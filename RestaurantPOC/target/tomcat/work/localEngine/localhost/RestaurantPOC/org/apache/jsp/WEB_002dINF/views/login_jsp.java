package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>AL MEHFAL Restaurant</title>\r\n");
      out.write("\t\t<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"web/css/jquery.vegas.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"web/css/styles.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"web/js/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"web/js/jquery.vegas.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t$( function() {\r\n");
      out.write("\t\t\t\t$.vegas( 'slideshow', {\r\n");
      out.write("\t\t\t\t\tdelay: 8000,\r\n");
      out.write("\t\t\t\t\tbackgrounds: [\r\n");
      out.write("\t\t\t\t\t\t{ src: 'web/images/bkg/al-mehfal (1).jpg',  fade: 3000 },\r\n");
      out.write("\t\t\t\t\t\t{ src: 'web/images/bkg/al-mehfal (2).jpg',  fade: 3000 },\r\n");
      out.write("\t\t\t\t\t\t{ src: 'web/images/bkg/al-mehfal (3).jpg',  fade: 3000 },\r\n");
      out.write("\t\t\t\t\t\t{ src: 'web/images/bkg/al-mehfal (4).jpg',  fade: 3000 },\r\n");
      out.write("\t\t\t\t\t\t{ src: 'web/images/bkg/al-mehfal (5).jpg',  fade: 3000 },\r\n");
      out.write("\t\t\t\t\t\t{ src: 'web/images/bkg/al-mehfal (6).jpg',  fade: 3000 },\r\n");
      out.write("\t\t\t\t\t\t{ src: 'web/images/bkg/al-mehfal (7).jpg',  fade: 3000 },\r\n");
      out.write("\t\t\t\t\t\t{ src: 'web/images/bkg/al-mehfal (8).jpg',  fade: 3000 },\r\n");
      out.write("\t\t\t\t\t\t{ src: 'web/images/bkg/al-mehfal (9).jpg',  fade: 3000 },\r\n");
      out.write("\t\t\t\t\t\t{ src: 'web/images/bkg/al-mehfal (10).jpg', fade: 3000 },\r\n");
      out.write("\t\t\t\t\t\t{ src: 'web/images/bkg/al-mehfal (11).jpg', fade: 3000 },\r\n");
      out.write("\t\t\t\t\t\t{ src: 'web/images/bkg/al-mehfal (12).jpg', fade: 3000 },\r\n");
      out.write("\t\t\t\t\t\t{ src: 'web/images/bkg/al-mehfal (13).jpg', fade: 3000 },\r\n");
      out.write("\t\t\t\t\t\t{ src: 'web/images/bkg/al-mehfal (14).jpg', fade: 3000 }\r\n");
      out.write("\t\t\t\t\t]\r\n");
      out.write("\t\t\t\t})('overlay');\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$(\"#menu_wrap\").fadeTo(\"fast\", 0.80);\r\n");
      out.write("\t\t\t\t$(\"#main_wrap\").fadeTo(\"fast\", 0.80);\r\n");
      out.write("\t\t\t\t$(\"#footer\").fadeTo(\"fast\", 0.80);\r\n");
      out.write("\t\t    });\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("\t\t\t#table1 {\r\n");
      out.write("\t\t\t\tpadding: 15px;\r\n");
      out.write("\t\t\t\twidth: 270px;\r\n");
      out.write("\t\t\t\tfont-size: 16px;\r\n");
      out.write("\t\t\t\tfont-weight: normal;\r\n");
      out.write("\t\t\t\tbackground: black;\r\n");
      out.write("\t\t\t\tborder: 1px thin #ccc;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t#table1 td {\r\n");
      out.write("\t\t\t\twidth: 270px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t#loginTitle {\r\n");
      out.write("\t\t\t\tpadding-bottom: 15px;\r\n");
      out.write("\t\t\t\tfont-size: 16px;\r\n");
      out.write("\t\t\t\theight: 16px;\r\n");
      out.write("\t\t\t\ttext-align: right;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t#loginId, #loginPwd {\r\n");
      out.write("\t\t\t\tfont-size: 13px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t#loginMsg {\r\n");
      out.write("\t\t\t\ttext-align: center;\r\n");
      out.write("\t\t\t\tfont-size: 13px;\r\n");
      out.write("\t\t\t\tmargin-bottom: 8px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t#loginIdInput input, #loginPwdInput input {\r\n");
      out.write("\t\t\t\twidth: 100%;\r\n");
      out.write("\t\t\t\theight: 24px;\r\n");
      out.write("\t\t\t\tfont-size: 16px;\r\n");
      out.write("\t\t\t\tline-height: 24px;\r\n");
      out.write("\t\t\t\tborder: 1px solid #999;\r\n");
      out.write("\t\t\t\toutline: medium none;\r\n");
      out.write("\t\t\t\tbox-shadow: 0px 1px 2px #aaa inset;\r\n");
      out.write("\t\t\t\tmargin-bottom: 8px;\r\n");
      out.write("\t\t\t\tpadding-left: 2px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t#loginIdInput input:focus , #loginPwdInput input:focus {\r\n");
      out.write("\t\t\t\tborder: 1px solid #8769ed;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div id=\"wrapper\">\r\n");
      out.write("\t\t\t<div id=\"menu_wrap\">\r\n");
      out.write("\t\t\t\t<div id=\"menu\">\r\n");
      out.write("\t\t\t\t\t<div id=\"logo\">   \r\n");
      out.write("\t\t\t\t\t\t<h1><a href=\"#home\" class=\"logo_image menubtn\">Al Mehfal Restaurant</a></h1>      \r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<ul id=\"navbar\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"top_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t<a id=\"blog\" href=\"#menu\" class=\"menubtn\">\r\n");
      out.write("\t\t\t\t\t\t\t\tMenu<span>Delicious Hyderabadi Cuisine</span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"top_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t<a id=\"contact\" href=\"#about\" class=\"menubtn\">\r\n");
      out.write("\t\t\t\t\t\t\t\tAbout<span>Contact + Other Information</span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=\"restinfo\">\r\n");
      out.write("\t\t\t\t\t\t<h2 class=\"padtop\" id=\"phone\"><span style=\"font-size:12px;\">Call:</span> 07-2223700</h2>\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"padtop\" style=\"color:#ccc\">12PM Noon to Midnight</h4>\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"padtop\" style=\"font-size:11px;\">Oman Road, Shell Pump Area, Ras Al Khaimah</h4>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"hide_menu\">\r\n");
      out.write("\t\t    \t\t\t<a href=\"#\" class=\"menu_visible\">Hide menu</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"menu_tooltip\">\r\n");
      out.write("\t\t\t\t\t\t<p>Hide the navigation</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"main_wrap\">\r\n");
      out.write("\t\t\t\t<div id=\"homepg\" class=\"maincontent\">\r\n");
      out.write("\t\t\t\t\t<h2 class=\"section_title\">Al-Mehfal Restaurant</h2>\r\n");
      out.write("\t\t\t\t\t<div id=\"content\" style=\"width:280px;float:right;\">\r\n");
      out.write("\t\t\t\t\t\t<form id=\"login_form\" method=\"post\" action=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t<table id=\"table1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td id=\"loginTitle\"> Portal Login </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td id=\"loginId\"> Login ID: </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td id=\"loginIdInput\"> <input type=\"text\" name=\"username\" id=\"username\" /> </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td id=\"loginPwd\"> Password </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td id=\"loginPwdInput\"> <input type=\"password\" name=\"password\" id=\"password\" /> </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td id=\"loginMsg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"right\"> <input type=\"image\" src=\"web/images/login.gif\" /> </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"menupg\" class=\"maincontent\">\r\n");
      out.write("\t\t\t\t\t<h2 class=\"section_title\">Menu</h2>\r\n");
      out.write("\t\t\t\t\t<div id=\"content\" class=\"content_full_width\">\r\n");
      out.write("\t\t\t\t\t\t<table id=\"hor-minimalist-b\" summary=\"Menu\">\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"aboutpg\" class=\"maincontent\">\r\n");
      out.write("\t\t\t\t\t<h2 class=\"section_title\">About</h2>\r\n");
      out.write("\t\t\t\t\t<div id=\"content\" class=\"content_full_width\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\t\t<div id=\"footer_info\">\r\n");
      out.write("\t\t\t\t\t<p class=\"copyright\">&copy; 2013, Al Mehfal Restaurant, All Rights Reserved</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"web/js/custom.js\"></script>\r\n");
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

  private boolean _jspx_meth_c_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/views/login.jsp(131,50) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/validate");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
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
    // /WEB-INF/views/login.jsp(150,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty param.error}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<font color=\"#ed2836\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tLogin error: ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope[\"SPRING_SECURITY_LAST_EXCEPTION\"].message}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</font>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
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
}
