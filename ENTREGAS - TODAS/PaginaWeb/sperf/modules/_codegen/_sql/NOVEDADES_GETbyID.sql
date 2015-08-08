CREATE OR REPLACE PROCEDURE SSA.NOVEDADES_GETbyID 
  ( 
    p_ID_NOVEDAD IN NUMBER, 
    p_tabcursor IN OUT SYS_REFCURSOR   ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-14 14:21:14 --- W3 ITSolutions --- 
  ---------------------------------------------------------------
    OPEN p_tabcursor FOR SELECT * FROM SSA.NOVEDADES 
    WHERE ID_NOVEDAD = p_ID_NOVEDAD;


    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
