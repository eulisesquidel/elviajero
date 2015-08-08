package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bdb.util.HttpUtils;

public final class reserva_005fbq_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(6);
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-layout.tld");
    _jspx_dependants.add("/WEB-INF/struts-template.tld");
    _jspx_dependants.add("/WEB-INF/app.tld");
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fapp_005fCheckSimpleLogon_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftemplate_005fput_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fform_005fstyleClass_005freqCode_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fpanel_005falign;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fselect_005fproperty_005fkey;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005foptions_005fproperty_005fcollection_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fselect_005ftabindex_005fstyleClass_005fproperty_005fmode_005fkey;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fspace_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fformActions;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fmode;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005freset_005fstyleClass_005freqCode_005fmode;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fmessage_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fcollection_005fwidth_005fstyleClass_005fname_005fid_005falign;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftype_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005flink_005fparamProperty_005fparamName_005fparamId_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fbutton_005fstyleClass_005freqCode_005fonclick_005fmode;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fapp_005fCheckSimpleLogon_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fform_005fstyleClass_005freqCode_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fpanel_005falign = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fselect_005fproperty_005fkey = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005foptions_005fproperty_005fcollection_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fselect_005ftabindex_005fstyleClass_005fproperty_005fmode_005fkey = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fspace_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fformActions = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fmode = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005freset_005fstyleClass_005freqCode_005fmode = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fmessage_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fcollection_005fwidth_005fstyleClass_005fname_005fid_005falign = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftype_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005flink_005fparamProperty_005fparamName_005fparamId_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fbutton_005fstyleClass_005freqCode_005fonclick_005fmode = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fapp_005fCheckSimpleLogon_005fnobody.release();
    _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate.release();
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.release();
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect.release();
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname.release();
    _005fjspx_005ftagPool_005flayout_005fform_005fstyleClass_005freqCode_005faction.release();
    _005fjspx_005ftagPool_005flayout_005fpanel_005falign.release();
    _005fjspx_005ftagPool_005flayout_005fselect_005fproperty_005fkey.release();
    _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005flayout_005foptions_005fproperty_005fcollection_005fnobody.release();
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005flayout_005fselect_005ftabindex_005fstyleClass_005fproperty_005fmode_005fkey.release();
    _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005flayout_005fspace_005fnobody.release();
    _005fjspx_005ftagPool_005flayout_005fformActions.release();
    _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fmode.release();
    _005fjspx_005ftagPool_005flayout_005freset_005fstyleClass_005freqCode_005fmode.release();
    _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fname.release();
    _005fjspx_005ftagPool_005flayout_005fmessage_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005flayout_005fcollection_005fwidth_005fstyleClass_005fname_005fid_005falign.release();
    _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftype_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005flayout_005flink_005fparamProperty_005fparamName_005fparamId_005fhref.release();
    _005fjspx_005ftagPool_005flayout_005fbutton_005fstyleClass_005freqCode_005fonclick_005fmode.release();
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
          out.write("\t");
          out.write('\r');
          out.write('\n');
          out.write('	');
          if (_jspx_meth_template_005fput_005f0(_jspx_th_template_005finsert_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t");
          out.write('\r');
          out.write('\n');
          out.write('	');
          if (_jspx_meth_template_005fput_005f1(_jspx_th_template_005finsert_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t  \r\n");
          out.write("\t");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t");
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
              out.write("\t\t");
              out.write("\r\n");
              out.write("\t\t\t");
              //  layout:form
              fr.improve.struts.taglib.layout.FormTag _jspx_th_layout_005fform_005f0 = (fr.improve.struts.taglib.layout.FormTag) _005fjspx_005ftagPool_005flayout_005fform_005fstyleClass_005freqCode_005faction.get(fr.improve.struts.taglib.layout.FormTag.class);
              _jspx_th_layout_005fform_005f0.setPageContext(_jspx_page_context);
              _jspx_th_layout_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005fput_005f2);
              _jspx_th_layout_005fform_005f0.setAction("/reserva.do");
              _jspx_th_layout_005fform_005f0.setStyleClass("Body");
              _jspx_th_layout_005fform_005f0.setReqCode("");
              int _jspx_eval_layout_005fform_005f0 = _jspx_th_layout_005fform_005f0.doStartTag();
              if (_jspx_eval_layout_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\t\t\t\t\t\t\t \t\r\n");
                  out.write("\r\n");
                  out.write("\t\t\t");
                  if (_jspx_meth_layout_005fpanel_005f0(_jspx_th_layout_005fform_005f0, _jspx_page_context))
                    return;
                  out.write(" \r\n");
                  out.write("\r\n");
                  out.write("\t\t  ");
                  if (_jspx_meth_layout_005fspace_005f0(_jspx_th_layout_005fform_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t  \r\n");
                  out.write("\t\t  \t\r\n");
                  out.write("\t\t  ");
                  //  layout:formActions
                  fr.improve.struts.taglib.layout.FormActions _jspx_th_layout_005fformActions_005f0 = (fr.improve.struts.taglib.layout.FormActions) _005fjspx_005ftagPool_005flayout_005fformActions.get(fr.improve.struts.taglib.layout.FormActions.class);
                  _jspx_th_layout_005fformActions_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_layout_005fformActions_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fform_005f0);
                  int _jspx_eval_layout_005fformActions_005f0 = _jspx_th_layout_005fformActions_005f0.doStartTag();
                  if (_jspx_eval_layout_005fformActions_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("\t\t  \t\t");
                      //  layout:submit
                      fr.improve.struts.taglib.layout.SubmitTag _jspx_th_layout_005fsubmit_005f0 = (fr.improve.struts.taglib.layout.SubmitTag) _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fmode.get(fr.improve.struts.taglib.layout.SubmitTag.class);
                      _jspx_th_layout_005fsubmit_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_layout_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fformActions_005f0);
                      _jspx_th_layout_005fsubmit_005f0.setMode("N,D,N");
                      _jspx_th_layout_005fsubmit_005f0.setReqCode(HttpUtils.STRUTS_ACTION_FIND_DATA);
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
                          out.write("\r\n");
                          out.write("\t\t\t\t");
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
                      if (_jspx_meth_layout_005freset_005f0(_jspx_th_layout_005fformActions_005f0, _jspx_page_context))
                        return;
                      out.write("\t\t\r\n");
                      out.write("\t\t\t\t");
                      //  layout:submit
                      fr.improve.struts.taglib.layout.SubmitTag _jspx_th_layout_005fsubmit_005f1 = (fr.improve.struts.taglib.layout.SubmitTag) _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fmode.get(fr.improve.struts.taglib.layout.SubmitTag.class);
                      _jspx_th_layout_005fsubmit_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_layout_005fsubmit_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fformActions_005f0);
                      _jspx_th_layout_005fsubmit_005f1.setMode("D,D,N");
                      _jspx_th_layout_005fsubmit_005f1.setReqCode(HttpUtils.STRUTS_ACTION_CREATE);
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
                          if (_jspx_meth_bean_005fmessage_005f3(_jspx_th_layout_005fsubmit_005f1, _jspx_page_context))
                            return;
                          out.write("\r\n");
                          out.write("\t\t\t\t");
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
                  out.write("\t\t\t\t\t\t\t\t\t \r\n");
                  out.write("\t\t  \t  \r\n");
                  out.write("\t\t\t\r\n");
                  out.write("\t\t\t");
                  out.write("\t\r\n");
                  out.write("\t\t\t");
                  if (_jspx_meth_logic_005fpresent_005f0(_jspx_th_layout_005fform_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t");
                  out.write("\r\n");
                  out.write("\r\n");
                  out.write("\t \r\n");
                  out.write("\t\t ");
                  if (_jspx_meth_layout_005fspace_005f2(_jspx_th_layout_005fform_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\r\n");
                  out.write("\t\t ");
                  //  layout:formActions
                  fr.improve.struts.taglib.layout.FormActions _jspx_th_layout_005fformActions_005f1 = (fr.improve.struts.taglib.layout.FormActions) _005fjspx_005ftagPool_005flayout_005fformActions.get(fr.improve.struts.taglib.layout.FormActions.class);
                  _jspx_th_layout_005fformActions_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_layout_005fformActions_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fform_005f0);
                  int _jspx_eval_layout_005fformActions_005f1 = _jspx_th_layout_005fformActions_005f1.doStartTag();
                  if (_jspx_eval_layout_005fformActions_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("\t\t\r\n");
                      out.write("\t\r\n");
                      out.write("\t\t\t\r\n");
                      out.write("\t\t\t");
                      //  layout:button
                      fr.improve.struts.taglib.layout.ButtonTag _jspx_th_layout_005fbutton_005f0 = (fr.improve.struts.taglib.layout.ButtonTag) _005fjspx_005ftagPool_005flayout_005fbutton_005fstyleClass_005freqCode_005fonclick_005fmode.get(fr.improve.struts.taglib.layout.ButtonTag.class);
                      _jspx_th_layout_005fbutton_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_layout_005fbutton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fformActions_005f1);
                      _jspx_th_layout_005fbutton_005f0.setMode("D,D,N");
                      _jspx_th_layout_005fbutton_005f0.setReqCode(HttpUtils.STRUTS_ACTION_GOOGLEMAP_VIEW);
                      _jspx_th_layout_005fbutton_005f0.setStyleClass("button");
                      _jspx_th_layout_005fbutton_005f0.setOnclick("javascript:window.open('googlemap_view.html','Ver Mapa de Flota','width=1000,height=550');");
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
                          if (_jspx_meth_bean_005fmessage_005f4(_jspx_th_layout_005fbutton_005f0, _jspx_page_context))
                            return;
                          out.write("\r\n");
                          out.write("\t\t\t");
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
                      out.write("\r\n");
                      out.write("\t\t\t\r\n");
                      out.write("\t\t  ");
                      int evalDoAfterBody = _jspx_th_layout_005fformActions_005f1.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_layout_005fformActions_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flayout_005fformActions.reuse(_jspx_th_layout_005fformActions_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005flayout_005fformActions.reuse(_jspx_th_layout_005fformActions_005f1);
                  out.write("\r\n");
                  out.write("\t\t  \r\n");
                  out.write("\t\t");
                  int evalDoAfterBody = _jspx_th_layout_005fform_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_layout_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flayout_005fform_005fstyleClass_005freqCode_005faction.reuse(_jspx_th_layout_005fform_005f0);
                return;
              }
              _005fjspx_005ftagPool_005flayout_005fform_005fstyleClass_005freqCode_005faction.reuse(_jspx_th_layout_005fform_005f0);
              out.write('\r');
              out.write('\n');
              out.write('	');
              out.write("\r\n");
              out.write("\t\r\n");
              out.write("\t");
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
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_bean_005fmessage_005f0(_jspx_th_template_005fput_005f1, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("\t");
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
    _jspx_th_bean_005fmessage_005f0.setKey("ReservaForm.window.titulo");
    int _jspx_eval_bean_005fmessage_005f0 = _jspx_th_bean_005fmessage_005f0.doStartTag();
    if (_jspx_th_bean_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_layout_005fpanel_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:panel
    fr.improve.struts.taglib.layout.PanelTag _jspx_th_layout_005fpanel_005f0 = (fr.improve.struts.taglib.layout.PanelTag) _005fjspx_005ftagPool_005flayout_005fpanel_005falign.get(fr.improve.struts.taglib.layout.PanelTag.class);
    _jspx_th_layout_005fpanel_005f0.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fpanel_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fform_005f0);
    _jspx_th_layout_005fpanel_005f0.setAlign("center");
    int _jspx_eval_layout_005fpanel_005f0 = _jspx_th_layout_005fpanel_005f0.doStartTag();
    if (_jspx_eval_layout_005fpanel_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_layout_005fselect_005f0(_jspx_th_layout_005fpanel_005f0, _jspx_page_context))
          return true;
        out.write("\t\r\n");
        out.write("\t\t\t\t\t \r\n");
        out.write("\t\t\t");
        if (_jspx_meth_layout_005ftext_005f0(_jspx_th_layout_005fpanel_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_layout_005fselect_005f1(_jspx_th_layout_005fpanel_005f0, _jspx_page_context))
          return true;
        out.write("\t\r\n");
        out.write("\t\r\n");
        out.write("\t\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_layout_005ftext_005f1(_jspx_th_layout_005fpanel_005f0, _jspx_page_context))
          return true;
        out.write("\t\r\n");
        out.write("\t\t\t\t\t\t\t\t\t \r\n");
        out.write("\t\t\t");
        if (_jspx_meth_layout_005ftext_005f2(_jspx_th_layout_005fpanel_005f0, _jspx_page_context))
          return true;
        out.write("\t\r\n");
        out.write("\t\t\t\t\t\t\t\t\t \r\n");
        out.write("\t\t  ");
        int evalDoAfterBody = _jspx_th_layout_005fpanel_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_layout_005fpanel_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fpanel_005falign.reuse(_jspx_th_layout_005fpanel_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fpanel_005falign.reuse(_jspx_th_layout_005fpanel_005f0);
    return false;
  }

  private boolean _jspx_meth_layout_005fselect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fpanel_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:select
    fr.improve.struts.taglib.layout.field.SelectTag _jspx_th_layout_005fselect_005f0 = (fr.improve.struts.taglib.layout.field.SelectTag) _005fjspx_005ftagPool_005flayout_005fselect_005fproperty_005fkey.get(fr.improve.struts.taglib.layout.field.SelectTag.class);
    _jspx_th_layout_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fpanel_005f0);
    _jspx_th_layout_005fselect_005f0.setKey("ReservaForm.usuario");
    _jspx_th_layout_005fselect_005f0.setProperty("usuario.usuario");
    int _jspx_eval_layout_005fselect_005f0 = _jspx_th_layout_005fselect_005f0.doStartTag();
    if (_jspx_eval_layout_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_layout_005foption_005f0(_jspx_th_layout_005fselect_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_layout_005foptions_005f0(_jspx_th_layout_005fselect_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_layout_005fselect_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_layout_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fselect_005fproperty_005fkey.reuse(_jspx_th_layout_005fselect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fselect_005fproperty_005fkey.reuse(_jspx_th_layout_005fselect_005f0);
    return false;
  }

  private boolean _jspx_meth_layout_005foption_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:option
    fr.improve.struts.taglib.layout.field.OptionTag _jspx_th_layout_005foption_005f0 = (fr.improve.struts.taglib.layout.field.OptionTag) _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fnobody.get(fr.improve.struts.taglib.layout.field.OptionTag.class);
    _jspx_th_layout_005foption_005f0.setPageContext(_jspx_page_context);
    _jspx_th_layout_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fselect_005f0);
    _jspx_th_layout_005foption_005f0.setValue("");
    int _jspx_eval_layout_005foption_005f0 = _jspx_th_layout_005foption_005f0.doStartTag();
    if (_jspx_th_layout_005foption_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fnobody.reuse(_jspx_th_layout_005foption_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fnobody.reuse(_jspx_th_layout_005foption_005f0);
    return false;
  }

  private boolean _jspx_meth_layout_005foptions_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:options
    fr.improve.struts.taglib.layout.field.OptionsTag _jspx_th_layout_005foptions_005f0 = (fr.improve.struts.taglib.layout.field.OptionsTag) _005fjspx_005ftagPool_005flayout_005foptions_005fproperty_005fcollection_005fnobody.get(fr.improve.struts.taglib.layout.field.OptionsTag.class);
    _jspx_th_layout_005foptions_005f0.setPageContext(_jspx_page_context);
    _jspx_th_layout_005foptions_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fselect_005f0);
    _jspx_th_layout_005foptions_005f0.setCollection("usuarios");
    _jspx_th_layout_005foptions_005f0.setProperty("usuario");
    int _jspx_eval_layout_005foptions_005f0 = _jspx_th_layout_005foptions_005f0.doStartTag();
    if (_jspx_th_layout_005foptions_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005foptions_005fproperty_005fcollection_005fnobody.reuse(_jspx_th_layout_005foptions_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005foptions_005fproperty_005fcollection_005fnobody.reuse(_jspx_th_layout_005foptions_005f0);
    return false;
  }

  private boolean _jspx_meth_layout_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fpanel_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:text
    fr.improve.struts.taglib.layout.field.TextFieldTag _jspx_th_layout_005ftext_005f0 = (fr.improve.struts.taglib.layout.field.TextFieldTag) _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.TextFieldTag.class);
    _jspx_th_layout_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_layout_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fpanel_005f0);
    _jspx_th_layout_005ftext_005f0.setKey("ReservaForm.grilla_bq.cliente");
    _jspx_th_layout_005ftext_005f0.setProperty("cliente.numDoc");
    _jspx_th_layout_005ftext_005f0.setStyleClass("LABEL");
    _jspx_th_layout_005ftext_005f0.setMode("E,E,I");
    _jspx_th_layout_005ftext_005f0.setSize("30");
    _jspx_th_layout_005ftext_005f0.setMaxlength("30");
    int _jspx_eval_layout_005ftext_005f0 = _jspx_th_layout_005ftext_005f0.doStartTag();
    if (_jspx_th_layout_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.reuse(_jspx_th_layout_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_layout_005fselect_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fpanel_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:select
    fr.improve.struts.taglib.layout.field.SelectTag _jspx_th_layout_005fselect_005f1 = (fr.improve.struts.taglib.layout.field.SelectTag) _005fjspx_005ftagPool_005flayout_005fselect_005ftabindex_005fstyleClass_005fproperty_005fmode_005fkey.get(fr.improve.struts.taglib.layout.field.SelectTag.class);
    _jspx_th_layout_005fselect_005f1.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fpanel_005f0);
    _jspx_th_layout_005fselect_005f1.setKey("ReservaForm.grilla_bq.estado");
    _jspx_th_layout_005fselect_005f1.setProperty("estado");
    _jspx_th_layout_005fselect_005f1.setStyleClass("LABEL");
    _jspx_th_layout_005fselect_005f1.setTabindex("0");
    _jspx_th_layout_005fselect_005f1.setMode("E,E,I");
    int _jspx_eval_layout_005fselect_005f1 = _jspx_th_layout_005fselect_005f1.doStartTag();
    if (_jspx_eval_layout_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_layout_005foption_005f1(_jspx_th_layout_005fselect_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_layout_005foption_005f2(_jspx_th_layout_005fselect_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_layout_005foption_005f3(_jspx_th_layout_005fselect_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_layout_005foption_005f4(_jspx_th_layout_005fselect_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_layout_005foption_005f5(_jspx_th_layout_005fselect_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_layout_005fselect_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_layout_005fselect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fselect_005ftabindex_005fstyleClass_005fproperty_005fmode_005fkey.reuse(_jspx_th_layout_005fselect_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fselect_005ftabindex_005fstyleClass_005fproperty_005fmode_005fkey.reuse(_jspx_th_layout_005fselect_005f1);
    return false;
  }

  private boolean _jspx_meth_layout_005foption_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fselect_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:option
    fr.improve.struts.taglib.layout.field.OptionTag _jspx_th_layout_005foption_005f1 = (fr.improve.struts.taglib.layout.field.OptionTag) _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.OptionTag.class);
    _jspx_th_layout_005foption_005f1.setPageContext(_jspx_page_context);
    _jspx_th_layout_005foption_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fselect_005f1);
    _jspx_th_layout_005foption_005f1.setValue("En proceso/A realizar");
    _jspx_th_layout_005foption_005f1.setKey("En proceso/A realizar");
    int _jspx_eval_layout_005foption_005f1 = _jspx_th_layout_005foption_005f1.doStartTag();
    if (_jspx_th_layout_005foption_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.reuse(_jspx_th_layout_005foption_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.reuse(_jspx_th_layout_005foption_005f1);
    return false;
  }

  private boolean _jspx_meth_layout_005foption_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fselect_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:option
    fr.improve.struts.taglib.layout.field.OptionTag _jspx_th_layout_005foption_005f2 = (fr.improve.struts.taglib.layout.field.OptionTag) _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.OptionTag.class);
    _jspx_th_layout_005foption_005f2.setPageContext(_jspx_page_context);
    _jspx_th_layout_005foption_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fselect_005f1);
    _jspx_th_layout_005foption_005f2.setValue("En proceso");
    _jspx_th_layout_005foption_005f2.setKey("En proceso");
    int _jspx_eval_layout_005foption_005f2 = _jspx_th_layout_005foption_005f2.doStartTag();
    if (_jspx_th_layout_005foption_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.reuse(_jspx_th_layout_005foption_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.reuse(_jspx_th_layout_005foption_005f2);
    return false;
  }

  private boolean _jspx_meth_layout_005foption_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fselect_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:option
    fr.improve.struts.taglib.layout.field.OptionTag _jspx_th_layout_005foption_005f3 = (fr.improve.struts.taglib.layout.field.OptionTag) _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.OptionTag.class);
    _jspx_th_layout_005foption_005f3.setPageContext(_jspx_page_context);
    _jspx_th_layout_005foption_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fselect_005f1);
    _jspx_th_layout_005foption_005f3.setValue("A realizar");
    _jspx_th_layout_005foption_005f3.setKey("A realizar");
    int _jspx_eval_layout_005foption_005f3 = _jspx_th_layout_005foption_005f3.doStartTag();
    if (_jspx_th_layout_005foption_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.reuse(_jspx_th_layout_005foption_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.reuse(_jspx_th_layout_005foption_005f3);
    return false;
  }

  private boolean _jspx_meth_layout_005foption_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fselect_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:option
    fr.improve.struts.taglib.layout.field.OptionTag _jspx_th_layout_005foption_005f4 = (fr.improve.struts.taglib.layout.field.OptionTag) _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.OptionTag.class);
    _jspx_th_layout_005foption_005f4.setPageContext(_jspx_page_context);
    _jspx_th_layout_005foption_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fselect_005f1);
    _jspx_th_layout_005foption_005f4.setValue("Realizada");
    _jspx_th_layout_005foption_005f4.setKey("Realizada");
    int _jspx_eval_layout_005foption_005f4 = _jspx_th_layout_005foption_005f4.doStartTag();
    if (_jspx_th_layout_005foption_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.reuse(_jspx_th_layout_005foption_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.reuse(_jspx_th_layout_005foption_005f4);
    return false;
  }

  private boolean _jspx_meth_layout_005foption_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fselect_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:option
    fr.improve.struts.taglib.layout.field.OptionTag _jspx_th_layout_005foption_005f5 = (fr.improve.struts.taglib.layout.field.OptionTag) _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.OptionTag.class);
    _jspx_th_layout_005foption_005f5.setPageContext(_jspx_page_context);
    _jspx_th_layout_005foption_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fselect_005f1);
    _jspx_th_layout_005foption_005f5.setValue("Cancelada");
    _jspx_th_layout_005foption_005f5.setKey("Cancelada");
    int _jspx_eval_layout_005foption_005f5 = _jspx_th_layout_005foption_005f5.doStartTag();
    if (_jspx_th_layout_005foption_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.reuse(_jspx_th_layout_005foption_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005foption_005fvalue_005fkey_005fnobody.reuse(_jspx_th_layout_005foption_005f5);
    return false;
  }

  private boolean _jspx_meth_layout_005ftext_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fpanel_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:text
    fr.improve.struts.taglib.layout.field.TextFieldTag _jspx_th_layout_005ftext_005f1 = (fr.improve.struts.taglib.layout.field.TextFieldTag) _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.TextFieldTag.class);
    _jspx_th_layout_005ftext_005f1.setPageContext(_jspx_page_context);
    _jspx_th_layout_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fpanel_005f0);
    _jspx_th_layout_005ftext_005f1.setKey("ReservaForm.grilla_bq.direccion");
    _jspx_th_layout_005ftext_005f1.setProperty("direccion");
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

  private boolean _jspx_meth_layout_005ftext_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fpanel_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:text
    fr.improve.struts.taglib.layout.field.TextFieldTag _jspx_th_layout_005ftext_005f2 = (fr.improve.struts.taglib.layout.field.TextFieldTag) _005fjspx_005ftagPool_005flayout_005ftext_005fstyleClass_005fsize_005fproperty_005fmode_005fmaxlength_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.field.TextFieldTag.class);
    _jspx_th_layout_005ftext_005f2.setPageContext(_jspx_page_context);
    _jspx_th_layout_005ftext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fpanel_005f0);
    _jspx_th_layout_005ftext_005f2.setKey("ReservaForm.flota");
    _jspx_th_layout_005ftext_005f2.setProperty("flota.licencia");
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
    _jspx_th_bean_005fmessage_005f1.setKey("button.find");
    int _jspx_eval_bean_005fmessage_005f1 = _jspx_th_bean_005fmessage_005f1.doStartTag();
    if (_jspx_th_bean_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f1);
    return false;
  }

  private boolean _jspx_meth_layout_005freset_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fformActions_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:reset
    fr.improve.struts.taglib.layout.ResetTag _jspx_th_layout_005freset_005f0 = (fr.improve.struts.taglib.layout.ResetTag) _005fjspx_005ftagPool_005flayout_005freset_005fstyleClass_005freqCode_005fmode.get(fr.improve.struts.taglib.layout.ResetTag.class);
    _jspx_th_layout_005freset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_layout_005freset_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fformActions_005f0);
    _jspx_th_layout_005freset_005f0.setMode("D,D,N");
    _jspx_th_layout_005freset_005f0.setReqCode("reset");
    _jspx_th_layout_005freset_005f0.setStyleClass("button");
    int _jspx_eval_layout_005freset_005f0 = _jspx_th_layout_005freset_005f0.doStartTag();
    if (_jspx_eval_layout_005freset_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_layout_005freset_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_layout_005freset_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_layout_005freset_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_bean_005fmessage_005f2(_jspx_th_layout_005freset_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_layout_005freset_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_layout_005freset_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_layout_005freset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005freset_005fstyleClass_005freqCode_005fmode.reuse(_jspx_th_layout_005freset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005freset_005fstyleClass_005freqCode_005fmode.reuse(_jspx_th_layout_005freset_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005freset_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f2 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f2.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005freset_005f0);
    _jspx_th_bean_005fmessage_005f2.setKey("button.reset");
    int _jspx_eval_bean_005fmessage_005f2 = _jspx_th_bean_005fmessage_005f2.doStartTag();
    if (_jspx_th_bean_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fsubmit_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f3 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f3.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fsubmit_005f1);
    _jspx_th_bean_005fmessage_005f3.setKey("button.create");
    int _jspx_eval_bean_005fmessage_005f3 = _jspx_th_bean_005fmessage_005f3.doStartTag();
    if (_jspx_th_bean_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f3);
    return false;
  }

  private boolean _jspx_meth_logic_005fpresent_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:present
    org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f0 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
    _jspx_th_logic_005fpresent_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fpresent_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fform_005f0);
    _jspx_th_logic_005fpresent_005f0.setName("foundResults");
    _jspx_th_logic_005fpresent_005f0.setScope("request");
    int _jspx_eval_logic_005fpresent_005f0 = _jspx_th_logic_005fpresent_005f0.doStartTag();
    if (_jspx_eval_logic_005fpresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_layout_005fspace_005f1(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t  \t");
        if (_jspx_meth_layout_005fmessage_005f0(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_layout_005fcollection_005f0(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fpresent_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fpresent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fname.reuse(_jspx_th_logic_005fpresent_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fname.reuse(_jspx_th_logic_005fpresent_005f0);
    return false;
  }

  private boolean _jspx_meth_layout_005fspace_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:space
    fr.improve.struts.taglib.layout.EmptyTag _jspx_th_layout_005fspace_005f1 = (fr.improve.struts.taglib.layout.EmptyTag) _005fjspx_005ftagPool_005flayout_005fspace_005fnobody.get(fr.improve.struts.taglib.layout.EmptyTag.class);
    _jspx_th_layout_005fspace_005f1.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fspace_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    int _jspx_eval_layout_005fspace_005f1 = _jspx_th_layout_005fspace_005f1.doStartTag();
    if (_jspx_th_layout_005fspace_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fspace_005fnobody.reuse(_jspx_th_layout_005fspace_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fspace_005fnobody.reuse(_jspx_th_layout_005fspace_005f1);
    return false;
  }

  private boolean _jspx_meth_layout_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:message
    fr.improve.struts.taglib.layout.MessageTag _jspx_th_layout_005fmessage_005f0 = (fr.improve.struts.taglib.layout.MessageTag) _005fjspx_005ftagPool_005flayout_005fmessage_005fkey_005fnobody.get(fr.improve.struts.taglib.layout.MessageTag.class);
    _jspx_th_layout_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    _jspx_th_layout_005fmessage_005f0.setKey("slort.mensajes.campos.ResultadoBusqueda");
    int _jspx_eval_layout_005fmessage_005f0 = _jspx_th_layout_005fmessage_005f0.doStartTag();
    if (_jspx_th_layout_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fmessage_005fkey_005fnobody.reuse(_jspx_th_layout_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fmessage_005fkey_005fnobody.reuse(_jspx_th_layout_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_layout_005fcollection_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:collection
    fr.improve.struts.taglib.layout.collection.CollectionTag _jspx_th_layout_005fcollection_005f0 = (fr.improve.struts.taglib.layout.collection.CollectionTag) _005fjspx_005ftagPool_005flayout_005fcollection_005fwidth_005fstyleClass_005fname_005fid_005falign.get(fr.improve.struts.taglib.layout.collection.CollectionTag.class);
    _jspx_th_layout_005fcollection_005f0.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fcollection_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    _jspx_th_layout_005fcollection_005f0.setName("foundResults");
    _jspx_th_layout_005fcollection_005f0.setId("objeto");
    _jspx_th_layout_005fcollection_005f0.setStyleClass("FORM");
    _jspx_th_layout_005fcollection_005f0.setWidth("100%");
    _jspx_th_layout_005fcollection_005f0.setAlign("center");
    int _jspx_eval_layout_005fcollection_005f0 = _jspx_th_layout_005fcollection_005f0.doStartTag();
    if (_jspx_eval_layout_005fcollection_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_layout_005fcollection_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_layout_005fcollection_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_layout_005fcollection_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t \r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_layout_005fcollectionItem_005f0(_jspx_th_layout_005fcollection_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_layout_005fcollectionItem_005f1(_jspx_th_layout_005fcollection_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_layout_005fcollectionItem_005f2(_jspx_th_layout_005fcollection_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_layout_005fcollectionItem_005f3(_jspx_th_layout_005fcollection_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_layout_005fcollectionItem_005f4(_jspx_th_layout_005fcollection_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_layout_005fcollectionItem_005f5(_jspx_th_layout_005fcollection_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_layout_005fcollectionItem_005f6(_jspx_th_layout_005fcollection_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_layout_005fcollectionItem_005f7(_jspx_th_layout_005fcollection_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_layout_005fcollectionItem_005f8(_jspx_th_layout_005fcollection_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t \r\n");
        out.write("\t\t\t\t\t\t    \t");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t    \t");
        if (_jspx_meth_layout_005fcollectionItem_005f9(_jspx_th_layout_005fcollection_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_layout_005fcollectionItem_005f10(_jspx_th_layout_005fcollection_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t    ");
        int evalDoAfterBody = _jspx_th_layout_005fcollection_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_layout_005fcollection_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_layout_005fcollection_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fcollection_005fwidth_005fstyleClass_005fname_005fid_005falign.reuse(_jspx_th_layout_005fcollection_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fcollection_005fwidth_005fstyleClass_005fname_005fid_005falign.reuse(_jspx_th_layout_005fcollection_005f0);
    return false;
  }

  private boolean _jspx_meth_layout_005fcollectionItem_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcollection_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:collectionItem
    fr.improve.struts.taglib.layout.collection.CollectionItemTag _jspx_th_layout_005fcollectionItem_005f0 = (fr.improve.struts.taglib.layout.collection.CollectionItemTag) _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.get(fr.improve.struts.taglib.layout.collection.CollectionItemTag.class);
    _jspx_th_layout_005fcollectionItem_005f0.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fcollectionItem_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcollection_005f0);
    _jspx_th_layout_005fcollectionItem_005f0.setTitle("ReservaForm.grilla_bq.idReserva");
    _jspx_th_layout_005fcollectionItem_005f0.setName("objeto");
    _jspx_th_layout_005fcollectionItem_005f0.setProperty("idReserva");
    _jspx_th_layout_005fcollectionItem_005f0.setStyleClass("negro-nor-2");
    int _jspx_eval_layout_005fcollectionItem_005f0 = _jspx_th_layout_005fcollectionItem_005f0.doStartTag();
    if (_jspx_th_layout_005fcollectionItem_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_layout_005fcollectionItem_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_layout_005fcollectionItem_005f0);
    return false;
  }

  private boolean _jspx_meth_layout_005fcollectionItem_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcollection_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:collectionItem
    fr.improve.struts.taglib.layout.collection.CollectionItemTag _jspx_th_layout_005fcollectionItem_005f1 = (fr.improve.struts.taglib.layout.collection.CollectionItemTag) _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.get(fr.improve.struts.taglib.layout.collection.CollectionItemTag.class);
    _jspx_th_layout_005fcollectionItem_005f1.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fcollectionItem_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcollection_005f0);
    _jspx_th_layout_005fcollectionItem_005f1.setTitle("ReservaForm.usuario");
    _jspx_th_layout_005fcollectionItem_005f1.setName("objeto");
    _jspx_th_layout_005fcollectionItem_005f1.setProperty("usuario.usuario");
    _jspx_th_layout_005fcollectionItem_005f1.setStyleClass("negro-nor-2");
    int _jspx_eval_layout_005fcollectionItem_005f1 = _jspx_th_layout_005fcollectionItem_005f1.doStartTag();
    if (_jspx_th_layout_005fcollectionItem_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_layout_005fcollectionItem_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_layout_005fcollectionItem_005f1);
    return false;
  }

  private boolean _jspx_meth_layout_005fcollectionItem_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcollection_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:collectionItem
    fr.improve.struts.taglib.layout.collection.CollectionItemTag _jspx_th_layout_005fcollectionItem_005f2 = (fr.improve.struts.taglib.layout.collection.CollectionItemTag) _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.get(fr.improve.struts.taglib.layout.collection.CollectionItemTag.class);
    _jspx_th_layout_005fcollectionItem_005f2.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fcollectionItem_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcollection_005f0);
    _jspx_th_layout_005fcollectionItem_005f2.setTitle("ReservaForm.grilla_bq.cliente");
    _jspx_th_layout_005fcollectionItem_005f2.setName("objeto");
    _jspx_th_layout_005fcollectionItem_005f2.setProperty("cliente.clienteCompleto");
    _jspx_th_layout_005fcollectionItem_005f2.setStyleClass("negro-nor-2");
    int _jspx_eval_layout_005fcollectionItem_005f2 = _jspx_th_layout_005fcollectionItem_005f2.doStartTag();
    if (_jspx_th_layout_005fcollectionItem_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_layout_005fcollectionItem_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_layout_005fcollectionItem_005f2);
    return false;
  }

  private boolean _jspx_meth_layout_005fcollectionItem_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcollection_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:collectionItem
    fr.improve.struts.taglib.layout.collection.CollectionItemTag _jspx_th_layout_005fcollectionItem_005f3 = (fr.improve.struts.taglib.layout.collection.CollectionItemTag) _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftype_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.get(fr.improve.struts.taglib.layout.collection.CollectionItemTag.class);
    _jspx_th_layout_005fcollectionItem_005f3.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fcollectionItem_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcollection_005f0);
    _jspx_th_layout_005fcollectionItem_005f3.setTitle("ReservaForm.grilla_bq.fecha");
    _jspx_th_layout_005fcollectionItem_005f3.setName("objeto");
    _jspx_th_layout_005fcollectionItem_005f3.setProperty("fecha");
    _jspx_th_layout_005fcollectionItem_005f3.setStyleClass("negro-nor-2");
    _jspx_th_layout_005fcollectionItem_005f3.setType("date");
    int _jspx_eval_layout_005fcollectionItem_005f3 = _jspx_th_layout_005fcollectionItem_005f3.doStartTag();
    if (_jspx_th_layout_005fcollectionItem_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftype_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_layout_005fcollectionItem_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftype_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_layout_005fcollectionItem_005f3);
    return false;
  }

  private boolean _jspx_meth_layout_005fcollectionItem_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcollection_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:collectionItem
    fr.improve.struts.taglib.layout.collection.CollectionItemTag _jspx_th_layout_005fcollectionItem_005f4 = (fr.improve.struts.taglib.layout.collection.CollectionItemTag) _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftype_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.get(fr.improve.struts.taglib.layout.collection.CollectionItemTag.class);
    _jspx_th_layout_005fcollectionItem_005f4.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fcollectionItem_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcollection_005f0);
    _jspx_th_layout_005fcollectionItem_005f4.setTitle("ReservaForm.grilla_bq.hora");
    _jspx_th_layout_005fcollectionItem_005f4.setName("objeto");
    _jspx_th_layout_005fcollectionItem_005f4.setProperty("hora");
    _jspx_th_layout_005fcollectionItem_005f4.setStyleClass("negro-nor-2");
    _jspx_th_layout_005fcollectionItem_005f4.setType("time");
    int _jspx_eval_layout_005fcollectionItem_005f4 = _jspx_th_layout_005fcollectionItem_005f4.doStartTag();
    if (_jspx_th_layout_005fcollectionItem_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftype_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_layout_005fcollectionItem_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftype_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_layout_005fcollectionItem_005f4);
    return false;
  }

  private boolean _jspx_meth_layout_005fcollectionItem_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcollection_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:collectionItem
    fr.improve.struts.taglib.layout.collection.CollectionItemTag _jspx_th_layout_005fcollectionItem_005f5 = (fr.improve.struts.taglib.layout.collection.CollectionItemTag) _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.get(fr.improve.struts.taglib.layout.collection.CollectionItemTag.class);
    _jspx_th_layout_005fcollectionItem_005f5.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fcollectionItem_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcollection_005f0);
    _jspx_th_layout_005fcollectionItem_005f5.setTitle("ReservaForm.grilla_bq.estado");
    _jspx_th_layout_005fcollectionItem_005f5.setName("objeto");
    _jspx_th_layout_005fcollectionItem_005f5.setProperty("estado");
    _jspx_th_layout_005fcollectionItem_005f5.setStyleClass("negro-nor-2");
    int _jspx_eval_layout_005fcollectionItem_005f5 = _jspx_th_layout_005fcollectionItem_005f5.doStartTag();
    if (_jspx_th_layout_005fcollectionItem_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_layout_005fcollectionItem_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_layout_005fcollectionItem_005f5);
    return false;
  }

  private boolean _jspx_meth_layout_005fcollectionItem_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcollection_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:collectionItem
    fr.improve.struts.taglib.layout.collection.CollectionItemTag _jspx_th_layout_005fcollectionItem_005f6 = (fr.improve.struts.taglib.layout.collection.CollectionItemTag) _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.get(fr.improve.struts.taglib.layout.collection.CollectionItemTag.class);
    _jspx_th_layout_005fcollectionItem_005f6.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fcollectionItem_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcollection_005f0);
    _jspx_th_layout_005fcollectionItem_005f6.setTitle("ReservaForm.grilla_bq.direccion");
    _jspx_th_layout_005fcollectionItem_005f6.setName("objeto");
    _jspx_th_layout_005fcollectionItem_005f6.setProperty("direccion");
    _jspx_th_layout_005fcollectionItem_005f6.setStyleClass("negro-nor-2");
    int _jspx_eval_layout_005fcollectionItem_005f6 = _jspx_th_layout_005fcollectionItem_005f6.doStartTag();
    if (_jspx_th_layout_005fcollectionItem_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_layout_005fcollectionItem_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_layout_005fcollectionItem_005f6);
    return false;
  }

  private boolean _jspx_meth_layout_005fcollectionItem_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcollection_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:collectionItem
    fr.improve.struts.taglib.layout.collection.CollectionItemTag _jspx_th_layout_005fcollectionItem_005f7 = (fr.improve.struts.taglib.layout.collection.CollectionItemTag) _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.get(fr.improve.struts.taglib.layout.collection.CollectionItemTag.class);
    _jspx_th_layout_005fcollectionItem_005f7.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fcollectionItem_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcollection_005f0);
    _jspx_th_layout_005fcollectionItem_005f7.setTitle("ReservaForm.grilla_bq.telefono");
    _jspx_th_layout_005fcollectionItem_005f7.setName("objeto");
    _jspx_th_layout_005fcollectionItem_005f7.setProperty("telefono");
    _jspx_th_layout_005fcollectionItem_005f7.setStyleClass("negro-nor-2");
    int _jspx_eval_layout_005fcollectionItem_005f7 = _jspx_th_layout_005fcollectionItem_005f7.doStartTag();
    if (_jspx_th_layout_005fcollectionItem_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_layout_005fcollectionItem_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_layout_005fcollectionItem_005f7);
    return false;
  }

  private boolean _jspx_meth_layout_005fcollectionItem_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcollection_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:collectionItem
    fr.improve.struts.taglib.layout.collection.CollectionItemTag _jspx_th_layout_005fcollectionItem_005f8 = (fr.improve.struts.taglib.layout.collection.CollectionItemTag) _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.get(fr.improve.struts.taglib.layout.collection.CollectionItemTag.class);
    _jspx_th_layout_005fcollectionItem_005f8.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fcollectionItem_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcollection_005f0);
    _jspx_th_layout_005fcollectionItem_005f8.setTitle("ReservaForm.grilla_bq.flota");
    _jspx_th_layout_005fcollectionItem_005f8.setName("objeto");
    _jspx_th_layout_005fcollectionItem_005f8.setProperty("flota.licencia");
    _jspx_th_layout_005fcollectionItem_005f8.setStyleClass("negro-nor-2");
    int _jspx_eval_layout_005fcollectionItem_005f8 = _jspx_th_layout_005fcollectionItem_005f8.doStartTag();
    if (_jspx_th_layout_005fcollectionItem_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_layout_005fcollectionItem_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_layout_005fcollectionItem_005f8);
    return false;
  }

  private boolean _jspx_meth_layout_005fcollectionItem_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcollection_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:collectionItem
    fr.improve.struts.taglib.layout.collection.CollectionItemTag _jspx_th_layout_005fcollectionItem_005f9 = (fr.improve.struts.taglib.layout.collection.CollectionItemTag) _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass.get(fr.improve.struts.taglib.layout.collection.CollectionItemTag.class);
    _jspx_th_layout_005fcollectionItem_005f9.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fcollectionItem_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcollection_005f0);
    _jspx_th_layout_005fcollectionItem_005f9.setTitle("label.edit");
    _jspx_th_layout_005fcollectionItem_005f9.setStyleClass("negro-nor-2");
    int _jspx_eval_layout_005fcollectionItem_005f9 = _jspx_th_layout_005fcollectionItem_005f9.doStartTag();
    if (_jspx_eval_layout_005fcollectionItem_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_layout_005fcollectionItem_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_layout_005fcollectionItem_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_layout_005fcollectionItem_005f9.doInitBody();
      }
      do {
        out.write("  \r\n");
        out.write("\t\t\t\t\t\t    \t");
        if (_jspx_meth_logic_005fequal_005f0(_jspx_th_layout_005fcollectionItem_005f9, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_logic_005fequal_005f1(_jspx_th_layout_005fcollectionItem_005f9, _jspx_page_context))
          return true;
        out.write("  \r\n");
        out.write("\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_logic_005fequal_005f2(_jspx_th_layout_005fcollectionItem_005f9, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_logic_005fequal_005f3(_jspx_th_layout_005fcollectionItem_005f9, _jspx_page_context))
          return true;
        out.write("   \r\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_layout_005fcollectionItem_005f9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_layout_005fcollectionItem_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_layout_005fcollectionItem_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass.reuse(_jspx_th_layout_005fcollectionItem_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass.reuse(_jspx_th_layout_005fcollectionItem_005f9);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcollectionItem_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcollectionItem_005f9);
    _jspx_th_logic_005fequal_005f0.setName("objeto");
    _jspx_th_logic_005fequal_005f0.setProperty("estado");
    _jspx_th_logic_005fequal_005f0.setValue("A realizar");
    int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
    if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_layout_005flink_005f0(_jspx_th_logic_005fequal_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f0);
    return false;
  }

  private boolean _jspx_meth_layout_005flink_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:link
    fr.improve.struts.taglib.layout.LinkTag _jspx_th_layout_005flink_005f0 = (fr.improve.struts.taglib.layout.LinkTag) _005fjspx_005ftagPool_005flayout_005flink_005fparamProperty_005fparamName_005fparamId_005fhref.get(fr.improve.struts.taglib.layout.LinkTag.class);
    _jspx_th_layout_005flink_005f0.setPageContext(_jspx_page_context);
    _jspx_th_layout_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
    _jspx_th_layout_005flink_005f0.setHref("reserva.do?reqCode=edit");
    _jspx_th_layout_005flink_005f0.setParamId("selectedId");
    _jspx_th_layout_005flink_005f0.setParamName("objeto");
    _jspx_th_layout_005flink_005f0.setParamProperty("idReserva");
    int _jspx_eval_layout_005flink_005f0 = _jspx_th_layout_005flink_005f0.doStartTag();
    if (_jspx_eval_layout_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_layout_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_layout_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_layout_005flink_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/i.p.folder.drafts.gif\" border=\"0\" class=\"negro-nor-2\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_layout_005flink_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_layout_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_layout_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005flink_005fparamProperty_005fparamName_005fparamId_005fhref.reuse(_jspx_th_layout_005flink_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005flink_005fparamProperty_005fparamName_005fparamId_005fhref.reuse(_jspx_th_layout_005flink_005f0);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcollectionItem_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcollectionItem_005f9);
    _jspx_th_logic_005fequal_005f1.setName("objeto");
    _jspx_th_logic_005fequal_005f1.setProperty("estado");
    _jspx_th_logic_005fequal_005f1.setValue("En proceso");
    int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
    if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_layout_005flink_005f1(_jspx_th_logic_005fequal_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f1);
    return false;
  }

  private boolean _jspx_meth_layout_005flink_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:link
    fr.improve.struts.taglib.layout.LinkTag _jspx_th_layout_005flink_005f1 = (fr.improve.struts.taglib.layout.LinkTag) _005fjspx_005ftagPool_005flayout_005flink_005fparamProperty_005fparamName_005fparamId_005fhref.get(fr.improve.struts.taglib.layout.LinkTag.class);
    _jspx_th_layout_005flink_005f1.setPageContext(_jspx_page_context);
    _jspx_th_layout_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
    _jspx_th_layout_005flink_005f1.setHref("reserva.do?reqCode=edit");
    _jspx_th_layout_005flink_005f1.setParamId("selectedId");
    _jspx_th_layout_005flink_005f1.setParamName("objeto");
    _jspx_th_layout_005flink_005f1.setParamProperty("idReserva");
    int _jspx_eval_layout_005flink_005f1 = _jspx_th_layout_005flink_005f1.doStartTag();
    if (_jspx_eval_layout_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_layout_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_layout_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_layout_005flink_005f1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/i.p.folder.drafts.gif\" border=\"0\" class=\"negro-nor-2\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_layout_005flink_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_layout_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_layout_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005flink_005fparamProperty_005fparamName_005fparamId_005fhref.reuse(_jspx_th_layout_005flink_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005flink_005fparamProperty_005fparamName_005fparamId_005fhref.reuse(_jspx_th_layout_005flink_005f1);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcollectionItem_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcollectionItem_005f9);
    _jspx_th_logic_005fequal_005f2.setName("objeto");
    _jspx_th_logic_005fequal_005f2.setProperty("estado");
    _jspx_th_logic_005fequal_005f2.setValue("Cancelada");
    int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
    if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_layout_005flink_005f2(_jspx_th_logic_005fequal_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f2);
    return false;
  }

  private boolean _jspx_meth_layout_005flink_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:link
    fr.improve.struts.taglib.layout.LinkTag _jspx_th_layout_005flink_005f2 = (fr.improve.struts.taglib.layout.LinkTag) _005fjspx_005ftagPool_005flayout_005flink_005fparamProperty_005fparamName_005fparamId_005fhref.get(fr.improve.struts.taglib.layout.LinkTag.class);
    _jspx_th_layout_005flink_005f2.setPageContext(_jspx_page_context);
    _jspx_th_layout_005flink_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
    _jspx_th_layout_005flink_005f2.setHref("reserva.do?reqCode=inspect");
    _jspx_th_layout_005flink_005f2.setParamId("selectedId");
    _jspx_th_layout_005flink_005f2.setParamName("objeto");
    _jspx_th_layout_005flink_005f2.setParamProperty("idReserva");
    int _jspx_eval_layout_005flink_005f2 = _jspx_th_layout_005flink_005f2.doStartTag();
    if (_jspx_eval_layout_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_layout_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_layout_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_layout_005flink_005f2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/i.p.folder.drafts.gif\" border=\"0\" class=\"negro-nor-2\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_layout_005flink_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_layout_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_layout_005flink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005flink_005fparamProperty_005fparamName_005fparamId_005fhref.reuse(_jspx_th_layout_005flink_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005flink_005fparamProperty_005fparamName_005fparamId_005fhref.reuse(_jspx_th_layout_005flink_005f2);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcollectionItem_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcollectionItem_005f9);
    _jspx_th_logic_005fequal_005f3.setName("objeto");
    _jspx_th_logic_005fequal_005f3.setProperty("estado");
    _jspx_th_logic_005fequal_005f3.setValue("Realizada");
    int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
    if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_layout_005flink_005f3(_jspx_th_logic_005fequal_005f3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f3);
    return false;
  }

  private boolean _jspx_meth_layout_005flink_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:link
    fr.improve.struts.taglib.layout.LinkTag _jspx_th_layout_005flink_005f3 = (fr.improve.struts.taglib.layout.LinkTag) _005fjspx_005ftagPool_005flayout_005flink_005fparamProperty_005fparamName_005fparamId_005fhref.get(fr.improve.struts.taglib.layout.LinkTag.class);
    _jspx_th_layout_005flink_005f3.setPageContext(_jspx_page_context);
    _jspx_th_layout_005flink_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
    _jspx_th_layout_005flink_005f3.setHref("reserva.do?reqCode=inspect");
    _jspx_th_layout_005flink_005f3.setParamId("selectedId");
    _jspx_th_layout_005flink_005f3.setParamName("objeto");
    _jspx_th_layout_005flink_005f3.setParamProperty("idReserva");
    int _jspx_eval_layout_005flink_005f3 = _jspx_th_layout_005flink_005f3.doStartTag();
    if (_jspx_eval_layout_005flink_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_layout_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_layout_005flink_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_layout_005flink_005f3.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/i.p.folder.drafts.gif\" border=\"0\" class=\"negro-nor-2\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_layout_005flink_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_layout_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_layout_005flink_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005flink_005fparamProperty_005fparamName_005fparamId_005fhref.reuse(_jspx_th_layout_005flink_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005flink_005fparamProperty_005fparamName_005fparamId_005fhref.reuse(_jspx_th_layout_005flink_005f3);
    return false;
  }

  private boolean _jspx_meth_layout_005fcollectionItem_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcollection_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:collectionItem
    fr.improve.struts.taglib.layout.collection.CollectionItemTag _jspx_th_layout_005fcollectionItem_005f10 = (fr.improve.struts.taglib.layout.collection.CollectionItemTag) _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass.get(fr.improve.struts.taglib.layout.collection.CollectionItemTag.class);
    _jspx_th_layout_005fcollectionItem_005f10.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fcollectionItem_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcollection_005f0);
    _jspx_th_layout_005fcollectionItem_005f10.setTitle("label.delete");
    _jspx_th_layout_005fcollectionItem_005f10.setStyleClass("negro-nor-2");
    int _jspx_eval_layout_005fcollectionItem_005f10 = _jspx_th_layout_005fcollectionItem_005f10.doStartTag();
    if (_jspx_eval_layout_005fcollectionItem_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_layout_005fcollectionItem_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_layout_005fcollectionItem_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_layout_005fcollectionItem_005f10.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_logic_005fequal_005f4(_jspx_th_layout_005fcollectionItem_005f10, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("\t\t\t\t\t\t\t\t    ");
        if (_jspx_meth_logic_005fequal_005f5(_jspx_th_layout_005fcollectionItem_005f10, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_layout_005fcollectionItem_005f10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_layout_005fcollectionItem_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_layout_005fcollectionItem_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass.reuse(_jspx_th_layout_005fcollectionItem_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass.reuse(_jspx_th_layout_005fcollectionItem_005f10);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcollectionItem_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcollectionItem_005f10);
    _jspx_th_logic_005fequal_005f4.setName("objeto");
    _jspx_th_logic_005fequal_005f4.setProperty("estado");
    _jspx_th_logic_005fequal_005f4.setValue("A realizar");
    int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
    if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_layout_005flink_005f4(_jspx_th_logic_005fequal_005f4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t    ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f4);
    return false;
  }

  private boolean _jspx_meth_layout_005flink_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:link
    fr.improve.struts.taglib.layout.LinkTag _jspx_th_layout_005flink_005f4 = (fr.improve.struts.taglib.layout.LinkTag) _005fjspx_005ftagPool_005flayout_005flink_005fparamProperty_005fparamName_005fparamId_005fhref.get(fr.improve.struts.taglib.layout.LinkTag.class);
    _jspx_th_layout_005flink_005f4.setPageContext(_jspx_page_context);
    _jspx_th_layout_005flink_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f4);
    _jspx_th_layout_005flink_005f4.setHref("reserva.do?reqCode=inspect");
    _jspx_th_layout_005flink_005f4.setParamId("selectedId");
    _jspx_th_layout_005flink_005f4.setParamName("objeto");
    _jspx_th_layout_005flink_005f4.setParamProperty("idReserva");
    int _jspx_eval_layout_005flink_005f4 = _jspx_th_layout_005flink_005f4.doStartTag();
    if (_jspx_eval_layout_005flink_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_layout_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_layout_005flink_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_layout_005flink_005f4.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/i.p.junkmail.gif\" border=\"0\" class=\"negro-nor-2\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_layout_005flink_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_layout_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_layout_005flink_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005flink_005fparamProperty_005fparamName_005fparamId_005fhref.reuse(_jspx_th_layout_005flink_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005flink_005fparamProperty_005fparamName_005fparamId_005fhref.reuse(_jspx_th_layout_005flink_005f4);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcollectionItem_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcollectionItem_005f10);
    _jspx_th_logic_005fequal_005f5.setName("objeto");
    _jspx_th_logic_005fequal_005f5.setProperty("estado");
    _jspx_th_logic_005fequal_005f5.setValue("En proceso");
    int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
    if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_layout_005flink_005f5(_jspx_th_logic_005fequal_005f5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t    ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f5);
    return false;
  }

  private boolean _jspx_meth_layout_005flink_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:link
    fr.improve.struts.taglib.layout.LinkTag _jspx_th_layout_005flink_005f5 = (fr.improve.struts.taglib.layout.LinkTag) _005fjspx_005ftagPool_005flayout_005flink_005fparamProperty_005fparamName_005fparamId_005fhref.get(fr.improve.struts.taglib.layout.LinkTag.class);
    _jspx_th_layout_005flink_005f5.setPageContext(_jspx_page_context);
    _jspx_th_layout_005flink_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
    _jspx_th_layout_005flink_005f5.setHref("reserva.do?reqCode=inspect");
    _jspx_th_layout_005flink_005f5.setParamId("selectedId");
    _jspx_th_layout_005flink_005f5.setParamName("objeto");
    _jspx_th_layout_005flink_005f5.setParamProperty("idReserva");
    int _jspx_eval_layout_005flink_005f5 = _jspx_th_layout_005flink_005f5.doStartTag();
    if (_jspx_eval_layout_005flink_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_layout_005flink_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_layout_005flink_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_layout_005flink_005f5.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/i.p.junkmail.gif\" border=\"0\" class=\"negro-nor-2\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_layout_005flink_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_layout_005flink_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_layout_005flink_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005flink_005fparamProperty_005fparamName_005fparamId_005fhref.reuse(_jspx_th_layout_005flink_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005flink_005fparamProperty_005fparamName_005fparamId_005fhref.reuse(_jspx_th_layout_005flink_005f5);
    return false;
  }

  private boolean _jspx_meth_layout_005fspace_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:space
    fr.improve.struts.taglib.layout.EmptyTag _jspx_th_layout_005fspace_005f2 = (fr.improve.struts.taglib.layout.EmptyTag) _005fjspx_005ftagPool_005flayout_005fspace_005fnobody.get(fr.improve.struts.taglib.layout.EmptyTag.class);
    _jspx_th_layout_005fspace_005f2.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fspace_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fform_005f0);
    int _jspx_eval_layout_005fspace_005f2 = _jspx_th_layout_005fspace_005f2.doStartTag();
    if (_jspx_th_layout_005fspace_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fspace_005fnobody.reuse(_jspx_th_layout_005fspace_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fspace_005fnobody.reuse(_jspx_th_layout_005fspace_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fbutton_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f4 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f4.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fbutton_005f0);
    _jspx_th_bean_005fmessage_005f4.setKey("ReservaForm.button.googlemapsview.label");
    int _jspx_eval_bean_005fmessage_005f4 = _jspx_th_bean_005fmessage_005f4.doStartTag();
    if (_jspx_th_bean_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f4);
    return false;
  }
}
