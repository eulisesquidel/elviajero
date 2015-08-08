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

    <meta http-equiv="content-type" content="text/html; charset=ISO-8859-1"/>
   <%-- <script src="http://maps.google.com/maps?file=api&amp;v=2.x&amp;key=ABQIAAAAzr2EBOXUKnm_jVnk0OJI7xSosDVG8KKPE1-m51RBrvYughuyMxQ-i1QfUnH94QxWIa6N4U6MouMmBA" 
            type="text/javascript"></script>--%>
     <script src="http://maps.google.com/maps?file=api&amp;v=2.x&amp;key=ABQIAAAAbuXxLBFMgYlDNbrbDJvWzRSy2ooY7TB3FPLn4gqqVYh8dN86zxTPFEykr52-hr-X4o60TKPs3CaToQ" 
            type="text/javascript"></script>
   
    <script language="Javascript"  src="jscript/ajax.js"></script>
	<script src="jscript/googlemaps.js"></script>
	<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false"></script>
	<script type="text/javascript" src="http://jqueryjs.googlecode.com/files/jquery-1.3.2.min.js"></script>


	<script type="text/javascript" src="lib_jquery/jquery.autocomplete_geomod.js"></script>
	<script type="text/javascript" src="lib_jquery/geo_autocomplete.js"></script>
	<link rel="stylesheet" type="text/css" href="lib_jquery/jquery.autocomplete.css" />
	
	
<script type="text/javascript">
  
    
    
$().ready(function() {

    var latlng = new google.maps.LatLng(-34.65580390505896, -58.58802795410156);
    var bounds = new google.maps.LatLngBounds();
    
    var myOptions = {
      zoom: 8,
      center: latlng,
      mapTypeId: google.maps.MapTypeId.ROADMAP
    };
    
    bounds.extend(latlng);

    
    var map = new google.maps.Map(document.getElementById("map_canvas"), myOptions);
    var geocoder = new GClientGeocoder();
    var marker = new  google.maps.Marker();
    	
 	google.maps.event.addListener(map, 'click', function(event) {   
 		placeMarker(event.latLng);   
 	 });    
    
	    
	function placeMarker(location) {   
	    var clickedLocation = new google.maps.LatLng(location);   
		marker.setMap(null);
		marker = new google.maps.Marker({ position: location, map: map}); 
	
		var latitud=document.getElementsByName("latitud");
		var longitud=document.getElementsByName("longitud");
		
		latitud[0].value = "undefined";
		longitud[0].value = "undefined";
		
				 
		mylocation = location.toString(); 
		mylocation = mylocation.replace("(", "")
		mylocation = mylocation.replace(")", "")
		   	
		var elements = mylocation.split(',');
		
		stepDisplay = new google.maps.InfoWindow();
		    
		
		//LATITUD aprox 34
		//LONGITUD aprox 58
		latitud[0].value =elements[0].trim();
		longitud[0].value = elements[1].trim();
		
		
          var geocoder = new GClientGeocoder();
          var latlng = new GLatLng(latitud[0].value, longitud[0].value);
          geocoder.getLocations(latlng, function(addresses) {
              var direccion=document.getElementsByName("direccion");
			  direccion[0].value = addresses.Placemark[0].address;
		
          });

		//map.fitBounds(bounds);
		
		/*
		var geoOptions = {
		      address: clickedLocation,
		      bounds: bounds,
		      region: "NO"
		    };
		


		 geocoder.geocode(geoOptions, function(results, status) {
		      if (status == google.maps.GeocoderStatus.OK) {
		        addMarker(map, item, results[0].geometry.location);
		      } else {
		        console.log("Geocode failed " + status);
		      }
		    });
		 */
		    
		//map.setCenter(location); 
	}	
	   
	$('#location').geo_autocomplete(new google.maps.Geocoder, {
		mapkey: 'ABQIAAAAbuXxLBFMgYlDNbrbDJvWzRSy2ooY7TB3FPLn4gqqVYh8dN86zxTPFEykr52-hr-X4o60TKPs3CaToQ', 
		selectFirst: false,
		minChars: 3,
		cacheLength: 50,
		width: 400,
		scroll: true,
		scrollHeight: 330,
		region: 'AR'
	}).result(function(_event, _data) {
		//if (_data) map.fitBounds(bounds);
		if (_data) map.fitBounds(_data.geometry.viewport);
		//alert (_data.geometry.location.b);
		//alert (_data.geometry.location.c);
		//alert (_data.formatted_address);
		
		var direccion=document.getElementsByName("direccion");
		direccion[0].value = _data.formatted_address;
		
		var latitud=document.getElementsByName("latitud");
		var longitud=document.getElementsByName("longitud");
		
		latitud[0].value = "undefined";
		longitud[0].value = "undefined";
		 
		 
		mylocation = _data.geometry.location.toString(); 
		mylocation = mylocation.replace("(", "")
		mylocation = mylocation.replace(")", "")
		   
		var elements = mylocation.split(',');
		
		    
		
		//LATITUD aprox 34
		//LONGITUD aprox 58
		latitud[0].value =elements[0].trim();
		longitud[0].value = elements[1].trim();
		
				
		var myLatlng = new google.maps.LatLng(latitud[0].value,	longitud[0].value);
	    marker.setMap(null);
		marker = new google.maps.Marker({ position: myLatlng, title:_data.formatted_address }); 
   
		 // To add the marker to the map, call setMap(); 
		 marker.setMap(map); 
				
	});

});


