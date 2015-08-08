CREATE OR REPLACE PROCEDURE SSA.MENU2_DELETE 
  ( 
    p_ID_MENU2 IN NUMBER
  ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-14 10:8:8 --- W3 ITSolutions --- 
  ---------------------------------------------------------------
    DELETE SSA.MENU2 
    WHERE ID_MENU2 = p_ID_MENU2;


    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
