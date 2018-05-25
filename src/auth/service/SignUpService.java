package auth.service;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import platform.constants.PlatformConstants;

@WebServlet("/signup")
public class SignUpService extends  HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.getWriter().println("Hello");
    }
	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
		String line = null;
		BufferedReader reader = request.getReader();
	    while ((line = reader.readLine()) != null)
	      System.out.println(line);
	    
	    System.out.println(PlatformConstants.DB_DRIVER);
        response.getWriter().println("bolo");
    }
}
