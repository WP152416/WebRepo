package org.dimigo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.dimigo.vo.UserVO;

/**
 * Servlet implementation class BlogLoginServlet
 */
@WebServlet("/bloglogin")
public class BlogLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BlogLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("jsp/login.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.printf("id : %s, pw : %s",id,pw);
		
		response.setContentType("text/html; charset = utf-8");
		
		if("test@naver.com".equals(request.getParameter("id"))){
			//세션에 사용자 정보 생성
			HttpSession session = request.getSession();
			UserVO user = new UserVO();
			
			user.setId(id);
			user.setPwd(pw);
			
			session.setAttribute("user", user);
			RequestDispatcher rd = request.getRequestDispatcher("jsp/blog.jsp");
			rd.forward(request, response);
			
		} else {
			HttpSession session = request.getSession();
			UserVO user = new UserVO();
			
			user.setId(id);
			user.setPwd(pw);
			
			session.setAttribute("user", user);
			request.setAttribute("msg", "error");
			RequestDispatcher rd = request.getRequestDispatcher("jsp/login.jsp");
			rd.forward(request, response);
		}
	}
	
	@SuppressWarnings("unchecked")
	protected void doPost2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.printf("id : %s, pw : %s",id,pw);
			
		response.setContentType("application/json; charset = utf-8");
		PrintWriter out = response.getWriter();
	}

}
