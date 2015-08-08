CREATE OR REPLACE PROCEDURE SSA.MAILS_UPDATE 
  (
    p_ID_MAILS IN NUMBER, 
    p_MAIL IN VARCHAR2, 
    p_SECCION IN VARCHAR2
  ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-14 16:21:50 --- W3 ITSolutions --- 
  ---------------------------------------------------------------
    UPDATE SSA.MAILS 
     SET MAIL = p_MAIL,
         SECCION = p_SECCION
    WHERE ID_MAILS = p_ID_MAILS;


    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
