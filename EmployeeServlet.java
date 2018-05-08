package com.etc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 * 构造方法
	 */
	public EmployeeServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//doGet()  执行doPost() 方法
		this.doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//设置响应的类型
		response.setContentType("text/html");
		//设置请求的编码格式  UTf-8
		request.setCharacterEncoding("utf-8");
		//设置响应的编码格式UTF-8
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		//设计查询的索引number
		String  flag  = request.getParameter("action");
		//设置一个返回信息
		String msg = null;
		if(flag  == null)
		{
			//json  数据格式
			msg  = "{book:[{bookid:'1001',bookname:Java程序设计,booktype:开发类},{bookid:'1002',bookname:Android应用开发,booktype:开发类},{bookid:'1003',bookname:大学英语,booktype:语言类}{book:[{bookid:'1004',bookname:高等数学,booktype:数学类}]}";
			
		}
		else if (flag.equals("1001"))
		{
			msg = "{book:[{bookid:'1001',bookname:Java程序设计,booktype:开发类}]}";
		}
		else if (flag.equals("1002"))
		{
			msg = "{book:[{bookid:'1002',bookname:Android应用开发,booktype:语言类}]}";
		}	
		else if (flag.equals("1003"))
		{
			msg = "{book:[{bookid:'1003',bookname:大学英语,booktype:语言类}]}";
		}else if(flag.equals("1004"))
		{
			msg = "{book:[{bookid:'1004',bookname:高等数学,booktype:数学类}]}";
		}
		out.println(msg);
		
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
