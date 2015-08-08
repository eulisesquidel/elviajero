CREATE OR REPLACE PROCEDURE SSA.NOVEDADES_DELETE 
  ( 
    p_ID_NOVEDAD IN NUMBER
  ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-14 14:21:14 --- W3 ITSolutions --- 
  ---------------------------------------------------------------
    DELETE SSA.NOVEDADES 
    WHERE ID_NOVEDAD = p_ID_NOVEDAD;


    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
