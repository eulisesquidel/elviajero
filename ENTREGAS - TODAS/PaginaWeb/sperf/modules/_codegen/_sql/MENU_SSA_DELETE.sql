CREATE OR REPLACE PROCEDURE SSA.MENU_SSA_DELETE 
  ( 
    p_ID_MENU_SSA IN NUMBER
  ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-14 14:7:8 --- W3 ITSolutions --- 
  ---------------------------------------------------------------
    DELETE SSA.MENU_SSA 
    WHERE ID_MENU_SSA = p_ID_MENU_SSA;


    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
