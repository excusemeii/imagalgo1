package org.apache.jsp.Admin_0020Zone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcomeadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.8.1/baguetteBox.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"gallery-grid.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Autour One' rel='stylesheet'>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/hellostyl_2.css\">\n");
      out.write(" <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("body\n");
      out.write("{\n");
      out.write("margin:0px;\n");
      out.write("padding:0px;\n");
      out.write("background:url(frontpageimages/u.jpg);\t\n");
      out.write("background-size:cover;\n");
      out.write("font-family:sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <a href=\"secondpage.jsp\" class=\"btn btn-primary\" role=\"button\" style=\"border:none;\n");
      out.write("outline:none;\n");
      out.write("height:70px;\n");
      out.write("width:400px; \n");
      out.write("color:white;\n");
      out.write("font-size:16px;\n");
      out.write("background:#ff267e;\n");
      out.write("cursor:pointer;\n");
      out.write("border-radius:20px;\n");
      out.write("margin-top:150px;\n");
      out.write("margin-left:650px;\"><p style=\"color:#ffffff;margin-top:12px;font-size:25px;\"><b>Visit Website</b></p></a>>\n");
      out.write("  <a href=\"vquery.jsp\" class=\"btn btn-primary\" role=\"button\" style=\"border:none;\n");
      out.write("outline:none;\n");
      out.write("height:70px;\n");
      out.write("width:400px; \n");
      out.write("color:white;\n");
      out.write("font-size:16px;\n");
      out.write("background:#ff267e;\n");
      out.write("cursor:pointer;\n");
      out.write("border-radius:20px;\n");
      out.write("margin-top:50px;\n");
      out.write("margin-left:650px;\"><p style=\"color:#ffffff;margin-top:12px;font-size:25px;\"><b>View Queries</b></p></a>>\n");
      out.write("  <a href=\"vfeed.jsp\" class=\"btn btn-primary\" role=\"button\" style=\"border:none;\n");
      out.write("outline:none;\n");
      out.write("height:70px;\n");
      out.write("width:400px; \n");
      out.write("color:white;\n");
      out.write("font-size:16px;\n");
      out.write("background:#ff267e;\n");
      out.write("cursor:pointer;\n");
      out.write("border-radius:20px;\n");
      out.write("margin-top:50px;\n");
      out.write("margin-left:650px;\"><p style=\"color:#ffffff;margin-top:12px;font-size:25px;\"><b>View Feedback</b></p></a>>\n");
      out.write("  <a href=\"alogout.jsp\" class=\"btn btn-primary\" role=\"button\" style=\"border:none;\n");
      out.write("outline:none;\n");
      out.write("height:70px;\n");
      out.write("width:400px; \n");
      out.write("color:white;\n");
      out.write("font-size:16px;\n");
      out.write("background:#ff267e;\n");
      out.write("cursor:pointer;\n");
      out.write("border-radius:20px;\n");
      out.write("margin-top:50px;\n");
      out.write("margin-left:650px;\"><p style=\"color:#ffffff;margin-top:12px;font-size:25px;\"><b>Log Out</b></p></a>>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
}
