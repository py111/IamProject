package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newuser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>User Registration</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background: url('images/about.jpg') no-repeat center center fixed; -webkit-background-size: cover;\r\n");
      out.write("  -moz-background-size: cover;\r\n");
      out.write("  -o-background-size: cover;\r\n");
      out.write("  background-size: cover;\">\r\n");
      out.write("<center>\r\n");
      out.write("\t<font size=\"4\"><br> ");

 	String message = (String) request.getAttribute("message");
 
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.message}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</font>\r\n");
      out.write("\t<br><br>\r\n");
      out.write("\t<p><font size=\"5\"><h1>To Create A New Identity, Enter Below Details</h1></font></p>\r\n");
      out.write("\t<p><i>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</i></p>\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("\t<form name=\"userEntryForm\" action=\"./Create\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t\t<table cellspacing=\"5\" border=\"0\">\r\n");
      out.write("\t\t\t<tr><td align=\"right\"><h3>User name:</h3></td><td><input type=\"text\" name=\"UserName\"></td></tr>\r\n");
      out.write("\t\t\t<tr><td align=\"right\"><h3>Last name:</h3></td><td><input type=\"text\" name=\"lastName\"></td></tr>\r\n");
      out.write("\t\t\t<tr><td align=\"right\"><h3>First name:</h3></td><td><input type=\"text\" name=\"firstName\"></td></tr>\r\n");
      out.write("\t\t\t<tr><td align=\"right\"><h3>Email address:</h3></td><td><input type=\"email\" name=\"emailid\"></td></tr>\r\n");
      out.write("\t\t\t<tr><td align=\"right\"><h3>Password:</h3></td><td><input type=\"text\" name=\"password\"></td></tr>\r\n");
      out.write("\t\t\t<tr><td align=\"right\"><h3>Birth date:</h3></td><td><input type=\"date\" name=\"birthdate\"></td></tr>\r\n");
      out.write("\t\t\t<tr><td></td><td><br> <input type=\"submit\" name=\"createProfile\" value=\"Submit\"  style=\"background-color:lightblue\"></td></tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("</center>\r\n");
      out.write("</body>\r\n");
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
}
