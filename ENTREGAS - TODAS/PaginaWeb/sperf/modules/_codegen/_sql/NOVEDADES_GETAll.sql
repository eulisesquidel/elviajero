CREATE OR REPLACE PROCEDURE SSA.NOVEDADES_GETAll 
  ( 
    p_tabcursor IN OUT SYS_REFCURSOR   ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-14 14:21:14 --- W3 ITSolutions --- 
  ---------------------------------------------------------------
    OPEN p_tabcursor FOR SELECT * FROM SSA.NOVEDADES;


    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
