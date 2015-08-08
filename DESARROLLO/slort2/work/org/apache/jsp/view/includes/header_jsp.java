package org.apache.jsp.view.includes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(7);
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/struts-tiles.tld");
    _jspx_dependants.add("/WEB-INF/struts-template.tld");
    _jspx_dependants.add("/WEB-INF/struts-nested.tld");
    _jspx_dependants.add("/WEB-INF/struts-layout.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fwrite_005ftype_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005flink_005ftarget_005fstyleClass_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fhref;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005flayout_005fwrite_005ftype_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005flink_005ftarget_005fstyleClass_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005flayout_005fwrite_005ftype_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005flink_005ftarget_005fstyleClass_005fhref.release();
    _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fhref.release();
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
      com.slort.model.Usuario bdbUser = null;
      synchronized (session) {
        bdbUser = (com.slort.model.Usuario) _jspx_page_context.getAttribute("bdbUser", PageContext.SESSION_SCOPE);
        if (bdbUser == null){
          bdbUser = new com.slort.model.Usuario();
          _jspx_page_context.setAttribute("bdbUser", bdbUser, PageContext.SESSION_SCOPE);
        }
      }
      out.write("   \r\n");

   pageContext.setAttribute("dates", new Date());
	 

      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("<table border=0 cellpadding=0 cellspacing=0 width=\"100%\">\r\n");
      out.write("<tr class=\"Slort_header_bgcolor1\">\r\n");
      out.write("\t<td style=\"padding-left:10px;padding-right:10px;padding-top:2px;padding-bottom:2px;\">\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<table border=0 cellpadding=0 cellspacing=0 width=\"100%\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td width=50% align=\"left\" valign=\"middle\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<img border=0  src=\"images/logo-slort-chikito.png\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp; \t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td width=50% align=\"right\" valign=\"bottom\" class=G>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_layout_005fwrite_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td class=\"Slort_header_bgcolor2\" width=50% align=\"left\" valign=\"middle\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<table border=0 cellpadding=0 cellspacing=0 width=\"100%\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td width=50% align=\"left\" valign=\"middle\" class=G>\r\n");

				if ((bdbUser!=null) && (bdbUser.getIdUsuario()!=null) && (!(new Long(0)).equals(bdbUser.getIdUsuario())) ) {
					out.println("Usuario: "+bdbUser.getApellido()+", "+bdbUser.getNombre());
				}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td width=50% align=\"right\" valign=\"middle\" class=G>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_html_005flink_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t&nbsp;|&nbsp;\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_html_005flink_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t&nbsp;|&nbsp;\r\n");
      out.write("\t\t\t\tContraseña\r\n");
      out.write("\t\t\t\t&nbsp;|&nbsp;\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_html_005flink_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
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

  private boolean _jspx_meth_layout_005fwrite_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:write
    fr.improve.struts.taglib.layout.WriteTag _jspx_th_layout_005fwrite_005f0 = (fr.improve.struts.taglib.layout.WriteTag) _005fjspx_005ftagPool_005flayout_005fwrite_005ftype_005fname_005fnobody.get(fr.improve.struts.taglib.layout.WriteTag.class);
    _jspx_th_layout_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fwrite_005f0.setParent(null);
    _jspx_th_layout_005fwrite_005f0.setName("dates");
    _jspx_th_layout_005fwrite_005f0.setType("dateFull");
    int _jspx_eval_layout_005fwrite_005f0 = _jspx_th_layout_005fwrite_005f0.doStartTag();
    if (_jspx_th_layout_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fwrite_005ftype_005fname_005fnobody.reuse(_jspx_th_layout_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fwrite_005ftype_005fname_005fnobody.reuse(_jspx_th_layout_005fwrite_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f0 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_005ftarget_005fstyleClass_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f0.setParent(null);
    _jspx_th_html_005flink_005f0.setStyleClass("G");
    _jspx_th_html_005flink_005f0.setHref("http://www.slort.com.ar");
    _jspx_th_html_005flink_005f0.setTarget("_blank");
    int _jspx_eval_html_005flink_005f0 = _jspx_th_html_005flink_005f0.doStartTag();
    if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f0.doInitBody();
      }
      do {
        out.write("Slort");
        int evalDoAfterBody = _jspx_th_html_005flink_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_005ftarget_005fstyleClass_005fhref.reuse(_jspx_th_html_005flink_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_005ftarget_005fstyleClass_005fhref.reuse(_jspx_th_html_005flink_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f1 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f1.setParent(null);
    _jspx_th_html_005flink_005f1.setStyleClass("G");
    _jspx_th_html_005flink_005f1.setHref("inicio.do");
    int _jspx_eval_html_005flink_005f1 = _jspx_th_html_005flink_005f1.doStartTag();
    if (_jspx_eval_html_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f1.doInitBody();
      }
      do {
        out.write("Inicio");
        int evalDoAfterBody = _jspx_th_html_005flink_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fhref.reuse(_jspx_th_html_005flink_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fhref.reuse(_jspx_th_html_005flink_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f2 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f2.setParent(null);
    _jspx_th_html_005flink_005f2.setStyleClass("G");
    _jspx_th_html_005flink_005f2.setHref("logoff.do");
    int _jspx_eval_html_005flink_005f2 = _jspx_th_html_005flink_005f2.doStartTag();
    if (_jspx_eval_html_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f2.doInitBody();
      }
      do {
        out.write("Salir");
        int evalDoAfterBody = _jspx_th_html_005flink_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fhref.reuse(_jspx_th_html_005flink_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fhref.reuse(_jspx_th_html_005flink_005f2);
    return false;
  }
}
