CREATE OR REPLACE PROCEDURE SSA.MAILS_DELETE 
  ( 
    p_ID_MAILS IN NUMBER
  ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-14 16:21:50 --- W3 ITSolutions --- 
  ---------------------------------------------------------------
    DELETE SSA.MAILS 
    WHERE ID_MAILS = p_ID_MAILS;


    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
