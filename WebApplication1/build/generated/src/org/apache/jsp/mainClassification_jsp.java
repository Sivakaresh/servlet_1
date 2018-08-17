package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import com.sgc.data.DatabaseConnection;

public final class mainClassification_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <title>MainClassification</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"tbl.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/demo.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/header-search.css\">\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Cookie' rel='stylesheet' type='text/css'>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"drop.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" >\n");
      out.write("        <!-- Optional theme -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" >\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"form.css\" >\n");
      out.write("        <script src=\"form.js\"></script>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            body {\n");
      out.write("                color: #566787;\n");
      out.write("                background: #f5f5f5;\n");
      out.write("                font-family: 'Roboto', sans-serif;\n");
      out.write("            }\n");
      out.write("            .table-wrapper {\n");
      out.write("                background: #fff;\n");
      out.write("                padding: 20px;\n");
      out.write("                margin: 30px 0;\n");
      out.write("                box-shadow: 0 1px 1px rgba(0,0,0,.05);\n");
      out.write("            }\n");
      out.write("            .table-title {\n");
      out.write("                padding-bottom: 10px;\n");
      out.write("                margin: 0 0 10px;\n");
      out.write("            }\n");
      out.write("            .table-title h2 {\n");
      out.write("                margin: 8px 0 0;\n");
      out.write("                font-size: 22px;\n");
      out.write("            }\n");
      out.write("            .search-box {\n");
      out.write("                position: relative;        \n");
      out.write("                float: right;\n");
      out.write("            }\n");
      out.write("            .search-box input {\n");
      out.write("                height: 34px;\n");
      out.write("                border-radius: 20px;\n");
      out.write("                padding-left: 35px;\n");
      out.write("                border-color: #ddd;\n");
      out.write("                box-shadow: none;\n");
      out.write("            }\n");
      out.write("            .search-box input:focus {\n");
      out.write("                border-color: #3FBAE4;\n");
      out.write("            }\n");
      out.write("            .search-box i {\n");
      out.write("                color: #a0a5b1;\n");
      out.write("                position: absolute;\n");
      out.write("                font-size: 19px;\n");
      out.write("                top: 8px;\n");
      out.write("                left: 10px;\n");
      out.write("            }\n");
      out.write("            table.table tr th, table.table tr td {\n");
      out.write("                border-color: #e9e9e9;\n");
      out.write("            }\n");
      out.write("            table.table-striped tbody tr:nth-of-type(odd) {\n");
      out.write("                background-color: #fcfcfc;\n");
      out.write("            }\n");
      out.write("            table.table-striped.table-hover tbody tr:hover {\n");
      out.write("                background: #f5f5f5;\n");
      out.write("            }\n");
      out.write("            table.table th i {\n");
      out.write("                font-size: 13px;\n");
      out.write("                margin: 0 5px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            table.table td:last-child {\n");
      out.write("                width: 130px;\n");
      out.write("            }\n");
      out.write("            table.table td a {\n");
      out.write("                color: #a0a5b1;\n");
      out.write("                display: inline-block;\n");
      out.write("                margin: 0 5px;\n");
      out.write("            }\n");
      out.write("            table.table td a.view {\n");
      out.write("                color: #03A9F4;\n");
      out.write("            }\n");
      out.write("            table.table td a.edit {\n");
      out.write("                color: #FFC107;\n");
      out.write("            }\n");
      out.write("            table.table td a.delete {\n");
      out.write("                color: #E34724;\n");
      out.write("            }\n");
      out.write("            table.table td i {\n");
      out.write("                font-size: 19px;\n");
      out.write("            }    \n");
      out.write("            .pagination {\n");
      out.write("                float: right;\n");
      out.write("                margin: 0 0 5px;\n");
      out.write("            }\n");
      out.write("            .pagination li a {\n");
      out.write("                border: none;\n");
      out.write("                font-size: 95%;\n");
      out.write("                width: 30px;\n");
      out.write("                height: 30px;\n");
      out.write("                color: #999;\n");
      out.write("                margin: 0 2px;\n");
      out.write("                line-height: 30px;\n");
      out.write("                border-radius: 30px !important;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("            .pagination li a:hover {\n");
      out.write("                color: #666;\n");
      out.write("            }\t\n");
      out.write("            .pagination li.active a {\n");
      out.write("                background: #03A9F4;\n");
      out.write("            }\n");
      out.write("            .pagination li.active a:hover {        \n");
      out.write("                background: #0397d6;\n");
      out.write("            }\n");
      out.write("            .pagination li.disabled i {\n");
      out.write("                color: #ccc;\n");
      out.write("            }\n");
      out.write("            .pagination li i {\n");
      out.write("                font-size: 16px;\n");
      out.write("                padding-top: 6px\n");
      out.write("            }\n");
      out.write("            .hint-text {\n");
      out.write("                float: left;\n");
      out.write("                margin-top: 6px;\n");
      out.write("                font-size: 95%;\n");
      out.write("            }    \n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <header class=\"header-search\">\n");
      out.write("\n");
      out.write("            <div class=\"header-limiter\">\n");
      out.write("\n");
      out.write("                <h1><a href=\"#\">Library<span  style=\"color:#F05283;\">online</span></a></h1>\n");
      out.write("\n");
      out.write("                <nav>\n");
      out.write("                    <a href=\"index.jsp\">Home</a>\n");
      out.write("                    <a href=\"ViewBookController\">Books</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <a>Classification</a>\n");
      out.write("                        <div class=\"dropdown-content\">\n");
      out.write("                            <a href=\"mainClassification.jsp\">Main Classification</a><br>\n");
      out.write("                            <a href=\"subClassification.jsp\">Sub Classification</a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("                <form method=\"get\" action=\"#\">\n");
      out.write("                    <input type=\"search\" placeholder=\"Search!\" name=\"search\">\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"menu\">\n");
      out.write("            <div data-role=\"main\" class=\"ui-content\">\n");
      out.write("                <h2><a data-toggle=\"modal\" data-target=\"#myModal\">Add</a>\n");
      out.write("                    <!--<a href=\"\">Edit</a>-->\n");
      out.write("                    <a data-toggle=\"modal\" data-target=\"#myModal2\">Search</a>\n");
      out.write("                </h2>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- Modal -->\n");
      out.write("                <div id=\"myModal\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("                    <div class=\"modal-dialog\">\n");
      out.write("                        <!-- Modal content-->\n");
      out.write("                        <div class=\"modal-content\">\n");
      out.write("                            <div class=\"modal-header\">\n");
      out.write("                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                                <h4 class=\"modal-title\">\n");
      out.write("                                    Add Main Classification\n");
      out.write("                                </h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-body\">\n");
      out.write("                                <form  method=\"post\" action=\"MCcontroller\" >\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"name\"> Main Classification ID</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"name\" name=\"mcid\" required maxlength=\"50\">\n");
      out.write("\n");
      out.write("                                        <label for=\"name\">Main Classification Name</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"name\" name=\"mcname\" required maxlength=\"50\">\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <input type=\"submit\" name=\"submit\">&nbsp;&nbsp;&nbsp;\n");
      out.write("\n");
      out.write("                                    <!--<button type=\"submit\" class=\"btn btn-lg btn-success btn-block\" id=\"btnContactUs\">Save </button>-->\n");
      out.write("                                </form>\n");
      out.write("                                <!--                            <div id=\"success_message\" style=\"width:100%; height:100%; display:none; \"> <h3>Sent your message successfully!</h3> </div>\n");
      out.write("                                                            <div id=\"error_message\" style=\"width:100%; height:100%; display:none; \"> <h3>Error</h3> Sorry there was an error sending your form. </div>-->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- Modal -->\n");
      out.write("                <div id=\"myModal2\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("                    <div class=\"modal-dialog\">\n");
      out.write("                        <!-- Modal content-->\n");
      out.write("                        <div class=\"modal-content\">\n");
      out.write("                            <div class=\"modal-header\">\n");
      out.write("                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                                <h4 class=\"modal-title\">\n");
      out.write("                                    Search Main Classification\n");
      out.write("                                </h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-body\">\n");
      out.write("                                <form  method=\"post\" action=\"MCSearchController\" >\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <!--                                    <label for=\"name\"> Main Classification ID</label>\n");
      out.write("                                                                            <input type=\"text\" class=\"form-control\" id=\"name\" name=\"mcid\" required maxlength=\"50\">-->\n");
      out.write("\n");
      out.write("                                        <label for=\"name\">Main Classification Name</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"name\" name=\"searchKey\" required maxlength=\"50\">\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <input type=\"submit\" name=\"submit\" value=\"Search\">&nbsp;&nbsp;&nbsp;\n");
      out.write("\n");
      out.write("                                    <!--<button type=\"submit\" class=\"btn btn-lg btn-success btn-block\" id=\"btnContactUs\">Save </button>-->\n");
      out.write("                                </form>\n");
      out.write("                                <!--                            <div id=\"success_message\" style=\"width:100%; height:100%; display:none; \"> <h3>Sent your message successfully!</h3> </div>\n");
      out.write("                                                            <div id=\"error_message\" style=\"width:100%; height:100%; display:none; \"> <h3>Error</h3> Sorry there was an error sending your form. </div>-->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <table>\n");
      out.write("                <thead>\n");
      out.write("                    <tr><th>Main Classification ID</th><th>Main Classification Name</th><th>Edit</th><th>Delete</th></tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </tbody> \n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('.header-search form').on('click', function (e) {\n");
      out.write("\n");
      out.write("                    // If the form (which is turned into the search button) was\n");
      out.write("                    // clicked directly, toggle the visibility of the search box.\n");
      out.write("\n");
      out.write("                    if (e.target == this) {\n");
      out.write("                        $(this).find('input').toggle();\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            function deleteFun() {\n");
      out.write("                var r = confirm(\"Are you sure you want to delete ?\");\n");
      out.write("                \n");
      out.write("                if (r == true) {\n");
      out.write("                    $.get('MCDeleteController?key=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mainClass.getMainClassificationId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("');\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mainListAttribute}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("mainClass");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <tr>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mainClass.getMainClassificationId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mainClass.getMainClassificationName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>              \n");
          out.write("                            <td>\n");
          out.write("                                <a href=\"\" class=\"edit\" title=\"Edit\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE254;</i></a>\n");
          out.write("                            </td>\n");
          out.write("                            <td>\n");
          out.write("                                <a href=\"MCDeleteController\" class=\"delete\" title=\"Delete\" data-toggle=\"tooltip\" onclick=\"\"><i class=\"material-icons\">&#xE872;</i></a>\n");
          out.write("                            </td>\n");
          out.write("                        </tr>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
