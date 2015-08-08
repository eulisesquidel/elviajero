CREATE OR REPLACE PROCEDURE SSA.USUARIOS_INSERT 
  ( 
    p_ID_USUARIO OUT NUMBER, 
    p_NOMBRE IN VARCHAR2, 
    p_USUARIO IN VARCHAR2, 
    p_APELLIDO IN VARCHAR2, 
    p_tabcursor IN OUT SYS_REFCURSOR 
  ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-20 11:32:1 --- W3 ITSolutions --- 
  ---------------------------------------------------------------

 SELECT SQ_ID_USUARIO.NEXTVAL INTO p_ID_USUARIO FROM DUAL; 
 
    INSERT INTO SSA.USUARIOS ( 
        ID_USUARIO,
        NOMBRE,
        USUARIO,
        APELLIDO) 
    VALUES ( 
        p_ID_USUARIO,
        p_NOMBRE,
        p_USUARIO,
        p_APELLIDO);

   OPEN p_tabcursor FOR SELECT SQ_ID_USUARIO.CURRVAL FROM DUAL; 
 
    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
