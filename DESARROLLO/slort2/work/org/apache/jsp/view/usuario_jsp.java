package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Vector;
import com.bdb.util.HttpUtils;

public final class usuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(5);
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-layout.tld");
    _jspx_dependants.add("/WEB-INF/struts-template.tld");
    _jspx_dependants.add("/WEB-INF/app.tld");
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fjavascript_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fapp_005fCheckSimpleLogon_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fapp_005fActionLabelTag_005fparameter_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005fput_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fform_005fstyleClass_005freqCode_005fonsubmit_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fselect_005fstyleClass_005fproperty_005fmode_005fkey;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fspace_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fformActions;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fmode;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fbutton_005fstyleClass_005freqCode_005fonclick_005fmode;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fonclick_005fmode;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fmessage_005fkey_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fjavascript_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fapp_005fCheckSimpleLogon_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fapp_005fActionLabelTag_005fparameter_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fform_005fstyleClass_005freqCode_005fonsubmit_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fselect_005fstyleClass_005fproperty_005fmode_005fkey = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fspace_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fformActions = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fmode = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fbutton_005fstyleClass_005freqCode_005fonclick_005fmode = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fonclick_005fmode = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fmessage_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fjavascript_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fapp_005fCheckSimpleLogon_005fnobody.release();
    _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate.release();
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.release();
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect.release();
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fapp_005fActionLabelTag_005fparameter_005fnobody.release();
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname.release();
    _005fjspx_005ftagPool_005flayout_005fform_005fstyleClass_005freqCode_005fonsubmit_005faction.release();
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005flayout_005fselect_005fstyleClass_005fproperty_005fmode_005fkey.release();
    _005fjspx_005ftagPool_005flayout_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.release();
    _005fjspx_005ftagPool_005flayout_005fspace_005fnobody.release();
    _005fjspx_005ftagPool_005flayout_005fformActions.release();
    _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fmode.release();
    _005fjspx_005ftagPool_005flayout_005fbutton_005fstyleClass_005freqCode_005fonclick_005fmode.release();
    _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fonclick_005fmode.release();
    _005fjspx_005ftagPool_005flayout_005fmessage_005fkey_005fnobody.release();
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
      out.write("<head>\r\n");
      if (_jspx_meth_html_005fjavascript_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      if (_jspx_meth_app_005fCheckSimpleLogon_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      //  template:insert
      org.apache.struts.taglib.template.InsertTag _jspx_th_template_005finsert_005f0 = (org.apache.struts.taglib.template.InsertTag) _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate.get(org.apache.struts.taglib.template.InsertTag.class);
      _jspx_th_template_005finsert_005f0.setPageContext(_jspx_page_context);
      _jspx_th_template_005finsert_005f0.setParent(null);
      _jspx_th_template_005finsert_005f0.setTemplate("templates/default.jsp");
      int _jspx_eval_template_005finsert_005f0 = _jspx_th_template_005finsert_005f0.doStartTag();
      if (_jspx_eval_template_005finsert_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("  ");
          out.write("\r\n");
          out.write("  ");
          if (_jspx_meth_template_005fput_005f0(_jspx_th_template_005finsert_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("  \r\n");
          out.write("  ");
          out.write("\r\n");
          out.write("  ");
          if (_jspx_meth_template_005fput_005f1(_jspx_th_template_005finsert_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("  \r\n");
          out.write("  ");
          out.write("\r\n");
          out.write("  ");
          //  template:put
          org.apache.struts.taglib.template.PutTag _jspx_th_template_005fput_005f2 = (org.apache.struts.taglib.template.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname.get(org.apache.struts.taglib.template.PutTag.class);
          _jspx_th_template_005fput_005f2.setPageContext(_jspx_page_context);
          _jspx_th_template_005fput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
          _jspx_th_template_005fput_005f2.setName("content");
          int _jspx_eval_template_005fput_005f2 = _jspx_th_template_005fput_005f2.doStartTag();
          if (_jspx_eval_template_005fput_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_template_005fput_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_template_005fput_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_template_005fput_005f2.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t");
              out.write('\r');
              out.write('\n');
              out.write('	');
              //  layout:form
              fr.improve.struts.taglib.layout.FormTag _jspx_th_layout_005fform_005f0 = (fr.improve.struts.taglib.layout.FormTag) _005fjspx_005ftagPool_005flayout_005fform_005fstyleClass_005freqCode_005fonsubmit_005faction.get(fr.improve.struts.taglib.layout.FormTag.class);
              _jspx_th_layout_005fform_005f0.setPageContext(_jspx_page_context);
              _jspx_th_layout_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005fput_005f2);
              _jspx_th_layout_005fform_005f0.setAction("/usuario.do");
              _jspx_th_layout_005fform_005f0.setStyleClass("Body");
              _jspx_th_layout_005fform_005f0.setReqCode("");
              _jspx_th_layout_005fform_005f0.setOnsubmit("return validateUsuarioForm(this);");
              int _jspx_eval_layout_005fform_005f0 = _jspx_th_layout_005fform_005f0.doStartTag();
              if (_jspx_eval_layout_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\r\n");
                  out.write("\r\n");
                  out.write("\t\t\t");
                  if (_jspx_meth_layout_005ftext_005f0(_jspx_th_layout_005fform_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t \r\n");
                  out.write("\t\t\t");
                  if (_jspx_meth_layout_005ftext_005f1(_jspx_th_layout_005fform_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t \r\n");
                  out.write("\t\t");
                  if (_jspx_meth_layout_005ftext_005f2(_jspx_th_layout_005fform_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\r\n");
                  out.write("\t\t\r\n");
                  out.write("\t\t");
                  if (_jspx_meth_layout_005ftext_005f3(_jspx_th_layout_005fform_005f0, _jspx_page_context))
                    return;
                  out.write("\t\r\n");
                  out.write("\t\t\r\n");
                  out.write("\t\t\t\t");
                  if (_jspx_meth_layout_005ftext_005f4(_jspx_th_layout_005fform_005f0, _jspx_page_context))
                    return;
                  out.write("\t\r\n");
                  out.write("\t\t\t\t\t\t\t\t \r\n");
                  out.write("\t\t");
                  if (_jspx_meth_layout_005ftext_005f5(_jspx_th_layout_005fform_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\r\n");
                  out.write("\t\t");
                  if (_jspx_meth_layout_005fselect_005f0(_jspx_th_layout_005fform_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t \t\t\t\t\t\t \r\n");
                  out.write("\t\t");
                  if (_jspx_meth_layout_005fspace_005f0(_jspx_th_layout_005fform_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t  \r\n");
                  out.write("\t\t  ");
                  //  layout:formActions
                  fr.improve.struts.taglib.layout.FormActions _jspx_th_layout_005fformActions_005f0 = (fr.improve.struts.taglib.layout.FormActions) _005fjspx_005ftagPool_005flayout_005fformActions.get(fr.improve.struts.taglib.layout.FormActions.class);
                  _jspx_th_layout_005fformActions_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_layout_005fformActions_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fform_005f0);
                  int _jspx_eval_layout_005fformActions_005f0 = _jspx_th_layout_005fformActions_005f0.doStartTag();
                  if (_jspx_eval_layout_005fformActions_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("\t\t\t\t");
                      //  layout:submit
                      fr.improve.struts.taglib.layout.SubmitTag _jspx_th_layout_005fsubmit_005f0 = (fr.improve.struts.taglib.layout.SubmitTag) _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fmode.get(fr.improve.struts.taglib.layout.SubmitTag.class);
                      _jspx_th_layout_005fsubmit_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_layout_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fformActions_005f0);
                      _jspx_th_layout_005fsubmit_005f0.setMode("N,D,N");
                      _jspx_th_layout_005fsubmit_005f0.setReqCode(HttpUtils.STRUTS_ACTION_SAVE);
                      _jspx_th_layout_005fsubmit_005f0.setStyleClass("button");
                      int _jspx_eval_layout_005fsubmit_005f0 = _jspx_th_layout_005fsubmit_005f0.doStartTag();
                      if (_jspx_eval_layout_005fsubmit_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_layout_005fsubmit_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_layout_005fsubmit_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_layout_005fsubmit_005f0.doInitBody();
                        }
                        do {
                          out.write("\r\n");
                          out.write("\t\t\t\t\t");
                          if (_jspx_meth_bean_005fmessage_005f1(_jspx_th_layout_005fsubmit_005f0, _jspx_page_context))
                            return;
                          int evalDoAfterBody = _jspx_th_layout_005fsubmit_005f0.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_layout_005fsubmit_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_layout_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fmode.reuse(_jspx_th_layout_005fsubmit_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fmode.reuse(_jspx_th_layout_005fsubmit_005f0);
                      out.write("\r\n");
                      out.write("\t\t\t\t");
                      //  layout:submit
                      fr.improve.struts.taglib.layout.SubmitTag _jspx_th_layout_005fsubmit_005f1 = (fr.improve.struts.taglib.layout.SubmitTag) _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fmode.get(fr.improve.struts.taglib.layout.SubmitTag.class);
                      _jspx_th_layout_005fsubmit_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_layout_005fsubmit_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fformActions_005f0);
                      _jspx_th_layout_005fsubmit_005f1.setMode("D,N,N");
                      _jspx_th_layout_005fsubmit_005f1.setReqCode(HttpUtils.STRUTS_ACTION_SAVE_NEW);
                      _jspx_th_layout_005fsubmit_005f1.setStyleClass("button");
                      int _jspx_eval_layout_005fsubmit_005f1 = _jspx_th_layout_005fsubmit_005f1.doStartTag();
                      if (_jspx_eval_layout_005fsubmit_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_layout_005fsubmit_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_layout_005fsubmit_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_layout_005fsubmit_005f1.doInitBody();
                        }
                        do {
                          out.write("\r\n");
                          out.write("\t\t\t\t\t");
                          if (_jspx_meth_bean_005fmessage_005f2(_jspx_th_layout_005fsubmit_005f1, _jspx_page_context))
                            return;
                          int evalDoAfterBody = _jspx_th_layout_005fsubmit_005f1.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_layout_005fsubmit_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_layout_005fsubmit_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fmode.reuse(_jspx_th_layout_005fsubmit_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fmode.reuse(_jspx_th_layout_005fsubmit_005f1);
                      out.write("\r\n");
                      out.write("\t\t\t\t");
                      //  layout:button
                      fr.improve.struts.taglib.layout.ButtonTag _jspx_th_layout_005fbutton_005f0 = (fr.improve.struts.taglib.layout.ButtonTag) _005fjspx_005ftagPool_005flayout_005fbutton_005fstyleClass_005freqCode_005fonclick_005fmode.get(fr.improve.struts.taglib.layout.ButtonTag.class);
                      _jspx_th_layout_005fbutton_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_layout_005fbutton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fformActions_005f0);
                      _jspx_th_layout_005fbutton_005f0.setMode("D,D,D");
                      _jspx_th_layout_005fbutton_005f0.setReqCode(HttpUtils.STRUTS_ACTION_FIND_DATA);
                      _jspx_th_layout_005fbutton_005f0.setOnclick("javascript:history.go(-1);");
                      _jspx_th_layout_005fbutton_005f0.setStyleClass("button");
                      int _jspx_eval_layout_005fbutton_005f0 = _jspx_th_layout_005fbutton_005f0.doStartTag();
                      if (_jspx_eval_layout_005fbutton_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_layout_005fbutton_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_layout_005fbutton_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_layout_005fbutton_005f0.doInitBody();
                        }
                        do {
                          out.write("\r\n");
                          out.write("\t\t\t\t\t");
                          if (_jspx_meth_bean_005fmessage_005f3(_jspx_th_layout_005fbutton_005f0, _jspx_page_context))
                            return;
                          int evalDoAfterBody = _jspx_th_layout_005fbutton_005f0.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_layout_005fbutton_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_layout_005fbutton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flayout_005fbutton_005fstyleClass_005freqCode_005fonclick_005fmode.reuse(_jspx_th_layout_005fbutton_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005flayout_005fbutton_005fstyleClass_005freqCode_005fonclick_005fmode.reuse(_jspx_th_layout_005fbutton_005f0);
                      out.write("\r\n");
                      out.write("\t\t\t\t");
                      //  layout:submit
                      fr.improve.struts.taglib.layout.SubmitTag _jspx_th_layout_005fsubmit_005f2 = (fr.improve.struts.taglib.layout.SubmitTag) _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fonclick_005fmode.get(fr.improve.struts.taglib.layout.SubmitTag.class);
                      _jspx_th_layout_005fsubmit_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_layout_005fsubmit_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fformActions_005f0);
                      _jspx_th_layout_005fsubmit_005f2.setMode("N,N,D");
                      _jspx_th_layout_005fsubmit_005f2.setReqCode(HttpUtils.STRUTS_ACTION_DELETE);
                      _jspx_th_layout_005fsubmit_005f2.setStyleClass("button");
                      _jspx_th_layout_005fsubmit_005f2.setOnclick("return confirm('Realmente desea borrar estos datos ?');");
                      int _jspx_eval_layout_005fsubmit_005f2 = _jspx_th_layout_005fsubmit_005f2.doStartTag();
                      if (_jspx_eval_layout_005fsubmit_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_layout_005fsubmit_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_layout_005fsubmit_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_layout_005fsubmit_005f2.doInitBody();
                        }
                        do {
                          out.write("\r\n");
                          out.write("\t\t\t\t\t");
                          if (_jspx_meth_bean_005fmessage_005f4(_jspx_th_layout_005fsubmit_005f2, _jspx_page_context))
                            return;
                          int evalDoAfterBody = _jspx_th_layout_005fsubmit_005f2.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_layout_005fsubmit_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_layout_005fsubmit_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fonclick_005fmode.reuse(_jspx_th_layout_005fsubmit_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fonclick_005fmode.reuse(_jspx_th_layout_005fsubmit_005f2);
                      out.write("\r\n");
                      out.write("\t\t  ");
                      int evalDoAfterBody = _jspx_th_layout_005fformActions_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_layout_005fformActions_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flayout_005fformActions.reuse(_jspx_th_layout_005fformActions_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005flayout_005fformActions.reuse(_jspx_th_layout_005fformActions_005f0);
                  out.write("\r\n");
                  out.write("\t\t  \r\n");
                  out.write("\t\t ");
                  if (_jspx_meth_layout_005fspace_005f1(_jspx_th_layout_005fform_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t ");
                  if (_jspx_meth_layout_005fmessage_005f0(_jspx_th_layout_005fform_005f0, _jspx_page_context))
                    return;
                  out.write('\r');
                  out.write('\n');
                  out.write('	');
                  int evalDoAfterBody = _jspx_th_layout_005fform_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_layout_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flayout_005fform_005fstyleClass_005freqCode_005fonsubmit_005faction.reuse(_jspx_th_layout_005fform_005f0);
                return;
              }
              _005fjspx_005ftagPool_005flayout_005fform_005fstyleClass_005freqCode_005fonsubmit_005faction.reuse(_jspx_th_layout_005fform_005f0);
              out.write("\r\n");
              out.write("\t\r\n");
              out.write("\t");
              out.write('\r');
              out.write('\n');
              out.write('	');
              int evalDoAfterBody = _jspx_th_template_005fput_005f2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_template_005fput_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_template_005fput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005ftemplate_005fput_005fname.reuse(_jspx_th_template_005fput_005f2);
            return;
          }
          _005fjspx_005ftagPool_005ftemplate_005fput_005fname.reuse(_jspx_th_template_005fput_005f2);
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_template_005finsert_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_template_005finsert_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate.reuse(_jspx_th_template_005finsert_005f0);
        return;
      }
      _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate.reuse(_jspx_th_template_005finsert_005f0);
      out.write('\r');
      out.write('\n');
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

  private boolean _jspx_meth_html_005fjavascript_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:javascript
    org.apache.struts.taglib.html.JavascriptValidatorTag _jspx_th_html_005fjavascript_005f0 = (org.apache.struts.taglib.html.JavascriptValidatorTag) _005fjspx_005ftagPool_005fhtml_005fjavascript_005fformName_005fnobody.get(org.apache.struts.taglib.html.JavascriptValidatorTag.class);
    _jspx_th_html_005fjavascript_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fjavascript_005f0.setParent(null);
    _jspx_th_html_005fjavascript_005f0.setFormName("UsuarioForm");
    int _jspx_eval_html_005fjavascript_005f0 = _jspx_th_html_005fjavascript_005f0.doStartTag();
    if (_jspx_th_html_005fjavascript_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fjavascript_005fformName_005fnobody.reuse(_jspx_th_html_005fjavascript_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fjavascript_005fformName_005fnobody.reuse(_jspx_th_html_005fjavascript_005f0);
    return false;
  }

  private boolean _jspx_meth_app_005fCheckSimpleLogon_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  app:CheckSimpleLogon
    com.slort.tag.CheckSimpleLogon _jspx_th_app_005fCheckSimpleLogon_005f0 = (com.slort.tag.CheckSimpleLogon) _005fjspx_005ftagPool_005fapp_005fCheckSimpleLogon_005fnobody.get(com.slort.tag.CheckSimpleLogon.class);
    _jspx_th_app_005fCheckSimpleLogon_005f0.setPageContext(_jspx_page_context);
    _jspx_th_app_005fCheckSimpleLogon_005f0.setParent(null);
    int _jspx_eval_app_005fCheckSimpleLogon_005f0 = _jspx_th_app_005fCheckSimpleLogon_005f0.doStartTag();
    if (_jspx_th_app_005fCheckSimpleLogon_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fapp_005fCheckSimpleLogon_005fnobody.reuse(_jspx_th_app_005fCheckSimpleLogon_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fapp_005fCheckSimpleLogon_005fnobody.reuse(_jspx_th_app_005fCheckSimpleLogon_005f0);
    return false;
  }

  private boolean _jspx_meth_template_005fput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005finsert_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:put
    org.apache.struts.taglib.template.PutTag _jspx_th_template_005fput_005f0 = (org.apache.struts.taglib.template.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.get(org.apache.struts.taglib.template.PutTag.class);
    _jspx_th_template_005fput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
    _jspx_th_template_005fput_005f0.setName("titlePage");
    _jspx_th_template_005fput_005f0.setContent(" ");
    _jspx_th_template_005fput_005f0.setDirect("true");
    int _jspx_eval_template_005fput_005f0 = _jspx_th_template_005fput_005f0.doStartTag();
    if (_jspx_th_template_005fput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.reuse(_jspx_th_template_005fput_005f0);
    return false;
  }

  private boolean _jspx_meth_template_005fput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005finsert_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  template:put
    org.apache.struts.taglib.template.PutTag _jspx_th_template_005fput_005f1 = (org.apache.struts.taglib.template.PutTag) _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect.get(org.apache.struts.taglib.template.PutTag.class);
    _jspx_th_template_005fput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_template_005fput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005finsert_005f0);
    _jspx_th_template_005fput_005f1.setName("title");
    _jspx_th_template_005fput_005f1.setDirect("true");
    int _jspx_eval_template_005fput_005f1 = _jspx_th_template_005fput_005f1.doStartTag();
    if (_jspx_eval_template_005fput_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_template_005fput_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_template_005fput_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_template_005fput_005f1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("  \t");
        if (_jspx_meth_bean_005fmessage_005f0(_jspx_th_template_005fput_005f1, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("  \t");
        if (_jspx_meth_app_005fActionLabelTag_005f0(_jspx_th_template_005fput_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("  ");
        int evalDoAfterBody = _jspx_th_template_005fput_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_template_005fput_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_template_005fput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect.reuse(_jspx_th_template_005fput_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect.reuse(_jspx_th_template_005fput_005f1);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005fput_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f0 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005fput_005f1);
    _jspx_th_bean_005fmessage_005f0.setKey("UsuarioForm.window.titulo");
    int _jspx_eval_bean_005fmessage_005f0 = _jspx_th_bean_005fmessage_005f0.doStartTag();
    if (_jspx_th_bean_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_app_005fActionLabelTag_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_template_005fput_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  app:ActionLabelTag
    com.slort.tag.ActionLabelTag _jspx_th_app_005fActionLabelTag_005f0 = (com.slort.tag.ActionLabelTag) _005fjspx_005ftagPool_005fapp_005fActionLabelTag_005fparameter_005fnobody.get(com.slort.tag.ActionLabelTag.class);
    _jspx_th_app_005fActionLabelTag_005f0.setPageContext(_jspx_page_context);
    _jspx_th_app_005fActionLabelTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005fput_005f1);
    _jspx_th_app_005fActionLabelTag_005f0.setParameter("reqCode");
    int _jspx_eval_app_005fActionLabelTag_005f0 = _jspx_th_app_005fActionLabelTag_005f0.doStartTag();
    if (_jspx_th_app_005fActionLabelTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fapp_005fActionLabelTag_005fparameter_005fnobody.reuse(_jspx_th_app_005fActionLabelTag_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fapp_005fActionLabelTag_005fparameter_005fnobody.reuse(_jspx_th_app_005fActionLabelTag_005f0);
    return false;
  }

  private boolean _jspx_meth_layout_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:text
    fr.improve.struts.taglib.layout.field.TextFieldTag _jspx_th_layout_005ftext_005f0 = (fr.improve.struts.taglib.layout.field.TextFieldTag) _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.TextFieldTag.class);
    _jspx_th_layout_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_layout_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fform_005f0);
    _jspx_th_layout_005ftext_005f0.setKey("UsuarioForm.idUsuario");
    _jspx_th_layout_005ftext_005f0.setProperty("idUsuario");
    _jspx_th_layout_005ftext_005f0.setStyleClass("LABEL");
    _jspx_th_layout_005ftext_005f0.setMode("H,I,I");
    _jspx_th_layout_005ftext_005f0.setSize("6");
    _jspx_th_layout_005ftext_005f0.setMaxlength("6");
    int _jspx_eval_layout_005ftext_005f0 = _jspx_th_layout_005ftext_005f0.doStartTag();
    if (_jspx_th_layout_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_layout_005ftext_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:text
    fr.improve.struts.taglib.layout.field.TextFieldTag _jspx_th_layout_005ftext_005f1 = (fr.improve.struts.taglib.layout.field.TextFieldTag) _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.TextFieldTag.class);
    _jspx_th_layout_005ftext_005f1.setPageContext(_jspx_page_context);
    _jspx_th_layout_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fform_005f0);
    _jspx_th_layout_005ftext_005f1.setKey("UsuarioForm.usuario");
    _jspx_th_layout_005ftext_005f1.setProperty("usuario");
    _jspx_th_layout_005ftext_005f1.setStyleClass("LABEL");
    _jspx_th_layout_005ftext_005f1.setMode("E,E,I");
    _jspx_th_layout_005ftext_005f1.setSize("30");
    _jspx_th_layout_005ftext_005f1.setMaxlength("30");
    int _jspx_eval_layout_005ftext_005f1 = _jspx_th_layout_005ftext_005f1.doStartTag();
    if (_jspx_th_layout_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f1);
    return false;
  }

  private boolean _jspx_meth_layout_005ftext_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:text
    fr.improve.struts.taglib.layout.field.TextFieldTag _jspx_th_layout_005ftext_005f2 = (fr.improve.struts.taglib.layout.field.TextFieldTag) _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.TextFieldTag.class);
    _jspx_th_layout_005ftext_005f2.setPageContext(_jspx_page_context);
    _jspx_th_layout_005ftext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fform_005f0);
    _jspx_th_layout_005ftext_005f2.setKey("UsuarioForm.nombre");
    _jspx_th_layout_005ftext_005f2.setProperty("nombre");
    _jspx_th_layout_005ftext_005f2.setStyleClass("LABEL");
    _jspx_th_layout_005ftext_005f2.setMode("E,E,I");
    _jspx_th_layout_005ftext_005f2.setSize("30");
    _jspx_th_layout_005ftext_005f2.setMaxlength("30");
    int _jspx_eval_layout_005ftext_005f2 = _jspx_th_layout_005ftext_005f2.doStartTag();
    if (_jspx_th_layout_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f2);
    return false;
  }

  private boolean _jspx_meth_layout_005ftext_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:text
    fr.improve.struts.taglib.layout.field.TextFieldTag _jspx_th_layout_005ftext_005f3 = (fr.improve.struts.taglib.layout.field.TextFieldTag) _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.TextFieldTag.class);
    _jspx_th_layout_005ftext_005f3.setPageContext(_jspx_page_context);
    _jspx_th_layout_005ftext_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fform_005f0);
    _jspx_th_layout_005ftext_005f3.setKey("UsuarioForm.apellido");
    _jspx_th_layout_005ftext_005f3.setProperty("apellido");
    _jspx_th_layout_005ftext_005f3.setStyleClass("LABEL");
    _jspx_th_layout_005ftext_005f3.setMode("E,E,I");
    _jspx_th_layout_005ftext_005f3.setSize("30");
    _jspx_th_layout_005ftext_005f3.setMaxlength("30");
    int _jspx_eval_layout_005ftext_005f3 = _jspx_th_layout_005ftext_005f3.doStartTag();
    if (_jspx_th_layout_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f3);
    return false;
  }

  private boolean _jspx_meth_layout_005ftext_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:text
    fr.improve.struts.taglib.layout.field.TextFieldTag _jspx_th_layout_005ftext_005f4 = (fr.improve.struts.taglib.layout.field.TextFieldTag) _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.TextFieldTag.class);
    _jspx_th_layout_005ftext_005f4.setPageContext(_jspx_page_context);
    _jspx_th_layout_005ftext_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fform_005f0);
    _jspx_th_layout_005ftext_005f4.setKey("UsuarioForm.email");
    _jspx_th_layout_005ftext_005f4.setProperty("email");
    _jspx_th_layout_005ftext_005f4.setStyleClass("LABEL");
    _jspx_th_layout_005ftext_005f4.setMode("E,E,I");
    _jspx_th_layout_005ftext_005f4.setSize("30");
    _jspx_th_layout_005ftext_005f4.setMaxlength("30");
    int _jspx_eval_layout_005ftext_005f4 = _jspx_th_layout_005ftext_005f4.doStartTag();
    if (_jspx_th_layout_005ftext_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f4);
    return false;
  }

  private boolean _jspx_meth_layout_005ftext_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:text
    fr.improve.struts.taglib.layout.field.TextFieldTag _jspx_th_layout_005ftext_005f5 = (fr.improve.struts.taglib.layout.field.TextFieldTag) _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.TextFieldTag.class);
    _jspx_th_layout_005ftext_005f5.setPageContext(_jspx_page_context);
    _jspx_th_layout_005ftext_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fform_005f0);
    _jspx_th_layout_005ftext_005f5.setKey("UsuarioForm.telefono");
    _jspx_th_layout_005ftext_005f5.setProperty("telefono");
    _jspx_th_layout_005ftext_005f5.setStyleClass("LABEL");
    _jspx_th_layout_005ftext_005f5.setMode("E,E,I");
    _jspx_th_layout_005ftext_005f5.setSize("30");
    _jspx_th_layout_005ftext_005f5.setMaxlength("30");
    int _jspx_eval_layout_005ftext_005f5 = _jspx_th_layout_005ftext_005f5.doStartTag();
    if (_jspx_th_layout_005ftext_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f5);
    return false;
  }

  private boolean _jspx_meth_layout_005fselect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:select
    fr.improve.struts.taglib.layout.field.SelectTag _jspx_th_layout_005fselect_005f0 = (fr.improve.struts.taglib.layout.field.SelectTag) _005fjspx_005ftagPool_005flayout_005fselect_005fstyleClass_005fproperty_005fmode_005fkey.get(fr.improve.struts.taglib.layout.field.SelectTag.class);
    _jspx_th_layout_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fform_005f0);
    _jspx_th_layout_005fselect_005f0.setKey("UsuarioForm.perfil");
    _jspx_th_layout_005fselect_005f0.setProperty("idperfil");
    _jspx_th_layout_005fselect_005f0.setStyleClass("LABEL");
    _jspx_th_layout_005fselect_005f0.setMode("E,E,I");
    int _jspx_eval_layout_005fselect_005f0 = _jspx_th_layout_005fselect_005f0.doStartTag();
    if (_jspx_eval_layout_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_layout_005foptions_005f0(_jspx_th_layout_005fselect_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_layout_005fselect_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_layout_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fselect_005fstyleClass_005fproperty_005fmode_005fkey.reuse(_jspx_th_layout_005fselect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fselect_005fstyleClass_005fproperty_005fmode_005fkey.reuse(_jspx_th_layout_005fselect_005f0);
    return false;
  }

  private boolean _jspx_meth_layout_005foptions_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:options
    fr.improve.struts.taglib.layout.field.OptionsTag _jspx_th_layout_005foptions_005f0 = (fr.improve.struts.taglib.layout.field.OptionsTag) _005fjspx_005ftagPool_005flayout_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(fr.improve.struts.taglib.layout.field.OptionsTag.class);
    _jspx_th_layout_005foptions_005f0.setPageContext(_jspx_page_context);
    _jspx_th_layout_005foptions_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fselect_005f0);
    _jspx_th_layout_005foptions_005f0.setCollection("grupoCollection");
    _jspx_th_layout_005foptions_005f0.setProperty("idPerfil");
    _jspx_th_layout_005foptions_005f0.setLabelProperty("descripcionLarga");
    int _jspx_eval_layout_005foptions_005f0 = _jspx_th_layout_005foptions_005f0.doStartTag();
    if (_jspx_th_layout_005foptions_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_layout_005foptions_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_layout_005foptions_005f0);
    return false;
  }

  private boolean _jspx_meth_layout_005fspace_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:space
    fr.improve.struts.taglib.layout.EmptyTag _jspx_th_layout_005fspace_005f0 = (fr.improve.struts.taglib.layout.EmptyTag) _005fjspx_005ftagPool_005flayout_005fspace_005fnobody.get(fr.improve.struts.taglib.layout.EmptyTag.class);
    _jspx_th_layout_005fspace_005f0.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fspace_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fform_005f0);
    int _jspx_eval_layout_005fspace_005f0 = _jspx_th_layout_005fspace_005f0.doStartTag();
    if (_jspx_th_layout_005fspace_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fspace_005fnobody.reuse(_jspx_th_layout_005fspace_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fspace_005fnobody.reuse(_jspx_th_layout_005fspace_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fsubmit_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f1 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fsubmit_005f0);
    _jspx_th_bean_005fmessage_005f1.setKey("button.save");
    int _jspx_eval_bean_005fmessage_005f1 = _jspx_th_bean_005fmessage_005f1.doStartTag();
    if (_jspx_th_bean_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f1);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fsubmit_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f2 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f2.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fsubmit_005f1);
    _jspx_th_bean_005fmessage_005f2.setKey("button.insert");
    int _jspx_eval_bean_005fmessage_005f2 = _jspx_th_bean_005fmessage_005f2.doStartTag();
    if (_jspx_th_bean_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fbutton_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f3 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f3.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fbutton_005f0);
    _jspx_th_bean_005fmessage_005f3.setKey("button.back");
    int _jspx_eval_bean_005fmessage_005f3 = _jspx_th_bean_005fmessage_005f3.doStartTag();
    if (_jspx_th_bean_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f3);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fsubmit_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f4 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f4.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fsubmit_005f2);
    _jspx_th_bean_005fmessage_005f4.setKey("button.delete");
    int _jspx_eval_bean_005fmessage_005f4 = _jspx_th_bean_005fmessage_005f4.doStartTag();
    if (_jspx_th_bean_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f4);
    return false;
  }

  private boolean _jspx_meth_layout_005fspace_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:space
    fr.improve.struts.taglib.layout.EmptyTag _jspx_th_layout_005fspace_005f1 = (fr.improve.struts.taglib.layout.EmptyTag) _005fjspx_005ftagPool_005flayout_005fspace_005fnobody.get(fr.improve.struts.taglib.layout.EmptyTag.class);
    _jspx_th_layout_005fspace_005f1.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fspace_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fform_005f0);
    int _jspx_eval_layout_005fspace_005f1 = _jspx_th_layout_005fspace_005f1.doStartTag();
    if (_jspx_th_layout_005fspace_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fspace_005fnobody.reuse(_jspx_th_layout_005fspace_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fspace_005fnobody.reuse(_jspx_th_layout_005fspace_005f1);
    return false;
  }

  private boolean _jspx_meth_layout_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:message
    fr.improve.struts.taglib.layout.MessageTag _jspx_th_layout_005fmessage_005f0 = (fr.improve.struts.taglib.layout.MessageTag) _005fjspx_005ftagPool_005flayout_005fmessage_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.MessageTag.class);
    _jspx_th_layout_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fform_005f0);
    _jspx_th_layout_005fmessage_005f0.setKey("slort.mensajes.campos.obligatorios");
    int _jspx_eval_layout_005fmessage_005f0 = _jspx_th_layout_005fmessage_005f0.doStartTag();
    if (_jspx_th_layout_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fmessage_005fkey_005fnobody.reuse(_jspx_th_layout_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fmessage_005fkey_005fnobody.reuse(_jspx_th_layout_005fmessage_005f0);
    return false;
  }
}
