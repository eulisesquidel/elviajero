package org.apache.jsp.view.includes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.struts.action.ActionErrors;

public final class errors_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ferrors_005fname_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005ferrors_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005ferrors_005fname_005fnobody.release();
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
      //  html:errors
      org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_005ferrors_005f0 = (org.apache.struts.taglib.html.ErrorsTag) _005fjspx_005ftagPool_005fhtml_005ferrors_005fname_005fnobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
      _jspx_th_html_005ferrors_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005ferrors_005f0.setParent(null);
      _jspx_th_html_005ferrors_005f0.setName(ActionErrors.GLOBAL_ERROR);
      int _jspx_eval_html_005ferrors_005f0 = _jspx_th_html_005ferrors_005f0.doStartTag();
      if (_jspx_th_html_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005ferrors_005fname_005fnobody.reuse(_jspx_th_html_005ferrors_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005ferrors_005fname_005fnobody.reuse(_jspx_th_html_005ferrors_005f0);
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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