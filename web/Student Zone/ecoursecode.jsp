<%@page import="java.sql.*"%>
<%

    String security = request.getParameter("security").trim();
    String fnname= request.getParameter("course").trim();
    try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/imagalgodb","root","root");
            Statement st=conn.createStatement();
            String q = "select * from signup where security='" +security + "'";
      
	 ResultSet rs;
    rs = st.executeQuery(q);
  String name=(String)session.getAttribute("uname");
    if (rs != null) {
        if (rs.next()) {
            
                st=conn.createStatement();
                st.executeUpdate("update signup set course='"+fnname+"'where uname='"+name+"'");
            out.print("<script>alert('Course changed successfully');window.location.href='myinfo.jsp';</script>");
            
          
        }
         else{
            out.print("<script>alert('Error in changing Course');window.location.href='myinfo.jsp';</script>");

        }

    } 
    else 
    {
        out.print("<script>alert('Error in changing Course');window.location.href='myinfo.jsp';</script>");
    }
    }
    catch(Exception e)
    {
    out.println(e);
    }
%>