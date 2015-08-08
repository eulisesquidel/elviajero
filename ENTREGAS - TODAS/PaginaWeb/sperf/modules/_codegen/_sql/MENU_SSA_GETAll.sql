CREATE OR REPLACE PROCEDURE SSA.MENU_SSA_GETAll 
  ( 
    p_tabcursor IN OUT SYS_REFCURSOR   ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-14 14:7:8 --- W3 ITSolutions --- 
  ---------------------------------------------------------------
    OPEN p_tabcursor FOR SELECT * FROM SSA.MENU_SSA;


    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
