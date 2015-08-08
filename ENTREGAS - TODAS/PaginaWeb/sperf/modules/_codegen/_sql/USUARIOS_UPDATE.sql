CREATE OR REPLACE PROCEDURE SSA.USUARIOS_UPDATE 
  (
    p_ID_USUARIO IN NUMBER, 
    p_NOMBRE IN VARCHAR2, 
    p_USUARIO IN VARCHAR2, 
    p_APELLIDO IN VARCHAR2
  ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-20 11:32:1 --- W3 ITSolutions --- 
  ---------------------------------------------------------------
    UPDATE SSA.USUARIOS 
     SET NOMBRE = p_NOMBRE,
         USUARIO = p_USUARIO,
         APELLIDO = p_APELLIDO
    WHERE ID_USUARIO = p_ID_USUARIO;


    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
