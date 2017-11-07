/**
 * 
 */
package dk.fuskogtusk.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Mikkel Vestergaard
 *
 */
public class Hello extends HttpServlet
{

	private static final long serialVersionUID = 9082461292866154654L;

	@Override
	public void init() throws ServletException {
		super.init();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//http://localhost:8080/MagicPiMirror/
		
		// Set response content type
		response.setContentType("text/html");

		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		out.println("<h1>Jordbær!</h1>");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

	@Override
	public void destroy() 
	{
		// resource release
		super.destroy();
	}
}
