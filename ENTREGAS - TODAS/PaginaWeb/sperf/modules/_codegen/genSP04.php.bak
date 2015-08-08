<?
	//=======================================================================================
	// Generacion de SPs - Pagina 04 -Resultado final
	// Fecha: 15/06/2004
	// Autor: RM
	//=======================================================================================
	$pagePrefix = "genSP";
	$pageNumber = 4;

	$conf = PAE_GetConfiguration("$baseDir/../_configuration/",$g_ConfigTxt);
	//--------------------------------------------
	//Variables del Wizard
	//--------------------------------------------
	$smarty->assign('title', 'Tablas: Lista');
	$wzMenu = gLoadArrayfromFile("./modules/$m/wzSPMenu.inc");

	$wzMenuSelectColor = array_fill(1, 10, '#000');
	$wzMenuSelectColor[$pageNumber] = '#FFF';


	$smarty->assign('wzMenu', $wzMenu);
	$smarty->assign('wzMenuSelectColor', $wzMenuSelectColor);

	$pageNext = $pagePrefix.substr("0".($pageNumber+1),-2);
	$pagePrev = $pagePrefix.substr("0".($pageNumber-1),-2);

	$smarty->assign('pageNext',"m=$m&a=$pageNext");
	$smarty->assign('pagePrev',"m=$m&a=$pagePrev");

	//--------------------------------------------
	//Variables POST & GET
	//--------------------------------------------
   	foreach ($_POST as $key =>  $value){
		if (substr($key,0,3)=='chk')	{
			$spGen[$value] = $value;
		}
		if ($key=='txtPackName'){
			$spkNameAll = $value;	
		}		
	}

	$formAction	= "./index.php?m=$m&a=$pageNext";

	//Form variables
	$smarty->assign('formAction', $formAction);
	$gentipo = $_SESSION[$m]['GENTIPO'];
	$smarty->assign('gentipo',$gentipo);

	//Inicializacion de las generacion de scripts

	$sqlHelper = new gODataManager($condb);
	
	$path_SQL = "./modules/$m/$g_pathGenSQL";

    $table = $_SESSION[$m]['table'];
    $spAction = $_SESSION[$m]['spAction'];
	$sUser= strtoupper($conf['DB_User']).".";
	$sSchema = $_SESSION[$m]['SCHEMA'];
    $txtOUT = '';
    $txtFiles = '';
	
	$txtPkAllHead='';
	$txtPkAllBody='';
	$txtPkSelHead='';
	$txtPkSelBody='';

	$spHead = '';
    $today = getdate();
	$sCR = "\n";
    $spHead = $spHead."  ---------------------------------------------------------------$sCR";
    $spHead = $spHead."  --- AUTOGENERADO {$today['year']}-{$today['mon']}-{$today['mday']} {$today['hours']}:{$today['minutes']}:{$today['seconds']} --- W3 ITSolutions --- $sCR";
    $spHead = $spHead."  ---------------------------------------------------------------$sCR";
	$pkHead= $spHead;

	$sFinProc = '';
	$sCreateOrReplace = '';
	if($gentipo==2){  //para creacion de SPs independientes
		$sFinProc = "/$sCR";
		$sCreateOrReplace = 'CREATE OR REPLACE';
	}
	
	$pkNameAll = '';
	if($gentipo==1){ //para creacion de SPs dentro de packages
		$sUser = "";
		$spHead = "";
		$pkNameAll = strtoupper($spkNameAll)."_";
		$pkNameSel = $pkNameAll."SEL";
		
		if(isset($spAction['INS'])){
			$pkNameAll = $pkNameAll."I"; 
		}
		if(isset($spAction['UPD'])){
			$pkNameAll = $pkNameAll."U"; 
		}
		if(isset($spAction['DEL'])){
			$pkNameAll = $pkNameAll."D"; 
		}
	}

	//---Loop con Tablas ---------------------------------------------------------------
    foreach ($table as $key => $value) {
		$rs = getTableDescription($key);

		//--- Insert -----------------------------------	
		if (isset($spAction['INS'])){
			$sAux = genSPInsert($sUser, $key, $rs, $gentipo);
			
			if($gentipo==1){ 
				$txtPkAllBody = $txtPkAllBody."\n".$sAux;
				$txtPkAllHead = $txtPkAllHead."\n".extractProcHead($sAux);
			}

			if($gentipo==2){ 
				$posfixProc="_INSERT";
				if (isset($spGen['GENSQL'])){
					$sFileName = $key.$posfixProc;
					$sFilePath = "$path_SQL/$sFileName.sql";
					genFile( $sAux, $sFilePath);
					$txtFiles[$sFileName] = $sFilePath ;
				}
				if (isset($spGen['PREVIEW'])){
					$txtOUT = $txtOUT."\n".$sAux;
				}
			}
			
			//Sequence para el insert
			$sAux2 = genSQInsert($sUser, $key, $rs, $gentipo);
			if (isset($spGen['GENSQL'])){
				$posfixProc="_SEQ";
				$sFileName = $key.$posfixProc;
				$sFilePath = "$path_SQL/$sFileName.sql";
				genFile( $sAux2, $sFilePath);
				$txtFiles[$sFileName] = $sFilePath ;
			}
			if (isset($spGen['PREVIEW'])){
				$txtOUT = $txtOUT."\n".$sAux2;
			}
			
			
		}
		//--- Update -----------------------------------	
		if (isset($spAction['UPD'])){
			$sAux = genSPUpdate($sUser, $key, $rs, $gentipo);
			if($gentipo==1){ 
				$txtPkAllBody = $txtPkAllBody."\n".$sAux;
				$txtPkAllHead = $txtPkAllHead."\n".extractProcHead($sAux);
			}
			if($gentipo==2){ 
				$posfixProc="_UPDATE";
				if (isset($spGen['GENSQL'])){
					$sFileName = $key.$posfixProc;
					$sFilePath = "$path_SQL/$sFileName.sql";
					genFile( $sAux, $sFilePath);
					$txtFiles[$sFileName] = $sFilePath ;
				}
				if (isset($spGen['PREVIEW'])){
					$txtOUT = $txtOUT."\n".$sAux;
				}
			}			
		}
		//--- Delete -----------------------------------	
		if (isset($spAction['DEL'])){
			$sAux = genSPDelete($sUser, $key, $rs, $gentipo);
			if($gentipo==1){ 
				$txtPkAllBody = $txtPkAllBody."\n".$sAux;
				$txtPkAllHead = $txtPkAllHead."\n".extractProcHead($sAux);
			}
			if($gentipo==2){ 
				$posfixProc="_DELETE";
				if (isset($spGen['GENSQL'])){
					$sFileName = $key.$posfixProc;
					$sFilePath = "$path_SQL/$sFileName.sql";
					genFile( $sAux, $sFilePath);
					$txtFiles[$sFileName] = $sFilePath ;
				}
				if (isset($spGen['PREVIEW'])){
					$txtOUT = $txtOUT."\n".$sAux;
				}
			}			
		}

		//--- Get by ID -----------------------------------	
		if (isset($spAction['GET'])){
			$sAux = genSPGetById($sUser, $key, $rs, $gentipo);
			if($gentipo==1){ 
				$txtPkSelBody = $txtPkSelBody."\n".$sAux;
				$txtPkSelHead = $txtPkSelHead."\n".extractProcHead($sAux);
			}
			if($gentipo==2){ 
				$posfixProc="_GETbyID";
				if (isset($spGen['GENSQL'])){
					$sFileName = $key.$posfixProc;
					$sFilePath = "$path_SQL/$sFileName.sql";
					genFile( $sAux, $sFilePath);
					$txtFiles[$sFileName] = $sFilePath ;
				}
				if (isset($spGen['PREVIEW'])){
					$txtOUT = $txtOUT."\n".$sAux;
				}
			}
		}

		//--- Get by ALL -----------------------------------	
		if (isset($spAction['GETAll'])){
			$sAux = genSPGetAll($sUser, $key, $rs, $gentipo);
			if($gentipo==1){ 
				$txtPkSelBody = $txtPkSelBody."\n".$sAux;
				$txtPkSelHead = $txtPkSelHead."\n".extractProcHead($sAux);
			}
			if($gentipo==2){ 
				$posfixProc="_GETAll";
				if (isset($spGen['GENSQL'])){
					$sFileName = $key.$posfixProc;
					$sFilePath = "$path_SQL/$sFileName.sql";
					genFile( $sAux, $sFilePath);
					$txtFiles[$sFileName] = $sFilePath ;
				}
				if (isset($spGen['PREVIEW'])){
					$txtOUT = $txtOUT."\n".$sAux;
				}
			}
		}

	} //foreach

	
	// --- Generacion de Packages ---------------------------------------------
	if($gentipo==1){ //para creacion de SPs dentro de packages
		$txtOUT = '';
	
	
		// Package ALL HEADER (Insert - Update - Delete) lo que se haya seleccionado	
		$sAux = "CREATE OR REPLACE PACKAGE $pkNameAll AS $sCR";
		$sAux = $sAux.$pkHead.$sCR;
		$sAux = $sAux.$txtPkAllHead;
		$sAux = $sAux."END $pkNameAll; $sCR/$sCR";		
		
		if (isset($spGen['GENSQL'])){
			$sFileName = $pkNameAll."_HEAD";
			$sFilePath = "$path_SQL/$sFileName.sql";
			genFile( $sAux, $sFilePath);
			$txtFiles[$sFileName] = $sFilePath ;
		}
		$txtOUT = $txtOUT."\n". $sAux;

		// Package ALL BODY (Insert - Update - Delete) lo que se haya seleccionado	
		$sAux = $sAux."CREATE OR REPLACE PACKAGE BODY $pkNameAll AS $sCR";
		$sAux = $sAux.$pkHead.$sCR;
		$sAux = $sAux.$txtPkAllBody;
		$sAux = $sAux."END $pkNameAll; $sCR/$sCR";
		
		if (isset($spGen['GENSQL'])){
			$sFileName = $pkNameAll."_BODY";
			$sFilePath = "$path_SQL/$sFileName.sql";
			genFile( $sAux, $sFilePath);
			$txtFiles[$sFileName] = $sFilePath ;
		}
		$txtOUT = $txtOUT."\n". $sAux;

		// Package SEL HEADER (GetbyID) lo que se haya seleccionado	
		$sAux = "CREATE OR REPLACE PACKAGE $pkNameSel AS $sCR";
		$sAux = $sAux.$pkHead.$sCR;
		$sAux = $sAux.$txtPkSelHead;
		$sAux = $sAux."END $pkNameSel; $sCR/$sCR";
		
		if (isset($spGen['GENSQL'])){
			$sFileName = $pkNameSel."_HEAD";
			$sFilePath = "$path_SQL/$sFileName.sql";
			genFile( $sAux, $sFilePath);
			$txtFiles[$sFileName] = $sFilePath ;
		}
		$txtOUT = $txtOUT."\n". $sAux;
		
		// Package SEL BODY (GetbyID) lo que se haya seleccionado	
		$sAux = $sAux."CREATE OR REPLACE PACKAGE BODY $pkNameSel AS $sCR";
		$sAux = $sAux.$pkHead.$sCR;
		$sAux = $sAux.$txtPkSelBody;
		$sAux = $sAux."END $pkNameSel; $sCR/$sCR";
		
		if (isset($spGen['GENSQL'])){
			$sFileName = $pkNameSel."_BODY";
			$sFilePath = "$path_SQL/$sFileName.sql";
			genFile( $sAux, $sFilePath);
			$txtFiles[$sFileName] = $sFilePath ;
		}
				
		$txtOUT = $txtOUT."\n". $sAux;
	}


    if (isset($_SESSION[$m]['DROPALL'])){
		$sAux = genSPDropAll();
		$sFileName = "DROP_ALL_SP";
		$sFilePath = "$path_SQL/$sFileName.sql";
		genFile( $sAux, $sFilePath);
		$txtFiles[$sFileName] = $sFilePath ;
    }

    if (isset($spGen['GENSQL'])){
	   	$smarty->assign('txtFiles',$txtFiles);
    }
    if (isset($spGen['PREVIEW'])){
	   	$smarty->assign('txtOUT',$txtOUT);
    }

