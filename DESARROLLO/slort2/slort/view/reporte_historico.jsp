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
		<bean:message key="ReporteHistoricoForm.window.titulo" /> 
	</template:put>
	  
	<%-- Contenido a incluir en la pantalla --%>
	<template:put name='content'>
		
		<%-- CONTENT.INICIO ----------------------------------------------------------------------------- --%>
	    <layout:form action="/reporteHistorico.do" styleClass="Body" reqCode="">					
				
		<layout:panel align="center">

									 
			<layout:select key="ReporteHistoricoForm.usuario" property="usuario.usuario">				
			<layout:option value=""/>
			<layout:options collection="usuarios" property="usuario"/>
			</layout:select>						 
									 
								 
	
									 
			<layout:text key="ReporteHistoricoForm.flota" 
									 property="flota.licencia" 
									 styleClass="LABEL" 
									 mode="E,E,I"
									 size="30"
									 maxlength="30"/>
		</layout:panel>

				<layout:panel align="center">
				<layout:row>		 	 
				<layout:date key="ReporteHistoricoForm.fechadesde" 
										 property="fechadesde"
										 styleClass="LABEL" 
										 mode="E,E,I"
										 size="12"
										 maxlength="10"
										 startYear="1920"
										 endYear="<%=SlortUtils.getMaxAnio()%>"
										 patternKey="app.pattern.date"
										 onfocus="CheckFechaNoFocus('fechadesde');"/>
				<layout:date key="ReporteHistoricoForm.fechahasta" 
										 property="fechahasta"
										 styleClass="LABEL" 
										 mode="E,E,I"
										 size="12"
										 maxlength="10"
										 startYear="1920"
										 endYear="<%=SlortUtils.getMaxAnio()%>"
										 patternKey="app.pattern.date"
				
										 onfocus="CheckFechaNoFocus('fechahasta');"/>
				</layout:row>
				</layout:panel>
			
	
		
					 
		  <layout:space/>
		  
		  <layout:formActions>
		  		<layout:submit mode="N,D,N" reqCode="<%=HttpUtils.STRUTS_ACTION_FIND_DATA%>" styleClass="button">
					<bean:message key="button.find"/>
				</layout:submit>
				<layout:reset mode="D,D,N" reqCode="reset" styleClass="button">
					<bean:message key="button.reset"/>
				</layout:reset>		
		  </layout:formActions>									 
		  	  
			
			<%-- TABLA DE RESULTADOS --%>	
			<logic:present name="foundResults" scope="request">
					<layout:space/>
				  	<layout:message  key="slort.mensajes.campos.ResultadoBusqueda" />
					<layout:collection name="foundResults" id="objeto" styleClass="FORM"
														 width="100%" align="center">
							 
							<layout:collectionItem title="HistoricoForm.id" name="objeto"  property="id" styleClass="negro-nor-2"/>
							<layout:collectionItem title="HistoricoForm.usuario" name="objeto"  property="calculoubicacion.reserva.usuario.usuario" styleClass="negro-nor-2"/>
							<layout:collectionItem title="HistoricoForm.flota" name="objeto"  property="flota.licencia" styleClass="negro-nor-2"/>
							<layout:collectionItem title="HistoricoForm.fecha" name="objeto" property="fecha" styleClass="negro-nor-2" type="date" />
							<layout:collectionItem title="HistoricoForm.hora" name="objeto" property="hora" styleClass="negro-nor-2"  type="time" />
							<layout:collectionItem title="HistoricoForm.ranking" name="objeto" property="ranking" styleClass="negro-nor-2" />
							<layout:collectionItem title="HistoricoForm.distanciaObjetivo" name="objeto" property="distanciaObjetivo" styleClass="negro-nor-2"/>
							<layout:collectionItem title="HistoricoForm.tiempoObjetivo" name="objeto" property="tiempoObjetivo" styleClass="negro-nor-2"/>
							<layout:collectionItem title="HistoricoForm.motivoNoAsignado" name="objeto" property="motivoNoAsignado" styleClass="negro-nor-2"/>
					
							<layout:collectionItem title="HistoricoForm.reserva" name="objeto" property="calculoubicacion.reserva.idReserva" styleClass="negro-nor-2"/>
					
					</layout:collection>
			</logic:present>
			<%-- TABLA DE RESULTADOS - FIN --%>

	 
		 <layout:space/>
	
			  <layout:formActions>
				<layout:submit mode="D,D,N" reqCode="<%=HttpUtils.STRUTS_ACTION_REPORTE_EXCEL%>" styleClass="button">
					<bean:message key="button.excel" />
				</layout:submit>
		  </layout:formActions>		
		  			
		  
		</layout:form>
	<%-- CONTENT.FIN ----------------------------------------------------------------------------- --%>
	
	</template:put>
</template:insert>
