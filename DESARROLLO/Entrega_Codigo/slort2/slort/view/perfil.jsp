<%@ page language="java" %>
<%@ page import="com.bdb.util.HttpUtils"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-layout.tld" prefix="layout" %>
<%@ taglib uri='/WEB-INF/struts-template.tld' prefix='template' %>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app" %>
<%@ taglib uri='/WEB-INF/struts-bean.tld' prefix='bean' %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<head>
<html:javascript formName="PerfilForm"  />
<script>
	function validacionCheckbox(ventana){
		
		validarOpcionDefecto(ventana);
		
		for (i=0; i<ventana.form.opcionAsignada.length; i++){
			if (ventana.form.opcionAsignada[i].checked)
				ventana.form.idsOpcionmenu[i].value = ventana.form.opcionAsignada[i].value;
		else
				ventana.form.idsOpcionmenu[i].value ="";
		}
	
	}
	
	function validarOpcionDefecto(ventana){
	 
	 		var opcionDefecto=document.getElementsByName("opcionDefecto");
	 
			for (i=0; i<ventana.form.opcionAsignada.length; i++){
				if (ventana.form.opcionAsignada[i].value==opcionDefecto[0].value)
						ventana.form.opcionAsignada[i].checked=true;
			}
	}
	
	
  
</script>
</head>


<app:CheckSimpleLogon />

<template:insert template='templates/default.jsp'>

  <%-- Valor del title del IE se concatena al texto 'Slort'. Valor no requerido --%>
  <template:put name='titlePage' content=' ' direct='true' />
  
  <%-- Titulo del la pantalla actual. Valor no requerido --%>
  <template:put name='title' direct="true">
  	<bean:message key="PerfilForm.window.titulo" /> 
  	<app:ActionLabelTag  parameter="reqCode" />
  </template:put>
  
  <%-- Contenido a incluir en la pantalla --%>
  <template:put name='content'>

	<%-- CONTENT.INICIO ----------------------------------------------------------------------------- --%>
	<layout:form action="/perfil.do" styleClass="Body" reqCode="" onsubmit="return validatePerfilForm(this);">


			<layout:text key="PerfilForm.idPerfil" 
									 property="idPerfil" 
									 styleClass="LABEL"
									 mode="H,I,I"
									 size="6"
									 maxlength="6"/>
									 
			<layout:text key="PerfilForm.descripcionCorta" 
								 property="descripcionCorta" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>
								 
		<layout:text key="PerfilForm.descripcionLarga" 
								 property="descripcionLarga" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="60"
								 maxlength="60"/>
		
		
		
		<layout:select	key="PerfilForm.opcionDefecto" 
										property="opcionDefecto" 
										styleClass="LABEL"
										mode="E,E,I" onchange="validarOpcionDefecto(this);">
			<layout:option value=""/>
			<layout:options collection="grupoCollection" property="idOpcionmenu" labelProperty="descripcionLargo" />
		</layout:select>
		 						 
		<layout:space/>
	  
		  <layout:formActions>
				<layout:submit mode="N,D,N" reqCode="<%=HttpUtils.STRUTS_ACTION_SAVE%>" styleClass="button">
					<bean:message key="button.save"/></layout:submit>
				<layout:submit mode="D,N,N" reqCode="<%=HttpUtils.STRUTS_ACTION_SAVE_NEW%>" styleClass="button" >
					<bean:message key="button.insert"/></layout:submit>
				<layout:button mode="D,D,D" reqCode="<%=HttpUtils.STRUTS_ACTION_FIND%>" onclick="javascript:history.go(-1);" styleClass="button">
					<bean:message key="button.back"/></layout:button>
				<layout:submit mode="N,N,D" reqCode="<%=HttpUtils.STRUTS_ACTION_DELETE%>" styleClass="button" 
											 onclick="return confirm('Realmente desea borrar estos datos ?');" >
					<bean:message key="button.delete"/></layout:submit>
		    
		  </layout:formActions>
		  
		 
				<logic:present name="opcionesDisponiblesAsignadas" scope="request">			
				
						<logic:iterate id="objeto"  name="opcionesDisponiblesAsignadas">	
						  <logic:equal  name="objeto" property="asignada" value="true">
							<input type="hidden" name="idsOpcionmenu" value="<bean:write name="objeto" property="opcionmenu.idOpcionmenu" />" >  
						  </logic:equal>
						  <logic:notEqual  name="objeto" property="asignada" value="true">
						  <input type="hidden" name="idsOpcionmenu" value="" >
						  </logic:notEqual> 
												    
						</logic:iterate>
				<layout:message  key="slort.mensajes.campos.obligatorios" />	
		 		<layout:space/>	
				<layout:message  key="slort.mensajes.campos.TituloOpcionesMenu" />
						
						<layout:collection name="opcionesDisponiblesAsignadas" id="objeto" styleClass="FORM" 
																			 align="center" sortAction="client" indexId="index" >														 
												<layout:collectionItem  title="Opcionmenu.idOpcionmenu" name="objeto"   property="opcionmenu.descripcionLargo" styleClass="negro-nor-2" />						
												 <%-- Contenido a incluir en la pantalla
												<layout:collectionInput formProperty="opcionAsignada" property="asignada"  name="objeto"  title="Asignada"  /> 
												 --%>
																							
												<layout:collectionItem  title="Opcionmenu.asignada" >
												
												    <logic:equal  name="objeto" property="asignada" value="true">
														<input type="checkbox" name="opcionAsignada" value="<bean:write name="objeto" property="opcionmenu.idOpcionmenu" />" checked
														  onchange="validacionCheckbox(this);" >
												    </logic:equal>
													<logic:notEqual  name="objeto" property="asignada" value="true">
														<input type="checkbox" name="opcionAsignada" value="<bean:write name="objeto" property="opcionmenu.idOpcionmenu" />" 
														onchange="validacionCheckbox(this);" >
													</logic:notEqual> 
												</layout:collectionItem> 
												<layout:collectionItem  title="Opcionmenu.orden" >

														<input name="orden" maxlength="2" value="<bean:write name="objeto" property="orden" />" >
												</layout:collectionItem>															 
						</layout:collection>
				</logic:present>		  
	</layout:form>
	
	<%-- CONTENT.FIN ----------------------------------------------------------------------------- --%>
	</template:put>
</template:insert>
