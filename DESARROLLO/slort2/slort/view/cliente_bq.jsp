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
		<bean:message key="ClienteForm.window.titulo" /> 
	</template:put>
	  
	<%-- Contenido a incluir en la pantalla --%>
	<template:put name='content'>
		
		<%-- CONTENT.INICIO ----------------------------------------------------------------------------- --%>
		<layout:form action="/cliente.do" styleClass="Body" reqCode="">
								 
								 
			<layout:text key="ClienteForm.nombre_bq" 
									 property="nombre" 
									 styleClass="LABEL" 
									 mode="E,E,I"
									 size="30"
									 maxlength="30"/>
	
			<layout:text key="ClienteForm.apellido_bq" 
									 property="apellido" 
									 styleClass="LABEL" 
									 mode="E,E,I"
									 size="30"
									 maxlength="30"/>
	
	
			<layout:text key="ClienteForm.numDoc_bq" 
									 property="numDoc" 
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
								 
							<layout:collectionItem title="ClienteForm.grilla_bq.codCliente" name="objeto"  property="codCliente" styleClass="negro-nor-2"/>
							<layout:collectionItem title="ClienteForm.grilla_bq.nombre" name="objeto" property="nombre" styleClass="negro-nor-2"/>
							<layout:collectionItem title="ClienteForm.grilla_bq.apellido" name="objeto" property="apellido" styleClass="negro-nor-2"/>
							<layout:collectionItem title="ClienteForm.grilla_bq.tipoDocu" name="objeto" property="tipoDocu" styleClass="negro-nor-2"/>
							<layout:collectionItem title="ClienteForm.grilla_bq.numDoc" name="objeto" property="numDoc" styleClass="negro-nor-2"/>
							<%-- 
							<layout:collectionItem title="ClienteForm.estado" name="objeto" property="estado" styleClass="negro-nor-2"/>
 							--%>

						
								 
							<%-- Edit button --%>
							<layout:collectionItem title="label.edit" styleClass="negro-nor-2" >
								<layout:link 
										href="cliente.do?reqCode=edit" 
										paramId="selectedId" 
										paramName="objeto" 
										paramProperty="codCliente">
									<img src="images/i.p.folder.drafts.gif" border="0" class="negro-nor-2" />
								</layout:link>
							</layout:collectionItem>
							<%-- Edit button --%>
							<%-- Delete button --%>
							<layout:collectionItem title="label.delete" styleClass="negro-nor-2">
								<layout:link 
										href="cliente.do?reqCode=inspect"
										paramId="selectedId"
										paramName="objeto"
										paramProperty="codCliente">
									<img src="images/i.p.junkmail.gif" border="0" class="negro-nor-2" />
								</layout:link>
							</layout:collectionItem>
							<%-- Delete button --%>

					</layout:collection>
			</logic:present>
			<%-- TABLA DE RESULTADOS - FIN --%>
			<layout:space/>
			<layout:space/>
				<layout:button mode="D,D,N" reqCode="<%=HttpUtils.STRUTS_ACTION_GOOGLEMAP_VIEW%>" styleClass="button" onclick="javascript:window.open('googlemap_view.html','Ver Mapa de Flota','width=1000,height=550');">
						<bean:message key="ReservaForm.button.googlemapsview.label"/>
				</layout:button>
		</layout:form>
	<%-- CONTENT.FIN ----------------------------------------------------------------------------- --%>
	
	</template:put>
</template:insert>
