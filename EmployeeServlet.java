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
	 * ���췽��
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

		//doGet()  ִ��doPost() ����
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

		//������Ӧ������
		response.setContentType("text/html");
		//��������ı����ʽ  UTf-8
		request.setCharacterEncoding("utf-8");
		//������Ӧ�ı����ʽUTF-8
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		//��Ʋ�ѯ������number
		String  flag  = request.getParameter("action");
		//����һ��������Ϣ
		String msg = null;
		if(flag  == null)
		{
			//json  ���ݸ�ʽ
			msg  = "{book:[{bookid:'1001',bookname:Java�������,booktype:������},{bookid:'1002',bookname:AndroidӦ�ÿ���,booktype:������},{bookid:'1003',bookname:��ѧӢ��,booktype:������}{book:[{bookid:'1004',bookname:�ߵ���ѧ,booktype:��ѧ��}]}";
			
		}
		else if (flag.equals("1001"))
		{
			msg = "{book:[{bookid:'1001',bookname:Java�������,booktype:������}]}";
		}
		else if (flag.equals("1002"))
		{
			msg = "{book:[{bookid:'1002',bookname:AndroidӦ�ÿ���,booktype:������}]}";
		}	
		else if (flag.equals("1003"))
		{
			msg = "{book:[{bookid:'1003',bookname:��ѧӢ��,booktype:������}]}";
		}else if(flag.equals("1004"))
		{
			msg = "{book:[{bookid:'1004',bookname:�ߵ���ѧ,booktype:��ѧ��}]}";
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
