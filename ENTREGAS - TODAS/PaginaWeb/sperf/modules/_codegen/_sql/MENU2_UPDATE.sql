CREATE OR REPLACE PROCEDURE SSA.MENU2_UPDATE 
  (
    p_ID_MENU2 IN NUMBER, 
    p_LINK IN VARCHAR2, 
    p_ICONO IN VARCHAR2, 
    p_NOMBRE IN VARCHAR2
  ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-14 10:8:8 --- W3 ITSolutions --- 
  ---------------------------------------------------------------
    UPDATE SSA.MENU2 
     SET LINK = p_LINK,
         ICONO = p_ICONO,
         NOMBRE = p_NOMBRE
    WHERE ID_MENU2 = p_ID_MENU2;


    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
