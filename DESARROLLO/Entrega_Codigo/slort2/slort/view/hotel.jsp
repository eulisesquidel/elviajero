<%@ page language="java" %>
<%@ page import="com.bdb.util.HttpUtils"%> 
<%@ page import="com.slort.util.SlortUtils"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-layout.tld" prefix="layout" %>
<%@ taglib uri='/WEB-INF/struts-template.tld' prefix='template' %>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app" %>
<%@ taglib uri='/WEB-INF/struts-bean.tld' prefix='bean' %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<app:CheckSimpleLogon />

<template:insert template='templates/default.jsp'>

  <%-- Valor del title del IE se concatena al texto 'Slort'. Valor no requerido --%>
  <template:put name='titlePage' content=' ' direct='true' />
  
  <%-- Titulo del la pantalla actual. Valor no requerido --%>
  <template:put name='title' direct="true">
  	<bean:message key="HotelForm.window.titulo" /> 
  	<app:ActionLabelTag  parameter="reqCode" />
  </template:put>
  
  <%-- Contenido a incluir en la pantalla --%>
  <template:put name='content'>

	<%-- CONTENT.INICIO ----------------------------------------------------------------------------- --%>
	<layout:form action="/hotel.do" styleClass="Body" reqCode="" >


			<layout:text key="HotelForm.idHotel" 
									 property="idHotel" 
									 styleClass="LABEL"
									 mode="H,I,I"
									 size="6"
									 maxlength="6"/>
									 
								 
			<layout:text key="HotelForm.nombre" 
								 property="nombre" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>

		 						 
		<layout:space/>
	  
		  <layout:formActions>
				<layout:submit mode="N,D,N" reqCode="<%=HttpUtils.STRUTS_ACTION_SAVE%>" styleClass="button">
					<bean:message key="button.save"/></layout:submit>
				<layout:submit mode="D,N,N" reqCode="<%=HttpUtils.STRUTS_ACTION_SAVE_NEW%>" styleClass="button">
					<bean:message key="button.insert"/></layout:submit>
				<layout:submit mode="D,D,D" reqCode="<%=HttpUtils.STRUTS_ACTION_FIND%>" styleClass="button">
					<bean:message key="button.back"/></layout:submit>
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
