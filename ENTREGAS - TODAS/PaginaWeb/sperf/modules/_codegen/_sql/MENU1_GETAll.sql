CREATE OR REPLACE PROCEDURE SSA.MENU1_GETAll 
  ( 
    p_tabcursor IN OUT SYS_REFCURSOR   ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-13 22:49:25 --- W3 ITSolutions --- 
  ---------------------------------------------------------------
    OPEN p_tabcursor FOR SELECT * FROM SSA.MENU1;


    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
