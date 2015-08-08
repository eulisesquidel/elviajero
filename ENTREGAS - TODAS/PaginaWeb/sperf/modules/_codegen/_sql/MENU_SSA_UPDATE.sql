CREATE OR REPLACE PROCEDURE SSA.MENU_SSA_UPDATE 
  (
    p_ID_MENU_SSA IN NUMBER, 
    p_LINK IN VARCHAR2, 
    p_SECCION IN VARCHAR2
  ) 
  AS
 BEGIN 
  ---------------------------------------------------------------
  --- AUTOGENERADO 2007-11-14 14:7:8 --- W3 ITSolutions --- 
  ---------------------------------------------------------------
    UPDATE SSA.MENU_SSA 
     SET LINK = p_LINK,
         SECCION = p_SECCION
    WHERE ID_MENU_SSA = p_ID_MENU_SSA;


    EXCEPTION 
	WHEN OTHERS THEN 
 		NULL; 
 
 END;
/
