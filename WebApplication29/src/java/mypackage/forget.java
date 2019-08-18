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

/**
 *
 * @author MRuser
 */
public class forget extends HttpServlet {
@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        String pwd="";
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
        rs=st.executeQuery("select * from register where username='"+username+"'");

        if(rs.next())
        {
         pwd=rs.getString("pwd");
         resp.sendRedirect("signin.jsp?pwd='"+pwd+"'");
        }
        else
        {
            resp.sendRedirect("forget.jsp?pwd='"+pwd+"'");
        }
        
        }
        catch(Exception e)
        {
        System.out.println(e);
        }


    }
 
}
