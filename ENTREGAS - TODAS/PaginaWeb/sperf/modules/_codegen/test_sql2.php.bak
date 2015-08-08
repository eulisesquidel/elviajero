<?php
//**************************************************
// test_sql.php
// Test de SQL
//
//*************************************************
include '../i_config.php';
include '../library/php/i_functions.php';
include '../library/adodb/adodb-pager.inc.php'; 
include '../library/adodb/adodb.inc.php'; 
include '../library/adodb/tohtml.inc.php';

//
// Inicializo variables de Sesion
//
session_start();


$sAction = Request('txtAction');
$sSQL = Request('txtSQL');
$sLimit = Request('chkLimit');
$sNumRows = Request('txtNumRows');
$sOffset = Request('txtOffset');
$sTable = strtoupper(Request('txtTable'));

$sProc = '';


if ($sAction == 'GS'){
    ProcessGS();
}

function ProcessGS(){
	global $g_DBData, $sTable, $sProc;
	
	$sRegistros = '';
	
	//establezco conección con la DB
	$oDB = ADONewConnection('oci8');
	$oDB->Connect( $g_DBData['Host'], $g_DBData['User'], $g_DBData['Pass'], $g_DBData['DB'] );
	$oDB->SetFetchMode(ADODB_FETCH_ASSOC);
	
	//$oDB->debug=true;
	
	//*** Estructura de la Tabla
	$sSQL = "SELECT * FROM ALL_TAB_COLUMNS WHERE TABLE_NAME = '$sTable' ORDER BY COLUMN_ID";
	$oRS=$oDB->Execute($sSQL);
    /*
	if ($oRS===false){
		echo "La instruccion SQL:<br><b>$sSQL</b><br>no se ejecuto correctamente.";
		
	}else{
		//echo "Estructura de la Tabla: <b>$sTable</b>.";
		$sRegistros = '('. $oRS->RecordCount(). ' registros)';
		if (is_Object($oRS)){
			rs2html($oRS);
		}
		echo "La instruccion SQL:<br><b>$sSQL</b><br>se ejecuto correctamente. $sRegistros";
	}
    echo "<BR>-----------------------------------------------------------------------------------<BR>";
    */
	//*** Constraints de la Tabla
	$sSQL = "SELECT * FROM ALL_IND_COLUMNS WHERE TABLE_NAME = '$sTable' ";
	$oRSKeys=$oDB->Execute($sSQL);
	/*
	if ($oRS===false){
		echo "La instruccion SQL:<br><b>$sSQL</b><br>no se ejecuto correctamente.";
		
	}else{
		echo "Constraints de la Tabla: <b>$sTable</b>.";
		$sRegistros = '('. $oRS->RecordCount(). ' registros)';
		if (is_Object($oRSKeys)){
			rs2html($oRSKeys);
		}
		echo "La instruccion SQL:<br><b>$sSQL</b><br>se ejecuto correctamente. $sRegistros";
	}

    */
   	$typearr = array();
	$ncols = $oRS->FieldCount();
    $sPrefix = substr($sTable,2);
    $sCR = "\n";
    //-------------------------------------------------------
    //*** PROCEDURE INSERT
    //-------------------------------------------------------     
    $sProc = "CREATE OR REPLACE PROCEDURE $sTable"."_INSERT $sCR";
    $sProc = $sProc."  ( p_audit_id_usuario IN number, $sCR"; 
    $sProc = $sProc."    p_audit_id_menu IN number, $sCR"; 
    $sProc = $sProc."    p_audit_id_funcion IN number, $sCR"; 
    $sProc = $sProc."    p_audit_terminal IN VARCHAR2, $sCR"; 
    $sProc = $sProc."  $sCR"; 

    //*** Cargo los Parametros
    $oRS->MoveFirst();
    $num = 0;
    $sKey = 'none';      
    while (!$oRS->EOF) {
        $arr = $oRS->FetchRow();
        $InOut = 'IN';
        if ($num==0) {
            $InOut = 'OUT';
            if (substr($arr['COLUMN_NAME'],0,2)=='ID') {
                $sKey = $arr['COLUMN_NAME'];
            }    
        }
        if (substr($arr['COLUMN_NAME'],0,5)!='AUDIT') {
            $sProc = $sProc."    p_{$arr['COLUMN_NAME']} $InOut {$arr['DATA_TYPE']}, $sCR";           
        }
        $num++;
    }
    //*** Remuevo ultima coma
    $sProc = substr($sProc,0,strlen($sProc)-strlen($sCR)-2).$sCR;
    
    $sProc = $sProc."  ) $sCR  AS$sCR BEGIN $sCR"; 
    $today = getdate(); 
    $sProc = $sProc."  ---------------------------------------------------------------$sCR"; 
    $sProc = $sProc."  --- AUTOGENERADO {$today['year']}-{$today['mon']}-{$today['mday']} {$today['hours']}:{$today['minutes']}:{$today['seconds']} --- GLD Consultores --- $sCR"; 
    $sProc = $sProc."  ---------------------------------------------------------------$sCR"; 
    $sDeclare = "    declare v_Fecha_Alta date := SYSDATE;$sCR"; 
    
    $sProc = $sProc.$sDeclare;
    
    $sBody = "    BEGIN$sCR    US_AUDITORIA_INSERT( p_audit_id_usuario, p_audit_id_menu,p_audit_id_funcion,p_audit_terminal,v_Fecha_Alta);$sCR $sCR"; 
    
    //*** Agrego tratamiento de Clave Autonumerica
    if ($sKey!='none') {
       $sBody = $sBody."   SELECT SIAFTM.SQ_".$sPrefix."_".$sKey."nextval INTO p_$sKey FROM dual;$sCR $sCR";
    }
    
    $sBody = $sBody."    INSERT INTO $sTable ( $sCR";
    $sCampos = "";
    $sValores = "";
    
    $oRS->MoveFirst();
    $num = 0;
    while (!$oRS->EOF) {
        $arr = $oRS->FetchRow();
        if ($sKey=='none' || $num !=0) {
            if (substr($arr['COLUMN_NAME'],0,5)!='AUDIT') {
                $sCampos = $sCampos."        {$arr['COLUMN_NAME']},$sCR";
                $sValores = $sValores."        p_{$arr['COLUMN_NAME']},$sCR";
            } else {
                if ($arr['COLUMN_NAME']=='AUDIT_USUARIO') { 
                    $sCampos = $sCampos."        {$arr['COLUMN_NAME']},$sCR";
                    $sValores = $sValores."        SIAFTM.AUD_USER(p_audit_id_usuario),$sCR";
                }
                if ($arr['COLUMN_NAME']=='AUDIT_FECHA') { 
                    $sCampos = $sCampos."        {$arr['COLUMN_NAME']},$sCR";
                    $sValores = $sValores."        v_Fecha_Alta,$sCR";                       
                }
                if ($arr['COLUMN_NAME']=='AUDIT_TERMINAL') { 
                    $sCampos = $sCampos."        {$arr['COLUMN_NAME']},$sCR";
                    $sValores = $sValores."        p_audit_terminal,$sCR";                                              
                }
            }    
        }    
        $num++;
    }    
    $sCampos = substr($sCampos,0,strlen($sCampos)-strlen($sCR)-1);
    $sValores = substr($sValores,0,strlen($sValores)-strlen($sCR)-1);
    $sBody = $sBody.$sCampos.") $sCR    VALUES ( $sCR".$sValores.");$sCR";
    
    $sProc = $sProc.$sBody;
          
    $sProc = $sProc."    END;$sCR";  //End Body
    $sProc = $sProc."  END; --Procedure$sCR";  //End Procedure
    //$sProc = $sProc."/$sCR";
    
    GenFile( $sTable."_INSERT", $sProc);
    
    //-------------------------------------------------------
    //*** PROCEDURE UPDATE
    //-------------------------------------------------------     
    $sProc = "CREATE OR REPLACE PROCEDURE $sTable"."_UPDATE $sCR";
    $sProc = $sProc."  ( p_audit_id_usuario IN number, $sCR"; 
    $sProc = $sProc."    p_audit_id_menu IN number, $sCR"; 
    $sProc = $sProc."    p_audit_id_funcion IN number, $sCR"; 
    $sProc = $sProc."    p_audit_terminal IN VARCHAR2, $sCR"; 
    $sProc = $sProc."  $sCR"; 

    //*** Cargo las Keys
    $sKeys = '';
    
    $oRSKeys->MoveFirst();
    $num = 0;
    while (!$oRSKeys->EOF) {
        $arr = $oRSKeys->FetchRow();
            if (substr($arr['INDEX_NAME'],0,2)=='PK') {
                $sKeys = $sKeys."- {$arr['COLUMN_NAME']} -";
            }    
        $num++;
    }    



    //*** Cargo los Parametros
    $oRS->MoveFirst();
    $sKey = 'none';      
    while (!$oRS->EOF) {
        $arr = $oRS->FetchRow();
        $InOut = 'IN';
        if (substr($arr['COLUMN_NAME'],0,5)!='AUDIT') {
            $sProc = $sProc."    p_{$arr['COLUMN_NAME']} $InOut {$arr['DATA_TYPE']}, $sCR";           
        }
    }
    //*** Remuevo ultima coma
    $sProc = substr($sProc,0,strlen($sProc)-strlen($sCR)-2).$sCR;
    
    $sProc = $sProc."  ) $sCR  AS$sCR BEGIN $sCR"; 
    $today = getdate(); 
    $sProc = $sProc."  ---------------------------------------------------------------$sCR"; 
    $sProc = $sProc."  --- AUTOGENERADO {$today['year']}-{$today['mon']}-{$today['mday']} {$today['hours']}:{$today['minutes']}:{$today['seconds']} --- GLD Consultores --- $sCR"; 
    $sProc = $sProc."  ---------------------------------------------------------------$sCR"; 
    $sDeclare = "    declare v_Fecha_Alta date := SYSDATE;$sCR"; 
    
    $sProc = $sProc.$sDeclare;
    
    $sBody = "    BEGIN$sCR    US_AUDITORIA_INSERT( p_audit_id_usuario, p_audit_id_menu,p_audit_id_funcion,p_audit_terminal,v_Fecha_Alta);$sCR $sCR"; 
    
   
    $sBody = $sBody."    UPDATE $sTable $sCR";
    $sCampos = "";
    
    $oRS->MoveFirst();
    $num = 0;
    while (!$oRS->EOF) {
        $arr = $oRS->FetchRow();
        $sSet = ($num==0) ? 'SET' : '   ';
        if ($sKey=='none' || $num !=0) {
            if (substr($arr['COLUMN_NAME'],0,5)!='AUDIT') {
                $sCampos = $sCampos."     $sSet {$arr['COLUMN_NAME']} = p_{$arr['COLUMN_NAME']},$sCR";
                $num++;
            } else {
                if ($arr['COLUMN_NAME']=='AUDIT_USUARIO') { 
                    $sCampos = $sCampos."     $sSet {$arr['COLUMN_NAME']} = SIAFTM.AUD_USER(p_audit_id_usuario),$sCR";
                    $num++;
                }
                if ($arr['COLUMN_NAME']=='AUDIT_FECHA') { 
                    $sCampos = $sCampos."     $sSet {$arr['COLUMN_NAME']} = v_Fecha_Alta,$sCR";
                    $num++;
                }
                if ($arr['COLUMN_NAME']=='AUDIT_TERMINAL') { 
                    $sCampos = $sCampos."     $sSet {$arr['COLUMN_NAME']} = p_audit_terminal,$sCR";
                    $num++;
                }
            }    
        }    
    }    
    $sCampos = substr($sCampos,0,strlen($sCampos)-strlen($sCR)-1);
    $sBody = $sBody.$sCampos.$sCR;
    
    $sWhere = "    WHERE";
    $oRS->MoveFirst();
    $num = 0;
    while (!$oRS->EOF) {
        $arr = $oRS->FetchRow();
        $sAnd = ($num==0) ? '' : '      and';
        $pos = strpos($sKeys, $arr['COLUMN_NAME']);    
        if ($pos !== false) { 
           // El campo esta dentro de las claves
           $sWhere = $sWhere."$sAnd {$arr['COLUMN_NAME']} = p_{$arr['COLUMN_NAME']} $sCR";
           $num++;
        }    
    }      
    $sWhere = substr($sWhere,0,strlen($sWhere)-strlen($sCR)-1);
    
    
    $sProc = $sProc.$sBody.$sWhere.";".$sCR.$sCR;
          
    $sProc = $sProc."    END;$sCR";  //End Body
    $sProc = $sProc."  END; --Procedure$sCR";  //End Procedure
    //$sProc = $sProc."/$sCR";

    GenFile( $sTable."_UPDATE", $sProc);

    //-------------------------------------------------------
    //*** PROCEDURE DELETE
    //-------------------------------------------------------     
    $sProc = "CREATE OR REPLACE PROCEDURE $sTable"."_DELETE $sCR";
    $sProc = $sProc."  ( p_audit_id_usuario IN number, $sCR"; 
    $sProc = $sProc."    p_audit_id_menu IN number, $sCR"; 
    $sProc = $sProc."    p_audit_id_funcion IN number, $sCR"; 
    $sProc = $sProc."    p_audit_terminal IN VARCHAR2, $sCR"; 
    $sProc = $sProc."  $sCR"; 

    //*** Cargo las Keys
    $sKeys = '';
    
    $oRSKeys->MoveFirst();
    $num = 0;
    while (!$oRSKeys->EOF) {
        $arr = $oRSKeys->FetchRow();
            if (substr($arr['INDEX_NAME'],0,2)=='PK') {
                $sKeys = $sKeys."- {$arr['COLUMN_NAME']} -";
            }    
        $num++;
    }    



    //*** Cargo los Parametros
    $oRS->MoveFirst();
    $sKey = 'none';      
    while (!$oRS->EOF) {
        $arr = $oRS->FetchRow();
        $InOut = 'IN';
        $pos = strpos($sKeys, $arr['COLUMN_NAME']);    
        if ($pos !== false) { 
            $sProc = $sProc."    p_{$arr['COLUMN_NAME']} $InOut {$arr['DATA_TYPE']}, $sCR";           
        }
    }
    //*** Remuevo ultima coma
    $sProc = substr($sProc,0,strlen($sProc)-strlen($sCR)-2).$sCR;
    
    $sProc = $sProc."  ) $sCR  AS$sCR BEGIN $sCR"; 
    $today = getdate(); 
    $sProc = $sProc."  ---------------------------------------------------------------$sCR"; 
    $sProc = $sProc."  --- AUTOGENERADO {$today['year']}-{$today['mon']}-{$today['mday']} {$today['hours']}:{$today['minutes']}:{$today['seconds']} --- GLD Consultores --- $sCR"; 
    $sProc = $sProc."  ---------------------------------------------------------------$sCR"; 
    $sDeclare = "    declare v_Fecha_Alta date := SYSDATE;$sCR"; 
    
    $sProc = $sProc.$sDeclare;
    
    $sBody = "    BEGIN$sCR    US_AUDITORIA_INSERT( p_audit_id_usuario, p_audit_id_menu,p_audit_id_funcion,p_audit_terminal,v_Fecha_Alta);$sCR $sCR"; 
    
   
    $sBody = $sBody."    DELETE $sTable $sCR"; 
    $sWhere = "    WHERE";
    $oRS->MoveFirst();
    $num = 0;
    while (!$oRS->EOF) {
        $arr = $oRS->FetchRow();
        $sAnd = ($num==0) ? '' : '      and';
        $pos = strpos($sKeys, $arr['COLUMN_NAME']);    
        if ($pos !== false) { 
           // El campo esta dentro de las claves
           $sWhere = $sWhere."$sAnd {$arr['COLUMN_NAME']} = p_{$arr['COLUMN_NAME']} $sCR";
           $num++;
        }    
    }      
    $sWhere = substr($sWhere,0,strlen($sWhere)-strlen($sCR)-1);
    
    
    $sProc = $sProc.$sBody.$sWhere.";".$sCR.$sCR;
          
    $sProc = $sProc."    END;$sCR";  //End Body
    $sProc = $sProc."  END; --Procedure$sCR";  //End Procedure
    //$sProc = $sProc."/$sCR";
    
    GenFile( $sTable."_DELETE", $sProc);

}


