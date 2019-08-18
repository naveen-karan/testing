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
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author MRuser
 */
public class signin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String username,pwd;
      username=req.getParameter("username");
      pwd=req.getParameter("pwd");
        HttpSession session;
        Connection con;
        Statement st;
        ResultSet rs;
        try
        {
        String driver,url,user,upassword;
        driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        url="jdbc:sqlserver://localhost:1433;databaseName=project9";
        user="naveen"; upassword="1234";
        Class.forName(driver);
        con=DriverManager.getConnection(url,user,upassword);
        st=con.createStatement();
        rs=st.executeQuery("select * from register where username='"+username+"' and pwd='"+pwd+"'");

        if(rs.next())
        {
         session=req.getSession();
         session.setAttribute("session_pwd", pwd);
         session.setAttribute("session_username", username);
         resp.sendRedirect("welcome.jsp?query_username='"+username+"'");
        }
        else
        {
            resp.sendRedirect("signin.jsp?check=notok");
        }
        
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
    }

}
