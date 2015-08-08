<%@ page language="java" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-template.tld" prefix="template" %>
<%@ taglib uri="/WEB-INF/struts-nested.tld" prefix="nested" %>
 

<style>
#foldheader{cursor:hand; font-weight:bold;}
#foldinglist{font-weight:bold;}
</style>

<script language="JavaScript1.2">

function change(){
   if(!document.all) {
      return;
    }
   if (event.srcElement.id=="foldheader") {
      var srcIndex = event.srcElement.sourceIndex;
      var nested = document.all[srcIndex+1];
      if (nested.style.display=="none") {
         nested.style.display='';
      }
      else {
         nested.style.display="none";
      }
   }
}
document.onclick=change;
</script>

<table border=0 cellpadding=0 cellspacing=0 width=200  style="PADDING-LEFT:5px;PADDING-RIGHT:5px;PADDING-TOP:2px;PADDING-BOTTOM:1px;">
	<tr height=10>
		<td align=right>
		</td>
	</tr>
	<tr>
		<td>
			<!-- INICIO MENU -->
			<jsp:useBean id="perfil" class="com.slort.model.Perfil" scope="session"/>
			<font class="azul-nor-1">
			<b><jsp:getProperty name="perfil" property="descripcionLarga"/></b>
			</font>
						<logic:present name="opcionesMenues" scope="session">
									<table cellspacing="0" cellpadding="3" border="1" style="border-collapse: collapse;border-spacing:0.5em 0.5em;" width="100%">			
								    <logic:iterate id="opcionMenu" name="opcionesMenues"  >
								    <tr>
									   <td>
									   <a href="<bean:write name="opcionMenu" property="link" />">
									   <font class="azul-nor-1">
									   <bean:write name="opcionMenu" property="descripcionLargo" />
									   </font></a>
									   </td>						   	    	
								    </tr>		
									</logic:iterate>
									</table>
						</logic:present>
		</td>
	</tr>
</table>
