package com.kakao.web.sign.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kakao.web.sign.model.SignUpService;
import com.kakao.web.sign.model.SignUpServiceImpl;
import com.kakao.web.sign.model.dao.SignUpDao;
import com.kakao.web.sign.model.dao.SignUpDaoImpl;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/signUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SignUpServiceImpl signUpService;
	
	public SignUp() {
		signUpService = new SignUpServiceImpl();
		
	}
	
    private SignUpDao signUpDao = new SignUpDaoImpl();
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		request.getRequestDispatcher("WEB-INF/views/sign_up_email.jsp").forward(request, response);
	}
	
	@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			response.setCharacterEncoding("UTF-8");
			String submitStatus = request.getParameter("submit_status");
			
			if (submitStatus.equals("email")) {

				String id = request.getParameter("id");
				
				int flag = signUpDao.idCheck(id);
				request.setAttribute("id", id);
				
				if(flag == 1) {
					
					request.setAttribute("flag", flag);
					
					
					request.getRequestDispatcher("WEB_INF/views/sign_up_email.jsp").forward(request, response);
				} else {
					request.getRequestDispatcher("WEB-INF/views/sign_up_password.jsp").forward(request, response);
				}
			} else if(submitStatus.equals("password")) {
				request.getRequestDispatcher("WEB-INF/views/sign_up_repassword.jsp").forward(request, response);
			} else if(submitStatus.equals("repassword")) {
				request.getRequestDispatcher("WEB-INF/views/sign_up_name.jsp").forward(request, response);
			} else if(submitStatus.equals("name")) {
				request.getRequestDispatcher("WEB-INF/views/sign_up_phone.jsp").forward(request, response);
			} else if(submitStatus.equals("phone")) {
				String submitFlag = request.getParameter("submit_flag");
				
				if(submitFlag.equals("1")) {
					
				}
			} else {
				System.out.println("접속오류!(잘못된 접근)");
			}
			System.out.println("post요청");
		}

}
