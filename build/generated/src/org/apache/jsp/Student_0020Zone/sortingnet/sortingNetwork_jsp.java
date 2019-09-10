package org.apache.jsp.Student_0020Zone.sortingnet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sortingNetwork_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.8.1/baguetteBox.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"gallery-grid.css\"\n");
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
      out.write("  #myBtn {\n");
      out.write("  display: none;\n");
      out.write("  position: fixed;\n");
      out.write("  bottom: 20px;\n");
      out.write("  right: 30px;\n");
      out.write("  z-index: 99;\n");
      out.write("  font-size: 18px;\n");
      out.write("  border: none;\n");
      out.write("  outline: none;\n");
      out.write("  background-color:red;\n");
      out.write("  color: white;\n");
      out.write("  cursor: pointer;\n");
      out.write("  padding: 15px;\n");
      out.write("border-radius: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myBtn:hover {\n");
      out.write("  background-color: #555;\n");
      out.write("} \n");
      out.write("\n");
      out.write("#slideshowdiv1 {\n");
      out.write("\n");
      out.write("  outline: 1px solid #008080;\n");
      out.write("  height : 60px;\n");
      out.write("  width : 730px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body onload=\"slideShow(); stopShow();\">\n");
      out.write("<button onclick=\"topFunction()\" id=\"myBtn\" title=\"Go to top\" style=\"background-color:blue;\"><i class=\"fa fa-arrow-up\"></i></button>\n");
      out.write("<script>\n");
      out.write("// When the user scrolls down 20px from the top of the document, show the button\n");
      out.write("window.onscroll = function() {scrollFunction()};\n");
      out.write("\n");
      out.write("function scrollFunction() {\n");
      out.write("  if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {\n");
      out.write("    document.getElementById(\"myBtn\").style.display = \"block\";\n");
      out.write("  } else {\n");
      out.write("    document.getElementById(\"myBtn\").style.display = \"none\";\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("// When the user clicks on the button, scroll to the top of the document\n");
      out.write("function topFunction() {\n");
      out.write("  document.body.scrollTop = 0;\n");
      out.write("  document.documentElement.scrollTop = 0;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("  <script type = \"text/javascript\">\n");
      out.write("   // creates array and holds images\n");
      out.write("var imageArray = ['SortingNetwork1.png', 'SortingNetwork2.png', 'SortingNetwork3.png', \n");
      out.write("'SortingNetwork4.png', 'SortingNetwork5.png','SortingNetwork6.png',\n");
      out.write("'SortingNetwork7.png','SortingNetwork8.png'];\n");
      out.write("\n");
      out.write("var steps = \n");
      out.write("[\"For sorting initially following elements are given:\",\n");
      out.write("\"The elements are compared in upper half that is 4 elements at the top are compared in increasing order and remaining 4 are compared in decreasing order \",\n");
      out.write("\"Now the elements are compared which is indicated by arrows, in the upper half in increasing order and in lower half in decreasing oredr:\",\n");
      out.write("\"Elements compared are indicated by the arrow:\",\"Elements are compared so that the one that is smaller is moved upwards and the one that is greater is moved below\",\n");
      out.write("\"Elements are compared and sorted in increasing order\",\" The elements are compared as indicated by arraows and arranged in increasing order\",\n");
      out.write("\"finally we get the sorted sequence of elements at the en of network\" ];\n");
      out.write("// set the array to start at 0\n");
      out.write("var i = 0;\n");
      out.write("\n");
      out.write("var speed = 2000;\n");
      out.write("var speed1 = 2000;\n");
      out.write("var minSpeed = 3000;\n");
      out.write("var maxSpeed = 0;\n");
      out.write("var pre=0;\n");
      out.write("// create function 'slideShow'\n");
      out.write("function slideShow() {\n");
      out.write("// creates variable 'div' to load images into a div selected using 'getElementById'\n");
      out.write("var div = document.getElementById('slideshowdiv');\n");
      out.write("div.innerHTML = '<img src=\"' + imageArray[i] + '\" />';\n");
      out.write("var div1 = document.getElementById('slideshowdiv1');\n");
      out.write("div1.innerHTML = steps[i];\n");
      out.write("\n");
      out.write("//increment i by 1\n");
      out.write("i++;\n");
      out.write("\n");
      out.write("// checks if i is greater than or equal to the length\n");
      out.write("\n");
      out.write("// every 2 seconds change image\n");
      out.write("timer = setTimeout('slideShow()', speed);\n");
      out.write("if( i == imageArray.length )\n");
      out.write("\tstopShow();\n");
      out.write("};\n");
      out.write("function slidenext() {\n");
      out.write("// creates variable 'div' to load images into a div selected using 'getElementById'\n");
      out.write("i = (i >= imageArray.length - 1) ? (imageArray.length-1) : i + 1;\n");
      out.write("var div = document.getElementById('slideshowdiv');\n");
      out.write("\n");
      out.write("div.innerHTML = '<img src=\"' + imageArray[i] + '\" />';\n");
      out.write("var div1 = document.getElementById('slideshowdiv1');\n");
      out.write("div1.innerHTML = steps[i];\n");
      out.write("\n");
      out.write("stopShow();\n");
      out.write("};\n");
      out.write("function slidepre() {\n");
      out.write("// creates variable 'div' to load images into a div selected using 'getElementById'\n");
      out.write("if(i > pre)\n");
      out.write("    i--;\n");
      out.write(" i = (i > 0) ? i - 1 : 0;\n");
      out.write(" var div = document.getElementById('slideshowdiv');\n");
      out.write("\n");
      out.write("div.innerHTML = '<img src=\"' + imageArray[i] + '\" />';\n");
      out.write("var div1 = document.getElementById('slideshowdiv1');\n");
      out.write("div1.innerHTML = steps[i];\n");
      out.write("\n");
      out.write("stopShow();\n");
      out.write("};\n");
      out.write("function displayNextImage() {\n");
      out.write("              \n");
      out.write("\t\t\t  timer=setTimeout('slidenext()',200);\n");
      out.write("          };\n");
      out.write("\n");
      out.write("          function displayPreviousImage() {\n");
      out.write("             \n");
      out.write("\t\t\t \t\t\t  timer=setTimeout('slidepre()',200);\n");
      out.write("\n");
      out.write("          };\n");
      out.write("function stopShow() {\n");
      out.write("    clearTimeout(timer);\n");
      out.write("};\n");
      out.write("function playShow() {\n");
      out.write("    if( i >= imageArray.length - 1 )\n");
      out.write("\ti = 0;\n");
      out.write("    timer = setTimeout('slideShow()', speed);\n");
      out.write("};\n");
      out.write("function increase() {\n");
      out.write("  if(speed -100 > maxSpeed )\n");
      out.write("    speed = 1500; \n");
      out.write("};\n");
      out.write("function decrease() {\n");
      out.write("  if(speed +100 <= minSpeed)      \n");
      out.write("    speed = 4500;\n");
      out.write("};\n");
      out.write("function normal() {\n");
      out.write("  if(speed < speed1|| speed > speed1)      \n");
      out.write("    speed = 3000;\n");
      out.write("};\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<div class=\"nav1\">\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light navbar-fixed-left\">\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav m-auto\">\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"secondpage.html\">Dashboard</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#tut\">Tutorial</a>\n");
      out.write("      </li>\n");
      out.write("\t  <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#algo\">Algorithm</a>\n");
      out.write("      </li>\n");
      out.write("\t  <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#visu\">Visualization</a>\n");
      out.write("      </li>\n");
      out.write("\t  <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"logout.jsp\">Logout</a>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("</div>\n");
      out.write("</br></br>\n");
      out.write("<div class=\"container\" style=\"background-color:#e6ffe6;border-radius:7px;\"id=\"tut\"></br>\n");
      out.write("<b></b><h2 style=\"font-size:23px;color:black;text-align:center\">Description</h2></b>\n");
      out.write("<p class=\"card-text\" style=\"font-size:17px;\" >In computer science, comparator networks are abstract devices built up of a fixed \n");
      out.write("number of \"wires\", carrying values, and comparator modules that connect pairs of wires, swapping the values on the wires if they\n");
      out.write(" are not in a desired order. Such networks are typically designed to perform sorting on fixed numbers of values, in which case \n");
      out.write(" they are called sorting networks.\n");
      out.write("<br>\n");
      out.write("</p>\n");
      out.write("<b></b><h2 style=\"font-size:23px;color:black;text-align:center\">Complexity</h2></b>\n");
      out.write("<p class=\"card-text\" style=\"font-size:17px;\" >\n");
      out.write("Various algorithms exist to construct simple, yet efficient sorting networks of depth O(log2 n) (hence size O(n log2 n)) such as\n");
      out.write(" Batcher odd?even mergesort, bitonic sort, Shell sort, and the Pairwise sorting network. These networks are often used in \n");
      out.write(" practice.  \n");
      out.write("</br>\n");
      out.write("</p>\n");
      out.write("<b></b><h2 style=\"font-size:23px;color:black;text-align:center\">Use</h2></b>\n");
      out.write("<p class=\"card-text\" style=\"font-size:17px;\" >Sorting networks differ from general comparison sorts in that they are not \n");
      out.write("capable of handling arbitrarily large inputs, and in that their sequence of comparisons is set in advance, regardless of the \n");
      out.write("outcome of previous comparisons. This independence of comparison sequences is useful for parallel execution and for implementation\n");
      out.write(" in hardware. Despite the simplicity of sorting nets, their theory is surprisingly deep and complex. Sorting networks were first\n");
      out.write(" studied circa 1954 by Armstrong, Nelson and O'Connor,who subsequently patented the idea. \n");
      out.write("Sorting networks can be implemented either in hardware or in software. Donald Knuth describes how the comparators for binary \n");
      out.write("integers can be implemented as simple, three-state electronic devices.Batcher, in 1968, suggested using them to construct switching \n");
      out.write("networks for computer hardware, replacing both buses and the faster, but more expensive, crossbar switches. Since the 2000s, \n");
      out.write("sorting nets (especially bitonic mergesort) are used by the GPGPU community for constructing sorting algorithms to run on \n");
      out.write("graphics processing units. Sorting networks differ from general comparison sorts in that they are not capable of handling \n");
      out.write("arbitrarily large inputs, and in that their sequence of comparisons is set in advance, regardless of the outcome of previous \n");
      out.write("comparisons. This independence of comparison sequences is useful for parallel execution and for implementation in hardware. \n");
      out.write("Despite the simplicity of sorting nets, their theory is surprisingly deep and complex. Sorting networks were first studied \n");
      out.write("circa 1954 by Armstrong, Nelson and O'Connor, who subsequently patented the idea.\n");
      out.write("\n");
      out.write(" </br></br>\n");
      out.write("</p>\n");
      out.write("</div>\n");
      out.write("</br></br>\n");
      out.write("<div class=\"container\" style=\"background-color:#e6ffe6;border-radius:7px;\"id=\"algo\"></br>\n");
      out.write("<b></b><h1 style=\"font-size:23px;color:black;text-align:center\">Algorithm</h1></b>\n");
      out.write("<p class=\"card-text\" style=\"font-size:17px;\" >The algorithm for Sorting Network sort is shown as: \n");
      out.write("</br></br>\n");
      out.write("A sorting network consists of two types of items: comparators and wires. The wires are thought of as running from left to right,\n");
      out.write(" carrying values (one per wire) that traverse the network all at the same time. Each comparator connects two wires. When a pair \n");
      out.write(" of values, traveling through a pair of wires, encounter a comparator, the comparator swaps the values if and only if the top \n");
      out.write(" wire's value is greater than the bottom wire's value. \n");
      out.write("In a formula, if the top wire carries x and the bottom wire carries y, then after hitting a comparator the wires carry \n");
      out.write("x ? = min ( x , y) \n");
      out.write(" and \n");
      out.write("y ? = max ( x , y ) \n");
      out.write(" respectively, so the pair of values is sorted. A network of wires and comparators that will correctly sort all possible inputs\n");
      out.write(" into ascending order is called a sorting network. \n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</br/></br>\n");
      out.write("<div class=\"container\" style=\"background-color:#e6ffe6;border-radius:7px;\"id=\"visu\"></br>\n");
      out.write("<b></b><h1 style=\"font-size:23px;color:black;text-align:center\">Visualization</h1></b>\n");
      out.write("<div class=\"btn-group\">\n");
      out.write("\n");
      out.write("    <button type=\"button\" class=\"btn btn-info btn-sm\" onclick=\"decrease()\">Slow</button>\n");
      out.write("    <button type=\"button\" class=\"btn btn-default btn-sm\" onclick=\"normal()\">Normal</button>\n");
      out.write("    <button type=\"button\" class=\"btn btn-warning btn-sm\" onclick=\"increase()\">Fast</button>\n");
      out.write("\t</div>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<div id=\"slideshowdiv\"></div>\n");
      out.write("<br>\n");
      out.write("<b>Steps :</b>\n");
      out.write("<br>\n");
      out.write("<div id=\"slideshowdiv1\"></div>\n");
      out.write("<div class=\"change\">\n");
      out.write("<br>\n");
      out.write("<div class=\"btn-group\">\n");
      out.write(" <button type=\"button\" class=\"btn btn-primary btn-sm\" onclick=\"displayPreviousImage()\">Previous</button>\n");
      out.write("    <button type=\"button\" class=\"btn btn-danger btn-sm\" onclick=\"stopShow()\">Stop</button>\n");
      out.write("    <button type=\"button\" class=\"btn btn-success btn-sm\" onclick=\"playShow()\">Play</button>\n");
      out.write("\t<button type=\"button\" class=\"btn btn-primary btn-sm\" onclick=\"displayNextImage()\">Next</button>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("</div>\n");
      out.write("<script src=\"js/jquery.js\"></script>\n");
      out.write("<!--<script src=\"//code.jquery.com/jquery.min.js\"></script>-->\n");
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
