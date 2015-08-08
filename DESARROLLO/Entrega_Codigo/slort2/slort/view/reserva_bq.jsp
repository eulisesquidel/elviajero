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

		<bean:message key="ReservaForm.window.titulo" /> 
	</template:put>
	  
	<%-- Contenido a incluir en la pantalla --%>

	<template:put name='content'>

		<%-- CONTENT.INICIO ----------------------------------------------------------------------------- --%>
			<layout:form action="/reserva.do" styleClass="Body" reqCode="">							 	

			<layout:panel align="center">
			
			<layout:select key="ReservaForm.usuario" property="usuario.usuario">				
			<layout:option value=""/>
			<layout:options collection="usuarios" property="usuario"/>
			</layout:select>	
					 
			<layout:text key="ReservaForm.grilla_bq.cliente" 
									 property="cliente.numDoc" 
									 styleClass="LABEL" 
									 mode="E,E,I"
									 size="30"
									 maxlength="30"/>
				
	
			
			<layout:select key="ReservaForm.grilla_bq.estado" 
										 property="estado" 
										 styleClass="LABEL" 
										 tabindex="0" mode="E,E,I">
						<layout:option value="En proceso/A realizar" key="En proceso/A realizar" />
						<layout:option value="En proceso" key="En proceso" />
						<layout:option value="A realizar" key="A realizar" />
						<layout:option value="Realizada" key="Realizada" />
						<layout:option value="Cancelada" key="Cancelada" />
				</layout:select>	
	
	
			<layout:text key="ReservaForm.grilla_bq.direccion" 
									 property="direccion" 
									 styleClass="LABEL" 
									 mode="E,E,I"
									 size="30"
									 maxlength="30"/>	
									 
			<layout:text key="ReservaForm.flota" 
									 property="flota.licencia" 
									 styleClass="LABEL" 
									 mode="E,E,I"
									 size="30"
									 maxlength="30"/>	
									 
		  </layout:panel> 

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
							 
							<layout:collectionItem title="ReservaForm.grilla_bq.idReserva" name="objeto"  property="idReserva" styleClass="negro-nor-2"/>
							<layout:collectionItem title="ReservaForm.usuario" name="objeto" property="usuario.usuario" styleClass="negro-nor-2"/>
							<layout:collectionItem title="ReservaForm.grilla_bq.cliente" name="objeto" property="cliente.clienteCompleto" styleClass="negro-nor-2"/>
							<layout:collectionItem title="ReservaForm.grilla_bq.fecha" name="objeto" property="fecha" styleClass="negro-nor-2" type="date" />
							<layout:collectionItem title="ReservaForm.grilla_bq.hora" name="objeto" property="hora" styleClass="negro-nor-2" type="time"/>
							<layout:collectionItem title="ReservaForm.grilla_bq.estado" name="objeto" property="estado" styleClass="negro-nor-2"/>
							<layout:collectionItem title="ReservaForm.grilla_bq.direccion" name="objeto" property="direccion" styleClass="negro-nor-2"/>
							<%--  <layout:collectionItem title="ReservaForm.grilla_bq.localidad" name="objeto" property="localidad" styleClass="negro-nor-2"/>  --%>
							<layout:collectionItem title="ReservaForm.grilla_bq.telefono" name="objeto" property="telefono" styleClass="negro-nor-2"/>
							<layout:collectionItem title="ReservaForm.grilla_bq.flota" name="objeto" property="flota.licencia" styleClass="negro-nor-2"/>
			 
						    	<%-- Edit button --%>
						    	<layout:collectionItem title="label.edit" styleClass="negro-nor-2" >  
						    	<logic:equal  name="objeto" property="estado" value="A realizar">
									<layout:link 
										href="reserva.do?reqCode=edit" 
										paramId="selectedId" 
										paramName="objeto" 
										paramProperty="idReserva">
									<img src="images/i.p.folder.drafts.gif" border="0" class="negro-nor-2" />
								</layout:link>
								</logic:equal> 
								
								<logic:equal  name="objeto" property="estado" value="En proceso">
									<layout:link 
										href="reserva.do?reqCode=edit" 
										paramId="selectedId" 
										paramName="objeto" 
										paramProperty="idReserva">
									<img src="images/i.p.folder.drafts.gif" border="0" class="negro-nor-2" />
								</layout:link>
								</logic:equal>  
								
								<logic:equal  name="objeto" property="estado" value="Cancelada">
									<layout:link 
										href="reserva.do?reqCode=inspect" 
										paramId="selectedId" 
										paramName="objeto" 
										paramProperty="idReserva">
									<img src="images/i.p.folder.drafts.gif" border="0" class="negro-nor-2" />
								</layout:link>
								</logic:equal> 
								
								<logic:equal  name="objeto" property="estado" value="Realizada">
									<layout:link 
										href="reserva.do?reqCode=inspect" 
										paramId="selectedId" 
										paramName="objeto" 
										paramProperty="idReserva">
									<img src="images/i.p.folder.drafts.gif" border="0" class="negro-nor-2" />
								</layout:link>
								</logic:equal>   
								</layout:collectionItem>
								
								<%-- Edit button --%>
								<%-- Delete button --%>
								<layout:collectionItem title="label.delete" styleClass="negro-nor-2">
									<logic:equal  name="objeto" property="estado" value="A realizar">
									<layout:link 
											href="reserva.do?reqCode=inspect"
											paramId="selectedId"
											paramName="objeto"
											paramProperty="idReserva">
										<img src="images/i.p.junkmail.gif" border="0" class="negro-nor-2" />
									</layout:link>
								    </logic:equal> 
								    <logic:equal  name="objeto" property="estado" value="En proceso">
									<layout:link 
											href="reserva.do?reqCode=inspect"
											paramId="selectedId"
											paramName="objeto"
											paramProperty="idReserva">
										<img src="images/i.p.junkmail.gif" border="0" class="negro-nor-2" />
									</layout:link>
								    </logic:equal> 
								</layout:collectionItem>
								<%-- Delete button --%>
								
						    </layout:collection>
			</logic:present>
			<%-- TABLA DE RESULTADOS - FIN --%>

	 
		 <layout:space/>
				
		 <layout:formActions>
		
	
			
			<layout:button mode="D,D,N" reqCode="<%=HttpUtils.STRUTS_ACTION_GOOGLEMAP_VIEW%>" styleClass="button" onclick="javascript:window.open('googlemap_view.html','Ver Mapa de Flota','width=1000,height=550');">
					<bean:message key="ReservaForm.button.googlemapsview.label"/>
			</layout:button>

			
		  </layout:formActions>
		  
		</layout:form>
	<%-- CONTENT.FIN ----------------------------------------------------------------------------- --%>
	
	</template:put>
</template:insert>
