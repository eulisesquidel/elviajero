<%@ page language="java"%>

<%@ taglib uri='/WEB-INF/struts-template.tld' prefix='template' %>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app" %>

<app:CheckSimpleLogon />

<template:insert template='templates/default.jsp'>

	<%-- Valor del title del IE se concatena al texto 'Slort'. Valor no requerido --%>
  <template:put name='titlePage' content='SLORT - Sistema de Localización de Radio Taxis' direct='true' />
  
  <%-- Titulo del la pantalla actual. Valor no requerido --%>
    <template:put name='title' content='Bienvenido a la aplicacion' direct="true"  />
  
  <%-- Contenido a incluir en la pantalla --%>
  <template:put name='content'>
  
<%-- CONTENT.INICIO ----------------------------------------------------------------------------- --%>
		<br><br><br>
				
<%-- CONTENT.FIN --------------------------------------------------------------------------------- --%>

  </template:put>
</template:insert>



