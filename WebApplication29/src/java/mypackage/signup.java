/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class signup extends HttpServlet {

     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String username,pwd,c_name,email;
    username=req.getParameter("username");
    pwd=req.getParameter("pwd");
    c_name=req.getParameter("c_name");
    email=req.getParameter("email");
    
   
        Connection con;
        Statement st;
        try
        {
      
        String driver,url,user,upassword;
        driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        url="jdbc:sqlserver://localhost:1433;databaseName=project9";
        user="naveen"; upassword="1234";
        Class.forName(driver);
        con=DriverManager.getConnection(url,user,upassword);
        st=con.createStatement();
       int i=  st.executeUpdate("insert into register(username,pwd,c_name,email) values('"+username+"','"+pwd+"','"+c_name+"','"+email+"')");
       if(i>0)
       resp.sendRedirect("signin.jsp?data=ok");
        }
        catch(Exception e)
        {
        resp.sendRedirect("index.jsp?data=ok");
        }
    
   
    
}

    
}
