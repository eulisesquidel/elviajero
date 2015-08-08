CREATE OR REPLACE PROCEDURE SSA.MENU1_UPDATE 
  (
    p_ID_MENU1 IN NUMBER, 
    p_NOMBRE IN VARCHAR2, 
    p_LINK IN VARCHAR2
  ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-13 22:49:25 --- W3 ITSolutions --- 
  ---------------------------------------------------------------
    UPDATE SSA.MENU1 
     SET NOMBRE = p_NOMBRE,
         LINK = p_LINK
    WHERE ID_MENU1 = p_ID_MENU1;


    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
