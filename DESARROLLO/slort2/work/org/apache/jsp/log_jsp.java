package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class log_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(8);
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/struts-tiles.tld");
    _jspx_dependants.add("/WEB-INF/struts-template.tld");
    _jspx_dependants.add("/WEB-INF/struts-nested.tld");
    _jspx_dependants.add("/WEB-INF/struts-layout.tld");
    _jspx_dependants.add("/WEB-INF/app.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhtml_005flocale;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fhtml_005flocale = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhtml_005flocale.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      //  html:html
      org.apache.struts.taglib.html.HtmlTag _jspx_th_html_005fhtml_005f0 = (org.apache.struts.taglib.html.HtmlTag) _005fjspx_005ftagPool_005fhtml_005fhtml_005flocale.get(org.apache.struts.taglib.html.HtmlTag.class);
      _jspx_th_html_005fhtml_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhtml_005f0.setParent(null);
      _jspx_th_html_005fhtml_005f0.setLocale(true);
      int _jspx_eval_html_005fhtml_005f0 = _jspx_th_html_005fhtml_005f0.doStartTag();
      if (_jspx_eval_html_005fhtml_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t<head>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<base href='");
          out.print(basePath);
          out.write("'>\r\n");
          out.write("\t\t<title>Slort </title>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
          out.write("\t\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
          out.write("\t\t<meta http-equiv=\"expires\" content=\"0\">\r\n");
          out.write("\t\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
          out.write("\t\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<link rel=\"stylesheet\" href='config/default.css' type=\"text/css\" />\r\n");
          out.write("\t\t<link rel=\"stylesheet\" href=\"config/ajax-dynamic-list.css\" type=\"text/css\" />\r\n");
          out.write("\t\r\n");
          out.write("\t\t<script language=\"Javascript\" src=\"config/javascript.js\"></script>\r\n");
          out.write("\t\t<script language=\"Javascript\" src=\"jscript/ajaxUtils.js\"></script>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<SCRIPT language=\"Javascript\" src=\"jscript/slort.js\"></SCRIPT>\r\n");
          out.write("\t\t<script language=\"Javascript\" src=\"jscript/ajax.js\"></script>\r\n");
          out.write("\t\t<script language=\"Javascript\" src=\"jscript/ajax-dynamic-list.js\"></script>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<script>var imgsrc=\"");
          out.print(path);
          out.write("/images/\"; var scriptsrc=\"");
          out.print(path);
          out.write("/config/\"; var langue=\"es\";</script>\t\t\r\n");
          out.write("\r\n");
          out.write("\t</head>    \r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("<script type=\"text/javascript\">\r\n");
          out.write("\r\n");
          out.write("\tfunction operacionAjax(domDocument)\r\n");
          out.write("\t{\r\n");
          out.write("\t\tvar texto = domDocument\r\n");
          out.write("\t\r\n");
          out.write("\t\tdocument.getElementById('ajax-search-results').innerHTML = texto\t\r\n");
          out.write("\t}\r\n");
          out.write("\r\n");
          out.write("\tfunction buscarPersonasInfo() \r\n");
          out.write("\t{\r\n");
          out.write("\t\tvalor = document.getElementById('textoABuscar').value;\r\n");
          out.write("\t\tvar url=\"PersonasAjax.do?paramAjax=\"+valor;\r\n");
          out.write("\t\tgetURI(url);\r\n");
          out.write("\t}\r\n");
          out.write("\t\r\n");
          out.write("\tfunction guardarPersona()\r\n");
          out.write("\t{\r\n");
          out.write("\t\tvar ja1 = new Array(); \r\n");
          out.write("\t\tvar ja2 = new Array(); \r\n");
          out.write("\t\tja = document.getElementById('suggestion').value.split(\"(\"); \r\n");
          out.write("\t\tj2 = ja[ja.length-1].split(\")\");\r\n");
          out.write("\t\tdocument.getElementById('id_persona').value = j2[0];\t\t\r\n");
          out.write("\t\t\r\n");
          out.write("\t}\r\n");
          out.write("\r\n");
          out.write("</script>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("<body bgcolor=\"#336699\"\r\n");
          out.write("topmargin=\"0\" leftmargin=\"0\" marginheight=\"0\" marginwidth=\"0\" bottommargin=\"0\" rightmargin=\"0\"\r\n");
          out.write("Onload=\"window.status=('Slort');\">\r\n");
          out.write("\t\r\n");
          out.write("\t\r\n");
          out.write("\t<table border=0 cellpadding=0 cellspacing=0 width=\"100%\" class=\"AA\" height=\"100%\">\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<!-- header.start -->\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td valign=\"top\" width=\"100%\" bgcolor=\"#DBEAF5\" colspan=\"2\">\r\n");
          out.write("\t\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/view/includes/header.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\t\t<!-- header.end -->\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<!-- main.start -->\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td valign=\"top\" width=\"115\" bgcolor=\"#DBEAF5\" height=\"100%\">\r\n");
          out.write("\t\t\t\t<!-- left.start -->\r\n");
          out.write("\t\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/view/includes/left.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t\t\t<!-- left.ini -->\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t\t<td valign=\"top\" width=\"100%\" height=\"100%\" align=center class=\"Slort_content_bgcolor\">\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t<!-- title.ini -->\r\n");
          out.write("\t\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"100%\" summary=\"\">\r\n");
          out.write("\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t<td width=\"100%\" class=\"Slort_title_jsp\"></td>\r\n");
          out.write("\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t</table>\r\n");
          out.write("\t\t\t<!-- title.fin -->\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t<!-- message.ini -->\r\n");
          out.write("\t\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/view/includes/messages.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t\t\t<!-- message.fin -->\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t<!-- errors.ini  incluye errores de ruben -->\r\n");
          out.write("\t\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/view/includes/errors.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t\t\t<!-- errors.fin -->\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t<!-- content.start -->\r\n");
          out.write("\t\t\t\t<!-- content.ini -->\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\t\t<!-- main.end -->\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<!-- footer.start -->\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td valign=\"bottom\" width=\"100%\" colspan=\"2\">\r\n");
          out.write("\t\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/view/includes/footer.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\t\t<!-- footer.end -->\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t\r\n");
          out.write("\t</table>\r\n");
          out.write("\t\r\n");
          out.write("\t\r\n");
          out.write("</body>\r\n");
          out.write("\t\r\n");
          int evalDoAfterBody = _jspx_th_html_005fhtml_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_005fhtml_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhtml_005flocale.reuse(_jspx_th_html_005fhtml_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhtml_005flocale.reuse(_jspx_th_html_005fhtml_005f0);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"refresh\" content=\"1;URL='");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.slort.model.Opcionmenu)_jspx_page_context.findAttribute("opcionDefecto")).getLink())));
      out.write("'\">\r\n");
      out.write("\r\n");
      com.slort.model.Opcionmenu opcionDefecto = null;
      synchronized (session) {
        opcionDefecto = (com.slort.model.Opcionmenu) _jspx_page_context.getAttribute("opcionDefecto", PageContext.SESSION_SCOPE);
        if (opcionDefecto == null){
          opcionDefecto = new com.slort.model.Opcionmenu();
          _jspx_page_context.setAttribute("opcionDefecto", opcionDefecto, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>Welcome</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<center>Welcome</center>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
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
}