//-------------------------------------------------------
// getTableDescription
//-------------------------------------------------------
function getTableDescription($tableName){

	//Variables de conexion
	global $condb, $conf, $sqlHelper;

	// Consulta SQL de Columnas
	$sql = "SELECT * FROM ALL_TAB_COLUMNS WHERE OWNER='".strtoupper($conf["DB_User"])."'  AND TABLE_NAME='". $id."' ".$orderby ;
	$sql = "SELECT C.COLUMN_NAME, C.DATA_TYPE, C.NULLABLE, " ;
	$sql = $sql."CASE WHEN P.CONSTRAINT_TYPE IS NULL THEN '' ELSE 'PK' END KEY " ;
	$sql = $sql."FROM ALL_TAB_COLUMNS C " ;
	$sql = $sql."LEFT JOIN ALL_IND_COLUMNS I ON I.INDEX_OWNER = C.OWNER " ;
	$sql = $sql."AND I.TABLE_NAME = C.TABLE_NAME  " ;
	$sql = $sql."AND I.COLUMN_NAME = C.COLUMN_NAME " ;
	$sql = $sql."LEFT JOIN ALL_CONSTRAINTS P ON P.OWNER = C.OWNER " ;
	$sql = $sql."AND P.TABLE_NAME = C.TABLE_NAME " ;
	$sql = $sql."AND P.INDEX_NAME = I.INDEX_NAME " ;
	$sql = $sql."AND P.CONSTRAINT_TYPE = 'P' " ;
	$sql = $sql."WHERE C.OWNER='".strtoupper($conf["DB_User"])."'  AND C.TABLE_NAME='". $tableName."'";



	$rs = $sqlHelper->sqlGetCommand($sql);

	return $rs ;

}
//-------------------------------------------------------
//GEN SEQUENCE FOR INSERT
//-------------------------------------------------------
function genSQInsert($sUser, $sTable, $rs, $gentipo) {
	global $spHead, $sCR, $sFinProc, $sCreateOrReplace;

    $ncols = $rs->FieldCount();

	 //*** Cargo los Parametros
    $rs->MoveFirst();
    $num = 0;
    $sKey = 'none';
    $sSqID = '';
    while (!$rs->EOF) {
        $arr = $rs->FetchRow();
        $InOut = 'IN';
        if ($num==0) {
            if ($arr['KEY'] == 'PK'){
                $sKey = $arr['COLUMN_NAME'];
                $InOut = 'OUT';
				$sSqID =$sKey; 
            }
        }
    }

	$sProc = "CREATE SEQUENCE SQ_$sSqID $sCR";
    $sProc = $sProc."  START WITH 1 INCREMENT BY 1";

    $sProc = $sProc."$sCR/";

	return $sProc;
}
//-------------------------------------------------------
//GEN PROCEDURE INSERT
//-------------------------------------------------------
function genSPInsert($sUser, $sTable, $rs, $gentipo) {
	global $spHead, $sCR, $sFinProc, $sCreateOrReplace;

    $ncols = $rs->FieldCount();

	$sProc = "$sCreateOrReplace PROCEDURE $sUser"."$sTable"."_INSERT $sCR";
    $sProc = $sProc."  ( $sCR";
	 //*** Cargo los Parametros
    $rs->MoveFirst();
    $num = 0;
    $sKey = 'none';
    $sSqID = '';
    while (!$rs->EOF) {
        $arr = $rs->FetchRow();
        $InOut = 'IN';
        if ($num==0) {
            if ($arr['KEY'] == 'PK'){
                $sKey = $arr['COLUMN_NAME'];
                $InOut = 'OUT';
				$sSqID =$sKey; 
            }
        }
        if (substr($arr['COLUMN_NAME'],0,5)!='AUDIT') {
            $sProc = $sProc."    p_{$arr['COLUMN_NAME']} $InOut {$arr['DATA_TYPE']}, $sCR";
        }
        $num++;
    }
    // Cursor para retornar ID autoincremental
	$sProc = $sProc."    p_tabcursor IN OUT SYS_REFCURSOR $sCR"; 

    $sProc = $sProc."  ) $sCR  AS$sCR BEGIN $sCR";
    $today = getdate();
 	$sProc = $sProc.$spHead;


	$sProc .= "$sCR SELECT SQ_$sSqID.NEXTVAL INTO p_$sSqID FROM DUAL; $sCR $sCR";

    $sBody = $sBody."    INSERT INTO $sUser"."$sTable ( $sCR";
    $sCampos = "";
    $sValores = "";

    $rs->MoveFirst();
    $num = 0;
    while (!$rs->EOF) {
        $arr = $rs->FetchRow();
		$sCampos = $sCampos."        {$arr['COLUMN_NAME']},$sCR";
		$sValores = $sValores."        p_{$arr['COLUMN_NAME']},$sCR";
        $num++;
    }
    $sCampos = substr($sCampos,0,strlen($sCampos)-strlen($sCR)-1);
    $sValores = substr($sValores,0,strlen($sValores)-strlen($sCR)-1);
    $sBody = $sBody.$sCampos.") $sCR    VALUES ( $sCR".$sValores.");$sCR";

    $sProc = $sProc.$sBody;

    $sProc .= "$sCR   OPEN p_tabcursor FOR SELECT SQ_$sSqID.CURRVAL FROM DUAL; $sCR ";


    $sProc .= "$sCR    EXCEPTION $sCR	WHEN OTHERS THEN $sCR ";
    $sProc .= "		NULL; $sCR $sCR"; // Acciones de excepciones

    $sProc = $sProc." END;$sCR";  //End Body
	$sProc = $sProc.$sFinProc;

	return $sProc;
}
//-------------------------------------------------------
//GEN PROCEDURE UPDATE
//-------------------------------------------------------
function genSPUpdate($sUser, $sTable, $rs ,$gentipo) {
	global $spHead, $sCR, $sFinProc, $sCreateOrReplace;

    $ncols = $rs->FieldCount();

	$sProc = "$sCreateOrReplace PROCEDURE $sUser"."$sTable"."_UPDATE $sCR";
    $sProc = $sProc."  ($sCR";

    //*** Cargo los Parametros
    $rs->MoveFirst();
    $sKey = 'none';
    while (!$rs->EOF) {
        $arr = $rs->FetchRow();
        $InOut = 'IN';
        $sProc = $sProc."    p_{$arr['COLUMN_NAME']} $InOut {$arr['DATA_TYPE']}, $sCR";
    }
    //*** Remuevo ultima coma
    $sProc = substr($sProc,0,strlen($sProc)-strlen($sCR)-2).$sCR;

    $sProc = $sProc."  ) $sCR  AS$sCR BEGIN $sCR";
 	$sProc = $sProc.$spHead;


    $sBody = $sBody."    UPDATE $sUser"."$sTable $sCR";
    $sCampos = "";

    $rs->MoveFirst();
    $num = 0;
    while (!$rs->EOF) {
        $arr = $rs->FetchRow();
        $sSet = ($num==0) ? 'SET' : '   ';
        if ($arr['KEY'] != 'PK' || $num !=0) {
			$sCampos = $sCampos."     $sSet {$arr['COLUMN_NAME']} = p_{$arr['COLUMN_NAME']},$sCR";
			$num++;
        }
    }
    $sCampos = substr($sCampos,0,strlen($sCampos)-strlen($sCR)-1);
    $sBody = $sBody.$sCampos.$sCR;

    $sWhere = "    WHERE";
    $rs->MoveFirst();
    $num = 0;
    while (!$rs->EOF) {
        $arr = $rs->FetchRow();
        $sAnd = ($num==0) ? '' : '      and';
        if ($arr['KEY'] == 'PK') {
           // El campo esta dentro de las claves
           $sWhere = $sWhere."$sAnd {$arr['COLUMN_NAME']} = p_{$arr['COLUMN_NAME']} $sCR";
           $num++;
        }
    }
    $sWhere = substr($sWhere,0,strlen($sWhere)-strlen($sCR)-1);


    $sProc = $sProc.$sBody.$sWhere.";".$sCR.$sCR;

    $sProc .= "$sCR    EXCEPTION $sCR	WHEN OTHERS THEN $sCR ";
    $sProc .= "		NULL; $sCR $sCR"; // Acciones de excepciones


    $sProc = $sProc." END;$sCR";  //End Body
	$sProc = $sProc.$sFinProc;
	
	return $sProc;
}
//-------------------------------------------------------
//GEN PROCEDURE DELETE
//-------------------------------------------------------
function genSPDelete($sUser, $sTable, $rs, $gentipo) {
	global $spHead, $sCR, $sFinProc, $sCreateOrReplace;

    $ncols = $rs->FieldCount();

    $sProc = "$sCreateOrReplace PROCEDURE $sUser"."$sTable"."_DELETE $sCR";
    $sProc = $sProc."  ( $sCR";

    //*** Cargo los Parametros
    $rs->MoveFirst();
    $sKey = 'none';
    while (!$rs->EOF) {
        $arr = $rs->FetchRow();
        $InOut = 'IN';
        if ($arr['KEY'] == 'PK') {
            $sProc = $sProc."    p_{$arr['COLUMN_NAME']} $InOut {$arr['DATA_TYPE']}, $sCR";
        }
    }
    //*** Remuevo ultima coma
    $sProc = substr($sProc,0,strlen($sProc)-strlen($sCR)-2).$sCR;

    $sProc = $sProc."  ) $sCR  AS$sCR BEGIN $sCR";
 	$sProc = $sProc.$spHead;

    $sBody = $sBody."    DELETE $sUser"."$sTable $sCR";
    $sWhere = "    WHERE";
    $rs->MoveFirst();
    $num = 0;
    while (!$rs->EOF) {
        $arr = $rs->FetchRow();
        $sAnd = ($num==0) ? '' : '      and';
        if ($arr['KEY'] == 'PK') {
           // El campo esta dentro de las claves
           $sWhere = $sWhere."$sAnd {$arr['COLUMN_NAME']} = p_{$arr['COLUMN_NAME']} $sCR";
           $num++;
        }
    }
    $sWhere = substr($sWhere,0,strlen($sWhere)-strlen($sCR)-1);


    $sProc = $sProc.$sBody.$sWhere.";".$sCR.$sCR;

    $sProc .= "$sCR    EXCEPTION $sCR	WHEN OTHERS THEN $sCR ";
    $sProc .= "		NULL; $sCR $sCR"; // Acciones de excepciones


    $sProc = $sProc." END;$sCR";  //End Body
	$sProc = $sProc.$sFinProc;

	return $sProc;
}
//-------------------------------------------------------
//GEN PROCEDURE GETbyID
//-------------------------------------------------------
function genSPGetById($sUser, $sTable, $rs, $gentipo) {
	global $spHead, $sCR, $sFinProc, $sCreateOrReplace;

    $ncols = $rs->FieldCount();

    $sProc = "$sCreateOrReplace PROCEDURE $sUser"."$sTable"."_GETbyID $sCR";
    $sProc = $sProc."  ( $sCR";

    //*** Cargo los Parametros
    $rs->MoveFirst();
    $sKey = 'none';
    while (!$rs->EOF) {
        $arr = $rs->FetchRow();
        $InOut = 'IN';
        if ($arr['KEY'] == 'PK') {
            $sProc = $sProc."    p_{$arr['COLUMN_NAME']} $InOut {$arr['DATA_TYPE']}, $sCR";
        }
    }
	$sProc = $sProc."    p_tabcursor IN OUT SYS_REFCURSOR "; 

    $sProc = $sProc."  ) $sCR  AS$sCR BEGIN $sCR";
 	$sProc = $sProc.$spHead;

    $sBody = $sBody."    OPEN p_tabcursor FOR SELECT * FROM $sUser"."$sTable $sCR";
    $sWhere = "    WHERE";
    $rs->MoveFirst();
    $num = 0;
    while (!$rs->EOF) {
        $arr = $rs->FetchRow();
        $sAnd = ($num==0) ? '' : '      and';
        if ($arr['KEY'] == 'PK') {
           // El campo esta dentro de las claves
           $sWhere = $sWhere."$sAnd {$arr['COLUMN_NAME']} = p_{$arr['COLUMN_NAME']} $sCR";
           $num++;
        }
    }
    $sWhere = substr($sWhere,0,strlen($sWhere)-strlen($sCR)-1);


    $sProc = $sProc.$sBody.$sWhere.";".$sCR.$sCR;

    $sProc .= "$sCR    EXCEPTION $sCR	WHEN OTHERS THEN $sCR ";
    $sProc .= "		NULL; $sCR $sCR"; // Acciones de excepciones


    $sProc = $sProc." END;$sCR";  //End Body
	$sProc = $sProc.$sFinProc;

	return $sProc;
}
//-------------------------------------------------------
//GEN PROCEDURE GETAll
//-------------------------------------------------------
function genSPGetAll($sUser, $sTable, $rs, $gentipo) {
	global $spHead, $sCR, $sFinProc, $sCreateOrReplace;

    $ncols = $rs->FieldCount();

    $sProc = "$sCreateOrReplace PROCEDURE $sUser"."$sTable"."_GETAll $sCR";
    $sProc = $sProc."  ( $sCR";

	$sProc = $sProc."    p_tabcursor IN OUT SYS_REFCURSOR "; 

    $sProc = $sProc."  ) $sCR  AS$sCR BEGIN $sCR";
 	$sProc = $sProc.$spHead;

    $sBody = $sBody."    OPEN p_tabcursor FOR SELECT * FROM $sUser"."$sTable";

    $sProc = $sProc.$sBody.";".$sCR.$sCR;

    $sProc .= "$sCR    EXCEPTION $sCR	WHEN OTHERS THEN $sCR ";
    $sProc .= "		NULL; $sCR $sCR"; // Acciones de excepciones


    $sProc = $sProc." END;$sCR";  //End Body
	$sProc = $sProc.$sFinProc;

	return $sProc;
}
//-------------------------------------------------------
//GEN PROCEDURE DropAll
//-------------------------------------------------------
function genSPDropAll() {

	$sCR = "\n";

    $sProc = "PROMPT Generating script to drop the objects... $sCR";
	$sProc = $sProc."set pagesize 0 $sCR";
	$sProc = $sProc."set feedback off $sCR";
	$sProc = $sProc."set termout off $sCR";
	$sProc = $sProc."set linesize 100 $sCR";
	$sProc = $sProc."set trimspool on $sCR";
	$sProc = $sProc."set wrap on $sCR";


	$sProc = $sProc."spool drop_objects.lst.sql $sCR";

	$sProc = $sProc."PROMPT PROMPT $sCR";
	$sProc = $sProc."PROMPT PROMPT Dropping remaining user objects... $sCR";

	$sProc = $sProc."select 'PROMPT ... dropping '||object_type||' '||object_name $sCR";
	$sProc = $sProc.",      'drop '||object_type||' '||object_name||';' $sCR";
	$sProc = $sProc."from   user_objects $sCR";
	$sProc = $sProc."where object_type='PROCEDURE' $sCR";
	$sProc = $sProc."/ $sCR";

	$sProc = $sProc."spool off $sCR";
	$sProc = $sProc."set feedback on $sCR";
	$sProc = $sProc."set termout on $sCR";
	$sProc = $sProc."spool drop_user_objects.log $sCR";
	$sProc = $sProc."@drop_objects.lst.sql $sCR";

	$sProc = $sProc."set feedback off $sCR";

	$sProc = $sProc."purge recyclebin $sCR";
	$sProc = $sProc."/ $sCR";
	$sProc = $sProc."set feedback on $sCR";
	$sProc = $sProc."spool off $sCR";

	return $sProc;
}

//-------------------------------------------------------
// Function extractProcHead
//-------------------------------------------------------
function extractProcHead($sProc){
	global $sCR;
	$sAux = substr($sProc,0,strpos($sProc,')')+1);
	
	return $sAux.";$sCR";
	
}

?>
