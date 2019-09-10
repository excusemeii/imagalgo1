<%@page import="java.sql.*"%>
<%

    String uname = request.getParameter("uname").trim();
    String password = request.getParameter("password").trim();
    try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/imagalgodb","root","root");
            Statement st=conn.createStatement();
            String qlog="insert into login values('"+uname+"','"+password+"','true')";
            String q = "select * from signup where uname='" +uname + "' and password='" +password + "'";
      
	 ResultSet rs;
    rs = st.executeQuery(q);
   
    if (rs != null) {
        if (rs.next()) {
            if (rs.getString("password").equals(password)) {
                session.setAttribute("uname",uname);
            out.print("<script>alert('login successful');window.location.href='secondpage.jsp';</script>");
            } else {
                out.print("<script>alert('Invalid User Details');window.location.href='login.jsp';</script>");

            }

        } else {
            out.print("<script>alert('Invalid User Details');window.location.href='login.jsp';</script>");

        }

    }
         else {
                out.print("<script>alert('Invalid User Details');window.location.href='login.jsp';</script>");

         }
    }
    catch(Exception e)
    {
    out.println(e);
    }
%>