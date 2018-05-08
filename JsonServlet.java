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
 * ��doPost�����У�����http�������action�Ĳ�ͬ��������JsonTool�Ĳ�ͬʵ�ε�createJsonString������
 */
public class JsonServlet extends HttpServlet {
	//1.����һ��JsonService����
	private JsonService service;
	/**
	 *���췽��
	 */
	public JsonServlet() {
		super();
	}

	/**
	 * ����
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

		//������Ӧ�ĸ�ʽ
		response.setContentType("text/html");
		//2.�����������Ӧ�ı����ʽ
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		//�����������
		PrintWriter out = response.getWriter();
		//��doPost�����У�����http�������action�Ĳ�ͬ��������JsonTool�Ĳ�ͬʵ�ε�createJsonString������
		
		//3.��ʼ��һ������jsonString  �洢json����
		String jsonString = "";
		//4.��ȡHTTP���ݵ�action��ֵ
		String action = request.getParameter("action");
		
		//5.����action��ֵ������JsonTool�Ĳ�ͬʵ�ε�createJsonString������
		if(action.equals("book")) 
		{
			jsonString  = JsonTool.createJsonString("book", service.getBook());  //��һ����������
		}else if(action.equals("books"))
		{
			jsonString  = JsonTool.createJsonString("books", service.getListBook());  //�ڶ�����������
		}else if(action.equals("listMap"))
		{
			jsonString  = JsonTool.createJsonString("listMap", service.getListMap());  //��������������
		}
		
		
		//6.���jsonString�����ֵ
		out.println(jsonString);
		out.flush();
		out.close();
	}

	/**
	 * ��ʼ��
	 */
	public void init() throws ServletException {
		// Put your code here
		//7.ʵ����JsonService ����
		service  = new JsonService();
	}

}