?>
<html>
<head>
	<Title>Test SQL</Title>
	<Meta HTTP-EQUIV="Pragma" CONTENT="No-Cache">
	<link type='text/css' rel='stylesheet' href='../library/styles/default.css'>

</head>

<body>
	<div class="PageTitle">SIAFTM: Test SQL</div>
	
	<div class="Title1">Proceso</div>
	
	<Div class="Ficha">
	<Form id="frmTest" name="frmTest">
	<input type="hidden" name="txtAction" value="<?= $sAction ?>" >
	<table cellspacing="1">
		<tbody>
		<tr>
			<th colspan="2" > Datos del Proceso </th>
		</tr>
		<tr>
			<th>Datos de conección:</th>
			<td><?= "Host: {$g_DBData['Host']}<br>User: {$g_DBData['User']}<br>Pass: {$g_DBData['Pass']}<br>DB: {$g_DBData['DB']}<br>" ?></td>
		</tr>
		<tr>
			<th>Table data:</th>
			<td>
				Table: <input type="text" name="txtTable" value="<?= $sTable ?>" >
				<input type="submit" class="Button" value="Generar SPs" name="btnGenSP" onClick="document.frmTest.txtAction.value='GS';">
			</td>
		</tr>
		<tr>
			<th>Precedure:</th>
			<td>
                    <? 
                    if ($sAction != 'GS'){
                        echo "<textarea name='txtSQL' cols='80' rows='25'>$sSQL</textarea>";
                    }  else {
                        echo "<textarea name='txtSQL' cols='80' rows='25'>$sProc</textarea>";
                    }
                ?>
			</td>
		</tr>
		</tbody>
	</Table>
	</Form>
	</Div>

	<div class="Title1">Resultado del Proceso</div>
	<?
	if (strlen($sSQL)>0) {
        if ($sAction != 'GS'){
            Process();
        }    
	}
	if ($sAction == 'TQ'){
		ProcessTQ();
	}
	?>

