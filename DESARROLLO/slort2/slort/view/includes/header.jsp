<%@ page language="java" %>
<%@ page import="java.util.Date" %>


<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-template.tld" prefix="template" %>
<%@ taglib uri="/WEB-INF/struts-nested.tld" prefix="nested" %>
<%@ taglib uri="/WEB-INF/struts-layout.tld" prefix="layout" %>

<jsp:useBean id="bdbUser" scope="session" 
						 class="com.slort.model.Usuario" />   
<%
   pageContext.setAttribute("dates", new Date());
	 
%>

		
		
<table border=0 cellpadding=0 cellspacing=0 width="100%">
<tr class="Slort_header_bgcolor1">
	<td style="padding-left:10px;padding-right:10px;padding-top:2px;padding-bottom:2px;">
	


	<table border=0 cellpadding=0 cellspacing=0 width="100%">
		<tr>
			<td width=50% align="left" valign="middle">

				<img border=0  src="images/logo-slort-chikito.png">
				&nbsp;&nbsp;&nbsp;&nbsp; 				


			</td>
			<td width=50% align="right" valign="bottom" class=G>
					<layout:write name="dates" type="dateFull"/>
			</td>
		</tr>
	</table>





	</td>
</tr>

<tr>
	<td class="Slort_header_bgcolor2" width=50% align="left" valign="middle">
	
	
	
	<table border=0 cellpadding=0 cellspacing=0 width="100%">
		<tr>
			<td width=50% align="left" valign="middle" class=G>
<%
				if ((bdbUser!=null) && (bdbUser.getIdUsuario()!=null) && (!(new Long(0)).equals(bdbUser.getIdUsuario())) ) {
					out.println("Usuario: "+bdbUser.getApellido()+", "+bdbUser.getNombre());
				}
%>

			</td>
			<td width=50% align="right" valign="middle" class=G>
			
				<html:link styleClass="G" href="http://www.slort.com.ar" target="_blank" >Slort</html:link>
				&nbsp;|&nbsp;
				<html:link styleClass="G" href="inicio.do">Inicio</html:link>
				&nbsp;|&nbsp;
				Contraseņa
				&nbsp;|&nbsp;
				<html:link styleClass="G" href="logoff.do">Salir</html:link>

			</td>
		</tr>
	</table>
	
	
	
	</td>
</tr>
</table>
