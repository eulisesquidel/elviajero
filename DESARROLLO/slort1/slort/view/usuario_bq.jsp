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
<app:CheckSimpleSecurity groups="PlanEstudioGroup"/>

<template:insert template='templates/default.jsp'>

	<%-- Valor del title del IE se concatena al texto 'slort'. Valor no requerido --%>
	<template:put name='titlePage' content=' ' direct='true' />

	<%-- Titulo del la pantalla actual. Valor no requerido --%>
	<template:put name='title' direct="true">
		<bean:message key="UsuarioForm.window.titulo" /> 
	</template:put>
	  
	<%-- Contenido a incluir en la pantalla --%>
	<template:put name='content'>
		
		<%-- CONTENT.INICIO ----------------------------------------------------------------------------- --%>
		<layout:form action="/usuario.do" styleClass="Body" reqCode="">

									 
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

										 
		  <layout:space/>
						 
		  <layout:formActions>
				<layout:submit mode="N,D,N" reqCode="<%=HttpUtils.STRUTS_ACTION_FIND_DATA%>" styleClass="button">
					<bean:message key="button.find"/>
				</layout:submit>
				<layout:submit mode="D,D,N" reqCode="<%=HttpUtils.STRUTS_ACTION_CREATE%>" styleClass="button">
					<bean:message key="button.create"/>
				</layout:submit>
		  </layout:formActions>
		  
			
			<%-- TABLA DE RESULTADOS --%>	
			<logic:present name="foundResults" scope="request">
					<layout:space/>
					<layout:collection name="foundResults" id="objeto" styleClass="FORM"
														 width="100%" align="center">
														 
							<layout:collectionItem title="UsuarioForm.iduser" name="objeto"  property="idUser" styleClass="negro-nor-2"/>
							<layout:collectionItem title="UsuarioForm.usuario" name="objeto" property="usuario" styleClass="negro-nor-2"/>
							<layout:collectionItem title="UsuarioForm.nombre" name="objeto" property="nombre" styleClass="negro-nor-2"/>
							<layout:collectionItem title="UsuarioForm.apellido" name="objeto" property="apellido" styleClass="negro-nor-2"/>
							<layout:collectionItem title="UsuarioForm.email" name="objeto" property="email" styleClass="negro-nor-2"/>
							<layout:collectionItem title="UsuarioForm.telefono" name="objeto" property="telefono" styleClass="negro-nor-2"/>
							<layout:collectionItem title="UsuarioForm.grupo" name="objeto" property="grupo.longDesc" styleClass="negro-nor-2"/>							
								 
							<%-- Edit button --%>
							<layout:collectionItem title="label.edit" styleClass="negro-nor-2" >
								<layout:link 
										href="usuario.do?reqCode=edit" 
										paramId="selectedId" 
										paramName="objeto" 
										paramProperty="idUser">
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
										paramProperty="idUser">
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
