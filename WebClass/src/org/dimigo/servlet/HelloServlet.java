package org.dimigo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloSurvlet
 */
@WebServlet("/HelloSurvlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//요청데이터 처리
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		System.out.println("id : %s, name : %s/n");
		
		//출력 데이터 Content type 설정
		response.setContentType("text/html; charset-utf-8'");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet Test</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello, Servlet</h1>");
		out.println("<h2>안녕, 서블릿</h2>");		
		out.println("<h2>id : " + id + ", name : " + name + "</h2>");		
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost() 호출됨");
		doGet(request, response);
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init() 호출");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	
		System.out.println("service() 호출");
		super.service(req, resp);
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy() 호출111");
	}
}
