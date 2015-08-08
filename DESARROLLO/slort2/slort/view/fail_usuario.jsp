<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-template.tld" prefix="template" %>
<%@ taglib uri="/WEB-INF/struts-nested.tld" prefix="nested" %>
<%@ taglib uri="/WEB-INF/struts-layout.tld" prefix="layout" %>

<%@ taglib uri="/WEB-INF/app.tld" prefix="app" %>


<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html:html locale="true">
	<head>
		
		<base href='<%=basePath%>'>
		<title>Slort </title>
		
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		
		<link rel="stylesheet" href='config/default.css' type="text/css" />
		<link rel="stylesheet" href="config/ajax-dynamic-list.css" type="text/css" />
	
		<script language="Javascript" src="config/javascript.js"></script>
		<script language="Javascript" src="jscript/ajaxUtils.js"></script>
		
		<SCRIPT language="Javascript" src="jscript/slort.js"></SCRIPT>
		<script language="Javascript" src="jscript/ajax.js"></script>
		<script language="Javascript" src="jscript/ajax-dynamic-list.js"></script>
		
		<script>var imgsrc="<%=path%>/images/"; var scriptsrc="<%=path%>/config/"; var langue="es";</script>		

	</head>    



<body bgcolor="#336699"
topmargin="0" leftmargin="0" marginheight="0" marginwidth="0" bottommargin="0" rightmargin="0">
	
	
	<table border=0 cellpadding=0 cellspacing=0 width="100%" class="AA" height="100%">
		
		<!-- header.start -->
		<tr>
			<td valign="top" width="100%" bgcolor="#DBEAF5" colspan="2">
				<jsp:include page="/view/includes/header.jsp"/>
			</td>
		</tr>
		<!-- header.end -->
		
		<!-- main.start -->
		<tr>
			<td valign="top" width="115" bgcolor="#DBEAF5" height="100%">
				<!-- left.start -->
				<jsp:include page="/view/includes/left.jsp"/>
				<!-- left.ini -->
			</td>
			<td valign="top" width="100%" height="100%" align=center class="Slort_content_bgcolor">
				


				<!-- title.ini -->
				<table cellpadding="0" cellspacing="0" border="0" width="100%" summary="">
					<tr>
						<td width="100%" class="Slort_title_jsp"></td>
					</tr>
				</table>
			<!-- title.fin -->
				
				
				<!-- message.ini -->
				<jsp:include page="/view/includes/messages.jsp" />
				<!-- message.fin -->
				
				<!-- errors.ini  incluye errores de ruben -->
				<jsp:include page="/view/includes/errors.jsp" />
				<!-- errors.fin -->
				
				
				<!-- content.start -->
				<!-- content.ini -->
				
			</td>
		</tr>
		<!-- main.end -->
		
		
		<!-- footer.start -->
		<tr>
			<td valign="bottom" width="100%" colspan="2">
				<jsp:include page="/view/includes/footer.jsp"/>
			</td>
		</tr>
		<!-- footer.end -->
		
		
	</table>
	
	
</body>
	
</html:html>


<script type="text/javascript">

      	alert('No se puede eliminar el usuario que actualmente se esta utilizando');
	    window.location='usuario.do?reqCode=findData';


	function operacionAjax(domDocument)
	{
		var texto = domDocument
	
		document.getElementById('ajax-search-results').innerHTML = texto	
	}

	function buscarPersonasInfo() 
	{
		valor = document.getElementById('textoABuscar').value;
		var url="PersonasAjax.do?paramAjax="+valor;
		getURI(url);
	}
	
	function guardarPersona()
	{
		var ja1 = new Array(); 
		var ja2 = new Array(); 
		ja = document.getElementById('suggestion').value.split("("); 
		j2 = ja[ja.length-1].split(")");
		document.getElementById('id_persona').value = j2[0];		
		
	}

</script>



