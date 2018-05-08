package com.etc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etc.service.JsonService;
import com.etc.tool.JsonTool;
/*
 * 在doPost方法中，根据http请求参数action的不同，而调用JsonTool的不同实参的createJsonString方法。
 */
public class JsonServlet extends HttpServlet {
	//1.创建一个JsonService对象
	private JsonService service;
	/**
	 *构造方法
	 */
	public JsonServlet() {
		super();
	}

	/**
	 * 销毁
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//设置响应的格式
		response.setContentType("text/html");
		//2.设置请求和响应的编码格式
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		//设置输出方法
		PrintWriter out = response.getWriter();
		//在doPost方法中，根据http请求参数action的不同，而调用JsonTool的不同实参的createJsonString方法。
		
		//3.初始化一个对象jsonString  存储json数据
		String jsonString = "";
		//4.获取HTTP传递的action的值
		String action = request.getParameter("action");
		
		//5.根据action的值，调用JsonTool的不同实参的createJsonString方法。
		if(action.equals("book")) 
		{
			jsonString  = JsonTool.createJsonString("book", service.getBook());  //第一种数据类型
		}else if(action.equals("books"))
		{
			jsonString  = JsonTool.createJsonString("books", service.getListBook());  //第二种数据类型
		}else if(action.equals("listMap"))
		{
			jsonString  = JsonTool.createJsonString("listMap", service.getListMap());  //第三种数据类型
		}
		
		
		//6.输出jsonString对象的值
		out.println(jsonString);
		out.flush();
		out.close();
	}

	/**
	 * 初始化
	 */
	public void init() throws ServletException {
		// Put your code here
		//7.实例化JsonService 对象
		service  = new JsonService();
	}

}
