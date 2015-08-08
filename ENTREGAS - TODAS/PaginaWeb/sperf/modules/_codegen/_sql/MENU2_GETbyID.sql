CREATE OR REPLACE PROCEDURE SSA.MENU2_GETbyID 
  ( 
    p_ID_MENU2 IN NUMBER, 
    p_tabcursor IN OUT SYS_REFCURSOR   ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-14 10:8:8 --- W3 ITSolutions --- 
  ---------------------------------------------------------------
    OPEN p_tabcursor FOR SELECT * FROM SSA.MENU2 
    WHERE ID_MENU2 = p_ID_MENU2;


    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
