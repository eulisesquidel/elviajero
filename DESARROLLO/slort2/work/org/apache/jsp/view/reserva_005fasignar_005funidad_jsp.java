package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bdb.util.HttpUtils;
import com.slort.util.SlortUtils;

public final class reserva_005fasignar_005funidad_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(5);
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-layout.tld");
    _jspx_dependants.add("/WEB-INF/struts-template.tld");
    _jspx_dependants.add("/WEB-INF/app.tld");
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fapp_005fCheckSimpleLogon_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005fput_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fapp_005fActionLabelTag_005fparameter_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fform_005fstyleClass_005freqCode_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005frow;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fcolumn_005fwidth;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005freadonly_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fhtml_005falign;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fspace_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fformActions;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fbutton_005fstyleClass_005freqCode_005fonclick_005fmode;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fapp_005fCheckSimpleLogon_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fapp_005fActionLabelTag_005fparameter_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fform_005fstyleClass_005freqCode_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005frow = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fcolumn_005fwidth = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005freadonly_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fhtml_005falign = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fspace_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fformActions = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fbutton_005fstyleClass_005freqCode_005fonclick_005fmode = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fapp_005fCheckSimpleLogon_005fnobody.release();
    _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate.release();
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname.release();
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.release();
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect.release();
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fapp_005fActionLabelTag_005fparameter_005fnobody.release();
    _005fjspx_005ftagPool_005flayout_005fform_005fstyleClass_005freqCode_005faction.release();
    _005fjspx_005ftagPool_005flayout_005frow.release();
    _005fjspx_005ftagPool_005flayout_005fcolumn_005fwidth.release();
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005freadonly_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005flayout_005fhtml_005falign.release();
    _005fjspx_005ftagPool_005flayout_005fspace_005fnobody.release();
    _005fjspx_005ftagPool_005flayout_005fformActions.release();
    _005fjspx_005ftagPool_005flayout_005fbutton_005fstyleClass_005freqCode_005fonclick_005fmode.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta http-equiv=\"content-type\" content=\"text/html; charset=ISO-8859-1\"/>\r\n");
      out.write("     ");
      out.write("\r\n");
      out.write("    <script src=\"http://maps.google.com/maps?file=api&amp;v=2.x&amp;key=ABQIAAAAbuXxLBFMgYlDNbrbDJvWzRSy2ooY7TB3FPLn4gqqVYh8dN86zxTPFEykr52-hr-X4o60TKPs3CaToQ\" \r\n");
      out.write("            type=\"text/javascript\"></script>\r\n");
      out.write("    <script language=\"Javascript\"  src=\"jscript/ajax.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"jscript/sortable.js\"></script>\r\n");
      out.write("    \t<link rel=\"stylesheet\" type=\"text/css\" href=\"jscript/example.css\"/>\r\n");
      out.write("\t<script src=\"jscript/googlemaps.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    var map;\r\n");
      out.write("\tvar directions = new Array();\r\n");
      out.write("\t\r\n");
      out.write("    function initialize() {\r\n");
      out.write("    \tmap = new GMap2(document.getElementById(\"map_canvas\"));\r\n");
      out.write("\t    point = new GLatLng(-34.65580390505896, -58.58802795410156);\r\n");
      out.write("\t    map.setCenter(point, 10);\r\n");
      out.write("\t    map.addControl(new GLargeMapControl);\r\n");
      out.write("\t    //map.addOverlay(new GMarker(point)); \r\n");
      out.write("\t    ajax_GoogleMaps_Distance (this,\"getUbicacionrealGoogleMapsView\");\r\n");
      out.write("\t    map.closeInfoWindow();\r\n");
      out.write("\t    removeRowFromTable();\r\n");
      out.write("\t    \r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    function calcularDistancia(i,lat, long, info, latlongGM, totalmoviles, cod_unidad){\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        /* \r\n");
      out.write("        point2 = new GLatLng(lat,long);\r\n");
      out.write("        point3 = new GLatLng(lat,long);        \r\n");
      out.write("        var marker = new GMarker(point2)\r\n");
      out.write("        GEvent.addListener(marker, \"click\", function() { \r\n");
      out.write("\t\t    var myHtml = \"<b>#\" + info + \"</b>\"; \r\n");
      out.write("\t\t    map.openInfoWindowHtml(new GLatLng(lat,long), myHtml); \r\n");
      out.write("\t\t    }); \r\n");
      out.write("        map.addOverlay(marker);\r\n");
      out.write("        */\r\n");
      out.write("        directions[i]= new GDirections(map);\r\n");
      out.write("        \r\n");
      out.write("        var latitudDestino=document.getElementsByName(\"latitud\");\r\n");
      out.write("\t\tvar longitudDestino=document.getElementsByName(\"longitud\");\r\n");
      out.write("\r\n");
      out.write("\t\tvar latlongGMDestino = \"(\"+ latitudDestino[0].value +\",\"+longitudDestino[0].value +\")\";\r\n");
      out.write("\r\n");
      out.write("        //alert (latlongGM);\r\n");
      out.write("        //alert (latlongGMDestino);\r\n");
      out.write("        \r\n");
      out.write("      \tdirections[i].load(\"from: \"+ latlongGM +\" to: \"+ latlongGMDestino +\"\");\r\n");
      out.write("      \t\r\n");
      out.write("      \t// alert( \"totalmoviles: \"+ totalmoviles);\r\n");
      out.write("      \t// alert( \"totalmoviles: \"+ i);\r\n");
      out.write("\r\n");
      out.write("      \tif (i >= totalmoviles)\r\n");
      out.write("\t      \tGEvent.addListener(directions[i], \"load\",function() { \r\n");
      out.write("\t      \t        //alert( \"html: \"+ directions[i].getDistance().html +\" \" + directions[i].getDuration().html);\r\n");
      out.write("\t          \t    //alert( \"texto: \"+ directions[i].getDistance().value +\" \" + directions[i].getDuration().value);\r\n");
      out.write("\t          \t    document.getElementById(\"route\").innerHTML = directions[i].getDistance().html +\" \" + directions[i].getDuration().html ;\r\n");
      out.write("\t                addRowToTable ( info, obtenerDistanciaenNumero (directions[i].getDistance().html), directions[i].getDuration().html, cod_unidad);    \t\t\t\r\n");
      out.write("\t       \t\t    var tbl = document.getElementById('table');\r\n");
      out.write("\t       \t\t\tts_resortTable(tbl.rows[0].cells[0].firstChild, 3);\r\n");
      out.write("\t       \t\t\ttbl.rows[1].cells[4].firstChild.checked=true; \r\n");
      out.write("\t       \t\t\t//tbl.rows[1].cells[4].firstChild.value=\"motivo1\";\r\n");
      out.write("\t        });\r\n");
      out.write("\t    else\r\n");
      out.write("\t        GEvent.addListener(directions[i], \"load\",function() { \r\n");
      out.write("\t      \t        //alert( \"html: \"+ directions[i].getDistance().html +\" \" + directions[i].getDuration().html);\r\n");
      out.write("\t          \t    //alert( \"texto: \"+ directions[i].getDistance().value +\" \" + directions[i].getDuration().value);\r\n");
      out.write("\t          \t    document.getElementById(\"route\").innerHTML = directions[i].getDistance().html +\" \" + directions[i].getDuration().html ;\r\n");
      out.write("\t                addRowToTable (info, obtenerDistanciaenNumero (directions[i].getDistance().html), directions[i].getDuration().html, cod_unidad);    \t\t\t\r\n");
      out.write("\t       \t\t\t\r\n");
      out.write("\t        });    \r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    function onGDirectionsLoad(){\r\n");
      out.write("      document.getElementById(\"route\").innerHTML = directions.getSummaryHtml();\r\n");
      out.write("   \t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tfunction addRowToTable( info,distancia,tiempo, cod_unidad)\r\n");
      out.write("\t{\r\n");
      out.write("\t\t  var tbl = document.getElementById('table');\r\n");
      out.write("\t\t  var lastRow = tbl.rows.length;\r\n");
      out.write("\t\t  // if there's no header row in the table, then iteration = lastRow + 1\r\n");
      out.write("\t\t  var iteration = lastRow-1;\r\n");
      out.write("\t\t  var row = tbl.insertRow(lastRow);\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\r\n");
      out.write("  \t\t  var cellRight = row.insertCell(0);\r\n");
      out.write("\t\t  cellRight.innerHTML = cod_unidad;\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  /*\t\t  \r\n");
      out.write("\t\t  var cellRight = row.insertCell(0);\r\n");
      out.write("\t\t  el = document.createElement('input');\r\n");
      out.write("\t\t  el.type = 'text';\r\n");
      out.write("\t\t  el.name = 'unidad';\r\n");
      out.write("\t\t  el.id = 'unidad' + iteration;\r\n");
      out.write("\t\t  el.size = 4;\r\n");
      out.write("\t\t  el.value = cod_unidad;\r\n");
      out.write("\t\t  el.readOnly  = true;\r\n");
      out.write("\t\t  cellRight.appendChild(el); \r\n");
      out.write("\t\t  */\t\t  \r\n");
      out.write("\t\t  // right cell\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  cellRight = row.insertCell(1);\r\n");
      out.write("\t\t  cellRight.innerHTML = info;\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  cellRight = row.insertCell(2);\r\n");
      out.write("\t\t  cellRight.innerHTML = tiempo;\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  /*\r\n");
      out.write("\t\t  cellRight = row.insertCell(2);\r\n");
      out.write("\t\t  el = document.createElement('input');\r\n");
      out.write("\t\t  el.type = 'text';\r\n");
      out.write("\t\t  el.name = 'tiempo';\r\n");
      out.write("\t\t  el.id = 'tiempo' + iteration;\r\n");
      out.write("\t\t  el.size = 6;\r\n");
      out.write("\t\t  el.value = tiempo;\r\n");
      out.write("\t\t  el.readOnly  = true;\r\n");
      out.write("\t\t  cellRight.appendChild(el); \r\n");
      out.write("\t\t  */\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  cellRight = row.insertCell(3);\t  \r\n");
      out.write("\t\t  cellRight.innerHTML = distancia  ;\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  /*\r\n");
      out.write("\t\t  cellRight = row.insertCell(3);\r\n");
      out.write("\t\t  el = document.createElement('input');\r\n");
      out.write("\t\t  el.type = 'text';\r\n");
      out.write("\t\t  el.name = 'distancia';\r\n");
      out.write("\t\t  el.id = 'distancia' + iteration;\r\n");
      out.write("\t\t  el.size = 7;\r\n");
      out.write("\t\t  el.value = distancia;\r\n");
      out.write("\t\t  el.readOnly  = true;\r\n");
      out.write("\t\t  cellRight.appendChild(el); \r\n");
      out.write("\t\t*/ \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t  cellRight = row.insertCell(4);\r\n");
      out.write("\t\t  el = document.createElement('input');\r\n");
      out.write("\t\t  el.type = 'radio';\r\n");
      out.write("\t\t  el.name = 'unidadAsignada';\r\n");
      out.write("\t\t  el.id = 'unidadAsignada' + iteration;\r\n");
      out.write("\t\t  //if (iteration==1) el.checked=true;\r\n");
      out.write("\t\t  \r\n");
      out.write("          el.onclick=function(){\r\n");
      out.write("          var tbl = document.getElementById('table');\r\n");
      out.write("          iteration=lastRow-1;\r\n");
      out.write("          //alert(tbl.rows[3].cells[3].innerHTML);\r\n");
      out.write("          var iHTML='<input id=\"unidadAsignada'+iteration+'\" name=\"unidadAsignada\" type=\"radio\">';\r\n");
      out.write("          for (i=0;i<tbl.rows.length;i++){\r\n");
      out.write("               if (tbl.rows[i].cells[4].innerHTML==iHTML){\r\n");
      out.write("                   fila=i;\r\n");
      out.write("               }\r\n");
      out.write("       \t  } \t\r\n");
      out.write("          validarSeleccionUnidad(tbl,fila);\r\n");
      out.write("          }\r\n");
      out.write("          \r\n");
      out.write("\t\t  cellRight.appendChild(el);\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\r\n");
      out.write("\t\t  cellRight = row.insertCell(5);\r\n");
      out.write("\t\t  el = document.createElement('input');\r\n");
      out.write("\t\t  el.type = 'text';\r\n");
      out.write("\t\t  el.name = 'motivo';\r\n");
      out.write("\t\t  el.id = 'motivo' + iteration;\r\n");
      out.write("\t\t  el.size = 30;\r\n");
      out.write("\t\t  el.value = \"\";\r\n");
      out.write("\t\t  cellRight.appendChild(el);  \r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  \r\n");
      out.write("\t \r\n");
      out.write("\t\t  \r\n");
      out.write("\t }\r\n");
      out.write("\r\n");
      out.write("     function validarSeleccionUnidad(tbl,i){\r\n");
      out.write("       //alert( \" SI \");\r\n");
      out.write("       for (j=1;j<i;j++){\r\n");
      out.write("               if (tbl.rows[j].cells[5].firstChild.value==\"\"){\r\n");
      out.write("                   alert(\"Completar motivo de NO ASIGNACION de la unidad anterior\");\r\n");
      out.write("                   tbl.rows[j].cells[4].firstChild.checked=true;\r\n");
      out.write("                   return false;\r\n");
      out.write("               }\r\n");
      out.write("       }   \r\n");
      out.write("       //var direccion=document.getElementsByName('flotaCompleta');\r\n");
      out.write("\t   //flota.flotaCompleta[0].value = tbl.rows[i].cells[0].textContent;\r\n");
      out.write("       return true;               \r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\tfunction removeRowFromTable()\r\n");
      out.write("\t{\r\n");
      out.write("\t\t  var tbl = document.getElementById('table');\r\n");
      out.write("\t\t  var lastRow = tbl.rows.length;\r\n");
      out.write("\t\t  tbl.deleteRow(1);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction obtenerDistanciaenNumero(pDato) {\r\n");
      out.write("\t    pDato = pDato.replace(\"&nbsp;\", \"\");\r\n");
      out.write("\t    pDato = pDato.replace(\" \", \"\");\r\n");
      out.write("\t    pDato = pDato.replace(\"km\", \"\");\r\n");
      out.write("\t    pDato = pDato.replace(\"Km\", \"\");\r\n");
      out.write("\t\tpDato = pDato.replace(\"KM\", \"\");\r\n");
      out.write("\t\t//pDato = pDato.replace(\".\", \"\");\r\n");
      out.write("\t\t//pDato = pDato.replace(\",\", \".\");\r\n");
      out.write("\t\tif (pDato.indexOf(\"m\")!=-1){\r\n");
      out.write("\t\t\t// estamos hablando de metos \r\n");
      out.write("\t\t\tpDato = pDato.replace(\"m\");\r\n");
      out.write("\t\t\tpDato = parseFloat(pDato,10) / 1000;\r\n");
      out.write("\t\t\tpDato = pDato.toString().replace(\".\",\",\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn pDato;\r\n");
      out.write("\t    \r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\tfunction armarPaquetedeDatosRankingdeUnidades(){\r\n");
      out.write("\tvar datos=\"\";\r\n");
      out.write("\tvar dato_unidad =\"\";\r\n");
      out.write("\tvar dato_unidadAsignada = \"\";\r\n");
      out.write("\tvar dato_motivo = \"\";\t   \r\n");
      out.write("\tvar linea =\"\";\r\n");
      out.write("    var strid_unidad = \"\";\r\n");
      out.write("\tvar strid_unidadAsignada =\"\";\r\n");
      out.write("\tvar strid_motivo = \"\";\r\n");
      out.write("\tvar iHTML=\"\";\r\n");
      out.write("\t\t\t   \r\n");
      out.write("\t\ttbls = document.getElementById(\"table\");\r\n");
      out.write("\t\tfor (i=1;i<tbls.rows.length;i++) {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\tdato_unidad = tbls.rows[i].cells[0].textContent;\r\n");
      out.write("\t\t\t\tdato_unidadAsignada = tbls.rows[i].cells[4].firstChild.checked;\r\n");
      out.write("\t\t\t\tdato_motivo = tbls.rows[i].cells[5].firstChild.value;\r\n");
      out.write("\t\t\t\tdato_tiempo = tbls.rows[i].cells[2].textContent;\r\n");
      out.write("\t\t\t\tdato_distancia = tbls.rows[i].cells[3].textContent;\r\n");
      out.write("\t\t        // falta el ranking\r\n");
      out.write("\t\t        //alert(i);\t       \t \t\r\n");
      out.write("\t\t\t    //alert(dato_unidad);   \r\n");
      out.write("\t\t\t    //alert(dato_unidadAsignada);   \r\n");
      out.write("\t\t\t    //alert(dato_motivo);   \r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t    \tlinea = i +  \"-\" + dato_unidad + \"-\" + dato_unidadAsignada + \"-\" + dato_motivo + \"-\" + dato_tiempo+ \"-\" + dato_distancia;    \r\n");
      out.write("\t\t\t    datos = datos + linea + \";\"\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn datos;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </script>    \t\t\t\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_app_005fCheckSimpleLogon_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  template:insert
      org.apache.struts.taglib.template.InsertTag _jspx_th_template_005finsert_005f0 = (org.apache.struts.taglib.template.InsertTag) _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate.get(org.apache.struts.taglib.template.InsertTag.class);
      _jspx_th_template_005finsert_005f0.setPageContext(_jspx_page_context);
      _jspx_th_template_005finsert_005f0.setParent(null);
      _jspx_th_template_005finsert_005f0.setTemplate("templates/default.jsp");
      int _jspx_eval_template_005finsert_005f0 = _jspx_th_template_005finsert_005f0.doStartTag();
      if (_jspx_eval_template_005finsert_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("  ");
          if (_jspx_meth_template_005fput_005f0(_jspx_th_template_005finsert_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("  ");
          out.write("\r\n");
          out.write("  ");
          if (_jspx_meth_template_005fput_005f1(_jspx_th_template_005finsert_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("  \r\n");
          out.write("  ");
          out.write("\r\n");
          out.write("  ");
          if (_jspx_meth_template_005fput_005f2(_jspx_th_template_005finsert_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write(" \r\n");
          out.write("  ");
          out.write("\r\n");
          out.write("  ");
          //  template:put
          org.apache.struts.taglib.template.PutTag _jspx_th_template_005fput_005f3 = (org.apache.struts.taglib.template.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname.get(org.apache.struts.taglib.template.PutTag.class);
          _jspx_th_template_005fput_005f3.setPageContext(_jspx_page_context);
          _jspx_th_template_005fput_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
          _jspx_th_template_005fput_005f3.setName("content");
          int _jspx_eval_template_005fput_005f3 = _jspx_th_template_005fput_005f3.doStartTag();
          if (_jspx_eval_template_005fput_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_template_005fput_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_template_005fput_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_template_005fput_005f3.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\r\n");
              out.write("  \r\n");
              out.write("\t");
              out.write('\r');
              out.write('\n');
              out.write('	');
              //  layout:form
              fr.improve.struts.taglib.layout.FormTag _jspx_th_layout_005fform_005f0 = (fr.improve.struts.taglib.layout.FormTag) _005fjspx_005ftagPool_005flayout_005fform_005fstyleClass_005freqCode_005faction.get(fr.improve.struts.taglib.layout.FormTag.class);
              _jspx_th_layout_005fform_005f0.setPageContext(_jspx_page_context);
              _jspx_th_layout_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005fput_005f3);
              _jspx_th_layout_005fform_005f0.setAction("/reserva.do");
              _jspx_th_layout_005fform_005f0.setStyleClass("Body");
              _jspx_th_layout_005fform_005f0.setReqCode("");
              int _jspx_eval_layout_005fform_005f0 = _jspx_th_layout_005fform_005f0.doStartTag();
              if (_jspx_eval_layout_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("    ");
                  if (_jspx_meth_layout_005frow_005f0(_jspx_th_layout_005fform_005f0, _jspx_page_context))
                    return;
                  out.write('\r');
                  out.write('\n');
                  out.write('	');
                  //  layout:row
                  fr.improve.struts.taglib.layout.RowTag _jspx_th_layout_005frow_005f1 = (fr.improve.struts.taglib.layout.RowTag) _005fjspx_005ftagPool_005flayout_005frow.get(fr.improve.struts.taglib.layout.RowTag.class);
                  _jspx_th_layout_005frow_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_layout_005frow_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fform_005f0);
                  int _jspx_eval_layout_005frow_005f1 = _jspx_th_layout_005frow_005f1.doStartTag();
                  if (_jspx_eval_layout_005frow_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\t \r\n");
                      out.write("\t\t \t\t\t\t\t\t \r\n");
                      out.write("\t\t");
                      if (_jspx_meth_layout_005fspace_005f0(_jspx_th_layout_005frow_005f1, _jspx_page_context))
                        return;
                      out.write("\r\n");
                      out.write("\t  \r\n");
                      out.write("\t\t  ");
                      //  layout:formActions
                      fr.improve.struts.taglib.layout.FormActions _jspx_th_layout_005fformActions_005f0 = (fr.improve.struts.taglib.layout.FormActions) _005fjspx_005ftagPool_005flayout_005fformActions.get(fr.improve.struts.taglib.layout.FormActions.class);
                      _jspx_th_layout_005fformActions_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_layout_005fformActions_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005frow_005f1);
                      int _jspx_eval_layout_005fformActions_005f0 = _jspx_th_layout_005fformActions_005f0.doStartTag();
                      if (_jspx_eval_layout_005fformActions_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n");
                          out.write("\r\n");
                          out.write("\t\t\t\t");
                          //  layout:button
                          fr.improve.struts.taglib.layout.ButtonTag _jspx_th_layout_005fbutton_005f0 = (fr.improve.struts.taglib.layout.ButtonTag) _005fjspx_005ftagPool_005flayout_005fbutton_005fstyleClass_005freqCode_005fonclick_005fmode.get(fr.improve.struts.taglib.layout.ButtonTag.class);
                          _jspx_th_layout_005fbutton_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_layout_005fbutton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fformActions_005f0);
                          _jspx_th_layout_005fbutton_005f0.setMode("D,D,N");
                          _jspx_th_layout_005fbutton_005f0.setReqCode(HttpUtils.STRUTS_ACTION_SAVE);
                          _jspx_th_layout_005fbutton_005f0.setStyleClass("button");
                          _jspx_th_layout_005fbutton_005f0.setOnclick("ajax_guardarAJAX(this,'getGuardarRankingyUnidad');");
                          int _jspx_eval_layout_005fbutton_005f0 = _jspx_th_layout_005fbutton_005f0.doStartTag();
                          if (_jspx_eval_layout_005fbutton_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_layout_005fbutton_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_layout_005fbutton_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_layout_005fbutton_005f0.doInitBody();
                            }
                            do {
                              out.write("\r\n");
                              out.write("\t\t\t\t\t");
                              if (_jspx_meth_bean_005fmessage_005f1(_jspx_th_layout_005fbutton_005f0, _jspx_page_context))
                              return;
                              out.write("\r\n");
                              out.write("\t\t\t\t");
                              int evalDoAfterBody = _jspx_th_layout_005fbutton_005f0.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_layout_005fbutton_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_layout_005fbutton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005flayout_005fbutton_005fstyleClass_005freqCode_005fonclick_005fmode.reuse(_jspx_th_layout_005fbutton_005f0);
                            return;
                          }
                          _005fjspx_005ftagPool_005flayout_005fbutton_005fstyleClass_005freqCode_005fonclick_005fmode.reuse(_jspx_th_layout_005fbutton_005f0);
                          out.write("\r\n");
                          out.write("\t\t\t\t\r\n");
                          out.write("\t\t\t\t");
                          //  layout:button
                          fr.improve.struts.taglib.layout.ButtonTag _jspx_th_layout_005fbutton_005f1 = (fr.improve.struts.taglib.layout.ButtonTag) _005fjspx_005ftagPool_005flayout_005fbutton_005fstyleClass_005freqCode_005fonclick_005fmode.get(fr.improve.struts.taglib.layout.ButtonTag.class);
                          _jspx_th_layout_005fbutton_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_layout_005fbutton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fformActions_005f0);
                          _jspx_th_layout_005fbutton_005f1.setMode("D,D,N");
                          _jspx_th_layout_005fbutton_005f1.setReqCode(HttpUtils.STRUTS_ACTION_SAVE);
                          _jspx_th_layout_005fbutton_005f1.setStyleClass("button");
                          _jspx_th_layout_005fbutton_005f1.setOnclick("ajax_guardarAJAX(this,'getGuardarSinAsignar');");
                          int _jspx_eval_layout_005fbutton_005f1 = _jspx_th_layout_005fbutton_005f1.doStartTag();
                          if (_jspx_eval_layout_005fbutton_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_layout_005fbutton_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_layout_005fbutton_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_layout_005fbutton_005f1.doInitBody();
                            }
                            do {
                              out.write("\r\n");
                              out.write("\t\t\t\t\t");
                              if (_jspx_meth_bean_005fmessage_005f2(_jspx_th_layout_005fbutton_005f1, _jspx_page_context))
                              return;
                              out.write("\r\n");
                              out.write("\t\t\t\t");
                              int evalDoAfterBody = _jspx_th_layout_005fbutton_005f1.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_layout_005fbutton_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_layout_005fbutton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005flayout_005fbutton_005fstyleClass_005freqCode_005fonclick_005fmode.reuse(_jspx_th_layout_005fbutton_005f1);
                            return;
                          }
                          _005fjspx_005ftagPool_005flayout_005fbutton_005fstyleClass_005freqCode_005fonclick_005fmode.reuse(_jspx_th_layout_005fbutton_005f1);
                          out.write("\r\n");
                          out.write("\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\r\n");
                          out.write("\t\t  ");
                          int evalDoAfterBody = _jspx_th_layout_005fformActions_005f0.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_layout_005fformActions_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flayout_005fformActions.reuse(_jspx_th_layout_005fformActions_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005flayout_005fformActions.reuse(_jspx_th_layout_005fformActions_005f0);
                      out.write("\r\n");
                      out.write("\t\t");
                      int evalDoAfterBody = _jspx_th_layout_005frow_005f1.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_layout_005frow_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flayout_005frow.reuse(_jspx_th_layout_005frow_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005flayout_005frow.reuse(_jspx_th_layout_005frow_005f1);
                  out.write('\r');
                  out.write('\n');
                  out.write('	');
                  int evalDoAfterBody = _jspx_th_layout_005fform_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_layout_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flayout_005fform_005fstyleClass_005freqCode_005faction.reuse(_jspx_th_layout_005fform_005f0);
                return;
              }
              _005fjspx_005ftagPool_005flayout_005fform_005fstyleClass_005freqCode_005faction.reuse(_jspx_th_layout_005fform_005f0);
              out.write("\r\n");
              out.write("\t\r\n");
              out.write("\t");
              out.write('\r');
              out.write('\n');
              out.write('	');
              int evalDoAfterBody = _jspx_th_template_005fput_005f3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_template_005fput_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_template_005fput_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005ftemplate_005fput_005fname.reuse(_jspx_th_template_005fput_005f3);
            return;
          }
          _005fjspx_005ftagPool_005ftemplate_005fput_005fname.reuse(_jspx_th_template_005fput_005f3);
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_template_005finsert_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_template_005finsert_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate.reuse(_jspx_th_template_005finsert_005f0);
        return;
      }
      _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate.reuse(_jspx_th_template_005finsert_005f0);
      out.write('\r');
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_app_005fCheckSimpleLogon_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  app:CheckSimpleLogon
    com.slort.tag.CheckSimpleLogon _jspx_th_app_005fCheckSimpleLogon_005f0 = (com.slort.tag.CheckSimpleLogon) _005fjspx_005ftagPool_005fapp_005fCheckSimpleLogon_005fnobody.get(com.slort.tag.CheckSimpleLogon.class);
    _jspx_th_app_005fCheckSimpleLogon_005f0.setPageContext(_jspx_page_context);
    _jspx_th_app_005fCheckSimpleLogon_005f0.setParent(null);
    int _jspx_eval_app_005fCheckSimpleLogon_005f0 = _jspx_th_app_005fCheckSimpleLogon_005f0.doStartTag();
    if (_jspx_th_app_005fCheckSimpleLogon_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fapp_005fCheckSimpleLogon_005fnobody.reuse(_jspx_th_app_005fCheckSimpleLogon_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fapp_005fCheckSimpleLogon_005fnobody.reuse(_jspx_th_app_005fCheckSimpleLogon_005f0);
    return false;
  }

  private boolean _jspx_meth_template_005fput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005finsert_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:put
    org.apache.struts.taglib.template.PutTag _jspx_th_template_005fput_005f0 = (org.apache.struts.taglib.template.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname.get(org.apache.struts.taglib.template.PutTag.class);
    _jspx_th_template_005fput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
    _jspx_th_template_005fput_005f0.setName("OnLoad");
    int _jspx_eval_template_005fput_005f0 = _jspx_th_template_005fput_005f0.doStartTag();
    if (_jspx_eval_template_005fput_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_template_005fput_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_template_005fput_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_template_005fput_005f0.doInitBody();
      }
      do {
        out.write(" \r\n");
        out.write("  \tinitialize();\r\n");
        out.write("  ");
        int evalDoAfterBody = _jspx_th_template_005fput_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_template_005fput_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_template_005fput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_005fname.reuse(_jspx_th_template_005fput_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname.reuse(_jspx_th_template_005fput_005f0);
    return false;
  }

  private boolean _jspx_meth_template_005fput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005finsert_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:put
    org.apache.struts.taglib.template.PutTag _jspx_th_template_005fput_005f1 = (org.apache.struts.taglib.template.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.get(org.apache.struts.taglib.template.PutTag.class);
    _jspx_th_template_005fput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
    _jspx_th_template_005fput_005f1.setName("titlePage");
    _jspx_th_template_005fput_005f1.setContent(" ");
    _jspx_th_template_005fput_005f1.setDirect("true");
    int _jspx_eval_template_005fput_005f1 = _jspx_th_template_005fput_005f1.doStartTag();
    if (_jspx_th_template_005fput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f1);
    return false;
  }

  private boolean _jspx_meth_template_005fput_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005finsert_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:put
    org.apache.struts.taglib.template.PutTag _jspx_th_template_005fput_005f2 = (org.apache.struts.taglib.template.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect.get(org.apache.struts.taglib.template.PutTag.class);
    _jspx_th_template_005fput_005f2.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
    _jspx_th_template_005fput_005f2.setName("title");
    _jspx_th_template_005fput_005f2.setDirect("true");
    int _jspx_eval_template_005fput_005f2 = _jspx_th_template_005fput_005f2.doStartTag();
    if (_jspx_eval_template_005fput_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_template_005fput_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_template_005fput_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_template_005fput_005f2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("  \t");
        if (_jspx_meth_bean_005fmessage_005f0(_jspx_th_template_005fput_005f2, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("  \t");
        if (_jspx_meth_app_005fActionLabelTag_005f0(_jspx_th_template_005fput_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("  ");
        int evalDoAfterBody = _jspx_th_template_005fput_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_template_005fput_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_template_005fput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect.reuse(_jspx_th_template_005fput_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect.reuse(_jspx_th_template_005fput_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005fput_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f0 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005fput_005f2);
    _jspx_th_bean_005fmessage_005f0.setKey("ReservaForm.window.titulo");
    int _jspx_eval_bean_005fmessage_005f0 = _jspx_th_bean_005fmessage_005f0.doStartTag();
    if (_jspx_th_bean_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_app_005fActionLabelTag_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005fput_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  app:ActionLabelTag
    com.slort.tag.ActionLabelTag _jspx_th_app_005fActionLabelTag_005f0 = (com.slort.tag.ActionLabelTag) _005fjspx_005ftagPool_005fapp_005fActionLabelTag_005fparameter_005fnobody.get(com.slort.tag.ActionLabelTag.class);
    _jspx_th_app_005fActionLabelTag_005f0.setPageContext(_jspx_page_context);
    _jspx_th_app_005fActionLabelTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005fput_005f2);
    _jspx_th_app_005fActionLabelTag_005f0.setParameter("reqCode");
    int _jspx_eval_app_005fActionLabelTag_005f0 = _jspx_th_app_005fActionLabelTag_005f0.doStartTag();
    if (_jspx_th_app_005fActionLabelTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fapp_005fActionLabelTag_005fparameter_005fnobody.reuse(_jspx_th_app_005fActionLabelTag_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fapp_005fActionLabelTag_005fparameter_005fnobody.reuse(_jspx_th_app_005fActionLabelTag_005f0);
    return false;
  }

  private boolean _jspx_meth_layout_005frow_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:row
    fr.improve.struts.taglib.layout.RowTag _jspx_th_layout_005frow_005f0 = (fr.improve.struts.taglib.layout.RowTag) _005fjspx_005ftagPool_005flayout_005frow.get(fr.improve.struts.taglib.layout.RowTag.class);
    _jspx_th_layout_005frow_005f0.setPageContext(_jspx_page_context);
    _jspx_th_layout_005frow_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fform_005f0);
    int _jspx_eval_layout_005frow_005f0 = _jspx_th_layout_005frow_005f0.doStartTag();
    if (_jspx_eval_layout_005frow_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t");
        if (_jspx_meth_layout_005fcolumn_005f0(_jspx_th_layout_005frow_005f0, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("\t");
        if (_jspx_meth_layout_005fcolumn_005f1(_jspx_th_layout_005frow_005f0, _jspx_page_context))
          return true;
        out.write("\t\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_layout_005frow_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_layout_005frow_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005frow.reuse(_jspx_th_layout_005frow_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005frow.reuse(_jspx_th_layout_005frow_005f0);
    return false;
  }

  private boolean _jspx_meth_layout_005fcolumn_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005frow_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:column
    fr.improve.struts.taglib.layout.ColumnTag _jspx_th_layout_005fcolumn_005f0 = (fr.improve.struts.taglib.layout.ColumnTag) _005fjspx_005ftagPool_005flayout_005fcolumn_005fwidth.get(fr.improve.struts.taglib.layout.ColumnTag.class);
    _jspx_th_layout_005fcolumn_005f0.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fcolumn_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005frow_005f0);
    _jspx_th_layout_005fcolumn_005f0.setWidth("50%");
    int _jspx_eval_layout_005fcolumn_005f0 = _jspx_th_layout_005fcolumn_005f0.doStartTag();
    if (_jspx_eval_layout_005fcolumn_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\r\n");
        out.write("    \t\t\t");
        if (_jspx_meth_layout_005ftext_005f0(_jspx_th_layout_005fcolumn_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    \t\r\n");
        out.write("\t\t");
        if (_jspx_meth_layout_005ftext_005f1(_jspx_th_layout_005fcolumn_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_layout_005ftext_005f2(_jspx_th_layout_005fcolumn_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t \r\n");
        out.write("\t\t\t\t\t\t \r\n");
        out.write("\t\r\n");
        out.write("\t\t\t<table border=\"0\" id=\"table\"  class=\"sortable\" width=\"100%\">\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t<th width=\"10%\">Código</th>\r\n");
        out.write("\t\t\t<th width=\"30%\">Descripción</th>\r\n");
        out.write("\t\t\t<th width=\"10%\">Tiempo</th>\r\n");
        out.write("\t\t\t<th width=\"10%\">Distancia (Kms)</th>\r\n");
        out.write("\t\t\t<th width=\"10%\">Asignado</th>\r\n");
        out.write("\t\t\t<th width=\"30%\">Motivo</th>\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t<td><input type=\"text\" name=\"unidad\"\r\n");
        out.write("\t\t\tid=\"unidad\" /></td>\r\n");
        out.write("\t\t\t<td><input type=\"text\" name=\"descripcion\"\r\n");
        out.write("\t\t\tid=\"descripcion\" size=\"40\" /></td>\r\n");
        out.write("\t\t\t<td><input type=\"text\" name=\"tiempo\"\r\n");
        out.write("\t\t\tid=\"tiempo\" size=\"7\" /></td>\r\n");
        out.write("\t\t\t<td></td>\r\n");
        out.write("\t\t\t<td>\r\n");
        out.write("\t\t\t<input type=\"radio\" name=\"unidadAsignada\" value=\"\">\r\n");
        out.write("\t\t\t</td>\r\n");
        out.write("\t\t\t<td><input type=\"text\" name=\"motivo\"\r\n");
        out.write("\t\t\tid=\"motivo\" size=\"30\" maxlength=\"100\"/></td>\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t</table>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_layout_005fcolumn_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_layout_005fcolumn_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fcolumn_005fwidth.reuse(_jspx_th_layout_005fcolumn_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fcolumn_005fwidth.reuse(_jspx_th_layout_005fcolumn_005f0);
    return false;
  }

  private boolean _jspx_meth_layout_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcolumn_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:text
    fr.improve.struts.taglib.layout.field.TextFieldTag _jspx_th_layout_005ftext_005f0 = (fr.improve.struts.taglib.layout.field.TextFieldTag) _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.TextFieldTag.class);
    _jspx_th_layout_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_layout_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcolumn_005f0);
    _jspx_th_layout_005ftext_005f0.setKey("ReservaForm.idReserva");
    _jspx_th_layout_005ftext_005f0.setProperty("idReserva");
    _jspx_th_layout_005ftext_005f0.setStyleClass("LABEL");
    _jspx_th_layout_005ftext_005f0.setMode("H,I,I");
    _jspx_th_layout_005ftext_005f0.setSize("6");
    _jspx_th_layout_005ftext_005f0.setMaxlength("6");
    int _jspx_eval_layout_005ftext_005f0 = _jspx_th_layout_005ftext_005f0.doStartTag();
    if (_jspx_th_layout_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_layout_005ftext_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcolumn_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:text
    fr.improve.struts.taglib.layout.field.TextFieldTag _jspx_th_layout_005ftext_005f1 = (fr.improve.struts.taglib.layout.field.TextFieldTag) _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005freadonly_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.TextFieldTag.class);
    _jspx_th_layout_005ftext_005f1.setPageContext(_jspx_page_context);
    _jspx_th_layout_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcolumn_005f0);
    _jspx_th_layout_005ftext_005f1.setKey("ReservaForm.latitud");
    _jspx_th_layout_005ftext_005f1.setProperty("latitud");
    _jspx_th_layout_005ftext_005f1.setStyleClass("LABEL");
    _jspx_th_layout_005ftext_005f1.setMode("E,E,I");
    _jspx_th_layout_005ftext_005f1.setSize("30");
    _jspx_th_layout_005ftext_005f1.setMaxlength("30");
    _jspx_th_layout_005ftext_005f1.setReadonly(true);
    int _jspx_eval_layout_005ftext_005f1 = _jspx_th_layout_005ftext_005f1.doStartTag();
    if (_jspx_th_layout_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005freadonly_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005freadonly_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f1);
    return false;
  }

  private boolean _jspx_meth_layout_005ftext_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcolumn_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:text
    fr.improve.struts.taglib.layout.field.TextFieldTag _jspx_th_layout_005ftext_005f2 = (fr.improve.struts.taglib.layout.field.TextFieldTag) _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005freadonly_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.TextFieldTag.class);
    _jspx_th_layout_005ftext_005f2.setPageContext(_jspx_page_context);
    _jspx_th_layout_005ftext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcolumn_005f0);
    _jspx_th_layout_005ftext_005f2.setKey("ReservaForm.longitud");
    _jspx_th_layout_005ftext_005f2.setProperty("longitud");
    _jspx_th_layout_005ftext_005f2.setStyleClass("LABEL");
    _jspx_th_layout_005ftext_005f2.setMode("E,E,I");
    _jspx_th_layout_005ftext_005f2.setSize("30");
    _jspx_th_layout_005ftext_005f2.setMaxlength("30");
    _jspx_th_layout_005ftext_005f2.setReadonly(true);
    int _jspx_eval_layout_005ftext_005f2 = _jspx_th_layout_005ftext_005f2.doStartTag();
    if (_jspx_th_layout_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005freadonly_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005freadonly_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f2);
    return false;
  }

  private boolean _jspx_meth_layout_005fcolumn_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005frow_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:column
    fr.improve.struts.taglib.layout.ColumnTag _jspx_th_layout_005fcolumn_005f1 = (fr.improve.struts.taglib.layout.ColumnTag) _005fjspx_005ftagPool_005flayout_005fcolumn_005fwidth.get(fr.improve.struts.taglib.layout.ColumnTag.class);
    _jspx_th_layout_005fcolumn_005f1.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fcolumn_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005frow_005f0);
    _jspx_th_layout_005fcolumn_005f1.setWidth("50%");
    int _jspx_eval_layout_005fcolumn_005f1 = _jspx_th_layout_005fcolumn_005f1.doStartTag();
    if (_jspx_eval_layout_005fcolumn_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_layout_005fhtml_005f0(_jspx_th_layout_005fcolumn_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_layout_005fcolumn_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_layout_005fcolumn_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fcolumn_005fwidth.reuse(_jspx_th_layout_005fcolumn_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fcolumn_005fwidth.reuse(_jspx_th_layout_005fcolumn_005f1);
    return false;
  }

  private boolean _jspx_meth_layout_005fhtml_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcolumn_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:html
    fr.improve.struts.taglib.layout.HtmlTag _jspx_th_layout_005fhtml_005f0 = (fr.improve.struts.taglib.layout.HtmlTag) _005fjspx_005ftagPool_005flayout_005fhtml_005falign.get(fr.improve.struts.taglib.layout.HtmlTag.class);
    _jspx_th_layout_005fhtml_005f0.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fhtml_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcolumn_005f1);
    _jspx_th_layout_005fhtml_005f0.setAlign("center");
    int _jspx_eval_layout_005fhtml_005f0 = _jspx_th_layout_005fhtml_005f0.doStartTag();
    if (_jspx_eval_layout_005fhtml_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t    <span id=\"span_result\"></span>\r\n");
        out.write("\t\t\t    <div id=\"route\"></div>\r\n");
        out.write("\t\t\t\t<div   id=\"map_canvas\" style=\"width:400px;height:300px;\"/>\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_layout_005fhtml_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_layout_005fhtml_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fhtml_005falign.reuse(_jspx_th_layout_005fhtml_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fhtml_005falign.reuse(_jspx_th_layout_005fhtml_005f0);
    return false;
  }

  private boolean _jspx_meth_layout_005fspace_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005frow_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:space
    fr.improve.struts.taglib.layout.EmptyTag _jspx_th_layout_005fspace_005f0 = (fr.improve.struts.taglib.layout.EmptyTag) _005fjspx_005ftagPool_005flayout_005fspace_005fnobody.get(fr.improve.struts.taglib.layout.EmptyTag.class);
    _jspx_th_layout_005fspace_005f0.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fspace_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005frow_005f1);
    int _jspx_eval_layout_005fspace_005f0 = _jspx_th_layout_005fspace_005f0.doStartTag();
    if (_jspx_th_layout_005fspace_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fspace_005fnobody.reuse(_jspx_th_layout_005fspace_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fspace_005fnobody.reuse(_jspx_th_layout_005fspace_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fbutton_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f1 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fbutton_005f0);
    _jspx_th_bean_005fmessage_005f1.setKey("button.save");
    int _jspx_eval_bean_005fmessage_005f1 = _jspx_th_bean_005fmessage_005f1.doStartTag();
    if (_jspx_th_bean_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f1);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fbutton_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f2 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f2.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fbutton_005f1);
    _jspx_th_bean_005fmessage_005f2.setKey("button.back");
    int _jspx_eval_bean_005fmessage_005f2 = _jspx_th_bean_005fmessage_005f2.doStartTag();
    if (_jspx_th_bean_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f2);
    return false;
  }
}
