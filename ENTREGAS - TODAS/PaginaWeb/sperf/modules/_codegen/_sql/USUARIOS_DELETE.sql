CREATE OR REPLACE PROCEDURE SSA.USUARIOS_DELETE 
  ( 
    p_ID_USUARIO IN NUMBER
  ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-20 11:32:1 --- W3 ITSolutions --- 
  ---------------------------------------------------------------
    DELETE SSA.USUARIOS 
    WHERE ID_USUARIO = p_ID_USUARIO;


    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
