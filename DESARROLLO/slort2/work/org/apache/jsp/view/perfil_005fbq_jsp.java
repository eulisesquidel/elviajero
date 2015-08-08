package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bdb.util.HttpUtils;

public final class perfil_005fbq_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fspace_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fformActions;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fmode;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fmessage_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fcollection_005fwidth_005fstyleClass_005fname_005fid_005falign;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005flink_005fparamProperty_005fparamName_005fparamId_005fhref;

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
    _005fjspx_005ftagPool_005flayout_005fspace_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fformActions = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fmode = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fmessage_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fcollection_005fwidth_005fstyleClass_005fname_005fid_005falign = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005flink_005fparamProperty_005fparamName_005fparamId_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fapp_005fCheckSimpleLogon_005fnobody.release();
    _005fjspx_005ftagPool_005ftemplate_005finsert_005ftemplate.release();
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect_005fcontent_005fnobody.release();
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname_005fdirect.release();
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005ftemplate_005fput_005fname.release();
    _005fjspx_005ftagPool_005flayout_005fform_005fstyleClass_005freqCode_005faction.release();
    _005fjspx_005ftagPool_005flayout_005fspace_005fnobody.release();
    _005fjspx_005ftagPool_005flayout_005fformActions.release();
    _005fjspx_005ftagPool_005flayout_005fsubmit_005fstyleClass_005freqCode_005fmode.release();
    _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fname.release();
    _005fjspx_005ftagPool_005flayout_005fmessage_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005flayout_005fcollection_005fwidth_005fstyleClass_005fname_005fid_005falign.release();
    _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass.release();
    _005fjspx_005ftagPool_005flayout_005flink_005fparamProperty_005fparamName_005fparamId_005fhref.release();
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
          out.write('\r');
          out.write('\n');
          out.write('	');
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
              out.write("\t\t\r\n");
              out.write("\t\t");
              out.write("\r\n");
              out.write("\t\t");
              //  layout:form
              fr.improve.struts.taglib.layout.FormTag _jspx_th_layout_005fform_005f0 = (fr.improve.struts.taglib.layout.FormTag) _005fjspx_005ftagPool_005flayout_005fform_005fstyleClass_005freqCode_005faction.get(fr.improve.struts.taglib.layout.FormTag.class);
              _jspx_th_layout_005fform_005f0.setPageContext(_jspx_page_context);
              _jspx_th_layout_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_template_005fput_005f2);
              _jspx_th_layout_005fform_005f0.setAction("/perfil.do");
              _jspx_th_layout_005fform_005f0.setStyleClass("Body");
              _jspx_th_layout_005fform_005f0.setReqCode("");
              int _jspx_eval_layout_005fform_005f0 = _jspx_th_layout_005fform_005f0.doStartTag();
              if (_jspx_eval_layout_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t \r\n");
                  out.write("\t\t  ");
                  if (_jspx_meth_layout_005fspace_005f0(_jspx_th_layout_005fform_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t  \r\n");
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
                      _jspx_th_layout_005fsubmit_005f0.setMode("D,D,N");
                      _jspx_th_layout_005fsubmit_005f0.setReqCode(HttpUtils.STRUTS_ACTION_CREATE);
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
                  out.write("\t\t\t\r\n");
                  out.write("\t\t\t");
                  out.write("\t\r\n");
                  out.write("\t\t\t");
                  if (_jspx_meth_logic_005fpresent_005f0(_jspx_th_layout_005fform_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t");
                  out.write("\r\n");
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
    _jspx_th_bean_005fmessage_005f0.setKey("PerfilForm.window.titulo");
    int _jspx_eval_bean_005fmessage_005f0 = _jspx_th_bean_005fmessage_005f0.doStartTag();
    if (_jspx_th_bean_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f0);
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
    _jspx_th_bean_005fmessage_005f1.setKey("button.create");
    int _jspx_eval_bean_005fmessage_005f1 = _jspx_th_bean_005fmessage_005f1.doStartTag();
    if (_jspx_th_bean_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f1);
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
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t \r\n");
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
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t \r\n");
        out.write("\t\t\t\t\t\t\t");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_layout_005fcollectionItem_005f4(_jspx_th_layout_005fcollection_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_layout_005fcollectionItem_005f5(_jspx_th_layout_005fcollection_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t");
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
    _jspx_th_layout_005fcollectionItem_005f0.setTitle("PerfilForm.grilla_bq.idPerfil");
    _jspx_th_layout_005fcollectionItem_005f0.setName("objeto");
    _jspx_th_layout_005fcollectionItem_005f0.setProperty("idPerfil");
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
    _jspx_th_layout_005fcollectionItem_005f1.setTitle("PerfilForm.grilla_bq.descripcionCorta");
    _jspx_th_layout_005fcollectionItem_005f1.setName("objeto");
    _jspx_th_layout_005fcollectionItem_005f1.setProperty("descripcionCorta");
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
    _jspx_th_layout_005fcollectionItem_005f2.setTitle("PerfilForm.grilla_bq.descripcionLarga");
    _jspx_th_layout_005fcollectionItem_005f2.setName("objeto");
    _jspx_th_layout_005fcollectionItem_005f2.setProperty("descripcionLarga");
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
    fr.improve.struts.taglib.layout.collection.CollectionItemTag _jspx_th_layout_005fcollectionItem_005f3 = (fr.improve.struts.taglib.layout.collection.CollectionItemTag) _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.get(fr.improve.struts.taglib.layout.collection.CollectionItemTag.class);
    _jspx_th_layout_005fcollectionItem_005f3.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fcollectionItem_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcollection_005f0);
    _jspx_th_layout_005fcollectionItem_005f3.setTitle("PerfilForm.grilla_bq.opcionDefecto");
    _jspx_th_layout_005fcollectionItem_005f3.setName("objeto");
    _jspx_th_layout_005fcollectionItem_005f3.setProperty("opcionDefecto.descripcionLargo");
    _jspx_th_layout_005fcollectionItem_005f3.setStyleClass("negro-nor-2");
    int _jspx_eval_layout_005fcollectionItem_005f3 = _jspx_th_layout_005fcollectionItem_005f3.doStartTag();
    if (_jspx_th_layout_005fcollectionItem_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_layout_005fcollectionItem_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_layout_005fcollectionItem_005f3);
    return false;
  }

  private boolean _jspx_meth_layout_005fcollectionItem_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcollection_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:collectionItem
    fr.improve.struts.taglib.layout.collection.CollectionItemTag _jspx_th_layout_005fcollectionItem_005f4 = (fr.improve.struts.taglib.layout.collection.CollectionItemTag) _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass.get(fr.improve.struts.taglib.layout.collection.CollectionItemTag.class);
    _jspx_th_layout_005fcollectionItem_005f4.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fcollectionItem_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcollection_005f0);
    _jspx_th_layout_005fcollectionItem_005f4.setTitle("label.edit");
    _jspx_th_layout_005fcollectionItem_005f4.setStyleClass("negro-nor-2");
    int _jspx_eval_layout_005fcollectionItem_005f4 = _jspx_th_layout_005fcollectionItem_005f4.doStartTag();
    if (_jspx_eval_layout_005fcollectionItem_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_layout_005fcollectionItem_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_layout_005fcollectionItem_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_layout_005fcollectionItem_005f4.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_layout_005flink_005f0(_jspx_th_layout_005fcollectionItem_005f4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_layout_005fcollectionItem_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_layout_005fcollectionItem_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_layout_005fcollectionItem_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass.reuse(_jspx_th_layout_005fcollectionItem_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass.reuse(_jspx_th_layout_005fcollectionItem_005f4);
    return false;
  }

  private boolean _jspx_meth_layout_005flink_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcollectionItem_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:link
    fr.improve.struts.taglib.layout.LinkTag _jspx_th_layout_005flink_005f0 = (fr.improve.struts.taglib.layout.LinkTag) _005fjspx_005ftagPool_005flayout_005flink_005fparamProperty_005fparamName_005fparamId_005fhref.get(fr.improve.struts.taglib.layout.LinkTag.class);
    _jspx_th_layout_005flink_005f0.setPageContext(_jspx_page_context);
    _jspx_th_layout_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcollectionItem_005f4);
    _jspx_th_layout_005flink_005f0.setHref("perfil.do?reqCode=edit");
    _jspx_th_layout_005flink_005f0.setParamId("selectedId");
    _jspx_th_layout_005flink_005f0.setParamName("objeto");
    _jspx_th_layout_005flink_005f0.setParamProperty("idPerfil");
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

  private boolean _jspx_meth_layout_005fcollectionItem_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcollection_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:collectionItem
    fr.improve.struts.taglib.layout.collection.CollectionItemTag _jspx_th_layout_005fcollectionItem_005f5 = (fr.improve.struts.taglib.layout.collection.CollectionItemTag) _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass.get(fr.improve.struts.taglib.layout.collection.CollectionItemTag.class);
    _jspx_th_layout_005fcollectionItem_005f5.setPageContext(_jspx_page_context);
    _jspx_th_layout_005fcollectionItem_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcollection_005f0);
    _jspx_th_layout_005fcollectionItem_005f5.setTitle("label.delete");
    _jspx_th_layout_005fcollectionItem_005f5.setStyleClass("negro-nor-2");
    int _jspx_eval_layout_005fcollectionItem_005f5 = _jspx_th_layout_005fcollectionItem_005f5.doStartTag();
    if (_jspx_eval_layout_005fcollectionItem_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_layout_005fcollectionItem_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_layout_005fcollectionItem_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_layout_005fcollectionItem_005f5.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_layout_005flink_005f1(_jspx_th_layout_005fcollectionItem_005f5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_layout_005fcollectionItem_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_layout_005fcollectionItem_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_layout_005fcollectionItem_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass.reuse(_jspx_th_layout_005fcollectionItem_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005flayout_005fcollectionItem_005ftitle_005fstyleClass.reuse(_jspx_th_layout_005fcollectionItem_005f5);
    return false;
  }

  private boolean _jspx_meth_layout_005flink_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_layout_005fcollectionItem_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  layout:link
    fr.improve.struts.taglib.layout.LinkTag _jspx_th_layout_005flink_005f1 = (fr.improve.struts.taglib.layout.LinkTag) _005fjspx_005ftagPool_005flayout_005flink_005fparamProperty_005fparamName_005fparamId_005fhref.get(fr.improve.struts.taglib.layout.LinkTag.class);
    _jspx_th_layout_005flink_005f1.setPageContext(_jspx_page_context);
    _jspx_th_layout_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fcollectionItem_005f5);
    _jspx_th_layout_005flink_005f1.setHref("perfil.do?reqCode=inspect");
    _jspx_th_layout_005flink_005f1.setParamId("selectedId");
    _jspx_th_layout_005flink_005f1.setParamName("objeto");
    _jspx_th_layout_005flink_005f1.setParamProperty("idPerfil");
    int _jspx_eval_layout_005flink_005f1 = _jspx_th_layout_005flink_005f1.doStartTag();
    if (_jspx_eval_layout_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_layout_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_layout_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_layout_005flink_005f1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/i.p.junkmail.gif\" border=\"0\" class=\"negro-nor-2\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t\r\n");
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
}
