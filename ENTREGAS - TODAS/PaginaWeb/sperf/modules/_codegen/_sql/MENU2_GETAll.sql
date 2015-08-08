CREATE OR REPLACE PROCEDURE SSA.MENU2_GETAll 
  ( 
    p_tabcursor IN OUT SYS_REFCURSOR   ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-14 10:8:8 --- W3 ITSolutions --- 
  ---------------------------------------------------------------
    OPEN p_tabcursor FOR SELECT * FROM SSA.MENU2;


    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
