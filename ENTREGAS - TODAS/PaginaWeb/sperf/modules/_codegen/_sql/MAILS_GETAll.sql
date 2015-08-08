CREATE OR REPLACE PROCEDURE SSA.MAILS_GETAll 
  ( 
    p_tabcursor IN OUT SYS_REFCURSOR   ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-14 16:21:50 --- W3 ITSolutions --- 
  ---------------------------------------------------------------
    OPEN p_tabcursor FOR SELECT * FROM SSA.MAILS;


    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
