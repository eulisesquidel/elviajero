CREATE OR REPLACE PROCEDURE SSA.MENU1_DELETE 
  ( 
    p_ID_MENU1 IN NUMBER
  ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-13 22:49:25 --- W3 ITSolutions --- 
  ---------------------------------------------------------------
    DELETE SSA.MENU1 
    WHERE ID_MENU1 = p_ID_MENU1;


    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
