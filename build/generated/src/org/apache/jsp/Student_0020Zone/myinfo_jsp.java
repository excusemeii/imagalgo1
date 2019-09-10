package org.apache.jsp.Student_0020Zone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class myinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
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
      out.write("  <style>\n");
      out.write("      td{\n");
      out.write("          padding:15px;\n");
      out.write("      }\n");
      out.write("      </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    </br></br>\n");
      out.write("    ");

    
            String name=(String)session.getAttribute("uname");
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/imagalgodb","root","root");
            Statement st=conn.createStatement();
            String q="select * from signup where uname='"+name+"'";
        
            ResultSet rs=st.executeQuery(q);
			if(rs.next())
                        {
                            String fname=rs.getString("fname");
                            String lname=rs.getString("lname");
                            String uname=rs.getString("uname");
                            String email=rs.getString("email");
                            String course=rs.getString("course");
                            String branch=rs.getString("branch");
                        }
      out.write("\n");
      out.write("                        \n");
      out.write("     \n");
      out.write("        \n");
      out.write("    \n");
      out.write("<div class=\"container\" style=\"background-color:#e6ffe6;border-radius:7px;\" id=\"tut\"></br>\n");
      out.write("    <h2 style=\"font-size:23px;color:black;text-align:center\"><b>My Info</b></h2>\n");
      out.write("<p class=\"card-text\" style=\"font-size:17px;\" >\n");
      out.write("    </br>\n");
      out.write("<table>\n");
      out.write("    <tr>\n");
      out.write("         <td><b>First Name &nbsp;:</b></td>\n");
      out.write("         <td>");
out.println(rs.getString("fname"));
      out.write("</td>\n");
      out.write("         <td> <a href=\"efname.jsp\">Edit</a></td>\n");
      out.write("     </tr>\n");
      out.write("     <tr>\n");
      out.write("         <td><b>Last Name &nbsp;:</b></td>\n");
      out.write("         <td>");
out.println(rs.getString("lname"));
      out.write("</td>\n");
      out.write("         <td> <a href=\"elname.jsp\">Edit</a></td>\n");
      out.write("     </tr>\n");
      out.write("     <tr>\n");
      out.write("         <td><b>UserName &nbsp;:</b></td>\n");
      out.write("         <td>");
out.println(rs.getString("uname"));
      out.write("</td>\n");
      out.write("         \n");
      out.write("     </tr>\n");
      out.write("     <tr>\n");
      out.write("         <td><b>Email &nbsp;:</b></td>\n");
      out.write("         <td>");
out.println(rs.getString("email"));
      out.write("</td>\n");
      out.write("         <td> <a href=\"eemail.jsp\">Edit</a></td>\n");
      out.write("     </tr>\n");
      out.write("     <tr>\n");
      out.write("         <td><b>Course &nbsp;:</b></td>\n");
      out.write("         <td>");
out.println(rs.getString("course"));
      out.write("</td>\n");
      out.write("         <td> <a href=\"ecourse.jsp\">Edit</a></td>\n");
      out.write("     </tr>\n");
      out.write("     <tr>\n");
      out.write("         <td><b>Brach &nbsp;:</b></td>\n");
      out.write("         <td>");
out.println(rs.getString("branch"));
      out.write("</td>\n");
      out.write("         <td> <a href=\"ebranch.jsp\">Edit</a></td>\n");
      out.write("     </tr>\n");
      out.write("</table>\n");
      out.write("     \n");
      out.write("    \n");
      out.write("\n");
      out.write("</p>\n");
      out.write("</br>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("<script src=\"js/jquery.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
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
