package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bubble_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  width : 660px\n");
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
      out.write("var imageArray = ['bubble/b1.png', 'bubble/b2.png', 'bubble/b3.png', 'bubble/b4.png', 'bubble/b5.png', 'bubble/b6.png', 'bubble/b7.png',\n");
      out.write("                  'bubble/b8.png', 'bubble/b9.png', 'bubble/b10.png', 'bubble/b11.png', 'bubble/b12.png', 'bubble/b13.png', 'bubble/b14.png',\n");
      out.write("\t\t\t\t  'bubble/b15.png', 'bubble/b16.png', 'bubble/b17.png', 'bubble/b18.png', 'bubble/b19.png', 'bubble/b20.png', 'bubble/b21.png',\n");
      out.write("\t\t\t\t  'bubble/b22.png', 'bubble/b23.png', 'bubble/b24.png', 'bubble/b25.png', 'bubble/b26.png', 'bubble/b27.png', 'bubble/b28.png',\n");
      out.write("\t\t\t\t  'bubble/b29.png', 'bubble/b30.png', 'bubble/b31.png', 'bubble/b32.png', 'bubble/b33.png', 'bubble/b34.png', 'bubble/b35.png',\n");
      out.write("\t\t\t\t  'bubble/b36.png', 'bubble/b37.png', 'bubble/b38.png', 'bubble/b39.png', 'bubble/b40.png', 'bubble/b41.png', 'bubble/b42.png',\n");
      out.write("\t\t\t\t  'bubble/b43.png', 'bubble/b44.png', 'bubble/b45.png', 'bubble/b46.png', 'bubble/b47.png', 'bubble/b48.png'];\n");
      out.write("var steps = [\"Considering this input array, let's start bubble sort proceeding from left to right\",\n");
      out.write("\"In the beginning of first pass, the first element (arr[i]) is compared with the next adjacent element (arr[i+1]). If the first element is greater , they are swapped else not\",\n");
      out.write("\"Moving ahead through the list, compare the element with its next adjacent\", \"And if found greater, they are swapped\",\n");
      out.write("\"Compare\",\"Swap\",\"Compare\",\"Swap\",\"Compare\",\"Swap\",\"Compare\",\"Swap\",\"Compare\",\"Swap\",\n");
      out.write("\"At the end of first paas, the largest element moves to the end and list is now decreased by one as one element has already been sorted\",\n");
      out.write("\"In second pass, the elements are compared and swapped. After each pass, the larger elements move to the left\", \"Compare and swap\",\"Compare\",\"Swap\",\"Compare\",\"Compare\",\n");
      out.write("\"Swap\",\"Compare\",\"Compare\",\"Swap\",\"At the end of second paas, the second largest element moves to the end and list decreases by two as two elements are already sorted\",\n");
      out.write("\"In third pass, the elements are compared and swapped, the same way. After each pass, the larger elements move to the left\",\"Compare\", \"Compare\",\"Swap\",\"Compare\",\"Compare\",\n");
      out.write("\"At the end of third paas, the third largest element moves to the end and list decreases by three as three elements are already sorted\",\n");
      out.write("\"In fourth pass, the elements are compared and swapped. After each pass, the larger elements move to the left\", \"Compare\",\"Swap\",\"Compare\",\"Compare\",\n");
      out.write("\"At the end of fourth paas, the fourth largest element moves to the end and list decreases by four as four elements are already sorted\",\n");
      out.write("\"In fifth pass, the elements are compared and swapped. After each pass, the larger elements move to the left\", \"Compare\",\"Compare\",\n");
      out.write("\"At the end of fifth paas, the fifth largest element moves to the end and list decreases by five as five elements are already sorted\", \n");
      out.write("\"In sixth pass, the elements are compared and swapped. After each pass, the larger elements move to the left\", \"Compare\",\n");
      out.write("\"At the end of sixth paas, the sixth largest element moves to the end and list decreases by six as six elements are already sorted\",\n");
      out.write("\"In seventh pass, the elements are compared and swapped.\", \"Now, the array is sorted!\"];\n");
      out.write("// set the array to start at 0\n");
      out.write("var i = 0;\n");
      out.write("\n");
      out.write("var speed = 2000;\n");
      out.write("var speed1 = 2000;\n");
      out.write("var minSpeed = 3000;\n");
      out.write("var maxSpeed = 0;\n");
      out.write("\n");
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
      out.write("i = (i == imageArray.length - 1) ? i : i + 1;\n");
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
      out.write(" i = (i > 0) ? i - 1 : i;\n");
      out.write("var div = document.getElementById('slideshowdiv');\n");
      out.write("\n");
      out.write("div.innerHTML = '<img src=\"' + imageArray[i] + '\" />';\n");
      out.write("var div1 = document.getElementById('slideshowdiv1');\n");
      out.write("div1.innerHTML = steps[i];\n");
      out.write("\n");
      out.write("stopShow();\n");
      out.write("};\n");
      out.write("function displayNextImage() {\n");
      out.write("              \n");
      out.write("\t\t\t  timer=setTimeout('slidenext()',500);\n");
      out.write("          };\n");
      out.write("\n");
      out.write("          function displayPreviousImage() {\n");
      out.write("             \n");
      out.write("\t\t\t \t\t\t  timer=setTimeout('slidepre()',500);\n");
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
      out.write("    </ul>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("</div>\n");
      out.write("</br></br>\n");
      out.write("<div class=\"container\" style=\"background-color:#e6ffe6;border-radius:7px;\"id=\"tut\"></br>\n");
      out.write("<b></b><h2 style=\"font-size:23px;color:black;text-align:center\">Description</h2></b>\n");
      out.write("<p class=\"card-text\" style=\"font-size:17px;\" >Bubble sort is a simple sorting algorithm. \n");
      out.write("This sorting algorithm is comparison-based algorithm in which each pair of adjacent elements is \n");
      out.write("compared and the elements are swapped if they are not in order.\n");
      out.write("Bubble sort,is also referred to as sinking sort.The algorithm,is named for the way smaller or \n");
      out.write("larger elements \"bubble\" to the top of the list. Although the algorithm is simple, \n");
      out.write("it is too slow and impractical for most problems.  Bubble sort can be practical if the input \n");
      out.write("is in mostly sorted order with some out-of-order elements nearly in position. \n");
      out.write("</p>\n");
      out.write("</br>\n");
      out.write("<b></b><h2 style=\"font-size:23px;color:black;text-align:center\">Complexity</h2></b>\n");
      out.write("<p class=\"card-text\" style=\"font-size:17px;\" ><b>Case 1)</b> O(n) (Best case) This time complexity can \n");
      out.write("occur if the array is already sorted, and that means that no swap occurred and only 1 iteration of\n");
      out.write(" n elements.<br/>\n");
      out.write("<b>Case 2)</b> O(n^2) (Worst case) The worst case is if the array is already sorted but in descending \n");
      out.write("order. This means that in the first iteration it would have to look at n elements, then after that\n");
      out.write(" it would look n - 1 elements (since the biggest integer is at the end) and so on and so forth\n");
      out.write(" till 1 comparison occurs. Big-O = n + n - 1 + n - 2 ... + 1 = (n*(n + 1))/2 = O(n^2).\n");
      out.write("</br></br>\n");
      out.write("<b>Case 3)</b> O(n^2) (Average case) The average case is if the array elements lies somewhere \n");
      out.write("between worst case and best case.\n");
      out.write("</br></br>\n");
      out.write("The only significant advantage that bubble sort has over most other algorithms, even quicksort,\n");
      out.write(" but not insertion sort, is that the ability to detect that the list is sorted efficiently is\n");
      out.write(" built into the algorithm. When the list is already sorted (best-case), the complexity of bubble\n");
      out.write(" sort is only O(n). By contrast, most other algorithms, even those with better average-case \n");
      out.write(" complexity, perform their entire sorting process on the set and thus are more complex. However, \n");
      out.write(" not only does insertion sort share this advantage, but it also performs better on a list that is \n");
      out.write(" substantially sorted (having a small number of inversions). \n");
      out.write("Bubble sort should be avoided in the case of large collections. It will not be efficient in the \n");
      out.write("case of a reverse-ordered collection. \n");
      out.write("\n");
      out.write("</p>\n");
      out.write("<b></b><h2 style=\"font-size:23px;color:black;text-align:center\">Use</h2></b>\n");
      out.write("<p class=\"card-text\" style=\"font-size:17px;\" >\n");
      out.write("Although bubble sort is one of the simplest sorting algorithms to understand and implement, \n");
      out.write("its O(n2) complexity means that its efficiency decreases dramatically on lists of more than a \n");
      out.write("\n");
      out.write("small number of elements. Even among simple O(n2) sorting algorithms, algorithms like insertion\n");
      out.write(" sort are usually considerably more efficient. </br></br>\n");
      out.write("Due to its simplicity, bubble sort is often used to introduce the concept of an algorithm,\n");
      out.write(" or a sorting algorithm, to introductory computer science students. However, some researchers \n");
      out.write(" such as Owen Astrachan have gone to great lengths to disparage bubble sort and its continued \n");
      out.write(" popularity in computer science education, recommending that it no longer even be taught.</br></br>\n");
      out.write(" Bubble sort is asymptotically equivalent in running time to insertion sort in the worst case,\n");
      out.write(" but the two algorithms differ greatly in the number of swaps necessary. Experimental results \n");
      out.write(" such as those of Astrachan have also shown that insertion sort performs considerably better even \n");
      out.write(" on random lists. For these reasons many modern algorithm textbooks avoid using the bubble sort \n");
      out.write(" algorithm in favor of insertion sort.</br> </br>\n");
      out.write("Bubble sort also interacts poorly with modern CPU hardware. It produces at least twice as many \n");
      out.write("writes as insertion sort, twice as many cache misses, and asymptotically more branch mispredictions.\n");
      out.write(" Experiments by Astrachan sorting strings in Java show bubble sort to be roughly one-fifth as fast\n");
      out.write(" as an insertion sort and 70% as fast as a selection sort.</br></br>\n");
      out.write("In computer graphics bubble sort is popular for its capability to detect a very small error \n");
      out.write("(like swap of just two elements) in almost-sorted arrays and fix it with just linear complexity \n");
      out.write("(2n). For example, it is used in a polygon filling algorithm, where bounding lines are sorted by\n");
      out.write(" their x coordinate at a specific scan line (a line parallel to the x axis) and with incrementing\n");
      out.write(" y their order changes (two elements are swapped) only at intersections of two lines. Bubble sort\n");
      out.write(" is a stable sort algorithm, like insertion sort. \n");
      out.write(" </br></br>\n");
      out.write("</p>\n");
      out.write("</div>\n");
      out.write("</br></br>\n");
      out.write("<div class=\"container\" style=\"background-color:#e6ffe6;border-radius:7px;\"id=\"algo\"></br>\n");
      out.write("<b></b><h1 style=\"font-size:23px;color:black;text-align:center\">Algorithm</h1></b>\n");
      out.write("<p class=\"card-text\" style=\"font-size:17px;\" >The algorithm for bubble sort is shown as: \n");
      out.write("<br/></br>\n");
      out.write("void bubbleSort(int arr[], int n)</br> \n");
      out.write("{ </br>\n");
      out.write("   int i, j; </br>\n");
      out.write("   bool swapped; </br>\n");
      out.write("   for (i = 0; i < n-1; i++) </br>\n");
      out.write("   { </br>\n");
      out.write("     swapped = false; </br>\n");
      out.write("     for (j = 0; j < n-i-1; j++) </br>\n");
      out.write("     { </br>\n");
      out.write("        if (arr[j] > arr[j+1])</br> \n");
      out.write("        { </br>\n");
      out.write("           swap(&arr[j], &arr[j+1]);</br> \n");
      out.write("           swapped = true; </br>\n");
      out.write("        } </br>\n");
      out.write("     } </br>\n");
      out.write("  \n");
      out.write("     // IF no two elements were swapped by inner loop, then break </br>\n");
      out.write("     if (swapped == false) </br>\n");
      out.write("        break; </br>\n");
      out.write("   } </br>\n");
      out.write("} </br></br>\n");
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
      out.write("</br/></br/>\n");
      out.write("</div>\n");
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
