<%@ page language="java" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-template.tld" prefix="template" %>
<%@ taglib uri="/WEB-INF/struts-nested.tld" prefix="nested" %>
<%@ taglib uri="/WEB-INF/struts-layout.tld" prefix="layout" %>


<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html:html locale="true">
	<head>
		
		<base href='<%=basePath%>'>
		<title>Slort <template:get name='titlePage'/></title>
		
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		
		<link rel="stylesheet"
		href='config/default2.css'
		type="text/css">
		
		<script language="Javascript" src="config/javascript.js"></script>
		<script language="Javascript" src="jscript/Slort.js"></script>
		<script>var imgsrc="<%=path%>/images/"; var scriptsrc="<%=path%>/config/"; var langue="es";</script>
		
	</head>
		


<body bgcolor="#ffffff"
topmargin="0" leftmargin="0" marginheight="0" marginwidth="0" bottommargin="0" rightmargin="0"
Onload="window.status=('Slort');<template:get name='OnLoad'/>">
	
	
	<table border=0 cellpadding=0 cellspacing=0 width="100%" bgcolor="#ffffff">
		
		<tr>
			<td valign="top" width="100%" align="center" class="Slort_title_list" >
				<template:get name='title'/>
				<br><br>
			</td>
		</tr>

		<tr>
			<td valign="top" align="center">
				<template:get name='content'/>
			</td>
		</tr>
	
		<tr>
			<td valign="top" width="100%" align="center">
				<br><br>
				<layout:button styleClass="button" onclick="printWindow();">
					<bean:message key="button.print"/></layout:button>
					
				<layout:button styleClass="button" onclick="window.close();" >
					<bean:message key="button.close"/></layout:button>
			</td>
		</tr>
		
		
	</table>
	
	
</body>
	
</html:html>



