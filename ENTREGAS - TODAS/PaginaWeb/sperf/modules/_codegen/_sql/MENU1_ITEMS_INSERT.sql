CREATE OR REPLACE PROCEDURE SSA.MENU1_ITEMS_INSERT 
  ( 
    p_ID OUT NUMBER, 
    p_NOMBRE IN VARCHAR2, 
    p_LINK IN VARCHAR2, 
    p_ID_RAIZ IN NUMBER, 
    p_tabcursor IN OUT SYS_REFCURSOR 
  ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-15 10:11:14 --- W3 ITSolutions --- 
  ---------------------------------------------------------------

 SELECT SQ_ID.NEXTVAL INTO p_ID FROM DUAL; 
 
    INSERT INTO SSA.MENU1_ITEMS ( 
        ID,
        NOMBRE,
        LINK,
        ID_RAIZ) 
    VALUES ( 
        p_ID,
        p_NOMBRE,
        p_LINK,
        p_ID_RAIZ);

   OPEN p_tabcursor FOR SELECT SQ_ID.CURRVAL FROM DUAL; 
 
    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
