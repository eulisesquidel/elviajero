<%@ page language="java" %>
<%@ page import="org.apache.struts.action.ActionErrors" %>
<%@ page import="org.apache.struts.action.ActionMessages" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<!-- EEEEEEEEEEEEEEEEE PRUEBA MENSAJE QQQQQQQQQQQQQQQQQQQQQQ -->
				<html:messages id="message" name="<%=ActionMessages.GLOBAL_MESSAGE%>">
						<table cellpadding="0" cellspacing="0" border="0" width="80%">
							<tr>
								<td class="slort_message_title">Informaci�n:</td>
							</tr>
							<tr>
								<td class="slort_message_content">
										<li><bean:write name="message"/></li>
								</td>
							</tr>
						</table>
				</html:messages>