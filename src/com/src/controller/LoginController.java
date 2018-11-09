package com.src.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.model.LoginModel;
import com.src.service.DbIntr;
import com.src.service.FactoryClass;
import com.src.validation.Encryption;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		password=Encryption.encryptPassword(password);
		DbIntr intr = FactoryClass.getInstance();
		LoginModel lm=new LoginModel();
		lm.setUsername(username);
		lm.setPassword(password);
		try {
			boolean login = intr.login(lm);
			if(login) {
				//go to welcome page
				request.setAttribute("username", username);
				
				request.getRequestDispatcher("Welcome.java").forward(request, response);
			}
			else {
				request.setAttribute("message", "invalid username and password");
				request.getRequestDispatcher("Login.jsp").forward(request, response);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
