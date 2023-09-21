<%@ page language="java" import="java.sql.*, javax.sql.*" %>
<HTML>
<HEAD>
<TITLE> Connection with DataBase  </TITLE>
</HEAD>
 <body>
  <%
        Connection con=null;
	try
	{
            System.out.println(request.getServerName());
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","srdemo","oracle");
            Statement stat=con.createStatement();
            ResultSet rs=stat.executeQuery("select * from Products");
    %>
  <table border="2">
   <%
				while(rs.next())
				{
			%>
    
   <tr>
    <td>
     <%= rs.getString(1) %>
    </td>
    <td>
     <%= rs.getString(2) %>
    </td>
    <td>
     <%= rs.getString(3) %>
    </td>
   </tr>
    
   <%
				}
			%>
  </table>
  <%
				}
				catch(Exception e)
				{
					out.println(" Cannot Display the Records ");
					System.out.println(e);

				}
				%>
 </body>
</HTML> 
