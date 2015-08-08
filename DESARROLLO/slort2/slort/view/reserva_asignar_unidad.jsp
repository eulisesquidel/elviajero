<%@ page language="java" %>
<%@ page import="com.bdb.util.HttpUtils"%> 
<%@ page import="com.slort.util.SlortUtils"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-layout.tld" prefix="layout" %>
<%@ taglib uri='/WEB-INF/struts-template.tld' prefix='template' %>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app" %>
<%@ taglib uri='/WEB-INF/struts-bean.tld' prefix='bean' %>

  <head>
    <meta http-equiv="content-type" content="text/html; charset=ISO-8859-1"/>
     <%-- <script src="http://maps.google.com/maps?file=api&amp;v=2.x&amp;key=ABQIAAAAzr2EBOXUKnm_jVnk0OJI7xSosDVG8KKPE1-m51RBrvYughuyMxQ-i1QfUnH94QxWIa6N4U6MouMmBA" 
            type="text/javascript"></script>--%>
    <script src="http://maps.google.com/maps?file=api&amp;v=2.x&amp;key=ABQIAAAAbuXxLBFMgYlDNbrbDJvWzRSy2ooY7TB3FPLn4gqqVYh8dN86zxTPFEykr52-hr-X4o60TKPs3CaToQ" 
            type="text/javascript"></script>
    <script language="Javascript"  src="jscript/ajax.js"></script>
    <script type="text/javascript" src="jscript/sortable.js"></script>
    	<link rel="stylesheet" type="text/css" href="jscript/example.css"/>
	<script src="jscript/googlemaps.js"></script>
    <script type="text/javascript">



    var map;
	var directions = new Array();
	
    function initialize() {
    	map = new GMap2(document.getElementById("map_canvas"));
	    point = new GLatLng(-34.65580390505896, -58.58802795410156);
	    map.setCenter(point, 10);
	    map.addControl(new GLargeMapControl);
	    //map.addOverlay(new GMarker(point)); 
	    ajax_GoogleMaps_Distance (this,"getUbicacionrealGoogleMapsView");
	    map.closeInfoWindow();
	    removeRowFromTable();
	    
    }
    
    
    
    function calcularDistancia(i,lat, long, info, latlongGM, totalmoviles, cod_unidad){
        
        
        /* 
        point2 = new GLatLng(lat,long);
        point3 = new GLatLng(lat,long);        
        var marker = new GMarker(point2)
        GEvent.addListener(marker, "click", function() { 
		    var myHtml = "<b>#" + info + "</b>"; 
		    map.openInfoWindowHtml(new GLatLng(lat,long), myHtml); 
		    }); 
        map.addOverlay(marker);
        */
        directions[i]= new GDirections(map);
        
        var latitudDestino=document.getElementsByName("latitud");
		var longitudDestino=document.getElementsByName("longitud");

		var latlongGMDestino = "("+ latitudDestino[0].value +","+longitudDestino[0].value +")";

        //alert (latlongGM);
        //alert (latlongGMDestino);
        
      	directions[i].load("from: "+ latlongGM +" to: "+ latlongGMDestino +"");
      	
      	// alert( "totalmoviles: "+ totalmoviles);
      	// alert( "totalmoviles: "+ i);

      	if (i >= totalmoviles)
	      	GEvent.addListener(directions[i], "load",function() { 
	      	        //alert( "html: "+ directions[i].getDistance().html +" " + directions[i].getDuration().html);
	          	    //alert( "texto: "+ directions[i].getDistance().value +" " + directions[i].getDuration().value);
	          	    document.getElementById("route").innerHTML = directions[i].getDistance().html +" " + directions[i].getDuration().html ;
	                addRowToTable ( info, obtenerDistanciaenNumero (directions[i].getDistance().html), directions[i].getDuration().html, cod_unidad);    			
	       		    var tbl = document.getElementById('table');
	       			ts_resortTable(tbl.rows[0].cells[0].firstChild, 3);
	       			tbl.rows[1].cells[4].firstChild.checked=true; 
	       			//tbl.rows[1].cells[4].firstChild.value="motivo1";
	        });
	    else
	        GEvent.addListener(directions[i], "load",function() { 
	      	        //alert( "html: "+ directions[i].getDistance().html +" " + directions[i].getDuration().html);
	          	    //alert( "texto: "+ directions[i].getDistance().value +" " + directions[i].getDuration().value);
	          	    document.getElementById("route").innerHTML = directions[i].getDistance().html +" " + directions[i].getDuration().html ;
	                addRowToTable (info, obtenerDistanciaenNumero (directions[i].getDistance().html), directions[i].getDuration().html, cod_unidad);    			
	       			
	        });    

    }
    
    
    
    
    function onGDirectionsLoad(){
      document.getElementById("route").innerHTML = directions.getSummaryHtml();
   	}



	function addRowToTable( info,distancia,tiempo, cod_unidad)
	{
		  var tbl = document.getElementById('table');
		  var lastRow = tbl.rows.length;
		  // if there's no header row in the table, then iteration = lastRow + 1
		  var iteration = lastRow-1;
		  var row = tbl.insertRow(lastRow);
		  
	
  		  var cellRight = row.insertCell(0);
		  cellRight.innerHTML = cod_unidad;
		  
		  /*		  
		  var cellRight = row.insertCell(0);
		  el = document.createElement('input');
		  el.type = 'text';
		  el.name = 'unidad';
		  el.id = 'unidad' + iteration;
		  el.size = 4;
		  el.value = cod_unidad;
		  el.readOnly  = true;
		  cellRight.appendChild(el); 
		  */		  
		  // right cell
		  
		  cellRight = row.insertCell(1);
		  cellRight.innerHTML = info;
		  
		  cellRight = row.insertCell(2);
		  cellRight.innerHTML = tiempo;
		  
		  /*
		  cellRight = row.insertCell(2);
		  el = document.createElement('input');
		  el.type = 'text';
		  el.name = 'tiempo';
		  el.id = 'tiempo' + iteration;
		  el.size = 6;
		  el.value = tiempo;
		  el.readOnly  = true;
		  cellRight.appendChild(el); 
		  */
		  
		  
		  cellRight = row.insertCell(3);	  
		  cellRight.innerHTML = distancia  ;
		  
		  /*
		  cellRight = row.insertCell(3);
		  el = document.createElement('input');
		  el.type = 'text';
		  el.name = 'distancia';
		  el.id = 'distancia' + iteration;
		  el.size = 7;
		  el.value = distancia;
		  el.readOnly  = true;
		  cellRight.appendChild(el); 
		*/ 
		
		  cellRight = row.insertCell(4);
		  el = document.createElement('input');
		  el.type = 'radio';
		  el.name = 'unidadAsignada';
		  el.id = 'unidadAsignada' + iteration;
		  //if (iteration==1) el.checked=true;
		  
          el.onclick=function(){
          var tbl = document.getElementById('table');
          iteration=lastRow-1;
          //alert(tbl.rows[3].cells[3].innerHTML);
          var iHTML='<input id="unidadAsignada'+iteration+'" name="unidadAsignada" type="radio">';
          for (i=0;i<tbl.rows.length;i++){
               if (tbl.rows[i].cells[4].innerHTML==iHTML){
                   fila=i;
               }
       	  } 	
          validarSeleccionUnidad(tbl,fila);
          }
          
		  cellRight.appendChild(el);
		  
	
		  cellRight = row.insertCell(5);
		  el = document.createElement('input');
		  el.type = 'text';
		  el.name = 'motivo';
		  el.id = 'motivo' + iteration;
		  el.size = 30;
		  el.value = "";
		  cellRight.appendChild(el);  
		  
		  
	 
		  
	 }

     function validarSeleccionUnidad(tbl,i){
       //alert( " SI ");
       for (j=1;j<i;j++){
               if (tbl.rows[j].cells[5].firstChild.value==""){
                   alert("Completar motivo de NO ASIGNACION de la unidad anterior");
                   tbl.rows[j].cells[4].firstChild.checked=true;
                   return false;
               }
       }   
       //var direccion=document.getElementsByName('flotaCompleta');
	   //flota.flotaCompleta[0].value = tbl.rows[i].cells[0].textContent;
       return true;               
    }

	function removeRowFromTable()
	{
		  var tbl = document.getElementById('table');
		  var lastRow = tbl.rows.length;
		  tbl.deleteRow(1);
	}
	
	
	function obtenerDistanciaenNumero(pDato) {
	    pDato = pDato.replace("&nbsp;", "");
	    pDato = pDato.replace(" ", "");
	    pDato = pDato.replace("km", "");
	    pDato = pDato.replace("Km", "");
		pDato = pDato.replace("KM", "");
		//pDato = pDato.replace(".", "");
		//pDato = pDato.replace(",", ".");
		if (pDato.indexOf("m")!=-1){
			// estamos hablando de metos 
			pDato = pDato.replace("m");
			pDato = parseFloat(pDato,10) / 1000;
			pDato = pDato.toString().replace(".",",");
			
		}
		return pDato;
	    
    }


	
	function armarPaquetedeDatosRankingdeUnidades(){
	var datos="";
	var dato_unidad ="";
	var dato_unidadAsignada = "";
	var dato_motivo = "";	   
	var linea ="";
    var strid_unidad = "";
	var strid_unidadAsignada ="";
	var strid_motivo = "";
	var iHTML="";
			   
		tbls = document.getElementById("table");
		for (i=1;i<tbls.rows.length;i++) {
		
				dato_unidad = tbls.rows[i].cells[0].textContent;
				dato_unidadAsignada = tbls.rows[i].cells[4].firstChild.checked;
				dato_motivo = tbls.rows[i].cells[5].firstChild.value;
				dato_tiempo = tbls.rows[i].cells[2].textContent;
				dato_distancia = tbls.rows[i].cells[3].textContent;
		        // falta el ranking
		        //alert(i);	       	 	
			    //alert(dato_unidad);   
			    //alert(dato_unidadAsignada);   
			    //alert(dato_motivo);   
			    
		
		    	linea = i +  "-" + dato_unidad + "-" + dato_unidadAsignada + "-" + dato_motivo + "-" + dato_tiempo+ "-" + dato_distancia;    
			    datos = datos + linea + ";"
		}
		return datos;
	}


    </script>    			
  </head>


