<%@ page language="java" %>

<%@ page import="com.bdb.util.HttpUtils"%>

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
		<bean:message key="FlotaForm.window.titulo" /> 
	</template:put>
	  
	<%-- Contenido a incluir en la pantalla --%>
	<template:put name='content'>
		
		<%-- CONTENT.INICIO ----------------------------------------------------------------------------- --%>
		<layout:form action="/flota.do" styleClass="Body" reqCode="">
								
				

								 
			<layout:text key="FlotaForm.grilla_bq.nombre" 
									 property="nombre" 
									 styleClass="LABEL" 
									 mode="E,E,I"
									 size="30"
									 maxlength="30"/>
	
			<layout:text key="FlotaForm.grilla_bq.apellido" 
									 property="apellido" 
									 styleClass="LABEL" 
									 mode="E,E,I"
									 size="30"
									 maxlength="30"/>
	
	
			<layout:text key="FlotaForm.grilla_bq.licencia" 
									 property="licencia" 
									 styleClass="LABEL" 
									 mode="E,E,I"
									 size="30"
									 maxlength="30"/>				 
		  <layout:space/>
		  
		  <layout:formActions>
		  		<layout:submit mode="N,D,N" reqCode="<%=HttpUtils.STRUTS_ACTION_FIND_DATA%>" styleClass="button">
					<bean:message key="button.find"/>
				</layout:submit>
				<layout:reset mode="D,D,N" reqCode="reset" styleClass="button">
					<bean:message key="button.reset"/>
				</layout:reset>		
				<layout:submit mode="D,D,N" reqCode="<%=HttpUtils.STRUTS_ACTION_CREATE%>" styleClass="button">
					<bean:message key="button.create"/>
				</layout:submit>
			  </layout:formActions>
		  
			
			<%-- TABLA DE RESULTADOS --%>	
			<logic:present name="foundResults" scope="request">
		  <layout:space/>
		  <layout:message  key="slort.mensajes.campos.ResultadoBusqueda" />
					<layout:collection name="foundResults" id="objeto" styleClass="FORM"
														 width="100%" align="center">
								 
							<layout:collectionItem title="FlotaForm.grilla_bq.codUnidad" name="objeto"  property="codUnidad" styleClass="negro-nor-2"/>
							<layout:collectionItem title="FlotaForm.grilla_bq.licencia" name="objeto" property="licencia" styleClass="negro-nor-2"/>
							<layout:collectionItem title="FlotaForm.grilla_bq.nombre" name="objeto" property="nombre" styleClass="negro-nor-2"/>
							<layout:collectionItem title="FlotaForm.grilla_bq.apellido" name="objeto" property="apellido" styleClass="negro-nor-2"/>
							<layout:collectionItem title="FlotaForm.grilla_bq.userYahoo" name="objeto" property="userYahoo" styleClass="negro-nor-2"/>
							<layout:collectionItem title="FlotaForm.grilla_bq.passwYahoo" name="objeto" property="passwYahoo" styleClass="negro-nor-2"/>
							<layout:collectionItem title="FlotaForm.grilla_bq.telefono" name="objeto" property="telefono" styleClass="negro-nor-2"/>				
							<layout:collectionItem title="FlotaForm.grilla_bq.activo" styleClass="negro-nor-2" >
								<logic:equal name="objeto" property="activo" value="1">
										<bean:message key="FlotaForm.si"/>
								</logic:equal>
								<logic:equal name="objeto" property="activo" value="0">
										<bean:message key="FlotaForm.no"/>
								</logic:equal>
							</layout:collectionItem>


								 
							<%-- Edit button --%>
							<layout:collectionItem title="label.edit" styleClass="negro-nor-2" >
								<layout:link 
										href="flota.do?reqCode=edit" 
										paramId="selectedId" 
										paramName="objeto" 
										paramProperty="codUnidad">
									<img src="images/i.p.folder.drafts.gif" border="0" class="negro-nor-2" />
								</layout:link>
							</layout:collectionItem>
							<%-- Edit button --%>
							<%-- Delete button --%>
							<layout:collectionItem title="label.delete" styleClass="negro-nor-2">
								<layout:link 
										href="flota.do?reqCode=inspect"
										paramId="selectedId"
										paramName="objeto"
										paramProperty="codUnidad">
									<img src="images/i.p.junkmail.gif" border="0" class="negro-nor-2" />
								</layout:link>
							</layout:collectionItem>
							<%-- Delete button --%>

					</layout:collection>
			</logic:present>
			<%-- TABLA DE RESULTADOS - FIN --%>
		</layout:form>
	<%-- CONTENT.FIN ----------------------------------------------------------------------------- --%>
	
	</template:put>
</template:insert>
