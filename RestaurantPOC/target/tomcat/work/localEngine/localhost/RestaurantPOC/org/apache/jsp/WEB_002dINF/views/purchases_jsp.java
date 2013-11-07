package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class purchases_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAnyGranted;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAnyGranted = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAnyGranted.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\t\t<title>HomePage - Al Mehfal Restaurant</title>\r\n");
      out.write("\t\t<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"web/css/common.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("\t\t<link href=\"web/css/jquery.validation.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t\t<link href=\"web/css/jquery.ui.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t\t<link href=\"web/css/theme.blue.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script src=\"web/js/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"web/js/jquery.tablesorter.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"web/js/jquery.ui.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"web/js/jquery.validation.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"web/js/jquery.validation-en.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"web/js/jquery.ui.touch-punch.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("\t\t\t#table1 {\r\n");
      out.write("\t\t\t\tborder: none;\r\n");
      out.write("\t\t\t\tborder-collapse: collapse;\r\n");
      out.write("\t\t\t\tmargin-left: 30px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#table1 tr td {\r\n");
      out.write("\t\t\t\tpadding: 3px;\r\n");
      out.write("\t\t\t\tborder: none;\r\n");
      out.write("\t\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#table1 tr td input[type=\"text\"] {\r\n");
      out.write("\t\t\t\tfont-family: \"Arial\";\r\n");
      out.write("\t\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\t\theight: 19px;\r\n");
      out.write("\t\t\t\tline-height: 18px;\r\n");
      out.write("\t\t\t\tcolor: black;\r\n");
      out.write("\t\t\t\tbackground-color: white;\r\n");
      out.write("\t\t\t\tborder: 2px inset #cccccc;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#table1 tr td input[type=\"text\"].uneditable {\r\n");
      out.write("\t\t\t\tbackground-color: #aaa;\r\n");
      out.write("\t\t\t\tcolor: black;\r\n");
      out.write("\t\t\t\tborder: 2px inset #cccccc;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tdiv#menuButton {\r\n");
      out.write("\t\t\t\tdisplay: inline-block;\r\n");
      out.write("\t\t\t\tcolor: black;\r\n");
      out.write("\t\t\t\ttext-align: center;\r\n");
      out.write("\t\t\t\tborder: 2px outset #cccccc;\r\n");
      out.write("\t\t\t\tbackground: #d5d5d5;\r\n");
      out.write("\t\t\t\tpointer: cursor;\r\n");
      out.write("\t\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\t\tfont-family: Arial;\r\n");
      out.write("\t\t\t\tcursor: pointer;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tdiv#menuButton:hover {\r\n");
      out.write("\t\t\t\tbackground: #b5b5b5;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#table2 {\r\n");
      out.write("\t\t\t\tmargin-left: 30px;\r\n");
      out.write("\t\t\t\tborder: 1px solid #aaa;\r\n");
      out.write("\t\t\t\tborder-collapse: collapse;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#table2 tr th {\r\n");
      out.write("\t\t\t\tbackground: #629cd7;\r\n");
      out.write("\t\t\t\tcolor: white;\r\n");
      out.write("\t\t\t\ttext-align: center;\r\n");
      out.write("\t\t\t\tfont-size: 13px;\r\n");
      out.write("\t\t\t\tline-height: 19px;\r\n");
      out.write("\t\t\t\tfont-weight: bold;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#table2 tr td {\r\n");
      out.write("\t\t\t\tpadding: 2px;\r\n");
      out.write("\t\t\t\tborder: 1px solid #aaa;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#table2 tr td.noBorder {\r\n");
      out.write("\t\t\t\tborder: none;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#table2 tr td img {\r\n");
      out.write("\t\t\t\tcursor: pointer;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#table2 tr td input[type=\"text\"] {\r\n");
      out.write("\t\t\t\tfont-family: \"Arial\";\r\n");
      out.write("\t\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\t\theight: 19px;\r\n");
      out.write("\t\t\t\tline-height: 18px;\r\n");
      out.write("\t\t\t\tcolor: black;\r\n");
      out.write("\t\t\t\tbackground-color: white;\r\n");
      out.write("\t\t\t\tborder: 2px inset #cccccc;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#table2 tr td input[type=\"text\"].uneditable {\r\n");
      out.write("\t\t\t\tbackground-color: #aaa;\r\n");
      out.write("\t\t\t\tcolor: black;\r\n");
      out.write("\t\t\t\tborder: 2px inset #cccccc;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#table4 {\r\n");
      out.write("\t\t\t\tborder-collapse: collapse;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#table4 tr td,\r\n");
      out.write("\t\t\t#table4 tr th {\r\n");
      out.write("\t\t\t\tpadding: 5px;\r\n");
      out.write("\t\t\t\ttext-align: left;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.tablesorter tbody tr td {\r\n");
      out.write("\t\t\t\tfont-size: 13px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.tablesorter thead tr th {\r\n");
      out.write("\t\t\t\tfont-size: 14px;\r\n");
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp" + (("menu.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("current", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("1", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"content_2columns\">\r\n");
      out.write("\t\t\t\t<h1> New Purchases </h1>\r\n");
      out.write("\t\t\t\t<br /><br />\r\n");
      out.write("\t\t\t\t<form name=\"purchases\" id=\"purchases\" method=\"post\" action='");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("'>\r\n");
      out.write("\t\t\t\t\t<table id=\"table1\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"right\"> GRN <b>:</b> &nbsp; </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td> <input class=\"uneditable\" type=\"text\" name=\"grp\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchases.grnNo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" readonly /> </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"right\"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Invoice Date <b>:</b> &nbsp; </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td> <input type=\"text\" id=\"invoiceDate\" name=\"invoiceDate\" readonly \r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchases.invoiceDate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"validate[required]\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"right\"> Date of Purchase <b>:</b> &nbsp; </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td> <input type=\"text\" id=\"purchaseDate\" name=\"purchaseDate\" class=\"validate[required]\" /> </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"right\"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Invoice Amount <b>:</b> &nbsp; </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td> <input class=\"validate[required] uneditable\" type=\"text\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"invoiceAmount\" name=\"invoiceAmount\" readonly /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"right\"> Supplier# <b>:</b> &nbsp; </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"supplierNum\" id=\"supplierNum\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"validate[required]\" placeHolder=\"SUPPLIER_NO\" readonly />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"menuButton\">&nbsp; ... &nbsp; </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"supplierName\" id=\"supplierName\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"validate[required]\" placeHolder=\"SUPPLIER_NAME\" readonly />\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"right\"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Paid Amount <b>:</b> &nbsp; </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td> <input class=\"validate[required]\" type=\"text\" name=\"paidAmount\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"right\"> Invoice No. <b>:</b> &nbsp; </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td> <input type=\"text\" name=\"invoiceNum\" class=\"validate[required]\" /> </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"right\"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Created On <b>:</b> &nbsp; </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td> <input class=\"uneditable\"  type=\"text\" name=\"createdOn\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchases.createdOn}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" readonly /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"right\"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Created By <b>:</b> &nbsp; </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td> <input type=\"text\" name=\"createdBy\" class=\"uneditable\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchases.createdBy}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" readonly /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table> <br /> <br />\r\n");
      out.write("\t\t\t\t\t<table id=\"table2\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Raw<br />Marerial ID</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th></th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Raw Marerial<br />Description</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Unit of<br />Measure</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th><br />Quantity</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th><br />Amount</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th></th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td> <input type=\"text\" name=\"materials[0].rawMaterialId\" class=\"validate[required]\" /> </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td> <div id=\"menuButton\"> &nbsp; ... &nbsp; </div> </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td> <input type=\"text\" name=\"materials[0].rawMaterialDesc\" class=\"validate[required]\" /> </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td> <input type=\"text\" name=\"materials[0].rawMaterialUom\" class=\"validate[required]\" /> </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td> <input type=\"text\" name=\"materials[0].rawMaterialQty\" class=\"validate[required,custom[integer]]\" /> </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td> <input type=\"text\" id=\"materialAmount\" name=\"materials[0].rawMaterialAmount\" class=\"validate[required,custom[number]]\" /> </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td> <img src=\"web/images/delete.png\" width=\"20px\" height=\"20px\" /> </td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"5\" class=\"noBorder\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td> <input type=\"text\" class=\"uneditable\" id=\"totalAmt\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"totalAmount\" readonly /> </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"noBorder\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"7\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input id=\"addRow\" type=\"button\" value=\"  Add Row \" /> &nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"  Save  \" /> &nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" value=\"  New  \" />\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\t\t<div id=\"footer_info\">\r\n");
      out.write("\t\t\t\t\t<p class=\"copyright\">&copy; 2013, Al Mehfal Restaurant, All Rights Reserved</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"dialog\">\r\n");
      out.write("\t\t\t<table id=\"table4\">\r\n");
      out.write("\t\t\t\t<thead><tr>\r\n");
      out.write("\t\t\t\t\t<th>Supplier No.</th>\r\n");
      out.write("\t\t\t\t\t<th>Supplier Name </th>\r\n");
      out.write("\t\t\t\t\t<th> Invoice Amount </th>\r\n");
      out.write("\t\t\t\t\t<th> </th>\r\n");
      out.write("\t\t\t\t</tr></thead>\r\n");
      out.write("\t\t\t\t<tbody>");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"dialog1\">\r\n");
      out.write("\t\t\t<table id=\"table4\" class=\"tablesorter\">\r\n");
      out.write("\t\t\t\t<thead><tr>\r\n");
      out.write("\t\t\t\t\t<th> Raw Material ID </th>\r\n");
      out.write("\t\t\t\t\t<th> Raw Material Name </th>\r\n");
      out.write("\t\t\t\t\t<th> Unit of Measure </th>\r\n");
      out.write("\t\t\t\t\t<th> </th>\r\n");
      out.write("\t\t\t\t</tr></thead>\r\n");
      out.write("\t\t\t\t<tbody>");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t\t$(\".tablesorter\").tablesorter({ theme : 'blue'});\r\n");
      out.write("\t\t\t\t$(\"#invoiceDate\").datepicker({\r\n");
      out.write("\t\t\t\t\tdateFormat: 'yy-mm-dd',\r\n");
      out.write("\t\t\t\t\tchangeMonth: true,\r\n");
      out.write("\t\t\t\t\tchangeYear: true,\r\n");
      out.write("\t\t\t\t\tshowWeek: true,\r\n");
      out.write("\t\t\t\t\tfirstDay: 1\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#purchaseDate\").datepicker({\r\n");
      out.write("\t\t\t\t\tdateFormat: 'yy-mm-dd',\r\n");
      out.write("\t\t\t\t\tchangeMonth: true,\r\n");
      out.write("\t\t\t\t\tchangeYear: true,\r\n");
      out.write("\t\t\t\t\tshowWeek: true,\r\n");
      out.write("\t\t\t\t\tfirstDay: 1\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#dialog\").dialog({\r\n");
      out.write("\t\t\t\t\tautoOpen: false,\r\n");
      out.write("\t\t\t\t\ttitle: 'Suppliers List',\r\n");
      out.write("\t\t\t\t\thide: 'slide',\r\n");
      out.write("\t\t\t\t\twidth: 450,\r\n");
      out.write("\t\t\t\t\theight: 350,\r\n");
      out.write("\t\t\t\t\tcloseOnEscape: true,\r\n");
      out.write("\t\t\t\t\tresizable: true,\r\n");
      out.write("\t\t\t\t\tmodal: false,\r\n");
      out.write("\t\t\t\t\tshow: 'slide',\r\n");
      out.write("\t\t\t\t\topen : function (event, ui) {\r\n");
      out.write("\t\t\t\t\t\t$(\"#accordion\").css('display','block');\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t$(\"#dialog\").dialog(\"widget\").draggable(\"option\",\"containment\",\"none\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#dialog1\").dialog({\r\n");
      out.write("\t\t\t\t\tautoOpen: false,\r\n");
      out.write("\t\t\t\t\ttitle: 'Raw Material List',\r\n");
      out.write("\t\t\t\t\thide: 'slide',\r\n");
      out.write("\t\t\t\t\twidth: 450,\r\n");
      out.write("\t\t\t\t\theight: 350,\r\n");
      out.write("\t\t\t\t\tcloseOnEscape: true,\r\n");
      out.write("\t\t\t\t\tresizable: true,\r\n");
      out.write("\t\t\t\t\tmodal: false,\r\n");
      out.write("\t\t\t\t\tshow: 'slide',\r\n");
      out.write("\t\t\t\t\topen : function (event, ui) {\r\n");
      out.write("\t\t\t\t\t\t$(\"#accordion\").css('display','block');\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t$(\"#dialog1\").dialog(\"widget\").draggable(\"option\",\"containment\",\"none\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(document).on(\"click\",\"#dialog #selectSupplier\", function(event) {\r\n");
      out.write("\t\t\t\t\tvar cols = $(this).parent().parent().find('td');\r\n");
      out.write("\t\t\t\t\tvar supplierNum = $.trim(cols.eq(0).html());\r\n");
      out.write("\t\t\t\t\tvar supplierName = $.trim(cols.eq(1).html());\r\n");
      out.write("\t\t\t\t\tvar invoiceAmount = $.trim(cols.eq(2).html());\r\n");
      out.write("\t\t\t\t\tvar invoiceDate = $.trim(cols.eq(3).html());\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$(\"#supplierNum\").val(supplierNum);\r\n");
      out.write("\t\t\t\t\t$(\"#supplierName\").val(supplierName);\r\n");
      out.write("\t\t\t\t\t$(\"#invoiceAmount\").val(invoiceAmount);\r\n");
      out.write("\t\t\t\t\t$(\"#invoiceDate\").val(invoiceDate);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#table1 td div#menuButton\").click(function(event) {\r\n");
      out.write("\t\t\t\t\t$(\"#dialog\").dialog('option','position',[event.clientX, event.clientY]);\r\n");
      out.write("\t\t\t\t\t$(\"#dialog\").dialog(\"open\");\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar columns;\r\n");
      out.write("\t\t\t\t$(document).on(\"click\", \"#table2 td div#menuButton\", function(event) {\r\n");
      out.write("\t\t\t\t\t$(\"#dialog1\").dialog('option','position',[event.clientX, event.clientY]);\r\n");
      out.write("\t\t\t\t\t$(\"#dialog1\").dialog(\"open\");\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tcolumns = $(this).parent().parent().find('td');\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(document).on(\"click\",\"#dialog1 #selectSupplier\", function(event) {\r\n");
      out.write("\t\t\t\t\tvar cols = $(this).parent().parent().find('td');\r\n");
      out.write("\t\t\t\t\tvar id = $.trim(cols.eq(0).html());\r\n");
      out.write("\t\t\t\t\tvar desc = $.trim(cols.eq(1).html());\r\n");
      out.write("\t\t\t\t\tvar uom = $.trim(cols.eq(2).html());\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tcolumns.eq(0).find('input').eq(0).val(id);\r\n");
      out.write("\t\t\t\t\tcolumns.eq(2).find('input').eq(0).val(desc);\r\n");
      out.write("\t\t\t\t\tcolumns.eq(3).find('input').eq(0).val(uom);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(document).on(\"keyup\",\"#table2 tr:eq(-3) td input\",function(event) {\r\n");
      out.write("\t\t\t\t\tvar index = $(\"#table2 tr\").length-3;\r\n");
      out.write("\t\t\t\t\t$('<tr>' +\r\n");
      out.write("\t\t\t\t\t\t'<td> <input type=\"text\" name=\"materials['+index+'].rawMaterialId\" class=\"validate[required]\" /> </td>' +\r\n");
      out.write("\t\t\t\t\t\t'<td> <div id=\"menuButton\"> &nbsp; ... &nbsp; </div> </td>' +\r\n");
      out.write("\t\t\t\t\t\t'<td> <input type=\"text\" name=\"materials['+index+'].rawMaterialDesc\" class=\"validate[required]\" /> </td>' +\r\n");
      out.write("\t\t\t\t\t\t'<td> <input type=\"text\" name=\"materials['+index+'].rawMaterialUom\" class=\"validate[required]\" /> </td>' +\r\n");
      out.write("\t\t\t\t\t\t'<td> <input type=\"text\" name=\"materials['+index+'].rawMaterialQty\" class=\"validate[required,customer[integer]]\" /> </td>' +\r\n");
      out.write("\t\t\t\t\t\t'<td> <input type=\"text\" id=\"materialAmount\" name=\"materials['+index+'].rawMaterialAmount\" class=\"validate[required,custom[number]]\" /> </td>' +\r\n");
      out.write("\t\t\t\t\t\t'<td> <img src=\"web/images/delete.png\" width=\"20px\" height=\"20px\" /> </td>' +\r\n");
      out.write("\t\t\t\t\t'</tr>').insertAfter($(\"#table2 tr:eq(-3)\"));\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(document).on(\"mousedown\", \"div#menuButton\", function(event) {\r\n");
      out.write("\t\t\t\t\t$(this).css({'border': '2px inset #cccccc'});\r\n");
      out.write("\t\t\t\t\t$(this).css({'background': '#8fca10'});\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t$(document).on(\"mouseup\", \"div#menuButton\", function(event) {\r\n");
      out.write("\t\t\t\t\t$(this).css({'border': '2px outset #cccccc'});\r\n");
      out.write("\t\t\t\t\t$(this).css({'background': '#d5d5d5'});\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#addRow\").click(function(event) {\r\n");
      out.write("\t\t\t\t\tvar index = $(\"#table2 tr\").length-3;\r\n");
      out.write("\t\t\t\t\t$('<tr>' + \r\n");
      out.write("\t\t\t\t\t\t'<td> <input type=\"text\" name=\"materials['+index+'].rawMaterialId\" class=\"validate[required]\" /> </td>' +\r\n");
      out.write("\t\t\t\t\t\t'<td> <div id=\"menuButton\"> &nbsp; ... &nbsp; </div> </td>' +\r\n");
      out.write("\t\t\t\t\t\t'<td> <input type=\"text\" name=\"materials['+index+'].rawMaterialDesc\" class=\"validate[required]\" /> </td>' +\r\n");
      out.write("\t\t\t\t\t\t'<td> <input type=\"text\" name=\"materials['+index+'].rawMaterialUom\" class=\"validate[required]\" /> </td>' +\r\n");
      out.write("\t\t\t\t\t\t'<td> <input type=\"text\" name=\"materials['+index+'].rawMaterialQty\" class=\"validate[required,customer[integer]]\" /> </td>' +\r\n");
      out.write("\t\t\t\t\t\t'<td> <input type=\"text\" id=\"materialAmount\" name=\"materials['+index+'].rawMaterialAmount\" class=\"validate[required,customer[number]]\" /> </td>' +\r\n");
      out.write("\t\t\t\t\t\t'<td> <img src=\"web/images/delete.png\" width=\"20px\" height=\"20px\" /> </td>' +\r\n");
      out.write("\t\t\t\t\t'</tr>').insertAfter($(\"#table2 tr:eq(-3)\"));\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(document).on(\"click\", \"#table2 tr td img\", function(event) {\r\n");
      out.write("\t\t\t\t\tvar rowIndex = $('#table2 tr').length - 4;\r\n");
      out.write("\t\t\t\t\tif(rowIndex <= 0) {\r\n");
      out.write("\t\t\t\t\t\talert(\"Must contain atleast one raw material details\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\telse {\r\n");
      out.write("\t\t\t\t\t\tvar removeConfirm = confirm(\"Are you sure do you want to remove?\");\r\n");
      out.write("\t\t\t\t\t\tif(removeConfirm == true) {\r\n");
      out.write("\t\t\t\t\t\t\tvar row = $(this).parent().parent();\r\n");
      out.write("\t\t\t\t\t\t\trow.remove();\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#purchases\").validationEngine('attach', {\r\n");
      out.write("\t\t\t\t\tonValidationComplete: function(form, status) {\r\n");
      out.write("\t\t\t\t\t\tif(status == true) {\r\n");
      out.write("\t\t\t\t\t\t\tif($('#table2 tr').length <= 3) {\r\n");
      out.write("\t\t\t\t\t\t\t\talert(\"There should be atleast raw material\");\r\n");
      out.write("\t\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\tvar count = $('#table2 tr').length();\r\n");
      out.write("\t\t\t\t\t\t\t$('#table2 tr').each(function(index) {\r\n");
      out.write("\t\t\t\t\t\t\t\tif(index >= 1 && index < (count-2)) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar one = $(this).find(\"td\").eq(0).find('input').eq(0);\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar newName = one.attr('name').replace(/\\[[0-9]+\\]/i, '[' + (index-2) + ']');\r\n");
      out.write("\t\t\t\t\t\t\t\t\tone.attr('name', newName);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar two = $(this).find(\"td\").eq(2).find('input').eq(0);\r\n");
      out.write("\t\t\t\t\t\t\t\t\tnewName = two.attr('name').replace(/\\[[0-9]+\\]/i, '[' + (index-2) + ']');\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttwo.attr('name', newName);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar three = $(this).find(\"td\").eq(3).find('input').eq(0);\r\n");
      out.write("\t\t\t\t\t\t\t\t\tnewName = three.attr('name').replace(/\\[[0-9]+\\]/i, '[' + (index-2) + ']');\r\n");
      out.write("\t\t\t\t\t\t\t\t\tthree.attr('name', newName);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar four = $(this).find(\"td\").eq(4).find('input').eq(0);\r\n");
      out.write("\t\t\t\t\t\t\t\t\tnewName = four.attr('name').replace(/\\[[0-9]+\\]/i, '[' + (index-2) + ']');\r\n");
      out.write("\t\t\t\t\t\t\t\t\tthree.attr('name', newName);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar five = $(this).find(\"td\").eq(5).find('input').eq(0);\r\n");
      out.write("\t\t\t\t\t\t\t\t\tnewName = five.attr('name').replace(/\\[[0-9]+\\]/i, '[' + (index-2) + ']');\r\n");
      out.write("\t\t\t\t\t\t\t\t\tthree.attr('name', newName);\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\treturn true;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tfunction calculateTotal() {\r\n");
      out.write("\t\t\t\t\tvar count = $('#table2 tr').length;\r\n");
      out.write("\t\t\t\t\tvar total = 0.0;\r\n");
      out.write("\t\t\t\t\t$('#table2 tr').each(function(index) {\r\n");
      out.write("\t\t\t\t\t\tif(index >= 1 && index < (count-2)) {\r\n");
      out.write("\t\t\t\t\t\t\tvar n = parseFloat($(this).find('td').eq(5).find('input').eq(0).val());\r\n");
      out.write("\t\t\t\t\t\t\tif(isNaN(n))\r\n");
      out.write("\t\t\t\t\t\t\t\tn = 0.0;\r\n");
      out.write("\t\t\t\t\t\t\ttotal += n;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$(\"#totalAmt\").val(total);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(document).on(\"keyup\",\"#table2 #materialAmount\", function() {\r\n");
      out.write("\t\t\t\t\tcalculateTotal();\r\n");
      out.write("\t\t\t\t});\r\n");
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
    // /WEB-INF/views/purchases.jsp(4,0) name = ifAnyGranted type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/views/purchases.jsp(5,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("role");
    // /WEB-INF/views/purchases.jsp(5,1) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/purchases.jsp(5,1) 'user'",_el_expressionfactory.createValueExpression("user",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
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
    // /WEB-INF/views/purchases.jsp(7,0) name = ifAnyGranted type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/views/purchases.jsp(8,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setVar("role");
    // /WEB-INF/views/purchases.jsp(8,1) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/purchases.jsp(8,1) 'manager'",_el_expressionfactory.createValueExpression("manager",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
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
    // /WEB-INF/views/purchases.jsp(10,0) name = ifAnyGranted type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/views/purchases.jsp(11,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f2.setVar("role");
    // /WEB-INF/views/purchases.jsp(11,1) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f2.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/purchases.jsp(11,1) 'admin'",_el_expressionfactory.createValueExpression("admin",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f2 = _jspx_th_c_005fset_005f2.doStartTag();
    if (_jspx_th_c_005fset_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/views/purchases.jsp(138,64) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/${role}/savePurchases", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/purchases.jsp(233,11) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/purchases.jsp(233,11) '${amounts}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${amounts}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/purchases.jsp(233,11) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("data");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t<td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data.supplierNum}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" </td>\r\n");
          out.write("\t\t\t\t\t\t<td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data.supplierName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" </td>\r\n");
          out.write("\t\t\t\t\t\t<td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data.amount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" </td>\r\n");
          out.write("\t\t\t\t\t\t<td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data.invoiceDate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" </td>\r\n");
          out.write("\t\t\t\t\t\t<td> <a id=\"selectSupplier\" href=\"javascript:void(0)\"> Select </a></td>\r\n");
          out.write("\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/views/purchases.jsp(242,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty amounts}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t<td colspan=\"4\" align=\"center\">\r\n");
        out.write("\t\t\t\t\t\t\tNo supplier exists\r\n");
        out.write("\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/views/purchases.jsp(260,11) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/purchases.jsp(260,11) '${materials}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${materials}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/purchases.jsp(260,11) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("data1");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t<td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data1.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" </td>\r\n");
          out.write("\t\t\t\t\t\t<td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data1.desc}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" </td>\r\n");
          out.write("\t\t\t\t\t\t<td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data1.uom}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" </td>\r\n");
          out.write("\t\t\t\t\t\t<td> <a id=\"selectSupplier\" href=\"javascript:void(0)\"> Select </a></td>\r\n");
          out.write("\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /WEB-INF/views/purchases.jsp(268,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty amounts}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t<td colspan=\"4\" align=\"center\">\r\n");
        out.write("\t\t\t\t\t\t\tNo raw material exists\r\n");
        out.write("\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t");
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
}
