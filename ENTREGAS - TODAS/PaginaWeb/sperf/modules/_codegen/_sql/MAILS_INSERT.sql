CREATE OR REPLACE PROCEDURE SSA.MAILS_INSERT 
  ( 
    p_ID_MAILS OUT NUMBER, 
    p_MAIL IN VARCHAR2, 
    p_SECCION IN VARCHAR2, 
    p_tabcursor IN OUT SYS_REFCURSOR 
  ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-14 16:21:50 --- W3 ITSolutions --- 
  ---------------------------------------------------------------

 SELECT SQ_ID_MAILS.NEXTVAL INTO p_ID_MAILS FROM DUAL; 
 
    INSERT INTO SSA.MAILS ( 
        ID_MAILS,
        MAIL,
        SECCION) 
    VALUES ( 
        p_ID_MAILS,
        p_MAIL,
        p_SECCION);

   OPEN p_tabcursor FOR SELECT SQ_ID_MAILS.CURRVAL FROM DUAL; 
 
    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
