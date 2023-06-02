<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<html>

<head>
    <style>
body {font-family: Arial, Helvetica, sans-serif;
      background:#cccccc;
text-align:center;}
/*form {border: 3px solid #f1f1f1;}*/

input[type=text], input[type=password] {
  /*width: 100%;*/
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  /*border: 1px solid #ccc;*/
  box-sizing: border-box;
}

button {
  background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  /*margin: 8px 0;*/
  border: none;
  cursor: pointer;
  /*width: 100%;*/
}

button:hover {
  opacity: 0.8;
}

.cancelbtn {
  width: auto;
  /*padding: 10px 18px;*/
  background-color: #f44336;
}

.imgcontainer {
  text-align: center;
  /*margin: 24px 0 12px 0;*/
}


/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 30px) {
  span.psw {
     display: block;
     float: none;
  }
  .cancelbtn {
     /*width: 100%;*/
  }
  .col{
      border: 3px solid #f1f1f1;
  }
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Login</title>

</head>

<body>
    <section>
        <div class="container">
            <h3 class="text-white head">Login </h3><hr>
            <div class="row">
                <div class="col">
                    <img src="login.png" class="img-fluid" alt="">
                </div>
                <div class="col-md-6 col-md-4">
                    <form class= "form-group" action="" method="post">
                        <div class="row">
                            <div class="col">
                                <input type="text" class="form-control form-control"name="uname" id="uname" placeholder="Enter the username">
                                <br>
                            </div>
                            <input type="password" class="form-control form-control-lg"name="upass" id="upass" placeholder="Enter the password">
                        <div class=""><br><p class="me-3"></p>
                            <button class="btn btn-lg btn-primary me-5">signin</button>
                        </div>
                        </div>
                    </form>
        </div>
    </section>

<%
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
%>

</body>

</html>