<app:CheckSimpleLogon />



<template:insert template='templates/default.jsp'>


  <template:put name='OnLoad' > 
  	initialize();
  </template:put>
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
	<layout:form action="/reserva.do" styleClass="Body" reqCode="">
    <layout:row>
    	<layout:column width="50%">
    	
    			<layout:text key="ReservaForm.idReserva" 
									 property="idReserva" 
									 styleClass="LABEL"
									 mode="H,I,I"
									 size="6"
									 maxlength="6"/>
    	
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
								 
						 
	
			<table border="0" id="table"  class="sortable" width="100%">
			<tr>
			<th width="10%">Código</th>
			<th width="30%">Descripción</th>
			<th width="10%">Tiempo</th>
			<th width="10%">Distancia (Kms)</th>
			<th width="10%">Asignado</th>
			<th width="30%">Motivo</th>
			</tr>
			<tr>
			<td><input type="text" name="unidad"
			id="unidad" /></td>
			<td><input type="text" name="descripcion"
			id="descripcion" size="40" /></td>
			<td><input type="text" name="tiempo"
			id="tiempo" size="7" /></td>
			<td></td>
			<td>
			<input type="radio" name="unidadAsignada" value="">
			</td>
			<td><input type="text" name="motivo"
			id="motivo" size="30" maxlength="100"/></td>
			</tr>
			</table>


	</layout:column> 
	<layout:column width="50%">
	
			<layout:html  align="center">
			    <span id="span_result"></span>
			    <div id="route"></div>
				<div   id="map_canvas" style="width:400px;height:300px;"/>
			</layout:html>
		
	</layout:column>	
	</layout:row>
	<layout:row>	 
		 						 
		<layout:space/>
	  
		  <layout:formActions>

				<layout:button mode="D,D,N" reqCode="<%=HttpUtils.STRUTS_ACTION_SAVE%>" styleClass="button" 
											 onclick="ajax_guardarAJAX(this,'getGuardarRankingyUnidad');" >
					<bean:message key="button.save"/>
				</layout:button>
				
				<layout:button mode="D,D,N" reqCode="<%=HttpUtils.STRUTS_ACTION_SAVE%>" styleClass="button" 
											 onclick="ajax_guardarAJAX(this,'getGuardarSinAsignar');" >
					<bean:message key="button.back"/>
				</layout:button>
				
						
		  </layout:formActions>
		</layout:row>
	</layout:form>
	
	<%-- CONTENT.FIN ----------------------------------------------------------------------------- --%>
	</template:put>
</template:insert>
