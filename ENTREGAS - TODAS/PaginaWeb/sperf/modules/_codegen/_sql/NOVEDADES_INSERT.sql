CREATE OR REPLACE PROCEDURE SSA.NOVEDADES_INSERT 
  ( 
    p_ID_NOVEDAD OUT NUMBER, 
    p_TITULO IN VARCHAR2, 
    p_SECCION IN VARCHAR2, 
    p_ANCHO IN VARCHAR2, 
    p_TEXTO IN VARCHAR2, 
    p_ACTIVO IN NUMBER, 
    p_FOTO IN VARCHAR2, 
    p_tabcursor IN OUT SYS_REFCURSOR 
  ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-14 14:21:14 --- W3 ITSolutions --- 
  ---------------------------------------------------------------

 SELECT SQ_ID_NOVEDAD.NEXTVAL INTO p_ID_NOVEDAD FROM DUAL; 
 
    INSERT INTO SSA.NOVEDADES ( 
        ID_NOVEDAD,
        TITULO,
        SECCION,
        ANCHO,
        TEXTO,
        ACTIVO,
        FOTO) 
    VALUES ( 
        p_ID_NOVEDAD,
        p_TITULO,
        p_SECCION,
        p_ANCHO,
        p_TEXTO,
        p_ACTIVO,
        p_FOTO);

   OPEN p_tabcursor FOR SELECT SQ_ID_NOVEDAD.CURRVAL FROM DUAL; 
 
    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
