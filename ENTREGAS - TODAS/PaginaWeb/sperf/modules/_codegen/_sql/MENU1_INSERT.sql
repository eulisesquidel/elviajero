CREATE OR REPLACE PROCEDURE SSA.MENU1_INSERT 
  ( 
    p_ID_MENU1 OUT NUMBER, 
    p_NOMBRE IN VARCHAR2, 
    p_LINK IN VARCHAR2, 
    p_tabcursor IN OUT SYS_REFCURSOR 
  ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-13 22:49:25 --- W3 ITSolutions --- 
  ---------------------------------------------------------------

 SELECT SQ_ID_MENU1.NEXTVAL INTO p_ID_MENU1 FROM DUAL; 
 
    INSERT INTO SSA.MENU1 ( 
        ID_MENU1,
        NOMBRE,
        LINK) 
    VALUES ( 
        p_ID_MENU1,
        p_NOMBRE,
        p_LINK);

   OPEN p_tabcursor FOR SELECT SQ_ID_MENU1.CURRVAL FROM DUAL; 
 
    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
