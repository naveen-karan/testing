package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"Data/bootstrap.min.css\"/>\n");
      out.write("         <script src=\"Data/sweetalert2.all.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

            String pwd="";
            pwd= request.getParameter("pwd");
            
      out.write("\n");
      out.write("        ");
 if(pwd!=null)
        {
            
      out.write("\n");
      out.write("              <script>\n");
      out.write("            swal(\"Congrates: Password Recovered\",\"");
      out.print(pwd );
      out.write("\",\"success\");\n");
      out.write("        </script>\n");
      out.write("            ");

        }
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("         ");

            String check="";
            check= request.getParameter("check");
            
      out.write("\n");
      out.write("        ");
 if(check!=null)
        {
            
      out.write("\n");
      out.write("              <script>\n");
      out.write("            swal(\"OOPS\",\"Invalide Email and Password\",\"error\");\n");
      out.write("        </script>\n");
      out.write("            ");

        }
        
      out.write("\n");
      out.write("        \n");
      out.write("        <form method=\"post\" action=\"signin\">\n");
      out.write(" <div style=\"width:390px;box-shadow: 10px 10px 16px gray; ;margin-left:500px;margin-top:130px;\">\n");
      out.write(" \n");
      out.write("     <!-- image logo -->\n");
      out.write("     <div>\n");
      out.write("         <img src=\"Data/img1.jpg\"\n");
      out.write("              style=\"width:100px;height:90px;margin-left:147px;\"></img>\n");
      out.write("     </div>\n");
      out.write("     \n");
      out.write("     <!-- email -->\n");
      out.write("  <div class=\"input-group\">\n");
      out.write("    <span class=\"input-group-addon\" style=\"width:90px;\">User Name</span>\n");
      out.write("    <input style=\"width:295px;\"  type=\"text\" class=\"form-control\" name=\"username\" placeholder=\"Email\" required>\n");
      out.write("  </div>\n");
      out.write("     \n");
      out.write("     <!-- password -->\n");
      out.write("  <div class=\"input-group\">\n");
      out.write("    <span class=\"input-group-addon\" style=\"width:90px;\">Password</span>\n");
      out.write("    <input  style=\"width:300px;\"  type=\"password\" class=\"form-control\" name=\"pwd\" placeholder=\"Password\" required>\n");
      out.write("  </div>  \n");
      out.write("     \n");
      out.write("     <!-- submit button -->\n");
      out.write("     <div class=\"input-group\">\n");
      out.write("         <input type=\"submit\" value=\"LogIn\" class=\"btn btn-primary btn-block\" style=\"width:390px;background-color: #66afe9;\" />\n");
      out.write("     </div>\n");
      out.write("     \n");
      out.write(" </div>\n");
      out.write("          \n");
      out.write("          <!-- create account -->\n");
      out.write("          <div style=\"width:390px;margin-left:562px;margin-top:30px;font-family: monospace;\">\n");
      out.write("              Not Registered?  \n");
      out.write("              <a href=\"index.jsp\"  > Create An Account </a>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("          <!-- forgot password -->\n");
      out.write("          <div style=\"width:390px;margin-left:622px;margin-top:10px;font-family: monospace;\">\n");
      out.write("              <a href=\"forget.jsp\"  > Forgot Password </a>\n");
      out.write("          </div>\n");
      out.write("</form>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
