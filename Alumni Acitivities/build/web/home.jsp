<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    <style>
    @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@500&display=swap');
        body{
            margin: 0;
            font-family: 'Poppins', sans-serif;
            background-color: #774360;
        }
        .head{
            border-radius: 10px;
            text-align: center;
            padding: 10px 10px 10px 10px;
            background-color: #4C3A51;
        }
        section{
            
            margin-top: 10vh;
        } .container{
            background: #fff;
            border-radius: 10px;
            padding: 20px 20px 20px 20px;
            margin: auto;
            border: 3px solid green;
            padding: 10px;
        }
        a{
            text-decoration-style: none;
        }
    </style>
</head>
<body>
    <section>
        <div class="container">
            <h3 class="text-white head">Login Details</h3><hr>
            <div class="row">
                <div class="col">
                    <img src="login.png" class="img-fluid" alt="">
                </div>
                <div class="col-md-6 col-md-4">
                    <form class= "form-group" action="" method="get">
                        <div class="row">
                            <div class="col">
                                <input type="text" class="form-control form-control"name="uname" id="uname" placeholder="Enter the username">
                                <br>
                            </div>
                            <div class="col">
                                <input type="text" class="form-control form-control"name="umail" id="upass" placeholder="Mail ID">
                                <br>
                              </div>
                            <input type="password" class="form-control form-control-lg"name="upass" id="upass" placeholder="Enter the password">
                        <div class=""><br><p class="me-3"></p>
                            <button class="btn btn-lg btn-primary me-5">signup</button>
                        </div>
                        </div>
                    </form>
        </div>
    </section>
</body>
</html>

<%
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
%>