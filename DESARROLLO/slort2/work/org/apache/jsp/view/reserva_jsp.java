package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bdb.util.HttpUtils;
import com.slort.util.SlortUtils;

public final class reserva_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(6);
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-layout.tld");
    _jspx_dependants.add("/WEB-INF/struts-template.tld");
    _jspx_dependants.add("/WEB-INF/app.tld");
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fjavascript_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fapp_005fCheckSimpleLogon_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fapp_005fActionLabelTag_005fparameter_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005fput_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fform_005fstyleClass_005freqCode_005fonsubmit_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005frow;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fcolumn;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fonkeyup_005fmode_005fmaxlength_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fbutton_005fstyleClass_005freqCode_005fonclick_005fmode;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fdate_005fstyleClass_005fstartYear_005fsize_005fproperty_005fpatternKey_005fonfocus_005fmode_005fmaxlength_005fkey_005fendYear_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005freadonly_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fformActions;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fonclick_005fmode;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fselect_005ftabindex_005fstyleClass_005fproperty_005fmode_005fkey;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fhtml_005falign;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fspace_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fmessage_005fkey_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fjavascript_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fapp_005fCheckSimpleLogon_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fapp_005fActionLabelTag_005fparameter_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fform_005fstyleClass_005freqCode_005fonsubmit_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005frow = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fcolumn = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fonkeyup_005fmode_005fmaxlength_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fbutton_005fstyleClass_005freqCode_005fonclick_005fmode = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fdate_005fstyleClass_005fstartYear_005fsize_005fproperty_005fpatternKey_005fonfocus_005fmode_005fmaxlength_005fkey_005fendYear_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005freadonly_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fformActions = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fonclick_005fmode = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fselect_005ftabindex_005fstyleClass_005fproperty_005fmode_005fkey = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fhtml_005falign = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fspace_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fmessage_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fjavascript_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fapp_005fCheckSimpleLogon_005fnobody.release();
    _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate.release();
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.release();
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect.release();
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fapp_005fActionLabelTag_005fparameter_005fnobody.release();
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname.release();
    _005fjspx_005ftagPool_005flayout_005fform_005fstyleClass_005freqCode_005fonsubmit_005faction.release();
    _005fjspx_005ftagPool_005flayout_005frow.release();
    _005fjspx_005ftagPool_005flayout_005fcolumn.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fonkeyup_005fmode_005fmaxlength_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005flayout_005fbutton_005fstyleClass_005freqCode_005fonclick_005fmode.release();
    _005fjspx_005ftagPool_005flayout_005fdate_005fstyleClass_005fstartYear_005fsize_005fproperty_005fpatternKey_005fonfocus_005fmode_005fmaxlength_005fkey_005fendYear_005fnobody.release();
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005freadonly_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005flayout_005fformActions.release();
    _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fonclick_005fmode.release();
    _005fjspx_005ftagPool_005flayout_005fselect_005ftabindex_005fstyleClass_005fproperty_005fmode_005fkey.release();
    _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005flayout_005fhtml_005falign.release();
    _005fjspx_005ftagPool_005flayout_005fspace_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005flayout_005fmessage_005fkey_005fnobody.release();
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
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <meta http-equiv=\"content-type\" content=\"text/html; charset=ISO-8859-1\"/>\r\n");
      out.write("   ");
      out.write("\r\n");
      out.write("     <script src=\"http://maps.google.com/maps?file=api&amp;v=2.x&amp;key=ABQIAAAAbuXxLBFMgYlDNbrbDJvWzRSy2ooY7TB3FPLn4gqqVYh8dN86zxTPFEykr52-hr-X4o60TKPs3CaToQ\" \r\n");
      out.write("            type=\"text/javascript\"></script>\r\n");
      out.write("   \r\n");
      out.write("    <script language=\"Javascript\"  src=\"jscript/ajax.js\"></script>\r\n");
      out.write("\t<script src=\"jscript/googlemaps.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"http://maps.google.com/maps/api/js?sensor=false\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"http://jqueryjs.googlecode.com/files/jquery-1.3.2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"lib_jquery/jquery.autocomplete_geomod.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"lib_jquery/geo_autocomplete.js\"></script>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"lib_jquery/jquery.autocomplete.css\" />\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("$().ready(function() {\r\n");
      out.write("\r\n");
      out.write("    var latlng = new google.maps.LatLng(-34.65580390505896, -58.58802795410156);\r\n");
      out.write("    var bounds = new google.maps.LatLngBounds();\r\n");
      out.write("    \r\n");
      out.write("    var myOptions = {\r\n");
      out.write("      zoom: 8,\r\n");
      out.write("      center: latlng,\r\n");
      out.write("      mapTypeId: google.maps.MapTypeId.ROADMAP\r\n");
      out.write("    };\r\n");
      out.write("    \r\n");
      out.write("    bounds.extend(latlng);\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    var map = new google.maps.Map(document.getElementById(\"map_canvas\"), myOptions);\r\n");
      out.write("    var geocoder = new GClientGeocoder();\r\n");
      out.write("    var marker = new  google.maps.Marker();\r\n");
      out.write("    \t\r\n");
      out.write(" \tgoogle.maps.event.addListener(map, 'click', function(event) {   \r\n");
      out.write(" \t\tplaceMarker(event.latLng);   \r\n");
      out.write(" \t });    \r\n");
      out.write("    \r\n");
      out.write("\t    \r\n");
      out.write("\tfunction placeMarker(location) {   \r\n");
      out.write("\t    var clickedLocation = new google.maps.LatLng(location);   \r\n");
      out.write("\t\tmarker.setMap(null);\r\n");
      out.write("\t\tmarker = new google.maps.Marker({ position: location, map: map}); \r\n");
      out.write("\t\r\n");
      out.write("\t\tvar latitud=document.getElementsByName(\"latitud\");\r\n");
      out.write("\t\tvar longitud=document.getElementsByName(\"longitud\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tlatitud[0].value = \"undefined\";\r\n");
      out.write("\t\tlongitud[0].value = \"undefined\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\tmylocation = location.toString(); \r\n");
      out.write("\t\tmylocation = mylocation.replace(\"(\", \"\")\r\n");
      out.write("\t\tmylocation = mylocation.replace(\")\", \"\")\r\n");
      out.write("\t\t   \t\r\n");
      out.write("\t\tvar elements = mylocation.split(',');\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tstepDisplay = new google.maps.InfoWindow();\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//LATITUD aprox 34\r\n");
      out.write("\t\t//LONGITUD aprox 58\r\n");
      out.write("\t\tlatitud[0].value =elements[0].trim();\r\n");
      out.write("\t\tlongitud[0].value = elements[1].trim();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("          var geocoder = new GClientGeocoder();\r\n");
      out.write("          var latlng = new GLatLng(latitud[0].value, longitud[0].value);\r\n");
      out.write("          geocoder.getLocations(latlng, function(addresses) {\r\n");
      out.write("              var direccion=document.getElementsByName(\"direccion\");\r\n");
      out.write("\t\t\t  direccion[0].value = addresses.Placemark[0].address;\r\n");
      out.write("\t\t\r\n");
      out.write("          });\r\n");
      out.write("\r\n");
      out.write("\t\t//map.fitBounds(bounds);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/*\r\n");
      out.write("\t\tvar geoOptions = {\r\n");
      out.write("\t\t      address: clickedLocation,\r\n");
      out.write("\t\t      bounds: bounds,\r\n");
      out.write("\t\t      region: \"NO\"\r\n");
      out.write("\t\t    };\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t geocoder.geocode(geoOptions, function(results, status) {\r\n");
      out.write("\t\t      if (status == google.maps.GeocoderStatus.OK) {\r\n");
      out.write("\t\t        addMarker(map, item, results[0].geometry.location);\r\n");
      out.write("\t\t      } else {\r\n");
      out.write("\t\t        console.log(\"Geocode failed \" + status);\r\n");
      out.write("\t\t      }\r\n");
      out.write("\t\t    });\r\n");
      out.write("\t\t */\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t//map.setCenter(location); \r\n");
      out.write("\t}\t\r\n");
      out.write("\t   \r\n");
      out.write("\t$('#location').geo_autocomplete(new google.maps.Geocoder, {\r\n");
      out.write("\t\tmapkey: 'ABQIAAAAbuXxLBFMgYlDNbrbDJvWzRSy2ooY7TB3FPLn4gqqVYh8dN86zxTPFEykr52-hr-X4o60TKPs3CaToQ', \r\n");
      out.write("\t\tselectFirst: false,\r\n");
      out.write("\t\tminChars: 3,\r\n");
      out.write("\t\tcacheLength: 50,\r\n");
      out.write("\t\twidth: 400,\r\n");
      out.write("\t\tscroll: true,\r\n");
      out.write("\t\tscrollHeight: 330,\r\n");
      out.write("\t\tregion: 'AR'\r\n");
      out.write("\t}).result(function(_event, _data) {\r\n");
      out.write("\t\t//if (_data) map.fitBounds(bounds);\r\n");
      out.write("\t\tif (_data) map.fitBounds(_data.geometry.viewport);\r\n");
      out.write("\t\t//alert (_data.geometry.location.b);\r\n");
      out.write("\t\t//alert (_data.geometry.location.c);\r\n");
      out.write("\t\t//alert (_data.formatted_address);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar direccion=document.getElementsByName(\"direccion\");\r\n");
      out.write("\t\tdireccion[0].value = _data.formatted_address;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar latitud=document.getElementsByName(\"latitud\");\r\n");
      out.write("\t\tvar longitud=document.getElementsByName(\"longitud\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tlatitud[0].value = \"undefined\";\r\n");
      out.write("\t\tlongitud[0].value = \"undefined\";\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t \r\n");
      out.write("\t\tmylocation = _data.geometry.location.toString(); \r\n");
      out.write("\t\tmylocation = mylocation.replace(\"(\", \"\")\r\n");
      out.write("\t\tmylocation = mylocation.replace(\")\", \"\")\r\n");
      out.write("\t\t   \r\n");
      out.write("\t\tvar elements = mylocation.split(',');\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//LATITUD aprox 34\r\n");
      out.write("\t\t//LONGITUD aprox 58\r\n");
      out.write("\t\tlatitud[0].value =elements[0].trim();\r\n");
      out.write("\t\tlongitud[0].value = elements[1].trim();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\tvar myLatlng = new google.maps.LatLng(latitud[0].value,\tlongitud[0].value);\r\n");
      out.write("\t    marker.setMap(null);\r\n");
      out.write("\t\tmarker = new google.maps.Marker({ position: myLatlng, title:_data.formatted_address }); \r\n");
      out.write("   \r\n");
      out.write("\t\t // To add the marker to the map, call setMap(); \r\n");
      out.write("\t\t marker.setMap(map); \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("  function altadeCliente(){\r\n");
      out.write("  \t\t var idReserva=document.getElementsByName(\"idReserva\");\r\n");
      out.write("  \t\t var altaReserva='NO';\r\n");
      out.write("  \t\t if (idReserva[0].value=='')\r\n");
      out.write("  \t\t \t\taltaReserva='SI';\r\n");
      out.write(" \t\t window.location='cliente.do?reqCode=create&provienedeReserva=SI&altaReserva='+altaReserva+'&idReserva='+idReserva[0].value+'&';\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  function validarFechayHora(){\r\n");
      out.write("  \r\n");
      out.write("      var form = document.forms[0];                                             \r\n");
      out.write(" \r\n");
      out.write("      if ((validateRequired(form) && validateDate(form) && validateHora(form))==false) {\r\n");
      out.write("      \treturn false\r\n");
      out.write("      } \r\n");
      out.write("      \r\n");
      out.write("      var fecha=document.getElementsByName(\"fecha\");\r\n");
      out.write("  \t  var hora=document.getElementsByName(\"hora\");\r\n");
      out.write("  \r\n");
      out.write("  \t  var mayor = dateMayor(fecha[0].value, hora[0].value);\r\n");
      out.write("  \t  \t\r\n");
      out.write("\t\tif (mayor > 0)\r\n");
      out.write("\t\t\treturn true \r\n");
      out.write("\t\telse {\r\n");
      out.write("\t\t\talert (\"No se puede ingresar una reserva con fecha y hora anterior a la actual.\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t  \t\t \r\n");
      out.write("   } \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("\tfunction dateMayor(fecha,hora) {\r\n");
      out.write("\tdate1 = new Date();\r\n");
      out.write("\tvar today = new Date();\r\n");
      out.write("\tdiff  = new Date();\r\n");
      out.write("\t\r\n");
      out.write("\tvar elements = fecha.split('-');\r\n");
      out.write("\t\r\n");
      out.write("\tdia=elements[0];\r\n");
      out.write("\tmes=elements[1];\r\n");
      out.write("\tanio=elements[2];\r\n");
      out.write("\t\r\n");
      out.write("    fecha = (mes   + \"/\" + dia + \"/\" + anio);\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\tdate1temp = new Date(fecha + \" \" + hora);\r\n");
      out.write("\tdate1.setTime(date1temp.getTime());\r\n");
      out.write("\r\n");
      out.write("\t// sets difference date to difference of first date and second date\r\n");
      out.write("\tif (date1.getTime() > today.getTime())\r\n");
      out.write("\t\treturn 1;\r\n");
      out.write("\telse\r\n");
      out.write("\t   return -1;\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t}\r\n");
      out.write("  \r\n");
      out.write("  \t\t \r\n");
      out.write("  \t\t \r\n");
      out.write("  \t\t \r\n");
      out.write("  \t\t \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".ac_results li img {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tmargin-right: 5px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_html_005fjavascript_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      if (_jspx_meth_app_005fCheckSimpleLogon_005f0(_jspx_page_context))
        return;
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
          out.write("  ");
          out.write("\r\n");
          out.write("  ");
          if (_jspx_meth_template_005fput_005f0(_jspx_th_template_005finsert_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("  \r\n");
          out.write("  ");
          out.write("\r\n");
          out.write("  ");
          if (_jspx_meth_template_005fput_005f1(_jspx_th_template_005finsert_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("  \r\n");
          out.write("  ");
          out.write("\r\n");
          out.write("  ");
          //  template:put
          org.apache.struts.taglib.template.PutTag _jspx_th_template_005fput_005f2 = (org.apache.struts.taglib.template.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname.get(org.apache.struts.taglib.template.PutTag.class);
          _jspx_th_template_005fput_005f2.setPageContext(_jspx_page_context);
          _jspx_th_template_005fput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
          _jspx_th_template_005fput_005f2.setName("content");
          int _jspx_eval_template_005fput_005f2 = _jspx_th_template_005fput_005f2.doStartTag();
          if (_jspx_eval_template_005fput_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_template_005fput_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_template_005fput_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_template_005fput_005f2.doInitBody();
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
              fr.improve.struts.taglib.layout.FormTag _jspx_th_layout_005fform_005f0 = (fr.improve.struts.taglib.layout.FormTag) _005fjspx_005ftagPool_005flayout_005fform_005fstyleClass_005freqCode_005fonsubmit_005faction.get(fr.improve.struts.taglib.layout.FormTag.class);
              _jspx_th_layout_005fform_005f0.setPageContext(_jspx_page_context);
              _jspx_th_layout_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005fput_005f2);
              _jspx_th_layout_005fform_005f0.setAction("/reserva.do");
              _jspx_th_layout_005fform_005f0.setStyleClass("Body");
              _jspx_th_layout_005fform_005f0.setReqCode("");
              _jspx_th_layout_005fform_005f0.setOnsubmit("return validateReservaForm(this);");
              int _jspx_eval_layout_005fform_005f0 = _jspx_th_layout_005fform_005f0.doStartTag();
              if (_jspx_eval_layout_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("    ");
                  //  layout:row
                  fr.improve.struts.taglib.layout.RowTag _jspx_th_layout_005frow_005f0 = (fr.improve.struts.taglib.layout.RowTag) _005fjspx_005ftagPool_005flayout_005frow.get(fr.improve.struts.taglib.layout.RowTag.class);
                  _jspx_th_layout_005frow_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_layout_005frow_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fform_005f0);
                  int _jspx_eval_layout_005frow_005f0 = _jspx_th_layout_005frow_005f0.doStartTag();
                  if (_jspx_eval_layout_005frow_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("    \t");
                      //  layout:column
                      fr.improve.struts.taglib.layout.ColumnTag _jspx_th_layout_005fcolumn_005f0 = (fr.improve.struts.taglib.layout.ColumnTag) _005fjspx_005ftagPool_005flayout_005fcolumn.get(fr.improve.struts.taglib.layout.ColumnTag.class);
                      _jspx_th_layout_005fcolumn_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_layout_005fcolumn_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005frow_005f0);
                      int _jspx_eval_layout_005fcolumn_005f0 = _jspx_th_layout_005fcolumn_005f0.doStartTag();
                      if (_jspx_eval_layout_005fcolumn_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n");
                          out.write("\t\r\n");
                          out.write("\t\t    <input type=\"hidden\"  name=\"direccionGoogle\" value=\"");
                          if (_jspx_meth_bean_005fwrite_005f0(_jspx_th_layout_005fcolumn_005f0, _jspx_page_context))
                            return;
                          out.write("\" >\r\n");
                          out.write("\t\r\n");
                          out.write("\t\t\t");
                          if (_jspx_meth_layout_005ftext_005f0(_jspx_th_layout_005fcolumn_005f0, _jspx_page_context))
                            return;
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t\t\t \r\n");
                          out.write("\t\t\t \t\t\t\t\t \r\n");
                          out.write("\t\t\t");
                          if (_jspx_meth_layout_005ftext_005f1(_jspx_th_layout_005fcolumn_005f0, _jspx_page_context))
                            return;
                          out.write("\t\r\n");
                          out.write("   \t\t\t\t");
                          //  layout:button
                          fr.improve.struts.taglib.layout.ButtonTag _jspx_th_layout_005fbutton_005f0 = (fr.improve.struts.taglib.layout.ButtonTag) _005fjspx_005ftagPool_005flayout_005fbutton_005fstyleClass_005freqCode_005fonclick_005fmode.get(fr.improve.struts.taglib.layout.ButtonTag.class);
                          _jspx_th_layout_005fbutton_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_layout_005fbutton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcolumn_005f0);
                          _jspx_th_layout_005fbutton_005f0.setMode("D,D,N");
                          _jspx_th_layout_005fbutton_005f0.setReqCode(HttpUtils.STRUTS_ACTION_GOOGLEMAP_VIEW);
                          _jspx_th_layout_005fbutton_005f0.setStyleClass("button");
                          _jspx_th_layout_005fbutton_005f0.setOnclick("javascript:altadeCliente();");
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
                          out.write("\t\t\t\r\n");
                          out.write("\t\t  \t\t\t\t\t\t\t \r\n");
                          out.write("\t\t<input type=\"hidden\" id=\"cliente.clienteCompleto_hidden\" name=\"codCliente\" value=\"");
                          if (_jspx_meth_bean_005fwrite_005f1(_jspx_th_layout_005fcolumn_005f0, _jspx_page_context))
                            return;
                          out.write("\" >\r\n");
                          out.write("\t\r\n");
                          out.write("\r\n");
                          out.write("\t\t");
                          //  layout:date
                          fr.improve.struts.taglib.layout.field.DateFieldTag _jspx_th_layout_005fdate_005f0 = (fr.improve.struts.taglib.layout.field.DateFieldTag) _005fjspx_005ftagPool_005flayout_005fdate_005fstyleClass_005fstartYear_005fsize_005fproperty_005fpatternKey_005fonfocus_005fmode_005fmaxlength_005fkey_005fendYear_005fnobody.get(fr.improve.struts.taglib.layout.field.DateFieldTag.class);
                          _jspx_th_layout_005fdate_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_layout_005fdate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcolumn_005f0);
                          _jspx_th_layout_005fdate_005f0.setKey("ReservaForm.fecha");
                          _jspx_th_layout_005fdate_005f0.setProperty("fecha");
                          _jspx_th_layout_005fdate_005f0.setStyleClass("LABEL");
                          _jspx_th_layout_005fdate_005f0.setMode("E,E,I");
                          _jspx_th_layout_005fdate_005f0.setSize("12");
                          _jspx_th_layout_005fdate_005f0.setMaxlength("10");
                          _jspx_th_layout_005fdate_005f0.setStartYear("1920");
                          _jspx_th_layout_005fdate_005f0.setEndYear(SlortUtils.getMaxAnio());
                          _jspx_th_layout_005fdate_005f0.setPatternKey("app.pattern.date");
                          _jspx_th_layout_005fdate_005f0.setOnfocus("CheckFechaNoFocus('idReserva');\r\n			");
                          int _jspx_eval_layout_005fdate_005f0 = _jspx_th_layout_005fdate_005f0.doStartTag();
                          if (_jspx_th_layout_005fdate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005flayout_005fdate_005fstyleClass_005fstartYear_005fsize_005fproperty_005fpatternKey_005fonfocus_005fmode_005fmaxlength_005fkey_005fendYear_005fnobody.reuse(_jspx_th_layout_005fdate_005f0);
                            return;
                          }
                          _005fjspx_005ftagPool_005flayout_005fdate_005fstyleClass_005fstartYear_005fsize_005fproperty_005fpatternKey_005fonfocus_005fmode_005fmaxlength_005fkey_005fendYear_005fnobody.reuse(_jspx_th_layout_005fdate_005f0);
                          out.write("\r\n");
                          out.write("\t\t\r\n");
                          out.write("\t\t\t\t\t\t\t\r\n");
                          out.write("\t\t");
                          if (_jspx_meth_layout_005ftext_005f2(_jspx_th_layout_005fcolumn_005f0, _jspx_page_context))
                            return;
                          out.write("\r\n");
                          out.write("\r\n");
                          out.write("\r\n");
                          out.write("\t\t \r\n");
                          out.write(" \t\t");
                          if (_jspx_meth_layout_005ftext_005f3(_jspx_th_layout_005fcolumn_005f0, _jspx_page_context))
                            return;
                          out.write("\r\n");
                          out.write("\t\t\r\n");
                          out.write("\t\t");
                          if (_jspx_meth_layout_005ftext_005f4(_jspx_th_layout_005fcolumn_005f0, _jspx_page_context))
                            return;
                          out.write("\r\n");
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t\t \r\n");
                          out.write("\t\t");
                          if (_jspx_meth_layout_005ftext_005f5(_jspx_th_layout_005fcolumn_005f0, _jspx_page_context))
                            return;
                          out.write("\r\n");
                          out.write("\r\n");
                          out.write("\r\n");
                          out.write("\r\n");
                          out.write("\t\t");
                          if (_jspx_meth_layout_005ftext_005f6(_jspx_th_layout_005fcolumn_005f0, _jspx_page_context))
                            return;
                          out.write("\r\n");
                          out.write("    \r\n");
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t\t \r\n");
                          out.write("\t\t");
                          if (_jspx_meth_layout_005ftext_005f7(_jspx_th_layout_005fcolumn_005f0, _jspx_page_context))
                            return;
                          out.write("\t\r\n");
                          out.write("\t\t\t\t\t\t \r\n");
                          out.write("\t\t \r\n");
                          out.write("\t\t  ");
                          //  layout:formActions
                          fr.improve.struts.taglib.layout.FormActions _jspx_th_layout_005fformActions_005f0 = (fr.improve.struts.taglib.layout.FormActions) _005fjspx_005ftagPool_005flayout_005fformActions.get(fr.improve.struts.taglib.layout.FormActions.class);
                          _jspx_th_layout_005fformActions_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_layout_005fformActions_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcolumn_005f0);
                          int _jspx_eval_layout_005fformActions_005f0 = _jspx_th_layout_005fformActions_005f0.doStartTag();
                          if (_jspx_eval_layout_005fformActions_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n");
                              out.write("\t\t\t\t");
                              //  layout:submit
                              fr.improve.struts.taglib.layout.SubmitTag _jspx_th_layout_005fsubmit_005f0 = (fr.improve.struts.taglib.layout.SubmitTag) _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fonclick_005fmode.get(fr.improve.struts.taglib.layout.SubmitTag.class);
                              _jspx_th_layout_005fsubmit_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_layout_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fformActions_005f0);
                              _jspx_th_layout_005fsubmit_005f0.setMode("D,D,N");
                              _jspx_th_layout_005fsubmit_005f0.setReqCode(HttpUtils.STRUTS_ACTION_GOOGLEMAP_DISTANCE_LISTA);
                              _jspx_th_layout_005fsubmit_005f0.setStyleClass("button");
                              _jspx_th_layout_005fsubmit_005f0.setOnclick("return validarFechayHora();");
                              int _jspx_eval_layout_005fsubmit_005f0 = _jspx_th_layout_005fsubmit_005f0.doStartTag();
                              if (_jspx_eval_layout_005fsubmit_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_layout_005fsubmit_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_layout_005fsubmit_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_layout_005fsubmit_005f0.doInitBody();
                              }
                              do {
                              out.write("\r\n");
                              out.write("\t\t\t\t\t");
                              if (_jspx_meth_bean_005fmessage_005f2(_jspx_th_layout_005fsubmit_005f0, _jspx_page_context))
                              return;
                              out.write("\r\n");
                              out.write("\t\t\t\t");
                              int evalDoAfterBody = _jspx_th_layout_005fsubmit_005f0.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_layout_005fsubmit_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_layout_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fonclick_005fmode.reuse(_jspx_th_layout_005fsubmit_005f0);
                              return;
                              }
                              _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fonclick_005fmode.reuse(_jspx_th_layout_005fsubmit_005f0);
                              out.write("\t\r\n");
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
                          out.write("\t\t  \r\n");
                          out.write("\t\t\r\n");
                          out.write("\t\t\r\n");
                          out.write("\t\t<input type=\"hidden\" id=\"flota.flotaCompleta_hidden\" name=\"codUnidad\" value=\"");
                          if (_jspx_meth_bean_005fwrite_005f2(_jspx_th_layout_005fcolumn_005f0, _jspx_page_context))
                            return;
                          out.write("\" >\r\n");
                          out.write("\t\t\t\t\t\t\t\t \r\n");
                          out.write("\t\t\t\t\t\t\t\t \r\n");
                          out.write("\t\t");
                          if (_jspx_meth_layout_005ftext_005f8(_jspx_th_layout_005fcolumn_005f0, _jspx_page_context))
                            return;
                          out.write("\t\r\n");
                          out.write("\r\n");
                          out.write("\t\t\r\n");
                          out.write("\t\t<input type=\"hidden\" id=\"hotel.nombre_hidden\" name=\"idHotel\" value=\"");
                          if (_jspx_meth_bean_005fwrite_005f3(_jspx_th_layout_005fcolumn_005f0, _jspx_page_context))
                            return;
                          out.write("\" >\r\n");
                          out.write("\r\n");
                          out.write("\t\t");
                          if (_jspx_meth_layout_005fselect_005f0(_jspx_th_layout_005fcolumn_005f0, _jspx_page_context))
                            return;
                          out.write("\t\r\n");
                          out.write("\t\t\t\t\t\t\t\t \r\n");
                          out.write("\t\t\t\t\t\t\t\t \r\n");
                          out.write("\t\t");
                          if (_jspx_meth_layout_005ftext_005f9(_jspx_th_layout_005fcolumn_005f0, _jspx_page_context))
                            return;
                          out.write("\r\n");
                          out.write("\t\r\n");
                          out.write("\t\t\t");
                          if (_jspx_meth_layout_005ftext_005f10(_jspx_th_layout_005fcolumn_005f0, _jspx_page_context))
                            return;
                          out.write("\t\t\t\t\t\t\t \r\n");
                          out.write("\r\n");
                          out.write("\t\t");
                          if (_jspx_meth_layout_005ftext_005f11(_jspx_th_layout_005fcolumn_005f0, _jspx_page_context))
                            return;
                          out.write("\r\n");
                          out.write("\r\n");
                          out.write("\t\t");
                          if (_jspx_meth_layout_005ftext_005f12(_jspx_th_layout_005fcolumn_005f0, _jspx_page_context))
                            return;
                          out.write("\r\n");
                          out.write("\t\t\r\n");
                          out.write("\r\n");
                          out.write("\t\r\n");
                          out.write("\t");
                          int evalDoAfterBody = _jspx_th_layout_005fcolumn_005f0.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_layout_005fcolumn_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flayout_005fcolumn.reuse(_jspx_th_layout_005fcolumn_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005flayout_005fcolumn.reuse(_jspx_th_layout_005fcolumn_005f0);
                      out.write(" \r\n");
                      out.write("\t");
                      if (_jspx_meth_layout_005fcolumn_005f1(_jspx_th_layout_005frow_005f0, _jspx_page_context))
                        return;
                      out.write("\t\r\n");
                      out.write("\t");
                      int evalDoAfterBody = _jspx_th_layout_005frow_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_layout_005frow_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flayout_005frow.reuse(_jspx_th_layout_005frow_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005flayout_005frow.reuse(_jspx_th_layout_005frow_005f0);
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
                      fr.improve.struts.taglib.layout.FormActions _jspx_th_layout_005fformActions_005f1 = (fr.improve.struts.taglib.layout.FormActions) _005fjspx_005ftagPool_005flayout_005fformActions.get(fr.improve.struts.taglib.layout.FormActions.class);
                      _jspx_th_layout_005fformActions_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_layout_005fformActions_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005frow_005f1);
                      int _jspx_eval_layout_005fformActions_005f1 = _jspx_th_layout_005fformActions_005f1.doStartTag();
                      if (_jspx_eval_layout_005fformActions_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n");
                          out.write("\t\t\t\t");
                          //  layout:submit
                          fr.improve.struts.taglib.layout.SubmitTag _jspx_th_layout_005fsubmit_005f1 = (fr.improve.struts.taglib.layout.SubmitTag) _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fonclick_005fmode.get(fr.improve.struts.taglib.layout.SubmitTag.class);
                          _jspx_th_layout_005fsubmit_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_layout_005fsubmit_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fformActions_005f1);
                          _jspx_th_layout_005fsubmit_005f1.setMode("N,D,N");
                          _jspx_th_layout_005fsubmit_005f1.setReqCode(HttpUtils.STRUTS_ACTION_SAVE);
                          _jspx_th_layout_005fsubmit_005f1.setStyleClass("button");
                          _jspx_th_layout_005fsubmit_005f1.setOnclick("return validarFechayHora();");
                          int _jspx_eval_layout_005fsubmit_005f1 = _jspx_th_layout_005fsubmit_005f1.doStartTag();
                          if (_jspx_eval_layout_005fsubmit_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_layout_005fsubmit_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_layout_005fsubmit_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_layout_005fsubmit_005f1.doInitBody();
                            }
                            do {
                              out.write("\r\n");
                              out.write("\t\t\t\t\t");
                              if (_jspx_meth_bean_005fmessage_005f5(_jspx_th_layout_005fsubmit_005f1, _jspx_page_context))
                              return;
                              int evalDoAfterBody = _jspx_th_layout_005fsubmit_005f1.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_layout_005fsubmit_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_layout_005fsubmit_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fonclick_005fmode.reuse(_jspx_th_layout_005fsubmit_005f1);
                            return;
                          }
                          _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fonclick_005fmode.reuse(_jspx_th_layout_005fsubmit_005f1);
                          out.write("\r\n");
                          out.write("\t\t\t\t");
                          //  layout:submit
                          fr.improve.struts.taglib.layout.SubmitTag _jspx_th_layout_005fsubmit_005f2 = (fr.improve.struts.taglib.layout.SubmitTag) _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fonclick_005fmode.get(fr.improve.struts.taglib.layout.SubmitTag.class);
                          _jspx_th_layout_005fsubmit_005f2.setPageContext(_jspx_page_context);
                          _jspx_th_layout_005fsubmit_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fformActions_005f1);
                          _jspx_th_layout_005fsubmit_005f2.setMode("D,N,N");
                          _jspx_th_layout_005fsubmit_005f2.setReqCode(HttpUtils.STRUTS_ACTION_SAVE_NEW);
                          _jspx_th_layout_005fsubmit_005f2.setStyleClass("button");
                          _jspx_th_layout_005fsubmit_005f2.setOnclick("return validarFechayHora();");
                          int _jspx_eval_layout_005fsubmit_005f2 = _jspx_th_layout_005fsubmit_005f2.doStartTag();
                          if (_jspx_eval_layout_005fsubmit_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_layout_005fsubmit_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_layout_005fsubmit_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_layout_005fsubmit_005f2.doInitBody();
                            }
                            do {
                              out.write("\r\n");
                              out.write("\t\t\t\t\t");
                              if (_jspx_meth_bean_005fmessage_005f6(_jspx_th_layout_005fsubmit_005f2, _jspx_page_context))
                              return;
                              int evalDoAfterBody = _jspx_th_layout_005fsubmit_005f2.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_layout_005fsubmit_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_layout_005fsubmit_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fonclick_005fmode.reuse(_jspx_th_layout_005fsubmit_005f2);
                            return;
                          }
                          _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fonclick_005fmode.reuse(_jspx_th_layout_005fsubmit_005f2);
                          out.write("\r\n");
                          out.write("\t\t\t\t");
                          //  layout:button
                          fr.improve.struts.taglib.layout.ButtonTag _jspx_th_layout_005fbutton_005f1 = (fr.improve.struts.taglib.layout.ButtonTag) _005fjspx_005ftagPool_005flayout_005fbutton_005fstyleClass_005freqCode_005fonclick_005fmode.get(fr.improve.struts.taglib.layout.ButtonTag.class);
                          _jspx_th_layout_005fbutton_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_layout_005fbutton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fformActions_005f1);
                          _jspx_th_layout_005fbutton_005f1.setMode("D,D,D");
                          _jspx_th_layout_005fbutton_005f1.setReqCode(HttpUtils.STRUTS_ACTION_FIND_DATA);
                          _jspx_th_layout_005fbutton_005f1.setOnclick("window.location='reserva.do?reqCode=findData';");
                          _jspx_th_layout_005fbutton_005f1.setStyleClass("button");
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
                              if (_jspx_meth_bean_005fmessage_005f7(_jspx_th_layout_005fbutton_005f1, _jspx_page_context))
                              return;
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
                          out.write("\t\t\t\t");
                          //  logic:equal
                          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                          _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fformActions_005f1);
                          _jspx_th_logic_005fequal_005f0.setName("reservaForm");
                          _jspx_th_logic_005fequal_005f0.setProperty("estado");
                          _jspx_th_logic_005fequal_005f0.setValue("A realizar");
                          int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
                          if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n");
                              out.write("\t\t\t\t");
                              //  layout:submit
                              fr.improve.struts.taglib.layout.SubmitTag _jspx_th_layout_005fsubmit_005f3 = (fr.improve.struts.taglib.layout.SubmitTag) _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fonclick_005fmode.get(fr.improve.struts.taglib.layout.SubmitTag.class);
                              _jspx_th_layout_005fsubmit_005f3.setPageContext(_jspx_page_context);
                              _jspx_th_layout_005fsubmit_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
                              _jspx_th_layout_005fsubmit_005f3.setMode("N,D,D");
                              _jspx_th_layout_005fsubmit_005f3.setReqCode(HttpUtils.STRUTS_ACTION_CANCELAR_RESERVA);
                              _jspx_th_layout_005fsubmit_005f3.setStyleClass("button");
                              _jspx_th_layout_005fsubmit_005f3.setOnclick("return confirm('Realmente desea Cancelar esta reserva?');");
                              int _jspx_eval_layout_005fsubmit_005f3 = _jspx_th_layout_005fsubmit_005f3.doStartTag();
                              if (_jspx_eval_layout_005fsubmit_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_layout_005fsubmit_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_layout_005fsubmit_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_layout_005fsubmit_005f3.doInitBody();
                              }
                              do {
                              out.write("\r\n");
                              out.write("\t\t\t\t\t");
                              if (_jspx_meth_bean_005fmessage_005f8(_jspx_th_layout_005fsubmit_005f3, _jspx_page_context))
                              return;
                              out.write("\r\n");
                              out.write("\t\t\t\t");
                              int evalDoAfterBody = _jspx_th_layout_005fsubmit_005f3.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_layout_005fsubmit_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_layout_005fsubmit_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fonclick_005fmode.reuse(_jspx_th_layout_005fsubmit_005f3);
                              return;
                              }
                              _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fonclick_005fmode.reuse(_jspx_th_layout_005fsubmit_005f3);
                              out.write("\t\r\n");
                              out.write("\t\t\t\t");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f0.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_logic_005fequal_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f0);
                            return;
                          }
                          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f0);
                          out.write("\r\n");
                          out.write("\t\t\t\t\r\n");
                          out.write("\t\t\t\t");
                          //  logic:equal
                          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                          _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fformActions_005f1);
                          _jspx_th_logic_005fequal_005f1.setName("reservaForm");
                          _jspx_th_logic_005fequal_005f1.setProperty("estado");
                          _jspx_th_logic_005fequal_005f1.setValue("En proceso");
                          int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
                          if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n");
                              out.write("\t\t\t\t");
                              //  layout:submit
                              fr.improve.struts.taglib.layout.SubmitTag _jspx_th_layout_005fsubmit_005f4 = (fr.improve.struts.taglib.layout.SubmitTag) _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fonclick_005fmode.get(fr.improve.struts.taglib.layout.SubmitTag.class);
                              _jspx_th_layout_005fsubmit_005f4.setPageContext(_jspx_page_context);
                              _jspx_th_layout_005fsubmit_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
                              _jspx_th_layout_005fsubmit_005f4.setMode("N,D,D");
                              _jspx_th_layout_005fsubmit_005f4.setReqCode(HttpUtils.STRUTS_ACTION_CANCELAR_RESERVA);
                              _jspx_th_layout_005fsubmit_005f4.setStyleClass("button");
                              _jspx_th_layout_005fsubmit_005f4.setOnclick("return confirm('Realmente desea Cancelar esta reserva?');");
                              int _jspx_eval_layout_005fsubmit_005f4 = _jspx_th_layout_005fsubmit_005f4.doStartTag();
                              if (_jspx_eval_layout_005fsubmit_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_layout_005fsubmit_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_layout_005fsubmit_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_layout_005fsubmit_005f4.doInitBody();
                              }
                              do {
                              out.write("\r\n");
                              out.write("\t\t\t\t\t");
                              if (_jspx_meth_bean_005fmessage_005f9(_jspx_th_layout_005fsubmit_005f4, _jspx_page_context))
                              return;
                              out.write("\r\n");
                              out.write("\t\t\t\t");
                              int evalDoAfterBody = _jspx_th_layout_005fsubmit_005f4.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_layout_005fsubmit_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_layout_005fsubmit_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fonclick_005fmode.reuse(_jspx_th_layout_005fsubmit_005f4);
                              return;
                              }
                              _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fonclick_005fmode.reuse(_jspx_th_layout_005fsubmit_005f4);
                              out.write("\t\r\n");
                              out.write("\t\t\t\t");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f1.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_logic_005fequal_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f1);
                            return;
                          }
                          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f1);
                          out.write("\r\n");
                          out.write("\t\t\t\t \r\n");
                          out.write("\t\t\t\t");
                          //  layout:button
                          fr.improve.struts.taglib.layout.ButtonTag _jspx_th_layout_005fbutton_005f2 = (fr.improve.struts.taglib.layout.ButtonTag) _005fjspx_005ftagPool_005flayout_005fbutton_005fstyleClass_005freqCode_005fonclick_005fmode.get(fr.improve.struts.taglib.layout.ButtonTag.class);
                          _jspx_th_layout_005fbutton_005f2.setPageContext(_jspx_page_context);
                          _jspx_th_layout_005fbutton_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fformActions_005f1);
                          _jspx_th_layout_005fbutton_005f2.setMode("D,D,N");
                          _jspx_th_layout_005fbutton_005f2.setReqCode(HttpUtils.STRUTS_ACTION_GOOGLEMAP_VIEW);
                          _jspx_th_layout_005fbutton_005f2.setStyleClass("button");
                          _jspx_th_layout_005fbutton_005f2.setOnclick("javascript:window.open('googlemap_view.html','Google View ','width=1000,height=550')");
                          int _jspx_eval_layout_005fbutton_005f2 = _jspx_th_layout_005fbutton_005f2.doStartTag();
                          if (_jspx_eval_layout_005fbutton_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_layout_005fbutton_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_layout_005fbutton_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_layout_005fbutton_005f2.doInitBody();
                            }
                            do {
                              out.write("\r\n");
                              out.write("\t\t\t\t\t");
                              if (_jspx_meth_bean_005fmessage_005f10(_jspx_th_layout_005fbutton_005f2, _jspx_page_context))
                              return;
                              out.write("\r\n");
                              out.write("\t\t\t\t");
                              int evalDoAfterBody = _jspx_th_layout_005fbutton_005f2.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_layout_005fbutton_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_layout_005fbutton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005flayout_005fbutton_005fstyleClass_005freqCode_005fonclick_005fmode.reuse(_jspx_th_layout_005fbutton_005f2);
                            return;
                          }
                          _005fjspx_005ftagPool_005flayout_005fbutton_005fstyleClass_005freqCode_005fonclick_005fmode.reuse(_jspx_th_layout_005fbutton_005f2);
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\r\n");
                          out.write("\t\t  ");
                          int evalDoAfterBody = _jspx_th_layout_005fformActions_005f1.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_layout_005fformActions_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flayout_005fformActions.reuse(_jspx_th_layout_005fformActions_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005flayout_005fformActions.reuse(_jspx_th_layout_005fformActions_005f1);
                      out.write("\r\n");
                      out.write("\t\t \r\n");
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
                  out.write("\r\n");
                  out.write("\t\t  ");
                  if (_jspx_meth_layout_005fspace_005f1(_jspx_th_layout_005fform_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t  ");
                  if (_jspx_meth_layout_005fmessage_005f0(_jspx_th_layout_005fform_005f0, _jspx_page_context))
                    return;
                  out.write('\r');
                  out.write('\n');
                  out.write('	');
                  int evalDoAfterBody = _jspx_th_layout_005fform_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_layout_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flayout_005fform_005fstyleClass_005freqCode_005fonsubmit_005faction.reuse(_jspx_th_layout_005fform_005f0);
                return;
              }
              _005fjspx_005ftagPool_005flayout_005fform_005fstyleClass_005freqCode_005fonsubmit_005faction.reuse(_jspx_th_layout_005fform_005f0);
              out.write("\r\n");
              out.write("\t\r\n");
              out.write("\t");
              out.write('\r');
              out.write('\n');
              out.write('	');
              int evalDoAfterBody = _jspx_th_template_005fput_005f2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_template_005fput_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_template_005fput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005ftemplate_005fput_005fname.reuse(_jspx_th_template_005fput_005f2);
            return;
          }
          _005fjspx_005ftagPool_005ftemplate_005fput_005fname.reuse(_jspx_th_template_005fput_005f2);
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    //alert(\"ARRANCO\");\r\n");
      out.write("    //alert(document.getElementsByName(\"direccionGoogle\"));\r\n");
      out.write("  \tvar direccionGoogle=document.getElementsByName(\"direccionGoogle\");\r\n");
      out.write("    //alert(direccionGoogle.toString());\r\n");
      out.write("    if (direccionGoogle[0].value!=\"\"){\r\n");
      out.write("    \t var txtLocation=document.getElementsByName(\"location\");\r\n");
      out.write("    \t txtLocation[0].value=direccionGoogle[0].value;\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_html_005fjavascript_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:javascript
    org.apache.struts.taglib.html.JavascriptValidatorTag _jspx_th_html_005fjavascript_005f0 = (org.apache.struts.taglib.html.JavascriptValidatorTag) _005fjspx_005ftagPool_005fhtml_005fjavascript_005fformName_005fnobody.get(org.apache.struts.taglib.html.JavascriptValidatorTag.class);
    _jspx_th_html_005fjavascript_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fjavascript_005f0.setParent(null);
    _jspx_th_html_005fjavascript_005f0.setFormName("ReservaForm");
    int _jspx_eval_html_005fjavascript_005f0 = _jspx_th_html_005fjavascript_005f0.doStartTag();
    if (_jspx_th_html_005fjavascript_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fjavascript_005fformName_005fnobody.reuse(_jspx_th_html_005fjavascript_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fjavascript_005fformName_005fnobody.reuse(_jspx_th_html_005fjavascript_005f0);
    return false;
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
    org.apache.struts.taglib.template.PutTag _jspx_th_template_005fput_005f0 = (org.apache.struts.taglib.template.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.get(org.apache.struts.taglib.template.PutTag.class);
    _jspx_th_template_005fput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
    _jspx_th_template_005fput_005f0.setName("titlePage");
    _jspx_th_template_005fput_005f0.setContent(" ");
    _jspx_th_template_005fput_005f0.setDirect("true");
    int _jspx_eval_template_005fput_005f0 = _jspx_th_template_005fput_005f0.doStartTag();
    if (_jspx_th_template_005fput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f0);
    return false;
  }

  private boolean _jspx_meth_template_005fput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005finsert_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:put
    org.apache.struts.taglib.template.PutTag _jspx_th_template_005fput_005f1 = (org.apache.struts.taglib.template.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect.get(org.apache.struts.taglib.template.PutTag.class);
    _jspx_th_template_005fput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
    _jspx_th_template_005fput_005f1.setName("title");
    _jspx_th_template_005fput_005f1.setDirect("true");
    int _jspx_eval_template_005fput_005f1 = _jspx_th_template_005fput_005f1.doStartTag();
    if (_jspx_eval_template_005fput_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_template_005fput_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_template_005fput_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_template_005fput_005f1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("  \t");
        if (_jspx_meth_bean_005fmessage_005f0(_jspx_th_template_005fput_005f1, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("  \t");
        if (_jspx_meth_app_005fActionLabelTag_005f0(_jspx_th_template_005fput_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("  ");
        int evalDoAfterBody = _jspx_th_template_005fput_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_template_005fput_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_template_005fput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect.reuse(_jspx_th_template_005fput_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect.reuse(_jspx_th_template_005fput_005f1);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005fput_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f0 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005fput_005f1);
    _jspx_th_bean_005fmessage_005f0.setKey("ReservaForm.window.titulo");
    int _jspx_eval_bean_005fmessage_005f0 = _jspx_th_bean_005fmessage_005f0.doStartTag();
    if (_jspx_th_bean_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_app_005fActionLabelTag_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005fput_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  app:ActionLabelTag
    com.slort.tag.ActionLabelTag _jspx_th_app_005fActionLabelTag_005f0 = (com.slort.tag.ActionLabelTag) _005fjspx_005ftagPool_005fapp_005fActionLabelTag_005fparameter_005fnobody.get(com.slort.tag.ActionLabelTag.class);
    _jspx_th_app_005fActionLabelTag_005f0.setPageContext(_jspx_page_context);
    _jspx_th_app_005fActionLabelTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005fput_005f1);
    _jspx_th_app_005fActionLabelTag_005f0.setParameter("reqCode");
    int _jspx_eval_app_005fActionLabelTag_005f0 = _jspx_th_app_005fActionLabelTag_005f0.doStartTag();
    if (_jspx_th_app_005fActionLabelTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fapp_005fActionLabelTag_005fparameter_005fnobody.reuse(_jspx_th_app_005fActionLabelTag_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fapp_005fActionLabelTag_005fparameter_005fnobody.reuse(_jspx_th_app_005fActionLabelTag_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcolumn_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcolumn_005f0);
    _jspx_th_bean_005fwrite_005f0.setName("reservaForm");
    _jspx_th_bean_005fwrite_005f0.setProperty("direccionGoogle");
    int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
    if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
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
    fr.improve.struts.taglib.layout.field.TextFieldTag _jspx_th_layout_005ftext_005f1 = (fr.improve.struts.taglib.layout.field.TextFieldTag) _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fonkeyup_005fmode_005fmaxlength_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.TextFieldTag.class);
    _jspx_th_layout_005ftext_005f1.setPageContext(_jspx_page_context);
    _jspx_th_layout_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcolumn_005f0);
    _jspx_th_layout_005ftext_005f1.setKey("ReservaForm.cliente");
    _jspx_th_layout_005ftext_005f1.setProperty("cliente.clienteCompleto");
    _jspx_th_layout_005ftext_005f1.setStyleClass("LABEL");
    _jspx_th_layout_005ftext_005f1.setMode("E,E,I");
    _jspx_th_layout_005ftext_005f1.setSize("30");
    _jspx_th_layout_005ftext_005f1.setMaxlength("30");
    _jspx_th_layout_005ftext_005f1.setOnkeyup("ajax_showOptions_2(this,'getClientesReservaporLetras',event,550,0)");
    int _jspx_eval_layout_005ftext_005f1 = _jspx_th_layout_005ftext_005f1.doStartTag();
    if (_jspx_th_layout_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fonkeyup_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fonkeyup_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f1);
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
    _jspx_th_bean_005fmessage_005f1.setKey("ReservaForm.button.googlemapsview.altacliente.label");
    int _jspx_eval_bean_005fmessage_005f1 = _jspx_th_bean_005fmessage_005f1.doStartTag();
    if (_jspx_th_bean_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f1);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcolumn_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcolumn_005f0);
    _jspx_th_bean_005fwrite_005f1.setName("reservaForm");
    _jspx_th_bean_005fwrite_005f1.setProperty("codCliente");
    int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
    if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
    return false;
  }

  private boolean _jspx_meth_layout_005ftext_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcolumn_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:text
    fr.improve.struts.taglib.layout.field.TextFieldTag _jspx_th_layout_005ftext_005f2 = (fr.improve.struts.taglib.layout.field.TextFieldTag) _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.TextFieldTag.class);
    _jspx_th_layout_005ftext_005f2.setPageContext(_jspx_page_context);
    _jspx_th_layout_005ftext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcolumn_005f0);
    _jspx_th_layout_005ftext_005f2.setKey("ReservaForm.hora");
    _jspx_th_layout_005ftext_005f2.setProperty("hora");
    _jspx_th_layout_005ftext_005f2.setStyleClass("LABEL");
    _jspx_th_layout_005ftext_005f2.setMode("E,E,I");
    _jspx_th_layout_005ftext_005f2.setSize("5");
    _jspx_th_layout_005ftext_005f2.setMaxlength("30");
    int _jspx_eval_layout_005ftext_005f2 = _jspx_th_layout_005ftext_005f2.doStartTag();
    if (_jspx_th_layout_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f2);
    return false;
  }

  private boolean _jspx_meth_layout_005ftext_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcolumn_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:text
    fr.improve.struts.taglib.layout.field.TextFieldTag _jspx_th_layout_005ftext_005f3 = (fr.improve.struts.taglib.layout.field.TextFieldTag) _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005freadonly_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.TextFieldTag.class);
    _jspx_th_layout_005ftext_005f3.setPageContext(_jspx_page_context);
    _jspx_th_layout_005ftext_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcolumn_005f0);
    _jspx_th_layout_005ftext_005f3.setKey("ReservaForm.direccion");
    _jspx_th_layout_005ftext_005f3.setProperty("direccion");
    _jspx_th_layout_005ftext_005f3.setStyleClass("LABEL");
    _jspx_th_layout_005ftext_005f3.setMode("E,E,I");
    _jspx_th_layout_005ftext_005f3.setSize("60");
    _jspx_th_layout_005ftext_005f3.setMaxlength("150");
    _jspx_th_layout_005ftext_005f3.setReadonly(true);
    int _jspx_eval_layout_005ftext_005f3 = _jspx_th_layout_005ftext_005f3.doStartTag();
    if (_jspx_th_layout_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005freadonly_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005freadonly_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f3);
    return false;
  }

  private boolean _jspx_meth_layout_005ftext_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcolumn_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:text
    fr.improve.struts.taglib.layout.field.TextFieldTag _jspx_th_layout_005ftext_005f4 = (fr.improve.struts.taglib.layout.field.TextFieldTag) _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.TextFieldTag.class);
    _jspx_th_layout_005ftext_005f4.setPageContext(_jspx_page_context);
    _jspx_th_layout_005ftext_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcolumn_005f0);
    _jspx_th_layout_005ftext_005f4.setKey("ReservaForm.observaciones");
    _jspx_th_layout_005ftext_005f4.setProperty("observaciones");
    _jspx_th_layout_005ftext_005f4.setStyleClass("LABEL");
    _jspx_th_layout_005ftext_005f4.setMode("E,E,I");
    _jspx_th_layout_005ftext_005f4.setSize("30");
    _jspx_th_layout_005ftext_005f4.setMaxlength("30");
    int _jspx_eval_layout_005ftext_005f4 = _jspx_th_layout_005ftext_005f4.doStartTag();
    if (_jspx_th_layout_005ftext_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f4);
    return false;
  }

  private boolean _jspx_meth_layout_005ftext_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcolumn_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:text
    fr.improve.struts.taglib.layout.field.TextFieldTag _jspx_th_layout_005ftext_005f5 = (fr.improve.struts.taglib.layout.field.TextFieldTag) _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.TextFieldTag.class);
    _jspx_th_layout_005ftext_005f5.setPageContext(_jspx_page_context);
    _jspx_th_layout_005ftext_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcolumn_005f0);
    _jspx_th_layout_005ftext_005f5.setKey("ReservaForm.entreCalles");
    _jspx_th_layout_005ftext_005f5.setProperty("entreCalles");
    _jspx_th_layout_005ftext_005f5.setStyleClass("LABEL");
    _jspx_th_layout_005ftext_005f5.setMode("E,E,I");
    _jspx_th_layout_005ftext_005f5.setSize("30");
    _jspx_th_layout_005ftext_005f5.setMaxlength("30");
    int _jspx_eval_layout_005ftext_005f5 = _jspx_th_layout_005ftext_005f5.doStartTag();
    if (_jspx_th_layout_005ftext_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f5);
    return false;
  }

  private boolean _jspx_meth_layout_005ftext_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcolumn_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:text
    fr.improve.struts.taglib.layout.field.TextFieldTag _jspx_th_layout_005ftext_005f6 = (fr.improve.struts.taglib.layout.field.TextFieldTag) _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.TextFieldTag.class);
    _jspx_th_layout_005ftext_005f6.setPageContext(_jspx_page_context);
    _jspx_th_layout_005ftext_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcolumn_005f0);
    _jspx_th_layout_005ftext_005f6.setKey("ReservaForm.telefono");
    _jspx_th_layout_005ftext_005f6.setProperty("telefono");
    _jspx_th_layout_005ftext_005f6.setStyleClass("LABEL");
    _jspx_th_layout_005ftext_005f6.setMode("E,E,I");
    _jspx_th_layout_005ftext_005f6.setSize("30");
    _jspx_th_layout_005ftext_005f6.setMaxlength("30");
    int _jspx_eval_layout_005ftext_005f6 = _jspx_th_layout_005ftext_005f6.doStartTag();
    if (_jspx_th_layout_005ftext_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f6);
    return false;
  }

  private boolean _jspx_meth_layout_005ftext_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcolumn_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:text
    fr.improve.struts.taglib.layout.field.TextFieldTag _jspx_th_layout_005ftext_005f7 = (fr.improve.struts.taglib.layout.field.TextFieldTag) _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.TextFieldTag.class);
    _jspx_th_layout_005ftext_005f7.setPageContext(_jspx_page_context);
    _jspx_th_layout_005ftext_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcolumn_005f0);
    _jspx_th_layout_005ftext_005f7.setKey("ReservaForm.flota");
    _jspx_th_layout_005ftext_005f7.setProperty("flota.flotaCompleta");
    _jspx_th_layout_005ftext_005f7.setStyleClass("LABEL");
    _jspx_th_layout_005ftext_005f7.setMode("I,I,I");
    _jspx_th_layout_005ftext_005f7.setSize("30");
    _jspx_th_layout_005ftext_005f7.setMaxlength("30");
    int _jspx_eval_layout_005ftext_005f7 = _jspx_th_layout_005ftext_005f7.doStartTag();
    if (_jspx_th_layout_005ftext_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f7);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fsubmit_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f2 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f2.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fsubmit_005f0);
    _jspx_th_bean_005fmessage_005f2.setKey("ReservaForm.button.googlemapsview.asignarunidad.label");
    int _jspx_eval_bean_005fmessage_005f2 = _jspx_th_bean_005fmessage_005f2.doStartTag();
    if (_jspx_th_bean_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcolumn_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcolumn_005f0);
    _jspx_th_bean_005fwrite_005f2.setName("reservaForm");
    _jspx_th_bean_005fwrite_005f2.setProperty("codUnidad");
    int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
    if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
    return false;
  }

  private boolean _jspx_meth_layout_005ftext_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcolumn_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:text
    fr.improve.struts.taglib.layout.field.TextFieldTag _jspx_th_layout_005ftext_005f8 = (fr.improve.struts.taglib.layout.field.TextFieldTag) _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fonkeyup_005fmode_005fmaxlength_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.TextFieldTag.class);
    _jspx_th_layout_005ftext_005f8.setPageContext(_jspx_page_context);
    _jspx_th_layout_005ftext_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcolumn_005f0);
    _jspx_th_layout_005ftext_005f8.setKey("ReservaForm.hotel");
    _jspx_th_layout_005ftext_005f8.setProperty("hotel.nombre");
    _jspx_th_layout_005ftext_005f8.setStyleClass("LABEL");
    _jspx_th_layout_005ftext_005f8.setMode("E,E,I");
    _jspx_th_layout_005ftext_005f8.setSize("30");
    _jspx_th_layout_005ftext_005f8.setMaxlength("30");
    _jspx_th_layout_005ftext_005f8.setOnkeyup("ajax_showOptions_2(this,'getHotelReservaporLetras',event,550,0)");
    int _jspx_eval_layout_005ftext_005f8 = _jspx_th_layout_005ftext_005f8.doStartTag();
    if (_jspx_th_layout_005ftext_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fonkeyup_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fonkeyup_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f8);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcolumn_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f3 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f3.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcolumn_005f0);
    _jspx_th_bean_005fwrite_005f3.setName("reservaForm");
    _jspx_th_bean_005fwrite_005f3.setProperty("idHotel");
    int _jspx_eval_bean_005fwrite_005f3 = _jspx_th_bean_005fwrite_005f3.doStartTag();
    if (_jspx_th_bean_005fwrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
    return false;
  }

  private boolean _jspx_meth_layout_005fselect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcolumn_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:select
    fr.improve.struts.taglib.layout.field.SelectTag _jspx_th_layout_005fselect_005f0 = (fr.improve.struts.taglib.layout.field.SelectTag) _005fjspx_005ftagPool_005flayout_005fselect_005ftabindex_005fstyleClass_005fproperty_005fmode_005fkey.get(fr.improve.struts.taglib.layout.field.SelectTag.class);
    _jspx_th_layout_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcolumn_005f0);
    _jspx_th_layout_005fselect_005f0.setKey("ReservaForm.estado");
    _jspx_th_layout_005fselect_005f0.setProperty("estado");
    _jspx_th_layout_005fselect_005f0.setStyleClass("LABEL");
    _jspx_th_layout_005fselect_005f0.setTabindex("0");
    _jspx_th_layout_005fselect_005f0.setMode("I,I,I");
    int _jspx_eval_layout_005fselect_005f0 = _jspx_th_layout_005fselect_005f0.doStartTag();
    if (_jspx_eval_layout_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_layout_005foption_005f0(_jspx_th_layout_005fselect_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_layout_005foption_005f1(_jspx_th_layout_005fselect_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_layout_005foption_005f2(_jspx_th_layout_005fselect_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_layout_005foption_005f3(_jspx_th_layout_005fselect_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_layout_005fselect_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_layout_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fselect_005ftabindex_005fstyleClass_005fproperty_005fmode_005fkey.reuse(_jspx_th_layout_005fselect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fselect_005ftabindex_005fstyleClass_005fproperty_005fmode_005fkey.reuse(_jspx_th_layout_005fselect_005f0);
    return false;
  }

  private boolean _jspx_meth_layout_005foption_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:option
    fr.improve.struts.taglib.layout.field.OptionTag _jspx_th_layout_005foption_005f0 = (fr.improve.struts.taglib.layout.field.OptionTag) _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.OptionTag.class);
    _jspx_th_layout_005foption_005f0.setPageContext(_jspx_page_context);
    _jspx_th_layout_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fselect_005f0);
    _jspx_th_layout_005foption_005f0.setValue("En proceso");
    _jspx_th_layout_005foption_005f0.setKey("En proceso");
    int _jspx_eval_layout_005foption_005f0 = _jspx_th_layout_005foption_005f0.doStartTag();
    if (_jspx_th_layout_005foption_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.reuse(_jspx_th_layout_005foption_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.reuse(_jspx_th_layout_005foption_005f0);
    return false;
  }

  private boolean _jspx_meth_layout_005foption_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:option
    fr.improve.struts.taglib.layout.field.OptionTag _jspx_th_layout_005foption_005f1 = (fr.improve.struts.taglib.layout.field.OptionTag) _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.OptionTag.class);
    _jspx_th_layout_005foption_005f1.setPageContext(_jspx_page_context);
    _jspx_th_layout_005foption_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fselect_005f0);
    _jspx_th_layout_005foption_005f1.setValue("A realizar");
    _jspx_th_layout_005foption_005f1.setKey("A realizar");
    int _jspx_eval_layout_005foption_005f1 = _jspx_th_layout_005foption_005f1.doStartTag();
    if (_jspx_th_layout_005foption_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.reuse(_jspx_th_layout_005foption_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.reuse(_jspx_th_layout_005foption_005f1);
    return false;
  }

  private boolean _jspx_meth_layout_005foption_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:option
    fr.improve.struts.taglib.layout.field.OptionTag _jspx_th_layout_005foption_005f2 = (fr.improve.struts.taglib.layout.field.OptionTag) _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.OptionTag.class);
    _jspx_th_layout_005foption_005f2.setPageContext(_jspx_page_context);
    _jspx_th_layout_005foption_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fselect_005f0);
    _jspx_th_layout_005foption_005f2.setValue("Realizada");
    _jspx_th_layout_005foption_005f2.setKey("Realizada");
    int _jspx_eval_layout_005foption_005f2 = _jspx_th_layout_005foption_005f2.doStartTag();
    if (_jspx_th_layout_005foption_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.reuse(_jspx_th_layout_005foption_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.reuse(_jspx_th_layout_005foption_005f2);
    return false;
  }

  private boolean _jspx_meth_layout_005foption_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:option
    fr.improve.struts.taglib.layout.field.OptionTag _jspx_th_layout_005foption_005f3 = (fr.improve.struts.taglib.layout.field.OptionTag) _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.OptionTag.class);
    _jspx_th_layout_005foption_005f3.setPageContext(_jspx_page_context);
    _jspx_th_layout_005foption_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fselect_005f0);
    _jspx_th_layout_005foption_005f3.setValue("Cancelada");
    _jspx_th_layout_005foption_005f3.setKey("Cancelada");
    int _jspx_eval_layout_005foption_005f3 = _jspx_th_layout_005foption_005f3.doStartTag();
    if (_jspx_th_layout_005foption_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.reuse(_jspx_th_layout_005foption_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.reuse(_jspx_th_layout_005foption_005f3);
    return false;
  }

  private boolean _jspx_meth_layout_005ftext_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcolumn_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:text
    fr.improve.struts.taglib.layout.field.TextFieldTag _jspx_th_layout_005ftext_005f9 = (fr.improve.struts.taglib.layout.field.TextFieldTag) _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.TextFieldTag.class);
    _jspx_th_layout_005ftext_005f9.setPageContext(_jspx_page_context);
    _jspx_th_layout_005ftext_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcolumn_005f0);
    _jspx_th_layout_005ftext_005f9.setKey("ReservaForm.usuario");
    _jspx_th_layout_005ftext_005f9.setProperty("usuario.usuario");
    _jspx_th_layout_005ftext_005f9.setStyleClass("LABEL");
    _jspx_th_layout_005ftext_005f9.setMode("H,I,I");
    _jspx_th_layout_005ftext_005f9.setSize("30");
    _jspx_th_layout_005ftext_005f9.setMaxlength("30");
    int _jspx_eval_layout_005ftext_005f9 = _jspx_th_layout_005ftext_005f9.doStartTag();
    if (_jspx_th_layout_005ftext_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f9);
    return false;
  }

  private boolean _jspx_meth_layout_005ftext_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcolumn_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:text
    fr.improve.struts.taglib.layout.field.TextFieldTag _jspx_th_layout_005ftext_005f10 = (fr.improve.struts.taglib.layout.field.TextFieldTag) _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.TextFieldTag.class);
    _jspx_th_layout_005ftext_005f10.setPageContext(_jspx_page_context);
    _jspx_th_layout_005ftext_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcolumn_005f0);
    _jspx_th_layout_005ftext_005f10.setKey("ReservaForm.idUsuario");
    _jspx_th_layout_005ftext_005f10.setProperty("idUsuario");
    _jspx_th_layout_005ftext_005f10.setStyleClass("LABEL");
    _jspx_th_layout_005ftext_005f10.setMode("H,H,H");
    _jspx_th_layout_005ftext_005f10.setSize("30");
    _jspx_th_layout_005ftext_005f10.setMaxlength("30");
    int _jspx_eval_layout_005ftext_005f10 = _jspx_th_layout_005ftext_005f10.doStartTag();
    if (_jspx_th_layout_005ftext_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f10);
    return false;
  }

  private boolean _jspx_meth_layout_005ftext_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcolumn_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:text
    fr.improve.struts.taglib.layout.field.TextFieldTag _jspx_th_layout_005ftext_005f11 = (fr.improve.struts.taglib.layout.field.TextFieldTag) _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005freadonly_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.TextFieldTag.class);
    _jspx_th_layout_005ftext_005f11.setPageContext(_jspx_page_context);
    _jspx_th_layout_005ftext_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcolumn_005f0);
    _jspx_th_layout_005ftext_005f11.setKey("ReservaForm.latitud");
    _jspx_th_layout_005ftext_005f11.setProperty("latitud");
    _jspx_th_layout_005ftext_005f11.setStyleClass("LABEL");
    _jspx_th_layout_005ftext_005f11.setMode("E,E,I");
    _jspx_th_layout_005ftext_005f11.setSize("30");
    _jspx_th_layout_005ftext_005f11.setMaxlength("30");
    _jspx_th_layout_005ftext_005f11.setReadonly(true);
    int _jspx_eval_layout_005ftext_005f11 = _jspx_th_layout_005ftext_005f11.doStartTag();
    if (_jspx_th_layout_005ftext_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005freadonly_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005freadonly_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f11);
    return false;
  }

  private boolean _jspx_meth_layout_005ftext_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcolumn_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:text
    fr.improve.struts.taglib.layout.field.TextFieldTag _jspx_th_layout_005ftext_005f12 = (fr.improve.struts.taglib.layout.field.TextFieldTag) _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005freadonly_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.TextFieldTag.class);
    _jspx_th_layout_005ftext_005f12.setPageContext(_jspx_page_context);
    _jspx_th_layout_005ftext_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcolumn_005f0);
    _jspx_th_layout_005ftext_005f12.setKey("ReservaForm.longitud");
    _jspx_th_layout_005ftext_005f12.setProperty("longitud");
    _jspx_th_layout_005ftext_005f12.setStyleClass("LABEL");
    _jspx_th_layout_005ftext_005f12.setMode("E,E,I");
    _jspx_th_layout_005ftext_005f12.setSize("30");
    _jspx_th_layout_005ftext_005f12.setMaxlength("30");
    _jspx_th_layout_005ftext_005f12.setReadonly(true);
    int _jspx_eval_layout_005ftext_005f12 = _jspx_th_layout_005ftext_005f12.doStartTag();
    if (_jspx_th_layout_005ftext_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005freadonly_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005freadonly_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f12);
    return false;
  }

  private boolean _jspx_meth_layout_005fcolumn_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005frow_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:column
    fr.improve.struts.taglib.layout.ColumnTag _jspx_th_layout_005fcolumn_005f1 = (fr.improve.struts.taglib.layout.ColumnTag) _005fjspx_005ftagPool_005flayout_005fcolumn.get(fr.improve.struts.taglib.layout.ColumnTag.class);
    _jspx_th_layout_005fcolumn_005f1.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fcolumn_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005frow_005f0);
    int _jspx_eval_layout_005fcolumn_005f1 = _jspx_th_layout_005fcolumn_005f1.doStartTag();
    if (_jspx_eval_layout_005fcolumn_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_layout_005fhtml_005f0(_jspx_th_layout_005fcolumn_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t<div id=\"map_canvas\" style=\"width:400px;height:300px;\"/>\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_layout_005fcolumn_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_layout_005fcolumn_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fcolumn.reuse(_jspx_th_layout_005fcolumn_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fcolumn.reuse(_jspx_th_layout_005fcolumn_005f1);
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
    _jspx_th_layout_005fhtml_005f0.setAlign("left");
    int _jspx_eval_layout_005fhtml_005f0 = _jspx_th_layout_005fhtml_005f0.doStartTag();
    if (_jspx_eval_layout_005fhtml_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t    ");
        if (_jspx_meth_bean_005fmessage_005f3(_jspx_th_layout_005fhtml_005f0, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("\t    \t");
        if (_jspx_meth_bean_005fmessage_005f4(_jspx_th_layout_005fhtml_005f0, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("\t\t");
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

  private boolean _jspx_meth_bean_005fmessage_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f3 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f3.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fhtml_005f0);
    _jspx_th_bean_005fmessage_005f3.setKey("ReservaForm.direccion.div.location.label");
    int _jspx_eval_bean_005fmessage_005f3 = _jspx_th_bean_005fmessage_005f3.doStartTag();
    if (_jspx_th_bean_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f3);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f4 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f4.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fhtml_005f0);
    _jspx_th_bean_005fmessage_005f4.setKey("ReservaForm.direccion.div.location");
    int _jspx_eval_bean_005fmessage_005f4 = _jspx_th_bean_005fmessage_005f4.doStartTag();
    if (_jspx_th_bean_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f4);
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

  private boolean _jspx_meth_bean_005fmessage_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fsubmit_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f5 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f5.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fsubmit_005f1);
    _jspx_th_bean_005fmessage_005f5.setKey("button.save");
    int _jspx_eval_bean_005fmessage_005f5 = _jspx_th_bean_005fmessage_005f5.doStartTag();
    if (_jspx_th_bean_005fmessage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f5);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fsubmit_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f6 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f6.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fsubmit_005f2);
    _jspx_th_bean_005fmessage_005f6.setKey("button.insert");
    int _jspx_eval_bean_005fmessage_005f6 = _jspx_th_bean_005fmessage_005f6.doStartTag();
    if (_jspx_th_bean_005fmessage_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f6);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fbutton_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f7 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f7.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fbutton_005f1);
    _jspx_th_bean_005fmessage_005f7.setKey("button.back");
    int _jspx_eval_bean_005fmessage_005f7 = _jspx_th_bean_005fmessage_005f7.doStartTag();
    if (_jspx_th_bean_005fmessage_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f7);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fsubmit_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f8 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f8.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fsubmit_005f3);
    _jspx_th_bean_005fmessage_005f8.setKey("ReservaForm.button.cancel");
    int _jspx_eval_bean_005fmessage_005f8 = _jspx_th_bean_005fmessage_005f8.doStartTag();
    if (_jspx_th_bean_005fmessage_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f8);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fsubmit_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f9 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f9.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fsubmit_005f4);
    _jspx_th_bean_005fmessage_005f9.setKey("ReservaForm.button.cancel");
    int _jspx_eval_bean_005fmessage_005f9 = _jspx_th_bean_005fmessage_005f9.doStartTag();
    if (_jspx_th_bean_005fmessage_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f9);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fbutton_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f10 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f10.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fbutton_005f2);
    _jspx_th_bean_005fmessage_005f10.setKey("ReservaForm.button.googlemapsview.label");
    int _jspx_eval_bean_005fmessage_005f10 = _jspx_th_bean_005fmessage_005f10.doStartTag();
    if (_jspx_th_bean_005fmessage_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f10);
    return false;
  }

  private boolean _jspx_meth_layout_005fspace_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:space
    fr.improve.struts.taglib.layout.EmptyTag _jspx_th_layout_005fspace_005f1 = (fr.improve.struts.taglib.layout.EmptyTag) _005fjspx_005ftagPool_005flayout_005fspace_005fnobody.get(fr.improve.struts.taglib.layout.EmptyTag.class);
    _jspx_th_layout_005fspace_005f1.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fspace_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fform_005f0);
    int _jspx_eval_layout_005fspace_005f1 = _jspx_th_layout_005fspace_005f1.doStartTag();
    if (_jspx_th_layout_005fspace_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fspace_005fnobody.reuse(_jspx_th_layout_005fspace_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fspace_005fnobody.reuse(_jspx_th_layout_005fspace_005f1);
    return false;
  }

  private boolean _jspx_meth_layout_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:message
    fr.improve.struts.taglib.layout.MessageTag _jspx_th_layout_005fmessage_005f0 = (fr.improve.struts.taglib.layout.MessageTag) _005fjspx_005ftagPool_005flayout_005fmessage_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.MessageTag.class);
    _jspx_th_layout_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fform_005f0);
    _jspx_th_layout_005fmessage_005f0.setKey("slort.mensajes.campos.obligatorios");
    int _jspx_eval_layout_005fmessage_005f0 = _jspx_th_layout_005fmessage_005f0.doStartTag();
    if (_jspx_th_layout_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fmessage_005fkey_005fnobody.reuse(_jspx_th_layout_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fmessage_005fkey_005fnobody.reuse(_jspx_th_layout_005fmessage_005f0);
    return false;
  }
}