</script>


<script type="text/javascript">
 

    

  function altadeCliente(){
  		 var idReserva=document.getElementsByName("idReserva");
  		 var altaReserva='NO';
  		 if (idReserva[0].value=='')
  		 		altaReserva='SI';
 		 window.location='cliente.do?reqCode=create&provienedeReserva=SI&altaReserva='+altaReserva+'&idReserva='+idReserva[0].value+'&';
  }

  function validarFechayHora(){
  
      var form = document.forms[0];                                             
 
      if ((validateRequired(form) && validateDate(form) && validateHora(form))==false) {
      	return false
      } 
      
      var fecha=document.getElementsByName("fecha");
  	  var hora=document.getElementsByName("hora");
  
  	  var mayor = dateMayor(fecha[0].value, hora[0].value);
  	  	
		if (mayor > 0)
			return true 
		else {
			alert ("No se puede ingresar una reserva con fecha y hora anterior a la actual.");
			return false;
		}
	  		 
   } 
  
  
	function dateMayor(fecha,hora) {
	date1 = new Date();
	var today = new Date();
	diff  = new Date();
	
	var elements = fecha.split('-');
	
	dia=elements[0];
	mes=elements[1];
	anio=elements[2];
	
    fecha = (mes   + "/" + dia + "/" + anio);
    
    
	date1temp = new Date(fecha + " " + hora);
	date1.setTime(date1temp.getTime());

	// sets difference date to difference of first date and second date
	if (date1.getTime() > today.getTime())
		return 1;
	else
	   return -1;

	
	}
  
  		 
  		 
  		 
  		 
 

</script>


<style>
.ac_results li img {
	float: left;
	margin-right: 5px;
}
</style>


<html:javascript formName="ReservaForm"  />
</head>

<app:CheckSimpleLogon />


