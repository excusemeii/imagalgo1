package org.apache.jsp.Student_0020Zone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class oddeven_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.8.1/baguetteBox.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"gallery-grid.css\"\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Autour One' rel='stylesheet'>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/hellostyl_2.css\">\r\n");
      out.write(" <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <style>\r\n");
      out.write("  #myBtn {\r\n");
      out.write("  display: none;\r\n");
      out.write("  position: fixed;\r\n");
      out.write("  bottom: 20px;\r\n");
      out.write("  right: 30px;\r\n");
      out.write("  z-index: 99;\r\n");
      out.write("  font-size: 18px;\r\n");
      out.write("  border: none;\r\n");
      out.write("  outline: none;\r\n");
      out.write("  background-color:red;\r\n");
      out.write("  color: white;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  padding: 15px;\r\n");
      out.write("border-radius: 50%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#myBtn:hover {\r\n");
      out.write("  background-color: #555;\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("#slideshowdiv1 {\r\n");
      out.write("\r\n");
      out.write("  outline: 1px solid #008080;\r\n");
      out.write("  height : 60px;\r\n");
      out.write("  width : 740px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"slideShow(); stopShow();\">\r\n");
      out.write("<button onclick=\"topFunction()\" id=\"myBtn\" title=\"Go to top\" style=\"background-color:blue;\"><i class=\"fa fa-arrow-up\"></i></button>\r\n");
      out.write("<script>\r\n");
      out.write("// When the user scrolls down 20px from the top of the document, show the button\r\n");
      out.write("window.onscroll = function() {scrollFunction()};\r\n");
      out.write("\r\n");
      out.write("function scrollFunction() {\r\n");
      out.write("  if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {\r\n");
      out.write("    document.getElementById(\"myBtn\").style.display = \"block\";\r\n");
      out.write("  } else {\r\n");
      out.write("    document.getElementById(\"myBtn\").style.display = \"none\";\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// When the user clicks on the button, scroll to the top of the document\r\n");
      out.write("function topFunction() {\r\n");
      out.write("  document.body.scrollTop = 0;\r\n");
      out.write("  document.documentElement.scrollTop = 0;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("  <script type = \"text/javascript\">\r\n");
      out.write("   // creates array and holds images\r\n");
      out.write("var imageArray = ['oddeven/o1.png','oddeven/o2.png','oddeven/o3.png','oddeven/o4.png','oddeven/o5.png','oddeven/o6.png','oddeven/o7.png','oddeven/o8.png',\r\n");
      out.write("'oddeven/o9.png','oddeven/o10.png','oddeven/o11.png','oddeven/o12.png','oddeven/o13.png','oddeven/o14.png','oddeven/o15.png','oddeven/o16.png'];\r\n");
      out.write("var steps = [\"Considering this input array, let's start odd-even sort proceeding from left to right. This sort is divided into two phases: Odd and Even\",\r\n");
      out.write("\"To begin with the Odd phase, the elements at odd index are compared with the next adjacent element.\", \"If the previous element is greater , they are swapped else not which means the smaller element is shifted towards left\",\r\n");
      out.write("\"To begin with the Even phase, the elements at even index are compared with the next adjacent element.\", \"If the previous element is greater , they are swapped else not which means the smaller element is shifted towards left\",\r\n");
      out.write("\"Again, for Odd phase, the elements at odd index are compared with the next adjacent element.\", \"If the previous element is greater , they are swapped else not which means the smaller element is shifted towards left\",\r\n");
      out.write("\"Again for the Even phase, the elements at even index are compared with the next adjacent element.\", \"If the previous element is greater , they are swapped else not which means the smaller element is shifted towards left\",\r\n");
      out.write("\"Again, for Odd phase, the elements at odd index are compared with the next adjacent element.\", \"If the previous element is greater , they are swapped else not which means the smaller element is shifted towards left\",\r\n");
      out.write("\"Again for the Even phase, the elements at even index are compared with the next adjacent element.\", \"If the previous element is greater , they are swapped else not which means the smaller element is shifted towards left\",\r\n");
      out.write("\"Again, for Odd phase, the elements at odd index are compared with the next adjacent element.\", \"If the previous element is greater , they are swapped else not which means the smaller element is shifted towards left. Here, the phases stop as the array becomes sorted\",\r\n");
      out.write("\"Therefore, the array is sorted!\"];\r\n");
      out.write("// set the array to start at 0\r\n");
      out.write("var i = 0;\r\n");
      out.write("\r\n");
      out.write("var speed = 2000;\r\n");
      out.write("var speed1 = 2000;\r\n");
      out.write("var minSpeed = 3000;\r\n");
      out.write("var maxSpeed = 0;\r\n");
      out.write("var pre=0;\r\n");
      out.write("// create function 'slideShow'\r\n");
      out.write("function slideShow() {\r\n");
      out.write("// creates variable 'div' to load images into a div selected using 'getElementById'\r\n");
      out.write("var div = document.getElementById('slideshowdiv');\r\n");
      out.write("div.innerHTML = '<img src=\"' + imageArray[i] + '\" />';\r\n");
      out.write("var div1 = document.getElementById('slideshowdiv1');\r\n");
      out.write("div1.innerHTML = steps[i];\r\n");
      out.write("\r\n");
      out.write("//increment i by 1\r\n");
      out.write("i++;\r\n");
      out.write("\r\n");
      out.write("// checks if i is greater than or equal to the length\r\n");
      out.write("\r\n");
      out.write("// every 2 seconds change image\r\n");
      out.write("timer = setTimeout('slideShow()', speed);\r\n");
      out.write("if( i == imageArray.length )\r\n");
      out.write("\tstopShow();\r\n");
      out.write("};\r\n");
      out.write("function slidenext() {\r\n");
      out.write("// creates variable 'div' to load images into a div selected using 'getElementById'\r\n");
      out.write("i = (i >= imageArray.length - 1) ? (imageArray.length-1) : i + 1;\r\n");
      out.write("var div = document.getElementById('slideshowdiv');\r\n");
      out.write("\r\n");
      out.write("div.innerHTML = '<img src=\"' + imageArray[i] + '\" />';\r\n");
      out.write("var div1 = document.getElementById('slideshowdiv1');\r\n");
      out.write("div1.innerHTML = steps[i];\r\n");
      out.write("\r\n");
      out.write("stopShow();\r\n");
      out.write("};\r\n");
      out.write("function slidepre() {\r\n");
      out.write("// creates variable 'div' to load images into a div selected using 'getElementById'\r\n");
      out.write(" if(i > pre)\r\n");
      out.write("    i--;\r\n");
      out.write(" i = (i > 0) ? i - 1 : 0;\r\n");
      out.write("var div = document.getElementById('slideshowdiv');\r\n");
      out.write("\r\n");
      out.write("div.innerHTML = '<img src=\"' + imageArray[i] + '\" />';\r\n");
      out.write("var div1 = document.getElementById('slideshowdiv1');\r\n");
      out.write("div1.innerHTML = steps[i];\r\n");
      out.write("\r\n");
      out.write("stopShow();\r\n");
      out.write("};\r\n");
      out.write("function displayNextImage() {\r\n");
      out.write("              \r\n");
      out.write("\t\t\t  timer=setTimeout('slidenext()',200);\r\n");
      out.write("          };\r\n");
      out.write("\r\n");
      out.write("          function displayPreviousImage() {\r\n");
      out.write("             \r\n");
      out.write("\t\t\t \t\t\t  timer=setTimeout('slidepre()',200);\r\n");
      out.write("\r\n");
      out.write("          };\r\n");
      out.write("function stopShow() {\r\n");
      out.write("    clearTimeout(timer);\r\n");
      out.write("};\r\n");
      out.write("function playShow() {\r\n");
      out.write("    if( i >= imageArray.length - 1 )\r\n");
      out.write("\ti = 0;\r\n");
      out.write("    timer = setTimeout('slideShow()', speed);\r\n");
      out.write("};\r\n");
      out.write("function increase() {\r\n");
      out.write("  if(speed -100 > maxSpeed )\r\n");
      out.write("    speed = 1500; \r\n");
      out.write("};\r\n");
      out.write("function decrease() {\r\n");
      out.write("  if(speed +100 <= minSpeed)      \r\n");
      out.write("    speed = 4500;\r\n");
      out.write("};\r\n");
      out.write("function normal() {\r\n");
      out.write("  if(speed < speed1|| speed > speed1)      \r\n");
      out.write("    speed = 3000;\r\n");
      out.write("};\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div class=\"nav1\">\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light navbar-fixed-left\">\r\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("    <ul class=\"navbar-nav m-auto\">\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"secondpage.html\">Dashboard</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"#tut\">Tutorial</a>\r\n");
      out.write("      </li>\r\n");
      out.write("\t  <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"#algo\">Algorithm</a>\r\n");
      out.write("      </li>\r\n");
      out.write("\t  <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"#visu\">Visualization</a>\r\n");
      out.write("      </li>\r\n");
      out.write("\t  <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"logout.jsp\">Logout</a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </nav>\r\n");
      out.write("</div>\r\n");
      out.write("</br></br>\r\n");
      out.write("<div class=\"container\" style=\"background-color:#e6ffe6;border-radius:7px;\"id=\"tut\"></br>\r\n");
      out.write("<b></b><h2 style=\"font-size:23px;color:black;text-align:center\">Description</h2></b>\r\n");
      out.write("<p class=\"card-text\" style=\"font-size:17px;\" >\r\n");
      out.write("In computing, an odd-even sort or odd-even transposition sort is a relatively simple sorting algorithm, developed originally for use on parallel processors with local interconnections. It is a comparison sort related to bubble sort, with which it shares many characteristics. It functions by comparing all odd/even indexed pairs of adjacent elements in the list and, if a pair is in the wrong order (the first is larger than the second) the elements are switched. The next step repeats this for even/odd indexed pairs (of adjacent elements). Then it alternates between odd/even and even/odd steps until the list is sorted. This is basically a variation of bubble-sort. This algorithm is divided into two phases- Odd and Even Phase. The algorithm runs until the array elements are sorted and in each iteration two phases occurs- Odd and Even Phases.\r\n");
      out.write("<br>In the odd phase, we perform a bubble sort on odd indexed elements and in the even phase, we perform a bubble sort on even indexed elements.\r\n");
      out.write("\r\n");
      out.write("</br>\r\n");
      out.write("</p>\r\n");
      out.write("<b></b><h2 style=\"font-size:23px;color:black;text-align:center\">Complexity</h2></b>\r\n");
      out.write("<p class=\"card-text\" style=\"font-size:17px;\" ><b>Best case : </b> O(n)<br>\r\n");
      out.write("<b>Average case : </b> O(n^2)<br>\r\n");
      out.write("<b>Worst case : </b> O(n^2)<br>\r\n");
      out.write("<b>Space complexity : </b> O(1)<br>\r\n");
      out.write("Odd-even sort is fast when all elements in the input array are close to their sorted indexes. Since odd-even sort must perform both an odd and an even iteration, it is possible to sort an input array where some elements are 2 indexes off their sorted position in this odd and even iteration.\r\n");
      out.write("<br>\r\n");
      out.write("Unlike other bubble sort derivatives like cocktail sort and comb sort, odd-even sort struggles to handle the turtles problems where indexes that are originally way off their sorted position push the number of iterations out significantly. If the largest item in the array was at the start then odd-even sort would perform at its worst in terms of iterations and comparisons.</p>\r\n");
      out.write("<br>\r\n");
      out.write("</div>\r\n");
      out.write("<br><br>\r\n");
      out.write("<div class=\"container\" style=\"background-color:#e6ffe6;border-radius:7px;\"id=\"algo\"></br>\r\n");
      out.write("<b></b><h1 style=\"font-size:23px;color:black;text-align:center\">Algorithm</h1></b>\r\n");
      out.write("<p class=\"card-text\" style=\"font-size:17px;\" >The algorithm for oddeven sort is shown as: \r\n");
      out.write("</br></br>\r\n");
      out.write("Oddevensort(arr, size)  <br>\r\n");
      out.write("\r\n");
      out.write("     sorted := false<br>\r\n");
      out.write("    while sorted := true<br>\r\n");
      out.write("        sorted :=true <br>\r\n");
      out.write("        for i := 1 to size-1 <br>\r\n");
      out.write("       \r\n");
      out.write("            if a[i]>a[i+1] <br>\r\n");
      out.write("           then <br>\r\n");
      out.write("                swap(&a[i],&a[i+1]) <br>\r\n");
      out.write("                \r\n");
      out.write("\t\t\t\tsorted := false <br>\r\n");
      out.write("        for i := 0 to size-1  <br>\r\n");
      out.write("        \r\n");
      out.write("            if a[i]>a[i+1] <br>\r\n");
      out.write("            then\r\n");
      out.write("                swap(&a[i],&a[i+1]) <br>\r\n");
      out.write("                sorted := false <br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("   done <br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</br/></br>\r\n");
      out.write("<div class=\"container\" style=\"background-color:#e6ffe6;border-radius:7px;\"id=\"visu\"></br>\r\n");
      out.write("<b></b><h1 style=\"font-size:23px;color:black;text-align:center\">Visualization</h1></b>\r\n");
      out.write("<div class=\"btn-group\">\r\n");
      out.write("\r\n");
      out.write("    <button type=\"button\" class=\"btn btn-info btn-sm\" onclick=\"decrease()\">Slow</button>\r\n");
      out.write("    <button type=\"button\" class=\"btn btn-default btn-sm\" onclick=\"normal()\">Normal</button>\r\n");
      out.write("    <button type=\"button\" class=\"btn btn-warning btn-sm\" onclick=\"increase()\">Fast</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<div id=\"slideshowdiv\"></div>\r\n");
      out.write("<br>\r\n");
      out.write("<b>Steps :</b>\r\n");
      out.write("<br>\r\n");
      out.write("<div id=\"slideshowdiv1\"></div>\r\n");
      out.write("<div class=\"change\">\r\n");
      out.write("<br>\r\n");
      out.write("<div class=\"btn-group\">\r\n");
      out.write(" <button type=\"button\" class=\"btn btn-primary btn-sm\" onclick=\"displayPreviousImage()\">Previous</button>\r\n");
      out.write("    <button type=\"button\" class=\"btn btn-danger btn-sm\" onclick=\"stopShow()\">Stop</button>\r\n");
      out.write("    <button type=\"button\" class=\"btn btn-success btn-sm\" onclick=\"playShow()\">Play</button>\r\n");
      out.write("\t<button type=\"button\" class=\"btn btn-primary btn-sm\" onclick=\"displayNextImage()\">Next</button>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"js/jquery.js\"></script>\r\n");
      out.write("<!--<script src=\"//code.jquery.com/jquery.min.js\"></script>-->\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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