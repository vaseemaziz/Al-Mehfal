package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sales_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAnyGranted;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAnyGranted = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAnyGranted.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
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
      if (_jspx_meth_sec_005fauthorize_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_sec_005fauthorize_005f1(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_sec_005fauthorize_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>SalesPage - Al Mehfal Restaurant</title>\r\n");
      out.write("\t\t<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"web/css/common.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("\t\t<link href=\"web/css/theme.blue.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"web/js/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"web/js/jquery.tablesorter.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("\t\t\t#table3 {\r\n");
      out.write("\t\t\t\twidth: 430px;\r\n");
      out.write("\t\t\t\tmargin-left: 10px;\r\n");
      out.write("\t\t\t\tmargin-top: 15px;\r\n");
      out.write("\t\t\t\tborder-spacing: 10px;\r\n");
      out.write("\t\t\t\tpadding: 10px;\r\n");
      out.write("\t\t\t\tborder: 1px solid #aaa;\r\n");
      out.write("\t\t\t\tborder-collapse: collapse;\r\n");
      out.write("\t\t\t\tbackground: #505050;\r\n");
      out.write("\t\t\t\tcolor: #f2f2f2;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#table3 tr td.border {\r\n");
      out.write("\t\t\t\tpadding: 4px;\r\n");
      out.write("\t\t\t\tborder-top: 1px solid #aaa;\r\n");
      out.write("\t\t\t\tborder-bottom: 1px solid #aaa;\r\n");
      out.write("\t\t\t\tfont-size: 13px;\r\n");
      out.write("\t\t\t\tfont-family: Arial;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#table3 tr td {\r\n");
      out.write("\t\t\t\tpadding: 4px;\r\n");
      out.write("\t\t\t\tborder: none;\r\n");
      out.write("\t\t\t\tfont-size: 13px;\r\n");
      out.write("\t\t\t\tfont-family: Arial;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#table3 tr td hr {\r\n");
      out.write("\t\t\t\tborder-color: #aaa;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div id=\"wrapper\">\r\n");
      out.write("\t\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t\t<div id=\"header_info\">\r\n");
      out.write("\t\t\t\t\t<h2>Al Mehfal Restaurant</h2>\r\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp" + (("menu.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("current", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("2", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"content_2columns\">\r\n");
      out.write("\t\t\t\t<div id=\"col1\">\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"col2\">\r\n");
      out.write("\t\t\t\t\t<h3> Current Bills </h3>\r\n");
      out.write("\t\t\t\t\t<table class=\"tablesorter\" id=\"currentBills\">\r\n");
      out.write("\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th> Bill No. </th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th> Bill Date </th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th> Net Amount </th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th> Table# </th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th> </th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\t\t<div id=\"footer_info\">\r\n");
      out.write("\t\t\t\t\t<p class=\"copyright\">&copy; 2013, Al Mehfal Restaurant, All Rights Reserved</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t$(document).ready(function () {\r\n");
      out.write("\t\t\t\t$(\"table\").tablesorter({ theme : 'blue'});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_sec_005fauthorize_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAnyGranted.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_005fauthorize_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sec_005fauthorize_005f0.setParent(null);
    // /WEB-INF/views/sales.jsp(4,0) name = ifAnyGranted type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sec_005fauthorize_005f0.setIfAnyGranted("ROLE_USER");
    int _jspx_eval_sec_005fauthorize_005f0 = _jspx_th_sec_005fauthorize_005f0.doStartTag();
    if (_jspx_eval_sec_005fauthorize_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write('\r');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_c_005fset_005f0(_jspx_th_sec_005fauthorize_005f0, _jspx_page_context))
        return true;
      out.write('\r');
      out.write('\n');
    }
    if (_jspx_th_sec_005fauthorize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAnyGranted.reuse(_jspx_th_sec_005fauthorize_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAnyGranted.reuse(_jspx_th_sec_005fauthorize_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f0);
    // /WEB-INF/views/sales.jsp(5,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("role");
    // /WEB-INF/views/sales.jsp(5,1) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/sales.jsp(5,1) 'user'",_el_expressionfactory.createValueExpression("user",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f1 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAnyGranted.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_005fauthorize_005f1.setPageContext(_jspx_page_context);
    _jspx_th_sec_005fauthorize_005f1.setParent(null);
    // /WEB-INF/views/sales.jsp(7,0) name = ifAnyGranted type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sec_005fauthorize_005f1.setIfAnyGranted("ROLE_MANAGER");
    int _jspx_eval_sec_005fauthorize_005f1 = _jspx_th_sec_005fauthorize_005f1.doStartTag();
    if (_jspx_eval_sec_005fauthorize_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write('\r');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_c_005fset_005f1(_jspx_th_sec_005fauthorize_005f1, _jspx_page_context))
        return true;
      out.write('\r');
      out.write('\n');
    }
    if (_jspx_th_sec_005fauthorize_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAnyGranted.reuse(_jspx_th_sec_005fauthorize_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAnyGranted.reuse(_jspx_th_sec_005fauthorize_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f1);
    // /WEB-INF/views/sales.jsp(8,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setVar("role");
    // /WEB-INF/views/sales.jsp(8,1) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/sales.jsp(8,1) 'manager'",_el_expressionfactory.createValueExpression("manager",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
    if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f2 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAnyGranted.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_005fauthorize_005f2.setPageContext(_jspx_page_context);
    _jspx_th_sec_005fauthorize_005f2.setParent(null);
    // /WEB-INF/views/sales.jsp(10,0) name = ifAnyGranted type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sec_005fauthorize_005f2.setIfAnyGranted("ROLE_ADMIN");
    int _jspx_eval_sec_005fauthorize_005f2 = _jspx_th_sec_005fauthorize_005f2.doStartTag();
    if (_jspx_eval_sec_005fauthorize_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write('\r');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_c_005fset_005f2(_jspx_th_sec_005fauthorize_005f2, _jspx_page_context))
        return true;
      out.write('\r');
      out.write('\n');
    }
    if (_jspx_th_sec_005fauthorize_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAnyGranted.reuse(_jspx_th_sec_005fauthorize_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAnyGranted.reuse(_jspx_th_sec_005fauthorize_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f2);
    // /WEB-INF/views/sales.jsp(11,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f2.setVar("role");
    // /WEB-INF/views/sales.jsp(11,1) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f2.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/sales.jsp(11,1) 'admin'",_el_expressionfactory.createValueExpression("admin",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f2 = _jspx_th_c_005fset_005f2.doStartTag();
    if (_jspx_th_c_005fset_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/views/sales.jsp(25,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not billToPrint}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<link href=\"web/css/sales.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
        out.write("\t\t\t<link href=\"web/css/jquery.ui.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
        out.write("\t\t\t<link href=\"web/css/jquery.ui.theme.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
        out.write("\t\t\t<link href=\"web/css/jquery.validation.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t<script src=\"web/js/jquery.ui.js\" type=\"text/javascript\"></script>\r\n");
        out.write("\t\t\t<script src=\"web/js/jquery.validation.js\" type=\"text/javascript\"></script>\r\n");
        out.write("\t\t\t<script src=\"web/js/jquery.validation-en.js\" type=\"text/javascript\"></script>\r\n");
        out.write("\t\t\t<script src=\"web/js/jquery.ui.touch-punch.js\" type=\"text/javascript\"></script>\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(null);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f1(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/views/sales.jsp(81,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${billToPrint}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<h2> Bill Receipt </h2>\r\n");
        out.write("\t\t\t\t\t\t\t<table id=\"table3\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td colspan=\"4\" align=\"center\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<b>AL MEHFAL RESTAURANT<br />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderForm.billDate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("<br />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\tBill No.: ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderForm.billNum}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</b><br />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t<tr><td colspan=\"4\"><hr /></td></tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td> &nbsp;&nbsp;<b>Item</b>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t</td> <td> <b>Price</b> </td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td> <b>Qty</b> </td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td align=\"right\"> <b>Amt</b>&nbsp;&nbsp; </td>\r\n");
        out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<tr><td colspan=\"4\"><hr /></td></tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td colspan=\"3\" align=\"right\"> Total Amount: </td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td align=\"right\"> <b>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderForm.billAmount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</b>&nbsp;&nbsp; </td>\r\n");
        out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fset_005f4(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fif_005f2(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<tr><td colspan=\"4\"><hr /></td></tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td colspan=\"4\" align=\"center\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fchoose_005f1(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t\t</table>\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /WEB-INF/views/sales.jsp(88,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderForm.salesType eq 'Al-a-Carte'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\tTable No.: <b>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderForm.tableNum}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</b> &nbsp;&nbsp;\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /WEB-INF/views/sales.jsp(101,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/sales.jsp(101,8) '${orderForm.orderedItems}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${orderForm.orderedItems}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/sales.jsp(101,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("orderItem");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<td> &nbsp;&nbsp;");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderItem.itemName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" </td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderItem.itemCost}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" </td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderItem.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" </td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fset_005f3(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"right\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cost}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("&nbsp;&nbsp; </td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/views/sales.jsp(106,10) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f3.setVar("cost");
    // /WEB-INF/views/sales.jsp(106,10) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f3.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/sales.jsp(106,10) '${orderItem.quantity * orderItem.itemCost}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${orderItem.quantity * orderItem.itemCost}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f3 = _jspx_th_c_005fset_005f3.doStartTag();
    if (_jspx_th_c_005fset_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f4 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /WEB-INF/views/sales.jsp(115,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f4.setVar("discount");
    // /WEB-INF/views/sales.jsp(115,8) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f4.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/sales.jsp(115,8) '${orderForm.discount}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${orderForm.discount}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f4 = _jspx_th_c_005fset_005f4.doStartTag();
    if (_jspx_th_c_005fset_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /WEB-INF/views/sales.jsp(116,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${discount > 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<td colspan=\"3\" align=\"right\"> Discount: </td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"right\"> <b>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderForm.discount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</b>&nbsp;&nbsp; </td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<td colspan=\"3\" align=\"right\"> Total to Pay: </td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"right\"> <b>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderForm.billNetAmount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</b>&nbsp;&nbsp; </td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    int _jspx_eval_c_005fchoose_005f1 = _jspx_th_c_005fchoose_005f1.doStartTag();
    if (_jspx_eval_c_005fchoose_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
    // /WEB-INF/views/sales.jsp(130,11) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderForm.billType eq 'Credit'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
    if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a class=\"btn\" target=\"_blank\" href='");
        if (_jspx_meth_c_005furl_005f0(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("?creditId=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderForm.creditId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("'>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tPrint Complete Credit Bill Receipt\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/views/sales.jsp(131,49) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/${role}/printCreditBill", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a class=\"btn\" target=\"_blank\" href='");
        if (_jspx_meth_c_005furl_005f1(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
          return true;
        out.write("?billNum=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderForm.billNum}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("'>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tPrint Bill Receipt\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    // /WEB-INF/views/sales.jsp(136,49) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/${role}/printBill", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f1 = _jspx_th_c_005fotherwise_005f1.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<form name=\"orderForm\" id=\"orderForm\" method=\"post\" \r\n");
        out.write("\t\t\t\t\t\t\t\taction='");
        if (_jspx_meth_c_005furl_005f2(_jspx_th_c_005fotherwise_005f1, _jspx_page_context))
          return true;
        out.write("'>\r\n");
        out.write("\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<fieldset>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<legend> Restaurant Bills</legend> <br />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<table id=\"table1\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<colgroup>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<col id=\"col1\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<col id=\"col2\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<col id=\"col3\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<col id=\"col4\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</colgroup>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"right\"> Bill No <b>:</b>&nbsp; </td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input class=\"uneditable\" type=\"text\" id=\"billNum\" \r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"billNum\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderForm.billNum}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" readonly />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"right\"> Bill Date <b>:</b>&nbsp; </td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input class=\"uneditable\" type=\"text\" id=\"billDate\" \r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"billDate\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderForm.billDate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" readonly />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"right\"> Bill Amount <b>:</b>&nbsp; </td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input class=\"uneditable\" type=\"text\" id=\"billAmount\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"billAmount\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderForm.billAmount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" readonly />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"right\"> Discount <b>:</b>&nbsp; </td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"validate[required]\" id=\"billDiscount\" \r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"discount\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderForm.discount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"right\"> Net Amount <b>:</b>&nbsp; </td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td> <input class=\"uneditable\" type=\"text\" id=\"billNetAmount\" \r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"billNetAmount\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderForm.billNetAmount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" readonly />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"right\"> Created By <b>:</b>&nbsp; </td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td> <input class=\"uneditable\" type=\"text\" name=\"createdBy\" \r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderForm.createdBy}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" readonly />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"right\"> Sales Type <b>:</b>&nbsp; </td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<select name=\"salesType\" id=\"salesType\" class=\"validate[required]\" onchange=\"setTableStatus()\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option selected=\"selected\"> Al-a-Carte </option>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option> Parcel </option>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option> Bulk </option>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<script type=\"text/javascript\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#salesType\").val('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderForm.salesType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("');\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfunction setTableStatus() {\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar myselect = document.getElementById(\"salesType\");\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar myvalue = myselect.options[myselect.selectedIndex].value;\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tif(myvalue=='Parcel' || myvalue=='Bulk')\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#tableNum\").attr('disabled', true);\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\telse\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#tableNum\").attr('disabled', false);\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</script>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"right\"> Table# <b>:</b>&nbsp; </td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<select name=\"tableNum\" id=\"tableNum\" class=\"validate[required]\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option> T01 </option>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option> T02 </option>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option> T03 </option>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option> T04 </option>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option> T05 </option>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option> T06 </option>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option> T07 </option>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option> T08 </option>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"creditId\" name=\"creditId\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"billType\" name=\"billType\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<script type=\"text/javascript\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#tableNum\").val('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderForm.tableNum}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("');\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</script>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</table>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<br /> <br />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<table id=\"table2\" class=\"menuitems\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"noBorder\" align=\"right\" colspan=\"5\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"btn\" id=\"newBill\"> New Bill </div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"btn\" id=\"saveBill\"> Save Bill </div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"btn\" id=\"cancelBill\"> Cancel Bill </div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"btn\" id=\"printBill\"> Print Bill </div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"btn\" id=\"openMenu\"> Menu Items </div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<br /> <br />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th> <br />Menu Item </th>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th> <br />Price </th>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th> <br />Quantity </th>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th> Bill Line<br />Amount </th>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th> <img src=\"web/images/remove.png\" \r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"18px\" height=\"18px\" /> </th>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fotherwise_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</table>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t</fieldset>\r\n");
        out.write("\t\t\t\t\t\t\t</form>\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f1);
    // /WEB-INF/views/sales.jsp(147,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/${role}/saveOrder", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f1);
    // /WEB-INF/views/sales.jsp(254,11) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/sales.jsp(254,11) '${orderForm.orderedItems}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${orderForm.orderedItems}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/sales.jsp(254,11) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("orderItem");
    // /WEB-INF/views/sales.jsp(254,11) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td> <input type=\"text\" id=\"tag\" name=\"orderedItems[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.index}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].itemName\" \r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"uneditable\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderItem.itemName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td> <input class=\"uneditable\" type=\"text\" name=\"orderedItems[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.index}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].itemCost\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderItem.itemCost}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" readonly />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td> <input type=\"text\" id=\"qty\" name=\"orderedItems[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.index}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].quantity\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderItem.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fset_005f5(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input class=\"uneditable\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${billLineAmt}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" disabled />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"web/images/delete.png\" width=\"18px\" height=\"18px\" /> \r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f5 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /WEB-INF/views/sales.jsp(266,14) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f5.setVar("billLineAmt");
    // /WEB-INF/views/sales.jsp(266,14) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f5.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/sales.jsp(266,14) '${orderItem.itemCost * orderItem.quantity} '",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${orderItem.itemCost * orderItem.quantity} ",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f5 = _jspx_th_c_005fset_005f5.doStartTag();
    if (_jspx_th_c_005fset_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent(null);
    // /WEB-INF/views/sales.jsp(294,7) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/sales.jsp(294,7) '${pendingOrders}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pendingOrders}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/sales.jsp(294,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("orderForm");
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderForm.billNum}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" </td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderForm.billDate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" </td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderForm.billNetAmount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" </td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderForm.tableNum}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" </td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td> <input type=\"button\" value=\"Open Order\" \r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"button\" id=\"openOrder\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent(null);
    // /WEB-INF/views/sales.jsp(305,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty pendingOrders}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td colspan=\"5\" align=\"center\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\tNo pending orders\r\n");
        out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f4.setParent(null);
    // /WEB-INF/views/sales.jsp(324,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not billToPrint}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<div id=\"dishItems\">\r\n");
        out.write("\t\t\t\t<div id=\"accordion\" style=\"display:none;\">\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fforEach_005f3(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t</div>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t<div id=\"part1\" title=\"Select billing method\">\r\n");
        out.write("\t\t\t\tSelect: <select name=\"billing\" id=\"billing\" onchange=\"setBilling()\">\r\n");
        out.write("\t\t\t\t\t\t<option selected=\"selected\"> Cash </option>\r\n");
        out.write("\t\t\t\t\t\t<option> Credit </option>\r\n");
        out.write("\t\t\t\t</select> <br /> <br />\r\n");
        out.write("\t\t\t\t<span id=\"cashOrCredit\">\r\n");
        out.write("\t\t\t\t</span>\r\n");
        out.write("\t\t\t\t<script type=\"text/javascript\">\r\n");
        out.write("\t\t\t\t\tfunction setBilling() {\r\n");
        out.write("\t\t\t\t\t\tvar myselect = document.getElementById(\"billing\");\r\n");
        out.write("\t\t\t\t\t\tvar myvalue = myselect.options[myselect.selectedIndex].value;\r\n");
        out.write("\t\t\t\t\t\tif(myvalue==\"Credit\") {\r\n");
        out.write("\t\t\t\t\t\t\t$(\"span#cashOrCredit\").html(\r\n");
        out.write("\t\t\t\t\t\t\t\t'&nbsp; &nbsp; &nbsp; <input type=\"radio\" name=\"grp\" value=\"New\" /> New Customer &nbsp; <br />' + \r\n");
        out.write("\t\t\t\t\t\t\t\t'&nbsp; &nbsp; &nbsp; <input type=\"radio\" name=\"grp\" value=\"Existing\" checked /> Existing Customer');\r\n");
        out.write("\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t\telse\r\n");
        out.write("\t\t\t\t\t\t\t$(\"span#cashOrCredit\").html('');\r\n");
        out.write("\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t</script>\r\n");
        out.write("\t\t\t</div>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t<div id=\"part2\" title=\"New Customer\">\r\n");
        out.write("\t\t\t\t<table>\r\n");
        out.write("\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t<td align=\"right\"> Customer Name: </td>\r\n");
        out.write("\t\t\t\t\t\t<td> <input type=\"text\" id=\"name\" class=\"validate[required]\" /> </td>\r\n");
        out.write("\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t<td align=\"right\"> Customer Address: </td>\r\n");
        out.write("\t\t\t\t\t\t<td> <input type=\"text\" id=\"address\" class=\"validate[required]\"/> </td>\r\n");
        out.write("\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t<td align=\"right\"> Customer Mobile: </td>\r\n");
        out.write("\t\t\t\t\t\t<td> <input type=\"text\" id=\"mobile\" class=\"validate[required]\"/> </td>\r\n");
        out.write("\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t</table>\r\n");
        out.write("\t\t\t</div>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t<div id=\"part3\" title=\"Existing Customer\">\r\n");
        out.write("\t\t\t\t<table>\r\n");
        out.write("\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t<td align=\"right\"> Customer Mobile: </td>\r\n");
        out.write("\t\t\t\t\t\t<td> <input type=\"text\" id=\"verifyMobile\" /> </td>\r\n");
        out.write("\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t</table>\r\n");
        out.write("\t\t\t</div>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t<script type=\"text/javascript\">\r\n");
        out.write("\t\t\t\t$(document).ready(function () {\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t$(\"#part1\").dialog({\r\n");
        out.write("\t\t\t\t\t\tautoOpen: false,\r\n");
        out.write("\t\t\t\t\t\tresizable: false,\r\n");
        out.write("\t\t\t\t\t\twidth: 300,\r\n");
        out.write("\t\t\t\t\t\tmodal: true,\r\n");
        out.write("\t\t\t\t\t\tbuttons: {\r\n");
        out.write("\t\t\t\t\t\t\tOk: function() {\r\n");
        out.write("\t\t\t\t\t\t\t\t$(this).dialog(\"close\");\r\n");
        out.write("\t\t\t\t\t\t\t\tvar myselect1 = document.getElementById(\"billing\");\r\n");
        out.write("\t\t\t\t\t\t\t\tvar myvalue1 = myselect1.options[myselect1.selectedIndex].value;\r\n");
        out.write("\t\t\t\t\t\t\t\tif(myvalue1==\"Cash\") {\r\n");
        out.write("\t\t\t\t\t\t\t\t\tvar myselect2 = document.getElementById(\"billing\");\r\n");
        out.write("\t\t\t\t\t\t\t\t\tvar myvalue2 = myselect2.options[myselect2.selectedIndex].value;\r\n");
        out.write("\t\t\t\t\t\t\t\t\t$(\"#billType\").val(myvalue2);\r\n");
        out.write("\t\t\t\t\t\t\t\t\tvar url  = '");
        if (_jspx_meth_c_005furl_005f3(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("';\r\n");
        out.write("\t\t\t\t\t\t\t\t\t$(\"form\").attr('action', url);\r\n");
        out.write("\t\t\t\t\t\t\t\t\t$(\"form\").submit();\r\n");
        out.write("\t\t\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t\t\t\telse {\r\n");
        out.write("\t\t\t\t\t\t\t\t\tvar value = $(\"input:radio[name=grp]:checked\").val();\r\n");
        out.write("\t\t\t\t\t\t\t\t\tif(value==\"New\")\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t$(\"#part2\").dialog(\"open\");\r\n");
        out.write("\t\t\t\t\t\t\t\t\telse if(value==\"Existing\")\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t$(\"#part3\").dialog(\"open\");\r\n");
        out.write("\t\t\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t\t\t},\r\n");
        out.write("\t\t\t\t\t\t\tCancel: function() {\r\n");
        out.write("\t\t\t\t\t\t\t\t$(this).dialog(\"close\");\r\n");
        out.write("\t\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t});\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t$(\"#part2\").dialog({\r\n");
        out.write("\t\t\t\t\t\tautoOpen: false,\r\n");
        out.write("\t\t\t\t\t\tresizable: false,\r\n");
        out.write("\t\t\t\t\t\twidth: 400,\r\n");
        out.write("\t\t\t\t\t\tmodal: true,\r\n");
        out.write("\t\t\t\t\t\tbuttons: {\r\n");
        out.write("\t\t\t\t\t\t\tSave: function() {\r\n");
        out.write("\t\t\t\t\t\t\t\tvar cname = $(\"#name\").val();\r\n");
        out.write("\t\t\t\t\t\t\t\tvar caddress = $(\"#address\").val();\r\n");
        out.write("\t\t\t\t\t\t\t\tvar cmobile = $(\"#mobile\").val();\r\n");
        out.write("\t\t\t\t\t\t\t\t$.ajax({\r\n");
        out.write("\t\t\t\t\t\t\t\t\ttype: \"POST\",\r\n");
        out.write("\t\t\t\t\t\t\t\t\turl: '");
        if (_jspx_meth_c_005furl_005f4(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("\t\t\t\t\t\t\t\t\tdata: {\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\tname: cname,\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\taddress: caddress,\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\tmobile: cmobile\r\n");
        out.write("\t\t\t\t\t\t\t\t\t},\r\n");
        out.write("\t\t\t\t\t\t\t\t\tsuccess: function(msg) {\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t$(\"#name\").val(''); $(\"#address\").val('');\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t$(\"#mobile\").val(''); $(\"#part2\").dialog(\"close\");\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\tvar myselect3 = document.getElementById(\"billing\");\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\tvar myvalue3 = myselect3.options[myselect3.selectedIndex].value;\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t$(\"#billType\").val(myvalue3); alert(msg);\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t$(\"#creditId\").val(cmobile);\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\tvar url  = '");
        if (_jspx_meth_c_005furl_005f5(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("';\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t$(\"form\").attr('action', url); $(\"form\").submit();\r\n");
        out.write("\t\t\t\t\t\t\t\t\t},\r\n");
        out.write("\t\t\t\t\t\t\t\t\terror: function(error){\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\talert(' Request Status: ' + error.status + '\\n\\n Status Text: ' + error.statusText + ' ' + error.responseText);\r\n");
        out.write("\t\t\t\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t\t\t\t});\r\n");
        out.write("\t\t\t\t\t\t\t},\r\n");
        out.write("\t\t\t\t\t\t\tBack: function() {\r\n");
        out.write("\t\t\t\t\t\t\t\t$(this).dialog(\"close\");\r\n");
        out.write("\t\t\t\t\t\t\t\t$(\"#part1\").dialog(\"open\");\r\n");
        out.write("\t\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t});\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t$(\"#part3\").dialog({\r\n");
        out.write("\t\t\t\t\t\tautoOpen: false,\r\n");
        out.write("\t\t\t\t\t\tresizable: false,\r\n");
        out.write("\t\t\t\t\t\twidth: 400,\r\n");
        out.write("\t\t\t\t\t\tmodal: true,\r\n");
        out.write("\t\t\t\t\t\tbuttons: {\r\n");
        out.write("\t\t\t\t\t\t\tCheck: function() {\r\n");
        out.write("\t\t\t\t\t\t\t\tvar cmobile = $(\"#verifyMobile\").val();\r\n");
        out.write("\t\t\t\t\t\t\t\t$.ajax({\r\n");
        out.write("\t\t\t\t\t\t\t\t\ttype: \"POST\",\r\n");
        out.write("\t\t\t\t\t\t\t\t\turl: '");
        if (_jspx_meth_c_005furl_005f6(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("\t\t\t\t\t\t\t\t\tdata: {\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\tverifyMobile: cmobile\r\n");
        out.write("\t\t\t\t\t\t\t\t\t},\r\n");
        out.write("\t\t\t\t\t\t\t\t\tsuccess: function(msg) {\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t$(\"#verifyMobile\").val(''); alert(msg);\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\tif(msg!='') {\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\tvar myselect4 = document.getElementById(\"billing\");\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\tvar myvalue4 = myselect4.options[myselect4.selectedIndex].value;\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"#billType\").val(myvalue4);\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"#creditId\").val(cmobile);\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"#part3\").dialog(\"close\");\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\tvar url = '");
        if (_jspx_meth_c_005furl_005f7(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("';\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"form\").attr('action', url); $(\"form\").submit();\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t\t\t\t\t},\r\n");
        out.write("\t\t\t\t\t\t\t\t\terror: function(error){\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\talert(' Request Status: ' + error.status + '\\n\\n Status Text: ' + error.statusText + ' ' + error.responseText);\r\n");
        out.write("\t\t\t\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t\t\t\t});\r\n");
        out.write("\t\t\t\t\t\t\t},\r\n");
        out.write("\t\t\t\t\t\t\tBack: function() {\r\n");
        out.write("\t\t\t\t\t\t\t\t$(this).dialog(\"close\");\r\n");
        out.write("\t\t\t\t\t\t\t\t$(\"#part1\").dialog(\"open\");\r\n");
        out.write("\t\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t});\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t$(\"#dishItems\").dialog({\r\n");
        out.write("\t\t\t\t\t\tautoOpen: false,\r\n");
        out.write("\t\t\t\t\t\ttitle: 'Menu Items',\r\n");
        out.write("\t\t\t\t\t\thide: 'slide',\r\n");
        out.write("\t\t\t\t\t\twidth:500,\r\n");
        out.write("\t\t\t\t\t\tcloseOnEscape: true,\r\n");
        out.write("\t\t\t\t\t\tresizable: true,\r\n");
        out.write("\t\t\t\t\t\tmodal: false,\r\n");
        out.write("\t\t\t\t\t\tshow: 'slide',\r\n");
        out.write("\t\t\t\t\t\topen : function (event, ui) {\r\n");
        out.write("\t\t\t\t\t\t\t$(\"#accordion\").css('display','block');\r\n");
        out.write("\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t});\r\n");
        out.write("\t\t\t\t\t$(\"#dishItems\").dialog(\"widget\").draggable(\"option\",\"containment\",\"none\");\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t$(\"#accordion\").accordion({\r\n");
        out.write("\t\t\t\t\t\tcollapsible: true,\r\n");
        out.write("\t\t\t\t\t\theightStyle: \"content\"\r\n");
        out.write("\t\t\t\t\t});\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\tfunction calculateBill() {\r\n");
        out.write("\t\t\t\t\t\tvar sum = 0.00;\r\n");
        out.write("\t\t\t\t\t\t$('.menuitems tr').each(function() {\r\n");
        out.write("\t\t\t\t\t\t\tif(this.rowIndex > 1)\r\n");
        out.write("\t\t\t\t\t\t\t\tvar cost = 0;\r\n");
        out.write("\t\t\t\t\t\t\t\tcost = $(this).find(\"td\").eq(3).find('input').val();\r\n");
        out.write("\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\tif(cost=='' || isNaN(cost))\r\n");
        out.write("\t\t\t\t\t\t\t\t\tcost = 0.00;\r\n");
        out.write("\t\t\t\t\t\t\t\telse\r\n");
        out.write("\t\t\t\t\t\t\t\t\tcost = parseFloat(cost);\r\n");
        out.write("\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\tsum += cost;\r\n");
        out.write("\t\t\t\t\t\t});\r\n");
        out.write("\t\r\n");
        out.write("\t\t\t\t\t\t$('#billAmount').val(sum);\r\n");
        out.write("\t\t\t\t\t\tvar discount = $('#billDiscount').val();\r\n");
        out.write("\t\t\t\t\t\tif(isNaN(discount))\r\n");
        out.write("\t\t\t\t\t\t\tdiscount = 0;\r\n");
        out.write("\t\t\t\t\t\telse\r\n");
        out.write("\t\t\t\t\t\t\tdiscount = parseFloat(discount);\r\n");
        out.write("\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t$('#billNetAmount').val(sum - discount);\r\n");
        out.write("\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t$(document).on(\"keyup\", \"input#billDiscount\", function() {\r\n");
        out.write("\t\t\t\t\t\tcalculateBill();\r\n");
        out.write("\t\t\t\t\t});\r\n");
        out.write("\t\r\n");
        out.write("\t\t\t\t\t$(document).on(\"keyup\", \"input#qty\", function() {\r\n");
        out.write("\t\t\t\t\t\tvar quantity = $(this).val();\r\n");
        out.write("\t\t\t\t\t\tvar cost = $(this).parent().prev().find(\"input\").eq(0).val();\r\n");
        out.write("\t\t\t\t\t\t$(this).parent().next().find(\"input\").eq(0).val(quantity*cost);\r\n");
        out.write("\t\t\t\t\t\tcalculateBill();\r\n");
        out.write("\t\t\t\t\t});\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t$(\"#orderForm\").validationEngine('attach', {\r\n");
        out.write("\t\t\t\t\t\tonValidationComplete: function(form, status) {\r\n");
        out.write("\t\t\t\t\t\t\tif(status == true) {\r\n");
        out.write("\t\t\t\t\t\t\t\tif($('.menuitems tr').length <= 2) {\r\n");
        out.write("\t\t\t\t\t\t\t\t\talert(\"There should be atleast one item to order\");\r\n");
        out.write("\t\t\t\t\t\t\t\t\treturn false;\r\n");
        out.write("\t\t\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t\t\t\tcalculateBill();\r\n");
        out.write("\t\t\t\t\t\t\t\t$('.menuitems tr').each(function(index) {\r\n");
        out.write("\t\t\t\t\t\t\t\t\tif(index > 1) {\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\tvar one = $(this).find(\"td\").eq(0).find('input').eq(0);\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\tvar newName = one.attr('name').replace(/\\[[0-9]+\\]/i, '[' + (index-2) + ']');\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\tone.attr('name', newName);\r\n");
        out.write("\t\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\tvar two = $(this).find(\"td\").eq(1).find('input').eq(0);\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\tnewName = two.attr('name').replace(/\\[[0-9]+\\]/i, '[' + (index-2) + ']');\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\ttwo.attr('name', newName);\r\n");
        out.write("\t\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\tvar three = $(this).find(\"td\").eq(2).find('input').eq(0);\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\tnewName = three.attr('name').replace(/\\[[0-9]+\\]/i, '[' + (index-2) + ']');\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\tthree.attr('name', newName);\r\n");
        out.write("\t\t\t\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t\t\t\t});\r\n");
        out.write("\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\tif($.trim($(\"#billNum\").val()) == '')\r\n");
        out.write("\t\t\t\t\t\t\t\t\t$(\"#billNum\").val(0);\r\n");
        out.write("\t\t\t\t\t\t\t\treturn true;\r\n");
        out.write("\t\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t\t\treturn false;\r\n");
        out.write("\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t});\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t$(document).on(\"click\", \"div#menuButton\", function(event) {\r\n");
        out.write("\t\t\t\t\t\tevent.preventDefault();\r\n");
        out.write("\t\t\t\t\t\tvar value = $(this).attr('class');\r\n");
        out.write("\t\t\t\t\t\tvar name = $(this).html();\r\n");
        out.write("\t\t\t\t\t\tvar flag = false;\r\n");
        out.write("\t\r\n");
        out.write("\t\t\t\t\t\t$('.menuitems tr').each(function(index) {\r\n");
        out.write("\t\t\t\t\t\t\tif(index > 1) {\r\n");
        out.write("\t\t\t\t\t\t\t\tvar itemData = $(this).find(\"td\").eq(0).find('input').eq(0).val();\r\n");
        out.write("\t\t\t\t\t\t\t\tif(itemData == name) {\r\n");
        out.write("\t\t\t\t\t\t\t\t\tvar itemDataQty = $(this).find(\"td\").eq(2).find('input').eq(0).val();\r\n");
        out.write("\t\t\t\t\t\t\t\t\tvar Qty = 1;\r\n");
        out.write("\t\t\t\t\t\t\t\t\tif(itemDataQty!='' || itemDataQty!=null)\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\tQty = parseInt(itemDataQty) + 1;\r\n");
        out.write("\t\t\t\t\t\t\t\t\t$(this).find(\"td\").eq(2).find('input').eq(0).val(Qty);\r\n");
        out.write("\t\t\t\t\t\t\t\t\t$(this).find(\"td\").eq(3).find('input').eq(0).val(Qty*parseFloat(value));\r\n");
        out.write("\t\t\t\t\t\t\t\t\tflag = true;\r\n");
        out.write("\t\t\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t\t});\r\n");
        out.write("\t\r\n");
        out.write("\t\t\t\t\t\tif(flag==false) {\r\n");
        out.write("\t\t\t\t\t\t\tvar index = $('.menuitems tr').length - 2;\r\n");
        out.write("\t\t\t\t\t\t\t$(\".menuitems\")\r\n");
        out.write("\t\t\t\t\t\t\t\t.find('tbody')\r\n");
        out.write("\t\t\t\t\t\t\t\t.append('<tr>' +\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t'<td> <input type=\"text\" size=\"18\" id=\"tag\" ' + \r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t'class=\"uneditable\" ' +\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t'value=\"' + name + '\" ' +  \r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t'name=\"orderedItems[' + index + '].itemName\" readonly /> ' +\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t'</td>' +\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t'<td> <input class=\"uneditable\" type=\"text\" ' + \r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t'size=\"8\" name=\"orderedItems[' + index + '].itemCost\" ' +\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t'value=\"' + value + '\" ' +\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t'readonly /> ' + \r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t'</td>' +\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t'<td> <input type=\"text\" size=\"8\" id=\"qty\" '+ \r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t'class=\"validate[required,custom[integer],min[1]]\" ' +\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t'value=\"1\" ' +\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t'name=\"orderedItems[' + index + '].quantity\" /> ' + \r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t'</td>' +\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t'<td> <input class=\"uneditable\" type=\"text\" ' +\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t'value=\"' + value + '\" ' +\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t'size=\"8\" disabled /> ' + \r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t'</td>' +\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t'<td> <img src=\"web/images/delete.png\" '+  \r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t'width=\"18px\" height=\"18px\" />' + \r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t'</td>' +\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t'</tr>');\r\n");
        out.write("\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t\tcalculateBill();\r\n");
        out.write("\t\t\t\t\t});\r\n");
        out.write("\t\r\n");
        out.write("\t\t\t\t\t$(document).on(\"click\", \".menuitems tbody tr td img\", function(event) {\r\n");
        out.write("\t\t\t\t\t\tvar index = $('.menuitems tr').length - 2;\r\n");
        out.write("\t\t\t\t\t\tif(index <= 0) {\r\n");
        out.write("\t\t\t\t\t\t\talert(\"Order must contain atleast one menu item\");\r\n");
        out.write("\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t\telse {\r\n");
        out.write("\t\t\t\t\t\t\tvar removeConfirm = confirm(\"Are you sure do you want to remove?\");\r\n");
        out.write("\t\t\t\t\t\t\tif(removeConfirm == true) {\r\n");
        out.write("\t\t\t\t\t\t\t\tvar row = $(this).parent().parent();\r\n");
        out.write("\t\t\t\t\t\t\t\trow.remove();\r\n");
        out.write("\t\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t});\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t$(document).on(\"mousedown\", \"div#menuButton\", function(event) {\r\n");
        out.write("\t\t\t\t\t\tevent.preventDefault();\r\n");
        out.write("\t\t\t\t\t\t$(this).css({'border': '2px inset #cccccc'});\r\n");
        out.write("\t\t\t\t\t\t$(this).css({'background': '#8fca10'});\r\n");
        out.write("\t\t\t\t\t});\r\n");
        out.write("\t\r\n");
        out.write("\t\t\t\t\t$(document).on(\"mouseup\", \"div#menuButton\", function(event) {\r\n");
        out.write("\t\t\t\t\t\tevent.preventDefault();\r\n");
        out.write("\t\t\t\t\t\t$(this).css({'border': '2px outset #cccccc'});\r\n");
        out.write("\t\t\t\t\t\t$(this).css({'background': '#d5d5d5'});\r\n");
        out.write("\t\t\t\t\t});\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t$(\"#openMenu\").click(function(event) {\r\n");
        out.write("\t\t\t\t\t\tevent.preventDefault();\r\n");
        out.write("\t\t\t\t\t\t$(\"#dishItems\").dialog('option','position',[event.clientX, event.clientY]);\r\n");
        out.write("\t\t\t\t\t\t$(\"#dishItems\").dialog(\"open\");\r\n");
        out.write("\t\t\t\t\t});\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t$(\"#saveBill\").click(function() {\r\n");
        out.write("\t\t\t\t\t\t$(\"form\").submit();\r\n");
        out.write("\t\t\t\t\t});\r\n");
        out.write("\t\r\n");
        out.write("\t\t\t\t\t$(\"#newBill\").click(function() {\r\n");
        out.write("\t\t\t\t\t\tvar newBillConfirm = confirm(\"Do you want to save the changes in current order?\");\r\n");
        out.write("\t\t\t\t\t\tif(newBillConfirm == true)\r\n");
        out.write("\t\t\t\t\t\t\t$(\"form\").submit();\r\n");
        out.write("\t\t\t\t\t\telse {\r\n");
        out.write("\t\t\t\t\t\t\tvar url = '");
        if (_jspx_meth_c_005furl_005f8(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("';\r\n");
        out.write("\t\t\t\t\t\t\twindow.top.location = url;\r\n");
        out.write("\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t});\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t$(\"#cancelBill\").click(function() {\r\n");
        out.write("\t\t\t\t\t\tvar cancelBillConfirm = confirm(\"Do you want to cancel the order?\");\r\n");
        out.write("\t\t\t\t\t\tif(cancelBillConfirm == true) {\r\n");
        out.write("\t\t\t\t\t\t\tvar url = '");
        if (_jspx_meth_c_005furl_005f9(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("' + '?value=' + $(\"#billNum\").val();\r\n");
        out.write("\t\t\t\t\t\t\twindow.top.location = url;\r\n");
        out.write("\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t});\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t$(\"#printBill\").click(function() {\r\n");
        out.write("\t\t\t\t\t\t$(\"#part1\").dialog(\"open\");\r\n");
        out.write("\t\t\t\t\t});\r\n");
        out.write("\t\r\n");
        out.write("\t\t\t\t\t$(document).on(\"click\", \"input#openOrder\", function() {\r\n");
        out.write("\t\t\t\t\t\tvar row = $(this).parent().parent();\r\n");
        out.write("\t\t\t\t\t\tvar value = row.find('td').eq(0).html();\r\n");
        out.write("\t\t\t\t\t\tvar url = '");
        if (_jspx_meth_c_005furl_005f10(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("' + '?bill=' + $.trim(value);\r\n");
        out.write("\t\t\t\t\t\talert(\"Order with bill number '\" + value + \"' will be opened\");\r\n");
        out.write("\t\t\t\t\t\twindow.top.location = url;\r\n");
        out.write("\t\t\t\t\t});\r\n");
        out.write("\t\t\t\t});\r\n");
        out.write("\t\t\t</script>\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/views/sales.jsp(327,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/sales.jsp(327,5) '${dishItems}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${dishItems}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/sales.jsp(327,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setVar("cateory");
    int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
      if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<h3>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cateory.description}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</h3>\r\n");
          out.write("\t\t\t\t\t\t<div>\r\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fforEach_005f4(_jspx_th_c_005fforEach_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f3.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f3);
    // /WEB-INF/views/sales.jsp(330,7) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/sales.jsp(330,7) '${cateory.dishItems}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${cateory.dishItems}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/sales.jsp(330,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setVar("item");
    int[] _jspx_push_body_count_c_005fforEach_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f4 = _jspx_th_c_005fforEach_005f4.doStartTag();
      if (_jspx_eval_c_005fforEach_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<div id=\"menuButton\" class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.itemCost}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.itemName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" </div>\r\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f4.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/views/sales.jsp(403,21) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/${role}/printOrder", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/views/sales.jsp(433,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f4.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/${role}/addCustomer", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
    if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/views/sales.jsp(446,22) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f5.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/${role}/printOrder", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f5 = _jspx_th_c_005furl_005f5.doStartTag();
    if (_jspx_th_c_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/views/sales.jsp(471,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f6.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/${role}/verifyCustomer", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f6 = _jspx_th_c_005furl_005f6.doStartTag();
    if (_jspx_th_c_005furl_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/views/sales.jsp(483,22) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f7.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/${role}/printOrder", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f7 = _jspx_th_c_005furl_005f7.doStartTag();
    if (_jspx_th_c_005furl_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f8 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/views/sales.jsp(681,18) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f8.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/${role}/sales", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f8 = _jspx_th_c_005furl_005f8.doStartTag();
    if (_jspx_th_c_005furl_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f8);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f9 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/views/sales.jsp(689,18) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f9.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/${role}/cancelOrder", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f9 = _jspx_th_c_005furl_005f9.doStartTag();
    if (_jspx_th_c_005furl_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f9);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f10 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/views/sales.jsp(701,17) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f10.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/${role}/openOrder", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f10 = _jspx_th_c_005furl_005f10.doStartTag();
    if (_jspx_th_c_005furl_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f10);
    return false;
  }
}
