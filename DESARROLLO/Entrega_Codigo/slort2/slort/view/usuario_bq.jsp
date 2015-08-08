<%@ page language="java" %>
<%@ page import="java.util.Vector"%>
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
		<bean:message key="UsuarioForm.window.titulo" /> 
	</template:put>
	  
	<%-- Contenido a incluir en la pantalla --%>
	<template:put name='content'>
		
		<%-- CONTENT.INICIO ----------------------------------------------------------------------------- --%>
		<layout:form action="/usuario.do" styleClass="Body" reqCode="">
						 
		  <layout:space/>
						 
		  <layout:formActions>
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
														 
							<layout:collectionItem title="UsuarioForm.grilla_bq.idUsuario" name="objeto"  property="idUsuario" styleClass="negro-nor-2"/>
							<layout:collectionItem title="UsuarioForm.grilla_bq.usuario" name="objeto" property="usuario" styleClass="negro-nor-2"/>
							<layout:collectionItem title="UsuarioForm.grilla_bq.nombre" name="objeto" property="nombre" styleClass="negro-nor-2"/>
							<layout:collectionItem title="UsuarioForm.grilla_bq.apellido" name="objeto" property="apellido" styleClass="negro-nor-2"/>
							<layout:collectionItem title="UsuarioForm.grilla_bq.email" name="objeto" property="email" styleClass="negro-nor-2"/>
							<layout:collectionItem title="UsuarioForm.grilla_bq.telefono" name="objeto" property="telefono" styleClass="negro-nor-2"/>
							<layout:collectionItem title="UsuarioForm.grilla_bq.perfil" name="objeto" property="perfil.descripcionLarga" styleClass="negro-nor-2"/>							
								 
							<%-- Edit button --%>
							<layout:collectionItem title="label.edit" styleClass="negro-nor-2" >
								<layout:link 
										href="usuario.do?reqCode=edit" 
										paramId="selectedId" 
										paramName="objeto" 
										paramProperty="idUsuario">
									<img src="images/i.p.folder.drafts.gif" border="0" class="negro-nor-2" />
								</layout:link>
							</layout:collectionItem>
							<%-- Edit button --%>
							<%-- Delete button --%>
							<layout:collectionItem title="label.delete" styleClass="negro-nor-2">
								<layout:link 
										href="usuario.do?reqCode=inspect"
										paramId="selectedId"
										paramName="objeto"
										paramProperty="idUsuario">
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
