<%@ page language="java" %>
<%@ page import="java.util.Vector"%>
<%@ page import="com.bdb.util.HttpUtils"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-layout.tld" prefix="layout" %>
<%@ taglib uri='/WEB-INF/struts-template.tld' prefix='template' %>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app" %>
<%@ taglib uri='/WEB-INF/struts-bean.tld' prefix='bean' %>
<head>
<html:javascript formName="UsuarioForm"  />
</head>


<template:insert template='templates/logout.jsp'>

  <%-- Valor del title del IE se concatena al texto 'slort'. Valor no requerido --%>
  <template:put name='titlePage' content=' ' direct='true' />
  
  <%-- Titulo del la pantalla actual. Valor no requerido --%>
  <template:put name='title' direct="true">
  	<bean:message key="UsuarioForm.window.titulo" /> 
  	<app:ActionLabelTag  parameter="reqCode" />
  </template:put>
  
  <%-- Contenido a incluir en la pantalla --%>
  <template:put name='content'>

	<%-- CONTENT.INICIO ----------------------------------------------------------------------------- --%>
	<layout:form action="/usuario.do" styleClass="Body" reqCode="cambiarPassword" onsubmit="return validateUsuarioForm(this);" >
	
			<layout:password key="UsuarioForm.pwdActual" 
								 property="pwdActual" 
								 styleClass="LABEL" 
								 mode="E,E,H"
								 size="30"
								 maxlength="30"/>
								 
			<layout:password key="UsuarioForm.pwdNueva" 
								 property="pwd" 
								 styleClass="LABEL" 
								 mode="E,E,H"
								 size="30"
								 maxlength="30"/>
								 
			<layout:password key="UsuarioForm.pwdConfirmacion" 
								 property="pwdConfirmacion" 
								 styleClass="LABEL" 
								 mode="E,E,H"
								 size="30"
								 maxlength="30"/>

	  
		  <layout:formActions>
				<layout:submit mode="N,D,H"  styleClass="button">
					<bean:message key="button.save"/>
				</layout:submit>
		<layout:button mode="D,D,D" reqCode="<%=HttpUtils.STRUTS_ACTION_FIND_DATA%>" onclick="window.location='view/home.jsp';"  styleClass="button">
				<bean:message key="button.back"/></layout:button>	
				
		  </layout:formActions>
		  
	</layout:form>
	
	<%-- CONTENT.FIN ----------------------------------------------------------------------------- --%>
	</template:put>
</template:insert>