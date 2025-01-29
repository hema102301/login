package com.login.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.model.Login;
import com.login.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginservlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LoginService ls = new LoginService();	
		Login user = null;
		String destpage = "login-form.jsp";
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		user = new Login(uname,pwd);
		ls.validateUser(user);
		if(user != null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			destpage = "index.jsp";
		}else {
			String msg = "invalid user/password";
			request.setAttribute("msg", msg);
		}
		RequestDispatcher r = request.getRequestDispatcher(destpage);
		r.forward(request,response);
	}

}
