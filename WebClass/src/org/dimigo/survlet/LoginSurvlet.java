package org.dimigo.survlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

/**
 * Servlet implementation class LoginSurvlet
 */
@WebServlet("/login")
public class LoginSurvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginSurvlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.printf("id : %s, pw : %s",id,pw);
		
		response.setContentType("application/json; charset = utf-8");
		PrintWriter out = response.getWriter();
		
		/*
		 * {
		 * 		"id" : id
		 * }
		 */
//		out.println("{");
//		out.println("\"id\":" + "\"" + id + "\"");
//		out.println("}");
		
		//JSON Simple library
//		JSONObject json = new JSONObject();
//		json.put("id", id);
//		System.out.println(json.toJSONString());
//		out.write(json.toJSONString());
		
		//Gson library
		JsonObject json = new JsonObject();
		json.addProperty("id", id);
		out.println(json.toString());
	}

}
