package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <style>\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;\n");
      out.write("      background:#cccccc;\n");
      out.write("text-align:center;}\n");
      out.write("/*form {border: 3px solid #f1f1f1;}*/\n");
      out.write("\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("  /*width: 100%;*/\n");
      out.write("  padding: 12px 20px;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  display: inline-block;\n");
      out.write("  /*border: 1px solid #ccc;*/\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button {\n");
      out.write("  background-color: #04AA6D;\n");
      out.write("  color: white;\n");
      out.write("  padding: 14px 20px;\n");
      out.write("  /*margin: 8px 0;*/\n");
      out.write("  border: none;\n");
      out.write("  cursor: pointer;\n");
      out.write("  /*width: 100%;*/\n");
      out.write("}\n");
      out.write("\n");
      out.write("button:hover {\n");
      out.write("  opacity: 0.8;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".cancelbtn {\n");
      out.write("  width: auto;\n");
      out.write("  /*padding: 10px 18px;*/\n");
      out.write("  background-color: #f44336;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".imgcontainer {\n");
      out.write("  text-align: center;\n");
      out.write("  /*margin: 24px 0 12px 0;*/\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/* Change styles for span and cancel button on extra small screens */\n");
      out.write("@media screen and (max-width: 30px) {\n");
      out.write("  span.psw {\n");
      out.write("     display: block;\n");
      out.write("     float: none;\n");
      out.write("  }\n");
      out.write("  .cancelbtn {\n");
      out.write("     /*width: 100%;*/\n");
      out.write("  }\n");
      out.write("  .col{\n");
      out.write("      border: 3px solid #f1f1f1;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("\n");
      out.write("<title>Login</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <section>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h3 class=\"text-white head\">Login </h3><hr>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <img src=\"login.png\" class=\"img-fluid\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 col-md-4\">\n");
      out.write("                    <form class= \"form-group\" action=\"\" method=\"post\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <input type=\"text\" class=\"form-control form-control\"name=\"uname\" id=\"uname\" placeholder=\"Enter the username\">\n");
      out.write("                                <br>\n");
      out.write("                            </div>\n");
      out.write("                            <input type=\"password\" class=\"form-control form-control-lg\"name=\"upass\" id=\"upass\" placeholder=\"Enter the password\">\n");
      out.write("                        <div class=\"\"><br><p class=\"me-3\"></p>\n");
      out.write("                            <button class=\"btn btn-lg btn-primary me-5\">signin</button>\n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");

    String a = request.getParameter("uname");
    String g = request.getParameter("upass");
    String host= "jdbc:mysql://localhost:3306/login?useSSL=false";
    Connection con = null;
    PreparedStatement stmt = null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(host,"root","Sundarraj@143");
        stmt = con.prepareStatement("select * from  login where name=? AND pass=?;");
        stmt.setString(1,a);
        stmt.setString(2,g);
        ResultSet rs=stmt.executeQuery();
        if(rs.next()){
           response.sendRedirect("index.jsp");
        }
    }
    catch(Exception e){
        System.out.println(e);
    }

      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