</body>
</html>
<?

function Process(){
	global $g_DBData, $sSQL, $sLimit, $sNumRows, $sOffset;
	
	$sRegistros = '';
	
	//establezco conección con la DB
	$oDB = ADONewConnection('oci8');
	$oDB->Connect( $g_DBData['Host'], $g_DBData['User'], $g_DBData['Pass'], $g_DBData['DB'] );
	$oDB->SetFetchMode(ADODB_FETCH_ASSOC);
	
	$oDB->debug=true;
	
	if ($sLimit == '1'){
		$oRS = $oDB->SelectLimit($sSQL, $sNumRows, $sOffset );
	}else{	
		$oRS=$oDB->Execute($sSQL);
	}
	
	
	if ($oRS===false){
		echo "La instruccion SQL:<br><b>$sSQL</b><br>no se ejecuto correctamente.";
		
	}else{
		$sRegistros = '('. $oRS->RecordCount(). ' registros)';
		if (is_Object($oRS)){
			rs2html($oRS);
		}
		echo "La instruccion SQL:<br><b>$sSQL</b><br>se ejecuto correctamente. $sRegistros";
	}
	
	if (is_Object($oRS)){
		$oRS->Close();
	}
}

function ProcessTQ(){
	global $g_DBData, $sTable;
	
	$sRegistros = '';
	
	//establezco conección con la DB
	$oDB = ADONewConnection('oci8');
	$oDB->Connect( $g_DBData['Host'], $g_DBData['User'], $g_DBData['Pass'], $g_DBData['DB'] );
	$oDB->SetFetchMode(ADODB_FETCH_ASSOC);
	
	$oDB->debug=true;
	
	//*** Estructura de la Tabla
	$sSQL = "SELECT * FROM ALL_TAB_COLUMNS WHERE TABLE_NAME = '$sTable' ";
	$oRS=$oDB->Execute($sSQL);
	
	if ($oRS===false){
		echo "La instruccion SQL:<br><b>$sSQL</b><br>no se ejecuto correctamente.";
		
	}else{
		echo "Estructura de la Tabla: <b>$sTable</b>.";
		$sRegistros = '('. $oRS->RecordCount(). ' registros)';
		if (is_Object($oRS)){
			rs2html($oRS);
		}
		echo "La instruccion SQL:<br><b>$sSQL</b><br>se ejecuto correctamente. $sRegistros";
	}
	
	//*** Indices de la Tabla
	$sSQL = "SELECT * FROM ALL_IND_COLUMNS WHERE TABLE_NAME = '$sTable' ";
	$oRS=$oDB->Execute($sSQL);
	
	if ($oRS===false){
		echo "La instruccion SQL:<br><b>$sSQL</b><br>no se ejecuto correctamente.";
		
	}else{
		echo "Indices de la Tabla: <b>$sTable</b>.";
		$sRegistros = '('. $oRS->RecordCount(). ' registros)';
		if (is_Object($oRS)){
			rs2html($oRS);
		}
		echo "La instruccion SQL:<br><b>$sSQL</b><br>se ejecuto correctamente. $sRegistros";
	}
	
	//*** Constraints de la Tabla
	$sSQL = "SELECT * FROM ALL_CONSTRAINTS WHERE TABLE_NAME = '$sTable' ";
	$oRS=$oDB->Execute($sSQL);
	
	if ($oRS===false){
		echo "La instruccion SQL:<br><b>$sSQL</b><br>no se ejecuto correctamente.";
		
	}else{
		echo "Constraints de la Tabla: <b>$sTable</b>.";
		$sRegistros = '('. $oRS->RecordCount(). ' registros)';
		if (is_Object($oRS)){
			rs2html($oRS);
		}
		echo "La instruccion SQL:<br><b>$sSQL</b><br>se ejecuto correctamente. $sRegistros";
	}
	
	if (is_Object($oRS)){
		$oRS->Close();
	}
}

function GenFile( $sFileName, $sContent){
	global $g_ArchivosServicios_SubPath;
	$sPath = NormalizePath( SitePath(). '_sql/') ;

	$sFileName = $sPath . $sFileName. '.sql';
	
    
	$fp = fopen($sFileName, 'w+');
	fwrite($fp, $sContent );
	fclose($fp);

    echo "Archivo $sFileName ...Generado.<br>";
}
?>
