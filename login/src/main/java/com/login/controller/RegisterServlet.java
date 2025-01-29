package com.login.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.model.Login;
import com.login.service.LoginService;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/registerservlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	LoginService ls = new LoginService();
	Login user = null;
	String uname = request.getParameter("uname");
	String pwd = request.getParameter("pwd");
	String email = request.getParameter("email");
	String phoneNum = request.getParameter("phonenum");
	user = new Login(uname,pwd,email,phoneNum);
	ls.registerUser(user);
	request.setAttribute("useradded", "useraddeddsucessfully");
	RequestDispatcher rs = request.getRequestDispatcher("login-form.jsp");
    rs.forward(request, response);
		
		
	}
	
}
