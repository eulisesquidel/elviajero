<%@ page language="java" %>
<%@ page import="java.util.Vector"%>
<%@ page import="com.bdb.util.HttpUtils"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-layout.tld" prefix="layout" %>
<%@ taglib uri='/WEB-INF/struts-template.tld' prefix='template' %>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app" %>
<%@ taglib uri='/WEB-INF/struts-bean.tld' prefix='bean' %>

<html:html locale="true">
<head>
<title>Struts File Upload and Save Example</title>
<html:base/>
</head>
<body bgcolor="white">
<html:form action="/fileuploadandsave" method="post" enctype="multipart/form-data">
<table>
<tr>
<td align="center" colspan="2">
<font size="4">File Upload on Server</font>
</tr>

<tr>
<td align="left" colspan="2">
<font color="red"></font>
</tr>


<tr>
<td align="right">
File Name
</td>
<td align="left">
<html:file property="theFile" accept="image/gif, jpg, jpeg,application/vnd.ms-excel,xls" /> 
</td>
</tr>

<tr>
<td align="center" colspan="2">
<html:submit>Upload File</html:submit>
</td>
</tr>
</table>
</html:form>
</body>
</html:html>