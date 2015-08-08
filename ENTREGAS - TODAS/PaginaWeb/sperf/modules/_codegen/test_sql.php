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
			<th>Sentencia SQL:</th>
			<td>
				<textarea name="txtSQL" cols="60" rows="12"><?= $sSQL ?></textarea>
				<input type="submit" class="Button" value="Procesar" name="btnProcesar" onClick="document.frmTest.txtAction.value='Q';">
			</td>
		</tr>
		<tr>
			<th>Select Limit:</th>
			<td>
				Use Select Limit: <input type="checkbox" name="chkLimit" value="1" <?= ($sLimit == '1')? 'checked': '' ?> >
				NumRows: <input type="text" name="txtNumRows" value="<?= $sNumRows ?>" >
				Offset: <input type="text" name="txtOffset" value="<?= $sOffset ?>" >
				<input type="submit" class="Button" value="Procesar" name="btnProcesar" onClick="document.frmTest.txtAction.value='Q';">
			</td>
		</tr>
		<tr>
			<th>Table data:</th>
			<td>
				Table: <input type="text" name="txtTable" value="<?= $sTable ?>" >
				<input type="submit" class="Button" value="Procesar" name="btnProcesar" onClick="document.frmTest.txtAction.value='TQ';">
                <input type="submit" class="Button" value="Generar SPs" name="btnGenSP" onClick="document.frmTest.txtAction.value='GS';">
			</td>
		</tr>
		</tbody>
		<tfoot>
		<tr>
		<td colspan="2" >
			<input type="submit" class="Button" value="Procesar" name="btnProcesar" >
		</td>
		</tr>
		</tfoot>
	</Table>
	</Form>
	</Div>

	<div class="Title1">Resultado del Proceso</div>
	<?
	if (strlen($sSQL)>0){
        if ($sAction != 'GS'){
            Process();
        }    
	}
	if ($sAction == 'TQ'){
		ProcessTQ();
	}
	if ($sAction == 'GS'){
		ProcessGS();
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
	if ($oRSKeys===false){
		echo "La instruccion SQL:<br><b>$sSQL</b><br>no se ejecuto correctamente.";
		
	}else{
		echo "Constraints de la Tabla: <b>$sTable</b>.";
		$sRegistros = '('. $oRSKeys>RecordCount(). ' registros)';
		if (is_Object($oRSKeys)){
			rs2html($oRSKeys);
		}
		echo "La instruccion SQL:<br><b>$sSQL</b><br>se ejecuto correctamente. $sRegistros";
	}

    */
    
    
    $typearr = array();
    $ncols = $oRS->FieldCount();
    $sPrefix = substr($sTable,0,2);
    $sCR = "\n";
    $sUser = "SIAFTM.";
    //-------------------------------------------------------
    //*** PROCEDURE INSERT
    //-------------------------------------------------------     
    $sProc = "CREATE OR REPLACE PROCEDURE $sUser"."$sTable"."_INSERT $sCR";
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
            if (substr($arr['COLUMN_NAME'],0,2)=='ID') {
                $sKey = $arr['COLUMN_NAME'];
                $InOut = 'OUT';
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
    
    $sBody = "    BEGIN$sCR    $sUser"."US_AUDITORIA_INSERT( p_audit_id_usuario, p_audit_id_menu,p_audit_id_funcion,p_audit_terminal,v_Fecha_Alta);$sCR $sCR"; 
    
    //*** Agrego tratamiento de Clave Autonumerica
    if ($sKey!='none') {
       $sBody = $sBody."   SELECT SIAFTM.SQ_".$sPrefix."_".$sKey.".nextval INTO p_$sKey FROM dual;$sCR $sCR";
    }
    
    $sBody = $sBody."    INSERT INTO $sUser"."$sTable ( $sCR";
    $sCampos = "";
    $sValores = "";
    
    $oRS->MoveFirst();
    $num = 0;
    while (!$oRS->EOF) {
        $arr = $oRS->FetchRow();
        //if ($sKey=='none' || $num !=0) {
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
        //}    
        $num++;
    }    
    $sCampos = substr($sCampos,0,strlen($sCampos)-strlen($sCR)-1);
    $sValores = substr($sValores,0,strlen($sValores)-strlen($sCR)-1);
    $sBody = $sBody.$sCampos.") $sCR    VALUES ( $sCR".$sValores.");$sCR";
    
    $sProc = $sProc.$sBody;
          
    $sProc = $sProc."    END;$sCR";  //End Body
    $sProc = $sProc."  END; --Procedure$sCR";  //End Procedure
    //$sProc = $sProc."/$sCR";
    
    GenFile( 'SP: INSERT',$sTable."_INSERT", $sProc);
    
    //-------------------------------------------------------
    //*** PROCEDURE UPDATE
    //-------------------------------------------------------     
    $sProc = "CREATE OR REPLACE PROCEDURE $sUser"."$sTable"."_UPDATE $sCR";
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
    
    $sBody = "    BEGIN$sCR    $sUser"."US_AUDITORIA_INSERT( p_audit_id_usuario, p_audit_id_menu,p_audit_id_funcion,p_audit_terminal,v_Fecha_Alta);$sCR $sCR"; 
    
   
    $sBody = $sBody."    UPDATE $sUser"."$sTable $sCR";
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

    GenFile( 'SP: UPDATE',$sTable."_UPDATE", $sProc);

    //-------------------------------------------------------
    //*** PROCEDURE DELETE
    //-------------------------------------------------------     
    $sProc = "CREATE OR REPLACE PROCEDURE $sUser"."$sTable"."_DELETE $sCR";
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
    
    $sBody = "    BEGIN$sCR    $sUser"."US_AUDITORIA_INSERT( p_audit_id_usuario, p_audit_id_menu,p_audit_id_funcion,p_audit_terminal,v_Fecha_Alta);$sCR $sCR"; 
    
   
    $sBody = $sBody."    DELETE $sUser"."$sTable $sCR"; 
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
    
    GenFile( 'SP: DELETE',$sTable."_DELETE", $sProc);

    /*    
    echo "<BR>-----------------------------------------------------------------------------------<BR>";
    */
    
    $sSQL = $oDB->PrepareSP( 'Begin MACC_BATCHAUDITGENERATOR( :p_TableName ); End;' );
	$oDB->InParameter( $sSQL, $sTable, 'p_TableName');
    $oDB->Execute( $sSQL );
    
	//*** Triggers de la Tabla
	$sSQL = "SELECT * FROM SIAFTM.MACC_TABLASAAUDITAR WHERE UPPER(MTAB) = '$sTable' ";
	$oRSTrig=$oDB->Execute($sSQL);
    /*
    if ($oRSTrig===false){
		echo "La instruccion SQL:<br><b>$sSQL</b><br>no se ejecuto correctamente.";
		
	}else{
		echo "Constraints de la Tabla: <b>$sTable</b>.";
		$sRegistros = '('. $oRSTrig->RecordCount(). ' registros)';
		if (is_Object($oRSTrig)){
			rs2html($oRSTrig);
		}
		echo "La instruccion SQL:<br><b>$sSQL</b><br>se ejecuto correctamente. $sRegistros";
	}
    */
    $sProc ='';
    
    $oRSTrig->MoveFirst();
    $num = 0;
    while (!$oRSTrig->EOF) {
        $arr = $oRSTrig->FetchRow();
        $sProc = $sProc."{$arr['MTRIG1']}$sCR{$arr['MTRIG2']}$sCR{$arr['MTRIG3']}$sCR/";
        $num++;
    }    

    GenFile( 'TRIGGERS ',$sTable."_TRIGGERS", $sProc);



}


function GenFile( $sTitle, $sFileName, $sContent){
	global $g_ArchivosServicios_SubPath;
	$sPath = NormalizePath( SitePath(). '_sql/') ;

	$sFileName = $sPath . $sFileName. '.sql';
	
    
	$fp = fopen($sFileName, 'w+');
	fwrite($fp, $sContent );
	fclose($fp);
    
    
    echo "<div class='Ficha'><table><tr><th>$sTitle</th></tr></table></div>";
    echo "<br>";
    echo "<pre>";
    echo "$sContent";
    echo "</pre>";
    echo "<br>";
    echo "Archivo $sFileName ..................Generado.<br>";
}


?>
