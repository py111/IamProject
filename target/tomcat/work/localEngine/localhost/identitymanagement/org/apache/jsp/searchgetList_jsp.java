package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import in.py.iam.datamodel.Identity;
import java.util.List;

public final class searchgetList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background: url('images/about.jpg') no-repeat center center fixed; -webkit-background-size: cover;\r\n");
      out.write("  -moz-background-size: cover;\r\n");
      out.write("  -o-background-size: cover;\r\n");
      out.write("  background-size: cover;\">\r\n");
      out.write("<center>\r\n");
      out.write("\t");

		List<Identity> identityList = (List<Identity>) session.getAttribute("identityList");
		//instruction in java console
		System.out.println("testToConsole");
	
      out.write("\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<table style=\"background-color: #ffffcc;\" border=\"1\" cellpadding=\"5\">\r\n");
      out.write("\t\t\t<br><h1>List Of Users</h1><br>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>UserName</th>\r\n");
      out.write("\t\t\t\t<th>LastName</th>\r\n");
      out.write("\t\t\t\t<th>FirstName</th>\r\n");
      out.write("\t\t\t\t<th>Email</th>\r\n");
      out.write("\t\t\t\t<th>Password</th>\r\n");
      out.write("\t\t\t\t<th>Birthdate</th>\r\n");
      out.write("\t\t\t\t<th>UPDATE</th>\r\n");
      out.write("\t\t\t\t<th>DELETE</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");

				if (identityList == null || identityList.isEmpty()) {
			
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\">Nothing to display</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");

				} else {
					for (Identity identity1 : identityList) {
			
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(identity1.getUserName());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(identity1.getLastName());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(identity1.getFirstName());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(identity1.getEmailid());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(identity1.getPassword());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(identity1.getBirthdate());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<form action=\"update.jsp\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"UserName\" value=\"");
      out.print(identity1.getUserName());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<td><br><button name=\"update\" type=\"submit\">UPDATE</button></td>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t<form action=\"Delete\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"UserName\" value=\"");
      out.print(identity1.getUserName());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<td><br><button name=\"delete\" type=\"submit\">DELETE</button></td>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");

				}
				}
			
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<form name=\"Exit\" action=\"Modify.jsp\" method=\"get\">\r\n");
      out.write("\t\t\t<br> <br>\r\n");
      out.write("\t\t\t<button name=\"exit\" type=\"submit\" style=\"background-color:lightblue\">BACK</button>\r\n");
      out.write("\t\t</form>\r\n");
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
