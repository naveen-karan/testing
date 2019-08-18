<%-- 
    Document   : forget
    Created on : Aug 18, 2019, 2:22:21 PM
    Author     : MRuser
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="Data/bootstrap.min.css" />
        
         <script src="Data/sweetalert2.all.js"></script>
    </head>
    <body>
        <!-- pop up window for email not registered " -->
         <%
            String pwd="";
            pwd= request.getParameter("pwd");
            %>
        <% if(pwd!=null)
        {
            %>
              <script>
            swal("OOPS","Account Not Registered !","error");
        </script>
            <%
        }
        %>
        
        <form method="get" action="forget">
 <div style="width:390px;box-shadow: 10px 10px 16px gray; ;margin-left:500px;margin-top:110px;">
 
     <div class="form-group" style="font-size:25px;width:350px;margin:auto;">
         <label for="name">Forgot Password </label>   
     </div>
 
       <br>
     <div class="form-group" style="width:350px;margin:auto;">
    <label for="email">UserName:</label>
    <input type="text" class="form-control" name="username" required>
  </div>
    <br>
       <div class="input-group" style="width:350px;margin:auto;">
         <input type="submit" value="Get Password" class="btn btn-primary btn-block" style="background-color: #66afe9;"  />
     </div>
       <br>
 </div>
          
          <div style="width:390px;margin-left:562px;margin-top:30px;font-family: monospace;">
              Already Registered?  
              <a href="signin.jsp"  > SignIn Here </a>
          </div>
</form>
        
        
    </body>
</html>
