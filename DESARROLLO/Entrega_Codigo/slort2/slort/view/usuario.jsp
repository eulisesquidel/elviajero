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

<app:CheckSimpleLogon />

<template:insert template='templates/default.jsp'>

  <%-- Valor del title del IE se concatena al texto 'Slort'. Valor no requerido --%>
  <template:put name='titlePage' content=' ' direct='true' />
  
  <%-- Titulo del la pantalla actual. Valor no requerido --%>
  <template:put name='title' direct="true">
  	<bean:message key="UsuarioForm.window.titulo" /> 
  	<app:ActionLabelTag  parameter="reqCode" />
  </template:put>
  
  <%-- Contenido a incluir en la pantalla --%>
  <template:put name='content'>

	<%-- CONTENT.INICIO ----------------------------------------------------------------------------- --%>
	<layout:form action="/usuario.do" styleClass="Body" reqCode="" onsubmit="return validateUsuarioForm(this);" >
	

			<layout:text key="UsuarioForm.idUsuario" 
									 property="idUsuario" 
									 styleClass="LABEL"
									 mode="H,I,I"
									 size="6"
									 maxlength="6"/>
									 
			<layout:text key="UsuarioForm.usuario" 
								 property="usuario" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>
								 
		<layout:text key="UsuarioForm.nombre" 
								 property="nombre" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>
		
		
		<layout:text key="UsuarioForm.apellido" 
								 property="apellido" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>	
		
				<layout:text key="UsuarioForm.email" 
								 property="email" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>	
								 
		<layout:text key="UsuarioForm.telefono" 
								 property="telefono" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>

		<layout:select	key="UsuarioForm.perfil" 
										property="idperfil" 
										styleClass="LABEL"
										mode="E,E,I">
			<layout:options collection="grupoCollection" property="idPerfil" labelProperty="descripcionLarga" />
		</layout:select>
		 						 
		<layout:space/>
	  
		  <layout:formActions>
				<layout:submit mode="N,D,N" reqCode="<%=HttpUtils.STRUTS_ACTION_SAVE%>" styleClass="button">
					<bean:message key="button.save"/></layout:submit>
				<layout:submit mode="D,N,N" reqCode="<%=HttpUtils.STRUTS_ACTION_SAVE_NEW%>" styleClass="button">
					<bean:message key="button.insert"/></layout:submit>
				<layout:button mode="D,D,D" reqCode="<%=HttpUtils.STRUTS_ACTION_FIND_DATA%>"  onclick="javascript:history.go(-1);"  styleClass="button">
					<bean:message key="button.back"/></layout:button>
				<layout:submit mode="N,N,D" reqCode="<%=HttpUtils.STRUTS_ACTION_DELETE%>" styleClass="button" 
											 onclick="return confirm('Realmente desea borrar estos datos ?');" >
					<bean:message key="button.delete"/></layout:submit>
		  </layout:formActions>
		  
		 <layout:space/>
		 <layout:message  key="slort.mensajes.campos.obligatorios" />
	</layout:form>
	
	<%-- CONTENT.FIN ----------------------------------------------------------------------------- --%>
	</template:put>
</template:insert>
