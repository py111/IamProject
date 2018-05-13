package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>About the Project</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background: url('images/about.jpg') no-repeat center center fixed; -webkit-background-size: cover;\r\n");
      out.write("  -moz-background-size: cover;\r\n");
      out.write("  -o-background-size: cover;\r\n");
      out.write("  background-size: cover;\">\r\n");
      out.write("\r\n");
      out.write("\t<div><center>\r\n");
      out.write("\t\t\t<h1><br><br>Specifications of Identity Management Tool</h1>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<h3><br>System Stores Identity Information: Unique User name, Full name, EmailID, Password and Birth date</h3><br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t1) The Create button allows you to create a new user.<br>\r\n");
      out.write("\t\t\t \t2) The List button gives you list of all the identities in the system.<br>\r\n");
      out.write("\t\t\t\t3) The Search button gives the option to search Identities based on User Name, Last Name OR Email Address and then user has option to either update or delete the chosen identity.\r\n");
      out.write("\t\r\n");
      out.write("<br> <br>\r\n");
      out.write("<form name=\"Exit\" action=\"Modify.jsp\" method=\"get\">\r\n");
      out.write("\t\t\t<br> <br>\r\n");
      out.write("\t\t\t<button name=\"exit\" type=\"submit\" style=\"background-color:lightblue\">BACK</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t</center></div>\r\n");
      out.write("\r\n");
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
