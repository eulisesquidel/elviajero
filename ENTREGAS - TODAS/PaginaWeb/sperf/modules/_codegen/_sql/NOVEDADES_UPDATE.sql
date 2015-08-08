CREATE OR REPLACE PROCEDURE SSA.NOVEDADES_UPDATE 
  (
    p_ID_NOVEDAD IN NUMBER, 
    p_TITULO IN VARCHAR2, 
    p_SECCION IN VARCHAR2, 
    p_ANCHO IN VARCHAR2, 
    p_TEXTO IN VARCHAR2, 
    p_ACTIVO IN NUMBER, 
    p_FOTO IN VARCHAR2
  ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-14 14:21:14 --- W3 ITSolutions --- 
  ---------------------------------------------------------------
    UPDATE SSA.NOVEDADES 
     SET TITULO = p_TITULO,
         SECCION = p_SECCION,
         ANCHO = p_ANCHO,
         TEXTO = p_TEXTO,
         ACTIVO = p_ACTIVO,
         FOTO = p_FOTO
    WHERE ID_NOVEDAD = p_ID_NOVEDAD;


    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
