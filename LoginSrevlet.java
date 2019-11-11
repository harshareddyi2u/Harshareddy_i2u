package com.harsha;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginSrevlet
 */
@WebServlet("/Login")
public class LoginSrevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Uname = request.getParameter("UserName");
		String Password = request.getParameter("Password");
		//PrintWriter out = response.getWriter();
		if(Uname.equals("harshavardhan")&& Password.equals("Tenayagen7@")) {
			HttpSession session = request.getSession();
			session.setAttribute("UserName", Uname);
			response.sendRedirect("WelcomePage.jsp");
			//System.out.println("i m here");
		}
		else {
			response.sendRedirect("LoginPage.jsp");
		}
	}

}
