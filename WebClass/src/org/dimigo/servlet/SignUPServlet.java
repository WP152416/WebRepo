package org.dimigo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.dimigo.vo.UserVO;

/**
 * Servlet implementation class SignUPServlet
 */
@WebServlet("/signup")
public class SignUPServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUPServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("jsp/signup.jsp");
		rd.forward(request, response);
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		//세션에 사용자 정보 생성
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		String nickname = request.getParameter("nickname");	
		
		boolean result = false;
		
		if(result){
			
			HttpSession session = request.getSession();
			UserVO user = new UserVO();
			
			user.setId(id);
			user.setName(name);
			user.setNickname(nickname);
			user.setPwd(pwd);
				
			session.setAttribute("user", user);
					
			RequestDispatcher rd = request.getRequestDispatcher("jsp/login.jsp");
			rd.forward(request, response);
					
		} else {
			HttpSession session = request.getSession();
			UserVO user = new UserVO();
			
			user.setId(id);
			user.setName(name);
			user.setNickname(nickname);
			user.setPwd(pwd);
			
			session.setAttribute("user", user);
			request.setAttribute("msg", "error");
			RequestDispatcher rd = request.getRequestDispatcher("jsp/signup.jsp");
			rd.forward(request, response);
			
		}
	}

}
