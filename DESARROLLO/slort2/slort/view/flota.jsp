<%@ page language="java" %>
<%@ page import="com.bdb.util.HttpUtils"%> 
<%@ page import="com.slort.util.SlortUtils"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-layout.tld" prefix="layout" %>
<%@ taglib uri='/WEB-INF/struts-template.tld' prefix='template' %>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app" %>
<%@ taglib uri='/WEB-INF/struts-bean.tld' prefix='bean' %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<head>
<html:javascript formName="FlotaForm"  />
</head>

<app:CheckSimpleLogon />

<template:insert template='templates/default.jsp'>

  <%-- Valor del title del IE se concatena al texto 'Slort'. Valor no requerido --%>
  <template:put name='titlePage' content=' ' direct='true' />
  
  <%-- Titulo del la pantalla actual. Valor no requerido --%>
  <template:put name='title' direct="true">
  	<bean:message key="FlotaForm.window.titulo" /> 
  	<app:ActionLabelTag  parameter="reqCode" />
  </template:put>
  
  <%-- Contenido a incluir en la pantalla --%>
  <template:put name='content'>

	<%-- CONTENT.INICIO ----------------------------------------------------------------------------- --%>
	<layout:form action="/flota.do" styleClass="Body" reqCode="" onsubmit="return validateFlotaForm(this);">


			<layout:text key="FlotaForm.codUnidad" 
									 property="codUnidad" 
									 styleClass="LABEL"
									 mode="H,I,I"
									 size="6"
									 maxlength="6"/>
									 
		<layout:text key="FlotaForm.licencia" 
								 property="licencia" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>
								 
			<layout:text key="FlotaForm.nombre" 
								 property="nombre" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>

		<layout:text key="FlotaForm.apellido" 
								 property="apellido" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>
								 
		<layout:text key="FlotaForm.userYahoo" 
								 property="userYahoo" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>
		
		<layout:text key="FlotaForm.passwYahoo" 
								 property="passwYahoo" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>
								 
		<layout:text key="FlotaForm.consumerKeyYahoo" 
								 property="consumerKeyYahoo" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>
		
		<layout:text key="FlotaForm.consumerSecretYahoo" 
								 property="consumerSecretYahoo" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="40"
								 maxlength="40"/>
								 

		<layout:text key="FlotaForm.domicilio" 
								 property="domicilio" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>

		<layout:text key="FlotaForm.codPostal" 
								 property="codPostal" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>
								 
								 
		<layout:text key="FlotaForm.localidad" 
								 property="localidad" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>

		<layout:text key="FlotaForm.telefono" 
								 property="telefono" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>

		<layout:text key="FlotaForm.cargo" 
								 property="cargo" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>
								 
		<layout:text key="FlotaForm.email" 
								 property="email" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>


			<layout:text key="FlotaForm.cuit" 
								 property="cuit" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>
								 
								 
		   		<layout:date key="FlotaForm.fechaAlta" 
						property="fechaAlta"
						styleClass="LABEL" 
						mode="H,I,I"
						size="12"
						maxlength="10"
						startYear="1920"
						endYear="<%=SlortUtils.getMaxAnio()%>"
						patternKey="app.pattern.date"
						onfocus="CheckFechaNoFocus('fechaAlta');
						"/>
    
								 

		<layout:text key="FlotaForm.fechaBaja" 
								 property="fechaBaja" 
								 styleClass="LABEL" 
								 mode="H,H,H"
								 size="30"
								 maxlength="30"/>			 
		
										 

		<layout:text key="FlotaForm.fechaModif" 
								 property="fechaModif" 
								 styleClass="LABEL" 
								 mode="H,I,I"
								 size="30"
								 maxlength="30"/>			 
		
			
		<layout:checkbox  property="activo"   mode="E,E,H" key="FlotaForm.activo"  styleClass="LABEL"   />
		
		<layout:text key="FlotaForm.esEliminar" 
								 property="esEliminar" 
								 styleClass="LABEL" 
								 mode="H,H,I"
								 size="30"
								 maxlength="30"/>		
		
		
		
		<layout:space/>
	  
		  <layout:formActions>
				<layout:submit mode="N,D,N" reqCode="<%=HttpUtils.STRUTS_ACTION_SAVE%>" styleClass="button">
					<bean:message key="button.save"/></layout:submit>
				<layout:submit mode="D,N,N" reqCode="<%=HttpUtils.STRUTS_ACTION_SAVE_NEW%>" styleClass="button">
					<bean:message key="button.insert"/></layout:submit>
				<layout:button mode="D,D,D" reqCode="<%=HttpUtils.STRUTS_ACTION_FIND_DATA%>" onclick="javascript:history.go(-1);" styleClass="button">
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
