import com.mysql.cj.protocol.Resultset;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;;
import java.io.*;
import static java.lang.System.out;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author selvaraj
 */
@WebServlet("/registerr")

public class registerr extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
       
    }
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException,IOException {
        response.setContentType("text/html;charset=UTF-8");
            String dbDriver = "com.mysql.jdbc.Driver";
            String dbURL = "jdbc:mysql://localhost:3306/";
            String dbName = "alumni";
            String dbUsername = "root";
            String dbPassword = "Sundarraj@143";
           
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        int phone = Integer.parseInt(request.getParameter("phone"));
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String d=request.getParameter("date");
        String department = request.getParameter("department");
        String year = request.getParameter("year");
        try{
        Class.forName(dbDriver);
        Connection con = DriverManager.getConnection(dbURL + dbName,dbUsername, dbPassword);
       
       
//        st.executeUpdate("insert into register values('"+fname+"','"+lname+"','"+email+"',"+phone+",'"+year+"','"+department+"','"+gender+"','"+d+"');");
        PreparedStatement stmt=con.prepareStatement("Insert into register values(?,?,?,?,?,?,?,?)");
        stmt.setString(1, fname);
        stmt.setString(2,lname );
        stmt.setString(3, email);
        stmt.setInt(4,phone );
        stmt.setString(5,year);
        stmt.setString(6,department);
        stmt.setString(7,gender);
        stmt.setString(8,d);
        stmt.executeUpdate();
           
           
         
       
       
        out.print("Data stored successsfully");
           
        }
//        out.print("Data Stored Successfully");
         catch(SQLException e){
            System.out.print("null");
        } catch (ClassNotFoundException ex) {
            System.out.print("null");
        }

        }
               

}
