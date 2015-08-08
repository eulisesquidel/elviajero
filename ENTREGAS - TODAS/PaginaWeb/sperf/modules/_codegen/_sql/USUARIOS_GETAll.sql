CREATE OR REPLACE PROCEDURE SSA.USUARIOS_GETAll 
  ( 
    p_tabcursor IN OUT SYS_REFCURSOR   ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-20 11:32:1 --- W3 ITSolutions --- 
  ---------------------------------------------------------------
    OPEN p_tabcursor FOR SELECT * FROM SSA.USUARIOS;


    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
