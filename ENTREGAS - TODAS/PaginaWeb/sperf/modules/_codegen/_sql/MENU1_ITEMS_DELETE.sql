CREATE OR REPLACE PROCEDURE SSA.MENU1_ITEMS_DELETE 
  ( 
    p_ID IN NUMBER
  ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-15 10:11:14 --- W3 ITSolutions --- 
  ---------------------------------------------------------------
    DELETE SSA.MENU1_ITEMS 
    WHERE ID = p_ID;


    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
