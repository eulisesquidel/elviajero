CREATE OR REPLACE PROCEDURE SSA.MENU1_ITEMS_UPDATE 
  (
    p_ID IN NUMBER, 
    p_NOMBRE IN VARCHAR2, 
    p_LINK IN VARCHAR2, 
    p_ID_RAIZ IN NUMBER
  ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-15 10:11:14 --- W3 ITSolutions --- 
  ---------------------------------------------------------------
    UPDATE SSA.MENU1_ITEMS 
     SET NOMBRE = p_NOMBRE,
         LINK = p_LINK,
         ID_RAIZ = p_ID_RAIZ
    WHERE ID = p_ID;


    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
