

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class First
 */
@WebServlet("/First")
public class First implements Servlet {
	private static final long serialVersionUID = 1L;
	private ServletConfig config = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public First() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		System.out.println("Servlet is Created");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("Servlet is Destroyed");
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "CopyRigth Version 2018:"; 
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("servlet in service");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.print("<h1>Hello Mahesh</h1>");
		out.println("</html>");
		
	}

}
