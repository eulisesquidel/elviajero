<%@ page language="java" %>
<%@ page import="com.bdb.util.HttpUtils"%>
<%@ page import="com.slort.util.SlortUtils"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-layout.tld" prefix="layout" %>
<%@ taglib uri='/WEB-INF/struts-template.tld' prefix='template' %>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app" %>
<%@ taglib uri='/WEB-INF/struts-bean.tld' prefix='bean' %>

<head>
<html:javascript formName="ClienteForm"  />
</head>

<app:CheckSimpleLogon />

<template:insert template='templates/default.jsp'>

  <%-- Valor del title del IE se concatena al texto 'Slort'. Valor no requerido --%>
  <template:put name='titlePage' content=' ' direct='true' />
  
  <%-- Titulo del la pantalla actual. Valor no requerido --%>
  <template:put name='title' direct="true">
  	<bean:message key="ClienteForm.window.titulo" /> 
  	<app:ActionLabelTag  parameter="reqCode" />
  </template:put>
  
  <%-- Contenido a incluir en la pantalla --%>
  <template:put name='content'>

	<%-- CONTENT.INICIO ----------------------------------------------------------------------------- --%>
	<layout:form action="/cliente.do" styleClass="Body" reqCode="" onsubmit="return validateClienteForm(this);">
	

			<layout:text key="ClienteForm.codCliente" 
									 property="codCliente" 
									 styleClass="LABEL"
									 mode="H,I,I"
									 size="6"
									 maxlength="6"/>
			 					 
			<layout:select key="ClienteForm.tipoCliente" 
								 property="tipoCliente" 
								 styleClass="LABEL" 
								 tabindex="0" mode="E,I,I">
				<layout:option value="Particular" key="Particular" />
				<layout:option value="Empresa" key="Empresa" />
			</layout:select>
			
			
						 
			<layout:text key="ClienteForm.nombre" 
								 property="nombre" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>

		<layout:text key="ClienteForm.apellido" 
								 property="apellido" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>

		<layout:text key="ClienteForm.razonsocial" 
								 property="razonsocial" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>
								 
		<layout:text key="ClienteForm.domicilio" 
								 property="domicilio" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>

		<layout:text key="ClienteForm.codPostal" 
								 property="codPostal" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>
								 
								 
		<layout:text key="ClienteForm.localidad" 
								 property="localidad" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>

		<layout:text key="ClienteForm.telefono" 
								 property="telefono" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>

		<layout:text key="ClienteForm.cargo" 
								 property="cargo" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>
								 
		<layout:text key="ClienteForm.email" 
								 property="email" 
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
								 mode="H,H,I"
								 size="30"
								 maxlength="30"/>	

		<layout:select key="ClienteForm.tipoDocu" 
								 property="tipoDocu" 
								 styleClass="LABEL" 
								 tabindex="0" mode="E,I,I">
				<layout:option value="DNI" key="DNI" />
				<layout:option value="CUIT" key="CUIT" />
				<layout:option value="CUIL" key="CUIL" />
		</layout:select>						 

			
 
		<layout:text key="ClienteForm.numDoc" 
								 property="numDoc" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>
		
		<%--  <layout:message key="ClienteForm.numDoc.formatosolicitado" 	  /> --%>
			
		 						 
		<layout:text key="ClienteForm.fechaModif" 
								 property="fechaModif" 
								 styleClass="LABEL" 
								 mode="H,I,I"
								 size="30"
								 maxlength="30"/>
								 				 									 

		
		
	    <input type="hidden" id="provienedeReserva" name="provienedeReserva" value="<bean:write name='clienteForm' property='provienedeReserva' />" >
	    <input type="hidden" id="altaReserva" name="altaReserva" value="<bean:write name='clienteForm' property='altaReserva' />" >
	    <input type="hidden" id="idReserva" name="idReserva" value="<bean:write name='clienteForm' property='idReserva' />" >
	
		 						 
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
