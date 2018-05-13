package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Modify_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Identity Access Management System</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background: url('images/modify.jpg') no-repeat center center fixed; -webkit-background-size: cover;\r\n");
      out.write("  -moz-background-size: cover;\r\n");
      out.write("  -o-background-size: cover;\r\n");
      out.write("  background-size: cover;\">\r\n");
      out.write("\t<center>\r\n");
      out.write("\t\t<br><br><br>\r\n");
      out.write("\t\t<h1><marquee width=\"80%\" behavior=\"alternate\"><font color=\"white\">I AM IDENTITY MANAGEMENT SYSTEM</font></marquee></h1>\r\n");
      out.write("\t\t<form name=\"About\" action=\"about.jsp\" method=\"get\">\r\n");
      out.write("\t\t\t<br> <br>\r\n");
      out.write("\t\t\t<button name=\"About\" type=\"submit\" style=\"background-color:lightblue\">About the System</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<form name=\"Create\" action=\"newuser.jsp\" method=\"get\">\r\n");
      out.write("\t\t\t<br> <br>\r\n");
      out.write("\t\t\t<button name=\"create\" type=\"submit\" style=\"background-color:lightblue\">Create New User</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<form name=\"List\" action=\"GetList\" method=\"get\">\r\n");
      out.write("\t\t\t<br> <br>\r\n");
      out.write("\t\t\t<button name=\"List\" type=\"submit\" style=\"background-color:lightblue\">List of Users</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<form name=\"Search\" action=\"search.jsp\" method=\"get\">\r\n");
      out.write("\t\t\t<br> <br>\r\n");
      out.write("\t\t\t<button name=\"Search\" type=\"submit\" style=\"background-color:lightblue\">Search User</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<form name=\"Exit\" action=\"exit.jsp\" method=\"get\">\r\n");
      out.write("\t\t\t<br> <br>\r\n");
      out.write("\t\t\t<button name=\"exit\" type=\"submit\" style=\"background-color:lightblue\">Logout</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</center>\r\n");
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
