CREATE OR REPLACE PROCEDURE SSA.MENU_SSA_GETbyID 
  ( 
    p_ID_MENU_SSA IN NUMBER, 
    p_tabcursor IN OUT SYS_REFCURSOR   ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-14 14:7:8 --- W3 ITSolutions --- 
  ---------------------------------------------------------------
    OPEN p_tabcursor FOR SELECT * FROM SSA.MENU_SSA 
    WHERE ID_MENU_SSA = p_ID_MENU_SSA;


    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
