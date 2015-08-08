CREATE OR REPLACE PROCEDURE SSA.MENU1_ITEMS_GETAll 
  ( 
    p_tabcursor IN OUT SYS_REFCURSOR   ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-15 10:11:14 --- W3 ITSolutions --- 
  ---------------------------------------------------------------
    OPEN p_tabcursor FOR SELECT * FROM SSA.MENU1_ITEMS;


    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
