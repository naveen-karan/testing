<%-- 
    Document   : signin
    Created on : Aug 18, 2019, 9:50:54 AM
    Author     : MRuser
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" type="text/css" href="Data/bootstrap.min.css"/>
         <script src="Data/sweetalert2.all.js"></script>
    </head>
    <body>
        
        <%
            String pwd="";
            pwd= request.getParameter("pwd");
            %>
        <% if(pwd!=null)
        {
            %>
              <script>
            swal("Congrates: Password Recovered","<%=pwd %>","success");
        </script>
            <%
        }
        %>
        
        
         <%
            String check="";
            check= request.getParameter("check");
            %>
        <% if(check!=null)
        {
            %>
              <script>
            swal("OOPS","Invalide Email and Password","error");
        </script>
            <%
        }
        %>
        
        <form method="post" action="signin">
 <div style="width:390px;box-shadow: 10px 10px 16px gray; ;margin-left:500px;margin-top:130px;">
 
     <!-- image logo -->
     <div>
         <img src="Data/img1.jpg"
              style="width:100px;height:90px;margin-left:147px;"></img>
     </div>
     
     <!-- email -->
  <div class="input-group">
    <span class="input-group-addon" style="width:90px;">User Name</span>
    <input style="width:295px;"  type="text" class="form-control" name="username" placeholder="Email" required>
  </div>
     
     <!-- password -->
  <div class="input-group">
    <span class="input-group-addon" style="width:90px;">Password</span>
    <input  style="width:300px;"  type="password" class="form-control" name="pwd" placeholder="Password" required>
  </div>  
     
     <!-- submit button -->
     <div class="input-group">
         <input type="submit" value="LogIn" class="btn btn-primary btn-block" style="width:390px;background-color: #66afe9;" />
     </div>
     
 </div>
          
          <!-- create account -->
          <div style="width:390px;margin-left:562px;margin-top:30px;font-family: monospace;">
              Not Registered?  
              <a href="index.jsp"  > Create An Account </a>
          </div>
          
          <!-- forgot password -->
          <div style="width:390px;margin-left:622px;margin-top:10px;font-family: monospace;">
              <a href="forget.jsp"  > Forgot Password </a>
          </div>
</form>
        
    </body>
</html>
