package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forget_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Data/bootstrap.min.css\" />\n");
      out.write("        \n");
      out.write("         <script src=\"Data/sweetalert2.all.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- pop up window for email not registered \" -->\n");
      out.write("         ");

            String pwd="";
            pwd= request.getParameter("pwd");
            
      out.write("\n");
      out.write("        ");
 if(pwd!=null)
        {
            
      out.write("\n");
      out.write("              <script>\n");
      out.write("            swal(\"OOPS\",\"Account Not Registered !\",\"error\");\n");
      out.write("        </script>\n");
      out.write("            ");

        }
        
      out.write("\n");
      out.write("        \n");
      out.write("        <form method=\"get\" action=\"forget\">\n");
      out.write(" <div style=\"width:390px;box-shadow: 10px 10px 16px gray; ;margin-left:500px;margin-top:110px;\">\n");
      out.write(" \n");
      out.write("     <div class=\"form-group\" style=\"font-size:25px;width:350px;margin:auto;\">\n");
      out.write("         <label for=\"name\">Forgot Password </label>   \n");
      out.write("     </div>\n");
      out.write(" \n");
      out.write("       <br>\n");
      out.write("     <div class=\"form-group\" style=\"width:350px;margin:auto;\">\n");
      out.write("    <label for=\"email\">UserName:</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\" name=\"username\" required>\n");
      out.write("  </div>\n");
      out.write("    <br>\n");
      out.write("       <div class=\"input-group\" style=\"width:350px;margin:auto;\">\n");
      out.write("         <input type=\"submit\" value=\"Get Password\" class=\"btn btn-primary btn-block\" style=\"background-color: #66afe9;\"  />\n");
      out.write("     </div>\n");
      out.write("       <br>\n");
      out.write(" </div>\n");
      out.write("          \n");
      out.write("          <div style=\"width:390px;margin-left:562px;margin-top:30px;font-family: monospace;\">\n");
      out.write("              Already Registered?  \n");
      out.write("              <a href=\"signin.jsp\"  > SignIn Here </a>\n");
      out.write("          </div>\n");
      out.write("</form>\n");
      out.write("        \n");
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
