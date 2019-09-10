package org.apache.jsp.Student_0020Zone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style>\n");
      out.write("body\n");
      out.write("{\n");
      out.write("margin:0px;\n");
      out.write("padding:0px;\n");
      out.write("background:url(frontpageimages/u.jpg);\t\n");
      out.write("background-size:cover;\n");
      out.write("font-family:sans-serif;\n");
      out.write("}\n");
      out.write(".loginBox\n");
      out.write("{\n");
      out.write("width:500px;\n");
      out.write("height:820px;\n");
      out.write("position:absolute;\n");
      out.write("top:53%;\n");
      out.write("left:50%;\n");
      out.write("transform:translate(-50%,-50%);\n");
      out.write("box-sizing:border-box;\n");
      out.write("background:rgba(0,0,0,0.5);\n");
      out.write("padding:80px 40px;\n");
      out.write("margin-bottom:10px;\n");
      out.write("margin-top:50px;\n");
      out.write("}\n");
      out.write("#user\n");
      out.write("{\n");
      out.write("width:100px;\n");
      out.write("height:100px;\n");
      out.write("border-radius:50px;\n");
      out.write("overflow:hidden;\n");
      out.write("position:absolute;\n");
      out.write("top:calc(-100px/2);\n");
      out.write("left:calc(50% - 50px);\n");
      out.write("}\n");
      out.write("h2\n");
      out.write("{\n");
      out.write("margin:0px;\n");
      out.write("padding:0px;\n");
      out.write("color:white;\n");
      out.write("text-align:center;\n");
      out.write("}\n");
      out.write(".loginBox p\n");
      out.write("{\n");
      out.write("margin:0px;\n");
      out.write("padding:0px;\n");
      out.write("color:white;\n");
      out.write("//text-align:center;\n");
      out.write("font-weight:bold;\n");
      out.write("}\n");
      out.write(".loginBox input\n");
      out.write("{\n");
      out.write("width:100%;\n");
      out.write("margin-bottom:20px;\n");
      out.write("}\n");
      out.write(".loginBox input[type=\"text\"],.loginBox input[type=\"password\"],.loginBox input[type=\"tel\"]\n");
      out.write("{\n");
      out.write("border:none;\n");
      out.write("border-bottom:1px solid white;\n");
      out.write("background:transparent;\n");
      out.write("outline:none;\n");
      out.write("height:25px;\n");
      out.write("color:white;\n");
      out.write("font-size:15px;\n");
      out.write("}\n");
      out.write("::placeholder\n");
      out.write("{\n");
      out.write("color:rgba(255,255,255,0.5);\n");
      out.write("}\n");
      out.write(".loginBox input[type=\"submit\"]\n");
      out.write("{\n");
      out.write("border:none;\n");
      out.write("outline:none;\n");
      out.write("height:40px;\n");
      out.write("color:white;\n");
      out.write("font-size:16px;\n");
      out.write("background:#ff267e;\n");
      out.write("cursor:pointer;\n");
      out.write("border-radius:20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"loginBox\">\n");
      out.write("<img src=\"frontpageimages/icon1.jpg\" id=\"user\">\n");
      out.write("<h2>Sign Up Here</h2></br>\n");
      out.write("<form action=\"signupcode.jsp\" method=\"post\" name=\"SignupForm\">\n");
      out.write("<p>Enter first name</p>\n");
      out.write("<input type=\"text\" name=\"fname\" required=\"\" placeholder=\"Enter your first name\"/>\n");
      out.write("<p>Enter last name</p>\n");
      out.write("<input type=\"text\" name=\"lname\" required=\"\" placeholder=\"Enter your last name\"/>\n");
      out.write("<p>User Name</p>\n");
      out.write("<input type=\"text\" name=\"uname\" title=\"Username must not be blank and contain only letters,numbers and underscores.\" required=\"\" required pattern=\"\\w+\" placeholder=\"Enter your userid\"/>\n");
      out.write("<p>Password</p>\n");
      out.write("<input type=\"password\" name=\"password\" title=\"Password must contain atleast 6 characters including uppercase/lowercase letters,numbers \" required pattern=\"(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,}\" required=\"\" placeholder=\"Enter password\"/>\n");
      out.write("<p>Confirm Password</p>\n");
      out.write("<input type=\"password\" name=\"cpassword\" title=\"Please enter the same password as above\" required pattern=\"(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,}\"  placeholder=\"Confirm password\"/>\n");
      out.write("<p>Course</p>\n");
      out.write("<input type=\"text\" name=\"course\" required=\"\" placeholder=\"Enter your course\"/>\n");
      out.write("<p>Branch</p>\n");
      out.write("<input type=\"text\" name=\"branch\" required=\"\" placeholder=\"Enter branch\"/>\n");
      out.write("<p>Mobile Number</p>\n");
      out.write("<!--<input type=\"text\" name=\"mnumber\" required=\"\" maxlength=\"10\" placeholder=\"Enter mobile number\"/>-->\n");
      out.write(" <input type=\"tel\" name=\"mnumber\" pattern=\"^\\d{10}$\" required=\"\" placeholder=\"Enter mobile number\" >\n");
      out.write("<p>Email</p>\n");
      out.write("<input type=\"email\" name=\"email\" required=\"\" pattern=\"+@.com\" placeholder=\"Enter email\"/><br>\n");
      out.write("<p>Security Question for Password Recovery</p>\n");
      out.write("<input type=\"text\" name=\"security\" required pattern=\"\\w+\" title=\"Security Question can't  be blank space and contain only letters\"   placeholder=\"Write the name of your favourite fruit\"/>\n");
      out.write("<input type=\"submit\" name=\"signup\" value=\"Sign Up\" onclick=\"confirmPass()\"/>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function confirmPass()\n");
      out.write("        {\n");
      out.write("            var confirm=document.SignupForm.cpassword.value;\n");
      out.write("            var password=document.SignupForm.password.value;\n");
      out.write("           if(confirm!=password)\n");
      out.write("            {\n");
      out.write("                alert(\"Password doesn't match\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
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
