package com.kakao.web.sign.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kakao.web.sign.service.SignInService;
import com.kakao.web.sign.service.SignInServiceImpl;

/**
 * Servlet implementation class SignIn
 */
@WebServlet("/signIn")
public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	private SignInService signInService;
	
	public SignIn() {
		signInService = new SignInServiceImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/views/sign_in.jsp").forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login_id = request.getParameter("login_id");
		String login_password = request.getParameter("login_password");
		
		int flag = signInService.signIn(login_id, login_password);
		if(flag == 2) {
			System.out.println("로그인 성공");
			response.sendRedirect("index");
		}else {
			request.setAttribute("login_id", login_id);
			request.setAttribute("login_password", login_password);
			request.setAttribute("flag", flag);
			request.getRequestDispatcher("/WEB-INF/views/sign_in.jsp").forward(request, response);
		}
	}

}
