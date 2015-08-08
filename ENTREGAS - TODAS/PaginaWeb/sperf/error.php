<?
$target = $_GET['target'];
$msg = $_GET['msg'];
?>
<html>
<body>
<style type="text/css">
<!--
.style3 {font-family: Arial, Helvetica, sans-serif; color: #CCCCCC; }
a:link {
	color: #666666;
	text-decoration: none;
}
a:visited {
	color: #666666;
	text-decoration: none;
}
a {
	font-family: Arial, Helvetica, sans-serif;
	color: #666666;
	font-size: 14px;
}
a:hover {
	color: #333333;
	text-decoration: none;
}
a:active {
	color: #666666;
	text-decoration: none;
}
.botones {
	font-family: Arial, Helvetica, sans-serif;
	font-size: 12px;
	color: #CCCCCC;
	background-color: #333333;
}
body,td,th {
	color: #CCCCCC;
}
-->


</style>
<link href="ballester.css" rel="stylesheet" type="text/css">
<link href="texto.css" rel="stylesheet" type="text/css">
<style type="text/css">
<!--
.style13 {color: #666666}
body {
	background-image: url(./images/fondo16.jpg);
}
.style20 {color: #FFFFFF}
.style21 {
	font-family: Arial, Helvetica, sans-serif;
	font-weight: bold;
}
.style22 {
	font-family: Arial, Helvetica, sans-serif;
	font-size: 10px;
	color: #FFFFFF;
}
-->
</style>
<form action='<? echo $target ?>' method='post'>
<table width="700" height="100%" border="2" align="center" cellpadding="0"
 cellspacing="0" bordercolor="#FFFFFF" bgcolor="#FFFFFF">
	<tr>
		<td valign="top" height="117">
			<p align="center" class="style3"><img src="./images/logo2.jpg" width="694"   height="116"> </p>
		</td>
	</tr>
  <tr>
		<td height="*" valign="top" bgcolor="#0099CC" >
				<span style="color: red;"><? echo $msg ?> </span>
		</td>
  </tr>
  <tr>
		<td height="20" valign="top" bgcolor="#0099CC" align="center">
			<input type='submit' value='Ok'>
		</td>
  </tr>
  <tr>
  <td height="20" bgcolor="#0099CC"><div align="center"><span class="style22">
  ADMINISTRADOR VERSI&Oacute;N 1 / A&ntilde;o 2007. </span></div>  </td>
 </tr>
</table>
</form>
</body>
</html>