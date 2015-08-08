CREATE OR REPLACE PROCEDURE SSA.MENU_SSA_INSERT 
  ( 
    p_ID_MENU_SSA OUT NUMBER, 
    p_LINK IN VARCHAR2, 
    p_SECCION IN VARCHAR2, 
    p_tabcursor IN OUT SYS_REFCURSOR 
  ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-14 14:7:8 --- W3 ITSolutions --- 
  ---------------------------------------------------------------

 SELECT SQ_ID_MENU_SSA.NEXTVAL INTO p_ID_MENU_SSA FROM DUAL; 
 
    INSERT INTO SSA.MENU_SSA ( 
        ID_MENU_SSA,
        LINK,
        SECCION) 
    VALUES ( 
        p_ID_MENU_SSA,
        p_LINK,
        p_SECCION);

   OPEN p_tabcursor FOR SELECT SQ_ID_MENU_SSA.CURRVAL FROM DUAL; 
 
    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
