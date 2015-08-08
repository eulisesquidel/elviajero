CREATE OR REPLACE PROCEDURE SSA.MENU2_INSERT 
  ( 
    p_ID_MENU2 OUT NUMBER, 
    p_LINK IN VARCHAR2, 
    p_ICONO IN VARCHAR2, 
    p_NOMBRE IN VARCHAR2, 
    p_tabcursor IN OUT SYS_REFCURSOR 
  ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-14 10:8:8 --- W3 ITSolutions --- 
  ---------------------------------------------------------------

 SELECT SQ_ID_MENU2.NEXTVAL INTO p_ID_MENU2 FROM DUAL; 
 
    INSERT INTO SSA.MENU2 ( 
        ID_MENU2,
        LINK,
        ICONO,
        NOMBRE) 
    VALUES ( 
        p_ID_MENU2,
        p_LINK,
        p_ICONO,
        p_NOMBRE);

   OPEN p_tabcursor FOR SELECT SQ_ID_MENU2.CURRVAL FROM DUAL; 
 
    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
