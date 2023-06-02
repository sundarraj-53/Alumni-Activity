package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sample_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String userdbName;

String userdbPsw;

String dbUsertype;


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

      out.write('\n');
      out.write('\n');


Connection con= null;

PreparedStatement ps = null;

ResultSet rs = null;



String driverName = "com.mysql.jdbc.Driver";

String url = "jdbc:mysql://localhost:3306/record";

String user = "root";

String dbpsw = "root";



String sql = "select * from userdetail where name=? and password=? and usertype=?";



String name = request.getParameter("name");

String password = request.getParameter("password");

String usertype = request.getParameter("usertype");



if((!(name.equals(null) || name.equals("")) && !(password.equals(null) || 
password.equals(""))) && !usertype.equals("select"))

{

try{

Class.forName(driverName);

con = DriverManager.getConnection(url, user, dbpsw);

ps = con.prepareStatement(sql);

ps.setString(1, name);

ps.setString(2, password);

ps.setString(3, usertype);

rs = ps.executeQuery();

if(rs.next())

{ 

userdbName = rs.getString("name");

userdbPsw = rs.getString("password");

dbUsertype = rs.getString("usertype");

if(name.equals(userdbName) && password.equals(userdbPsw) && usertype.equals(dbUsertype))

{

session.setAttribute("name",userdbName);

session.setAttribute("usertype", dbUsertype); 

response.sendRedirect("welcome.jsp"); 

} 

}

else

response.sendRedirect("error.jsp");

rs.close();

ps.close(); 

}

catch(SQLException sqe)

{

out.println(sqe);

} 

}

else

{


      out.write("\n");
      out.write("\n");
      out.write("<center><p style=\"color:red\">Error In Login</p></center>\n");
      out.write("\n");
 

getServletContext().getRequestDispatcher("/home.jsp").include(request, 
response);

}


      out.write('\n');
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
