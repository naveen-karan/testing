<%-- 
    Document   : index
    Created on : Aug 18, 2019, 9:40:41 AM
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
         <form name="form1" method="post" action="signup">
 <div style="width:390px;box-shadow: 10px 10px 16px gray; ;margin-left:500px;margin-top:110px;">
 
     
     <div class="form-group" style="font-size:25px;width:350px;margin:auto;color:gray;">
         <label for="name" style="margin-top:7px;">Sign Up </label>   
     </div>
 
       <br>
     <div class="form-group" style="width:350px;margin:auto;">
    <label for="username">UserName:</label>
    <input type="text" class="form-control" name="username" placeholder="User Name" required>
  </div>
  <div class="form-group" style="width:350px;margin:auto;">
    <label for="pwd">Password:</label>
    <input type="password" class="form-control" name="pwd" placeholder="Password" required>
  </div>
   <div class="form-group" style="width:350px;margin:auto;">
    <label for="c_name">Customer Name</label>
    <input type="text" class="form-control" name="c_name" placeholder="Customer Name" required>
  </div> 
       <div class="form-group" style="width:350px;margin:auto;">
    <label for="email">Email</label>
    <input type="email" class="form-control" name="email" placeholder="Email" required>
  </div> 
       <br>
       <div class="input-group" style="width:350px;margin:auto;">
         <input type="submit" value="Register" class="btn btn-primary btn-block" style="background-color: #66afe9;"  />
     </div>
       <br>
 </div>
          
          <div style="width:390px;margin-left:562px;margin-top:30px;font-family: monospace;">
              Already Registered?  
              <a href="signin.jsp"  > SignIn Here </a>
          </div>
          
              <div style="color:red;font-weight:bold;width:390px;margin-left:592px;margin-top:30px;font-family: monospace;">
              
          </div>
</form>
    </body>
</html>
