package org.apache.jsp.Student_0020Zone.merge;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class merge_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("var imageArray = ['merge1.png','merge2.png','merge3.png','merge4.png','merge5.png','merge6.png','merge7.png','merge8.png',\n");
      out.write("'merge9.png','merge10.png','merge11.png','merge12.png','merge13.png','merge14.png','merge15.png','merge16.png'];\n");
      out.write("var steps = [\"Intially the elements given for sorting are as shown:\",\"For dividing the array into two halves mid is calculated using the the index of left most and right most element, mid=(l+r)/2\",\n");
      out.write("\"After finding mid the array is divided into two parts\",\"From the two parts obtained by dividing the initial array we divide further into more smaller parts\",\n");
      out.write("\"This process of dividing continues until we obtain the parts of array that have only single element\",\n");
      out.write("\"After obtaining the arrays that have only single element we merge them by comparing to form array having two elements that are sorted\",\n");
      out.write("\"To further merge the array form array of greater number of elements and for this smallest element is moved first\",\n");
      out.write("\"Then the next smallest element is sorted\",\"Then this process continues to sort the elements in incraesing order \",\n");
      out.write("\"Now to further merge the array the elements of the two halves are compared and the smallest in both the arrays become the first element of the merged array\",\n");
      out.write("\"Now the second smallest element is selected and put into the merged array as second element\",\n");
      out.write("\"Now the third smallest element is selected and put into the merged array as third element\",\n");
      out.write("\"Now the next smallest element is selected and put into the merged array as next element\",\n");
      out.write("\"Now the next smallest element is selected and put into the merged array as next element\",\n");
      out.write("\"Now the next smallest element is selected and put into the merged array as next element\",\n");
      out.write("\"Finally all the elements are sorted and we get following sequence\"];\n");
      out.write("// set the array to start at 0\n");
      out.write("var i = 0;\n");
      out.write("\n");
      out.write("var speed = 2000;\n");
      out.write("var speed1 = 2000;\n");
      out.write("var minSpeed = 3000;\n");
      out.write("var maxSpeed = 0;\n");
      out.write("var pre = 0;\n");
      out.write("// create function 'slideShow'\n");
      out.write("function slideShow() {\n");
      out.write("// creates variable 'div' to load images into a div selected using 'getElementById'\n");
      out.write("var div = document.getElementById('slideshowdiv');\n");
      out.write("div.innerHTML = '<img src=\"' + imageArray[i] + '\" />';\n");
      out.write("var div1 = document.getElementById('slideshowdiv1');\n");
      out.write("div1.innerHTML = steps[i];\n");
      out.write("pre = i;\n");
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
      out.write("    if(i > pre)\n");
      out.write("    i--;\n");
      out.write(" i = (i > 0) ? i - 1 : 0;\n");
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
      out.write("<p class=\"card-text\" style=\"font-size:17px;\" >Quicksort (sometimes called partition-exchange sort) is an efficient sorting \n");
      out.write("algorithm, serving as a systematic method for placing the elements of a random access file or an array in order. Developed by \n");
      out.write("British computer scientist Tony Hoare in 1959 and published in 1961, it is still a commonly used algorithm for sorting. When \n");
      out.write("implemented well, it can be about two or three times faster than its main competitors, merge sort and heapsort.</br> \n");
      out.write("Quicksort is a comparison sort, meaning that it can sort items of any type for which a \"less-than\" relation (formally, a total\n");
      out.write(" order) is defined. In efficient implementations it is not a stable sort, meaning that the relative order of equal sort items \n");
      out.write(" is not preserved. Quicksort can operate in-place on an array, requiring small additional amounts of memory to perform the sorting.\n");
      out.write(" It is very similar to selection sort, except that it does not always choose worst-case partition. \n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("</p>\n");
      out.write("<b></b><h2 style=\"font-size:23px;color:black;text-align:center\">Complexity</h2></b>\n");
      out.write("<p class=\"card-text\" style=\"font-size:17px;\" >\n");
      out.write("<br></br> \n");
      out.write("<b>Case 1)</b> O(nlogn) (Worst case) \n");
      out.write("</br></br>\n");
      out.write("<b>Case 2)</b>  O(nlogn) (Average case) \n");
      out.write("</br></br>\n");
      out.write("<b>Case 3)</b>  O(nlogn) (Best case) \n");
      out.write("</br></br>\n");
      out.write("</p>\n");
      out.write("<!--<b></b><h2 style=\"font-size:23px;color:black;text-align:center\">Use</h2></b>-->\n");
      out.write("<p class=\"card-text\" style=\"font-size:17px;\" >\n");
      out.write(" </br></br>\n");
      out.write("</p>\n");
      out.write("</div>\n");
      out.write("</br></br>\n");
      out.write("<div class=\"container\" style=\"background-color:#e6ffe6;border-radius:7px;\"id=\"algo\"></br>\n");
      out.write("<b></b><h1 style=\"font-size:23px;color:black;text-align:center\">Algorithm</h1></b>\n");
      out.write("<p class=\"card-text\" style=\"font-size:17px;\" >The algorithm for  merge sort is shown as: \n");
      out.write("</br></br>\n");
      out.write("void merge(int arr[], int l, int m, int r) </br>\n");
      out.write("{ </br>\n");
      out.write("    int i, j, k;</br> \n");
      out.write("    int n1 = m - l + 1; </br>\n");
      out.write("    int n2 =  r - m; </br>\n");
      out.write("  \n");
      out.write("    /* create temp arrays */</br>\n");
      out.write("    int L[n1], R[n2]; </br>\n");
      out.write("  \n");
      out.write("    /* Copy data to temp arrays L[] and R[] */</br>\n");
      out.write("    for (i = 0; i < n1; i++) </br>\n");
      out.write("        L[i] = arr[l + i]; </br>\n");
      out.write("    for (j = 0; j < n2; j++) </br>\n");
      out.write("        R[j] = arr[m + 1+ j]; </br>\n");
      out.write("  \n");
      out.write("    /* Merge the temp arrays back into arr[l..r]*/</br>\n");
      out.write("    i = 0; // Initial index of first subarray </br>\n");
      out.write("    j = 0; // Initial index of second subarray </br>\n");
      out.write("    k = l; // Initial index of merged subarray </br>\n");
      out.write("    while (i < n1 && j < n2) </br>\n");
      out.write("    { </br>\n");
      out.write("        if (L[i] <= R[j]) </br>\n");
      out.write("        { </br>\n");
      out.write("            arr[k] = L[i];</br> \n");
      out.write("            i++;</br> \n");
      out.write("        } </br>\n");
      out.write("        else</br>\n");
      out.write("        { </br>\n");
      out.write("            arr[k] = R[j]; </br>\n");
      out.write("            j++; </br>\n");
      out.write("        } </br>\n");
      out.write("        k++; </br>\n");
      out.write("    } </br>\n");
      out.write("  \n");
      out.write("    /* Copy the remaining elements of L[], if there </br>\n");
      out.write("       are any */\n");
      out.write("    while (i < n1) </br>\n");
      out.write("    { </br>\n");
      out.write("        arr[k] = L[i];</br> \n");
      out.write("        i++; </br>\n");
      out.write("        k++; </br>\n");
      out.write("    } </br>\n");
      out.write("  \n");
      out.write("    /* Copy the remaining elements of R[], if there </br>\n");
      out.write("       are any */</br>\n");
      out.write("    while (j < n2) </br>\n");
      out.write("    { </br>\n");
      out.write("        arr[k] = R[j]; </br>\n");
      out.write("        j++; </br>\n");
      out.write("        k++; </br>\n");
      out.write("    } </br>\n");
      out.write("}</br> \n");
      out.write("  \n");
      out.write("/* l is for left index and r is right index of the \n");
      out.write("   sub-array of arr to be sorted */\n");
      out.write("void mergeSort(int arr[], int l, int r) </br>\n");
      out.write("{ </br>\n");
      out.write("    if (l < r)</br> \n");
      out.write("    { </br>\n");
      out.write("        // Same as (l+r)/2, but avoids overflow for \n");
      out.write("        // large l and h </br>\n");
      out.write("        int m = l+(r-l)/2; </br>\n");
      out.write("  \n");
      out.write("        // Sort first and second halves </br>\n");
      out.write("        mergeSort(arr, l, m); </br>\n");
      out.write("        mergeSort(arr, m+1, r); </br>\n");
      out.write("  \n");
      out.write("        merge(arr, l, m, r);</br> \n");
      out.write("    } </br>\n");
      out.write("} </br>\n");
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