<template:insert template='templates/default.jsp'>

  <%-- Valor del title del IE se concatena al texto 'Slort'. Valor no requerido --%>
  <template:put name='titlePage' content=' ' direct='true' />
  
  <%-- Titulo del la pantalla actual. Valor no requerido --%>
  <template:put name='title' direct="true">
  	<bean:message key="ReservaForm.window.titulo" /> 
  	<app:ActionLabelTag  parameter="reqCode" />
  </template:put>

  
  <%-- Contenido a incluir en la pantalla --%>
  <template:put name='content'>

  
	<%-- CONTENT.INICIO ----------------------------------------------------------------------------- --%>
	<layout:form action="/reserva.do" styleClass="Body" reqCode="" onsubmit="return validateReservaForm(this);">
    <layout:row >
    	<layout:column >
	
		    <input type="hidden"  name="direccionGoogle" value="<bean:write name='reservaForm' property='direccionGoogle' />" >
	
			<layout:text key="ReservaForm.idReserva" 
									 property="idReserva" 
									 styleClass="LABEL"
									 mode="H,I,I"
									 size="6"
									 maxlength="6"/>
									 
			 					 
			<layout:text key="ReservaForm.cliente"
						 property="cliente.clienteCompleto" 
						 styleClass="LABEL"
						 mode="E,E,I"
						 size="30"
						 maxlength="30"
						 onkeyup="ajax_showOptions_2(this,'getClientesReservaporLetras',event,550,0)" 
						 />	
   				<layout:button mode="D,D,N" reqCode="<%=HttpUtils.STRUTS_ACTION_GOOGLEMAP_VIEW%>" styleClass="button" onclick="javascript:altadeCliente();">
					<bean:message key="ReservaForm.button.googlemapsview.altacliente.label"/>
				</layout:button>
			
		  							 
		<input type="hidden" id="cliente.clienteCompleto_hidden" name="codCliente" value="<bean:write name='reservaForm' property='codCliente' />" >
	

		<layout:date key="ReservaForm.fecha" 
			property="fecha"
			styleClass="LABEL" 
			mode="E,E,I"
			size="12"
			maxlength="10"
			startYear="1920"
			endYear="<%=SlortUtils.getMaxAnio()%>"
			patternKey="app.pattern.date"
			onfocus="CheckFechaNoFocus('idReserva');
			"/>
		
							
		<layout:text key="ReservaForm.hora" 
								 property="hora" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="5"
								 maxlength="30"/>


		 
 		<layout:text key="ReservaForm.direccion" 
								 property="direccion" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="60"
								 maxlength="150" 
								 readonly="true" />
		
		<layout:text key="ReservaForm.observaciones" 
								 property="observaciones" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>

								 
		<layout:text key="ReservaForm.entreCalles" 
								 property="entreCalles" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>



		<layout:text key="ReservaForm.telefono" 
								 property="telefono" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"/>
    

								 
		<layout:text key="ReservaForm.flota"
						 property="flota.flotaCompleta" 
						 styleClass="LABEL"
						 mode="I,I,I"
						 size="30"
						 maxlength="30"
						 />	
						 
		 
		  <layout:formActions>
				<layout:submit mode="D,D,N" reqCode="<%=HttpUtils.STRUTS_ACTION_GOOGLEMAP_DISTANCE_LISTA%>" styleClass="button"   onclick="return validarFechayHora();" >
					<bean:message key="ReservaForm.button.googlemapsview.asignarunidad.label"/>
				</layout:submit>	
		  </layout:formActions>
		  
		
		
		<input type="hidden" id="flota.flotaCompleta_hidden" name="codUnidad" value="<bean:write name='reservaForm' property='codUnidad' />" >
								 
								 
		<layout:text key="ReservaForm.hotel"
						 property="hotel.nombre" 
						 styleClass="LABEL"
						 mode="E,E,I"
						 size="30"
						 maxlength="30"
						 onkeyup="ajax_showOptions_2(this,'getHotelReservaporLetras',event,550,0)" 
						 />	

		
		<input type="hidden" id="hotel.nombre_hidden" name="idHotel" value="<bean:write name='reservaForm' property='idHotel' />" >

		<layout:select key="ReservaForm.estado" 
									 property="estado" 
									 styleClass="LABEL" 
									 tabindex="0" mode="I,I,I">
					<layout:option value="En proceso" key="En proceso" />
					<layout:option value="A realizar" key="A realizar" />
					<layout:option value="Realizada" key="Realizada" />
					<layout:option value="Cancelada" key="Cancelada" />
			</layout:select>	
								 
								 
		<layout:text key="ReservaForm.usuario" 
								 property="usuario.usuario" 
								 styleClass="LABEL" 
								 mode="H,I,I"
								 size="30"
								 maxlength="30"/>
	
			<layout:text key="ReservaForm.idUsuario" 
								 property="idUsuario" 
								 styleClass="LABEL" 
								 mode="H,H,H"
								 size="30"
								 maxlength="30"/>							 

		<layout:text key="ReservaForm.latitud" 
								 property="latitud" 	
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"
								 readonly="true"/>

		<layout:text key="ReservaForm.longitud" 
								 property="longitud" 
								 styleClass="LABEL" 
								 mode="E,E,I"
								 size="30"
								 maxlength="30"
								 readonly="true"/>
		

	
	</layout:column> 
	<layout:column>
		<layout:html align="left">
		    <bean:message key="ReservaForm.direccion.div.location.label" /> 
	    	<bean:message key="ReservaForm.direccion.div.location" /> 
		</layout:html>
		<div id="map_canvas" style="width:400px;height:300px;"/>
	</layout:column>	
	</layout:row>
	<layout:row>	 
		 						 
		<layout:space/>
	  
		  <layout:formActions>
				<layout:submit mode="N,D,N" reqCode="<%=HttpUtils.STRUTS_ACTION_SAVE%>" styleClass="button" onclick="return validarFechayHora();">
					<bean:message key="button.save"/></layout:submit>
				<layout:submit mode="D,N,N" reqCode="<%=HttpUtils.STRUTS_ACTION_SAVE_NEW%>" 
				styleClass="button" onclick="return validarFechayHora();">
					<bean:message key="button.insert"/></layout:submit>
				<layout:button mode="D,D,D" reqCode="<%=HttpUtils.STRUTS_ACTION_FIND_DATA%>" onclick="window.location='reserva.do?reqCode=findData';"  styleClass="button">
					<bean:message key="button.back"/></layout:button>
				
				<logic:equal name="reservaForm"  property="estado" value="A realizar">
				<layout:submit mode="N,D,D" reqCode="<%=HttpUtils.STRUTS_ACTION_CANCELAR_RESERVA%>" styleClass="button" onclick="return confirm('Realmente desea Cancelar esta reserva?');" >
					<bean:message key="ReservaForm.button.cancel"  />
				</layout:submit>	
				</logic:equal>
				
				<logic:equal name="reservaForm"  property="estado" value="En proceso">
				<layout:submit mode="N,D,D" reqCode="<%=HttpUtils.STRUTS_ACTION_CANCELAR_RESERVA%>" styleClass="button" onclick="return confirm('Realmente desea Cancelar esta reserva?');" >
					<bean:message key="ReservaForm.button.cancel"  />
				</layout:submit>	
				</logic:equal>
				 
				<layout:button mode="D,D,N" reqCode="<%=HttpUtils.STRUTS_ACTION_GOOGLEMAP_VIEW%>" styleClass="button" onclick="javascript:window.open('googlemap_view.html','Google View ','width=1000,height=550')">
					<bean:message key="ReservaForm.button.googlemapsview.label"/>
				</layout:button>
					
		  </layout:formActions>
		 
		</layout:row>
		  <layout:space/>
		  <layout:message  key="slort.mensajes.campos.obligatorios" />
	</layout:form>
	
	<%-- CONTENT.FIN ----------------------------------------------------------------------------- --%>
	</template:put>
</template:insert>

<script type="text/javascript">
    //alert("ARRANCO");
    //alert(document.getElementsByName("direccionGoogle"));
  	var direccionGoogle=document.getElementsByName("direccionGoogle");
    //alert(direccionGoogle.toString());
    if (direccionGoogle[0].value!=""){
    	 var txtLocation=document.getElementsByName("location");
    	 txtLocation[0].value=direccionGoogle[0].value;
    }
</script>
