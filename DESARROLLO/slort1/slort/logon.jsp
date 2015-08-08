<%@ page import="org.apache.struts.action.ActionErrors" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-layout.tld" prefix="layout" %>
<%@ taglib uri='/WEB-INF/struts-template.tld' prefix='template' %>
<%@ taglib uri='/WEB-INF/struts-bean.tld' prefix='bean' %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<template:insert template='/view/templates/logout.jsp'>

	<%-- Valor del title del IE se concatena al texto 'slort'. Valor no requerido --%>
  <template:put name='titlePage' content='' direct='true' />
  
  <%-- Titulo del la pantalla actual. Valor no requerido --%>
    <template:put name='title' content='Ingreso a la Aplicacion' direct="true"  />
  
  <%-- Contenido a incluir en la pantalla --%>
  <template:put name='content'>
  
<%-- CONTENT.INICIO ----------------------------------------------------------------------------- --%>


<layout:form action="/verifyLogon.do" focus="username" styleClass="BODY">
 
  <layout:field key="prompt.username" property="username" size="16" maxlength="16" isRequired="true" styleClass="LABEL" type="text"/>
  <layout:field key="prompt.password" property="password" size="16" maxlength="16" type="password" styleClass="LABEL" isRequired="true"/>
							
	<layout:space />
	
  <layout:formActions>
      
			<layout:submit>
				<layout:message key="button.ingresar" />
			</layout:submit>

 			<layout:reset>
				<layout:message key="button.reset" />
			</layout:reset>
			
  </layout:formActions>
 
</layout:form>

<%-- CONTENT.FIN --------------------------------------------------------------------------------- --%>

  </template:put>
</template:insert>




