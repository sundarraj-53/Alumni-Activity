package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>login</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    <style>\n");
      out.write("    @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@500&display=swap');\n");
      out.write("        body{\n");
      out.write("            margin: 0;\n");
      out.write("            font-family: 'Poppins', sans-serif;\n");
      out.write("            background-color: #774360;\n");
      out.write("        }\n");
      out.write("        .head{\n");
      out.write("            border-radius: 10px;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 10px 10px 10px 10px;\n");
      out.write("            background-color: #4C3A51;\n");
      out.write("        }\n");
      out.write("        section{\n");
      out.write("            \n");
      out.write("            margin-top: 10vh;\n");
      out.write("        } .container{\n");
      out.write("            background: #fff;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            padding: 20px 20px 20px 20px;\n");
      out.write("            margin: auto;\n");
      out.write("            border: 3px solid green;\n");
      out.write("            padding: 10px;\n");
      out.write("        }\n");
      out.write("        a{\n");
      out.write("            text-decoration-style: none;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <section>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h3 class=\"text-white head\">Login Details</h3><hr>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <img src=\"login.png\" class=\"img-fluid\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 col-md-4\">\n");
      out.write("                    <form class= \"form-group\" action=\"\" method=\"get\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <input type=\"text\" class=\"form-control form-control\"name=\"uname\" id=\"uname\" placeholder=\"Enter the username\">\n");
      out.write("                                <br>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <input type=\"text\" class=\"form-control form-control\"name=\"umail\" id=\"upass\" placeholder=\"Mail ID\">\n");
      out.write("                                <br>\n");
      out.write("                              </div>\n");
      out.write("                            <input type=\"password\" class=\"form-control form-control-lg\"name=\"upass\" id=\"upass\" placeholder=\"Enter the password\">\n");
      out.write("                        <div class=\"\"><br><p class=\"me-3\"></p>\n");
      out.write("                            <button class=\"btn btn-lg btn-primary me-5\">signup</button>\n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");

    String a = request.getParameter("uname");
    String e = request.getParameter("umail");
    String g = request.getParameter("upass");
    String host= "jdbc:mysql://localhost:3306/login?useSSL=false";
    Connection con = null;
    PreparedStatement stmt = null;
    Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(host,"root","Sundarraj@143");
        stmt = con.prepareStatement("INSERT INTO login(name, email,pass) VALUES(?,?,?);");
        stmt.setString(1,a);
        stmt.setString(2,e);
        stmt.setString(3,g);
        stmt.executeUpdate();
//        response.sendRedirect("index.jsp");

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
