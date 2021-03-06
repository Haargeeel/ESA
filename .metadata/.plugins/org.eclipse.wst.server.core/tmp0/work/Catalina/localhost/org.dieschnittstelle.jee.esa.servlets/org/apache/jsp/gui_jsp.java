/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.33
 * Generated at: 2015-01-24 22:05:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.dieschnittstelle.jee.esa.crm.entities.AbstractTouchpoint;
import org.dieschnittstelle.jee.esa.crm.entities.StationaryTouchpoint;
import java.util.List;

public final class gui_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Touchpoints</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!--  print out the class hierarchy -->\r\n");
      out.write("\t");
      out.print(this);
      out.write("\r\n");
      out.write("\t<br />\r\n");
      out.write("\t");

		Class klass = this.getClass();
		String tabs = "";
		do {
	
      out.print(tabs + klass);
      out.write("<br />\r\n");
      out.write("\t");

		klass = klass.getSuperclass();
			tabs += "\t";
		} while (klass != null);
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!--  access session attributes and their constituents -->\r\n");
      out.write("\t<h3>Touchpoints</h3>\r\n");
      out.write("\r\n");
      out.write("\t<!-- create a table -->\r\n");
      out.write("\t<table border=\"1\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>Id</th>\r\n");
      out.write("\t\t\t<th>Name</th>\r\n");
      out.write("\t\t\t<th>Strasse</th>\r\n");
      out.write("\t\t\t<th>Postleitzahl</th>\r\n");
      out.write("\t\t\t<th>Ort</th>\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<!--  iterate over the touchpoints -->\r\n");
      out.write("\t\t");

			List<AbstractTouchpoint> touchpoints = (List<AbstractTouchpoint>) request
					.getAttribute("touchpoints");
			for (AbstractTouchpoint touchpoint : touchpoints) {
				if (touchpoint instanceof StationaryTouchpoint) {
		
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>");
      out.print(touchpoint.getId());
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(touchpoint.getName());
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(((StationaryTouchpoint) touchpoint).getLocation()
							.getStreet());
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.print(((StationaryTouchpoint) touchpoint).getLocation()
							.getHouseNr());
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(((StationaryTouchpoint) touchpoint).getLocation()
							.getZipCode());
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(((StationaryTouchpoint) touchpoint).getLocation()
							.getCity());
      out.write("</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<!--  we add a delete button -->\r\n");
      out.write("\t\t\t\t<form method=\"POST\"\r\n");
      out.write("\t\t\t\t\taction=\"/org.dieschnittstelle.jee.esa.servlets/gui/touchpoints/delete/");
      out.print(touchpoint.getId());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"delete\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");

			}
			}
		
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<!--  create a new touchpoint -->\r\n");
      out.write("\t<h3>New Touchpoint</h3>\r\n");
      out.write("\t<form method=\"POST\" action=\"/org.dieschnittstelle.jee.esa.servlets/gui/touchpoints/create/\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>Name:</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"name\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>Street and HouseNr:</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"street\"><input\r\n");
      out.write("\t\t\t\t\ttype=\"text\" size=\"4\" name=\"houseNr\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t<td>Zip Code and City:</td>\r\n");
      out.write("\t\t\t<td><input type=\"number\" name=\"zipCode\" size=\"5\" ><input\r\n");
      out.write("\t\t\t\ttype=\"text\" name=\"city\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<input type=\"submit\" value=\"create\" />\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
