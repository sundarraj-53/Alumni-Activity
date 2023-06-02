/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.registeration;

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
@WebServlet("/hello")

public class registeration extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        
    }
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException,IOException {
        response.setContentType("text/html;charset=UTF-8");
            String dbDriver = "com.mysql.jdbc.Driver";
            String dbURL = "jdbc:mysql:// localhost:3306/";
            String dbName = "alumni?useSSL=false";
            String dbUsername = "root";
            String dbPassword = "Sundarraj@143";
            
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String d=request.getParameter("date");
        String department = request.getParameter("department");
        String year = request.getParameter("year");
        try{
        Class.forName(dbDriver);
        Connection con = DriverManager.getConnection(dbURL + dbName,dbUsername, dbPassword);
        Statement st = con.createStatement();
        
        st.executeUpdate("insert into registeration values('"+fname+"','"+lname+"','"+email+"',"+phone+",'"+year+"','"+department+"','"+gender+"','"+d+"');");
        
        out.print("Data stored successsfully");
            
        }
         catch(SQLException e){
             Logger.getLogger(registeration.class.getName()).log(Level.SEVERE, null, e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registeration.class.getName()).log(Level.SEVERE, null, ex);
        }

        }
                

}