/**
 * 
 */
package dk.fuskogtusk.main;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * The Class Entry.
 *
 * @author Mikkel Vestergaard
 */
@WebServlet(name="Entry", urlPatterns={"/entry"})
public class Entry extends HttpServlet
{

	private static final long serialVersionUID = 9082461292866154654L;

	@Override
	public void init() throws ServletException {
		super.init();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	{
		//http://localhost:8080/MagicPiMirror/entry
		
		//Set attributes for file
		request.setAttribute("cake", "Banan roulade!");

		try 
		{
			//Forward request
			RequestDispatcher view = request.getRequestDispatcher("/index.jsp");
	        view.forward(request, response);    
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

	@Override
	public void destroy() 
	{
		// resource release
		super.destroy();
	}
}
