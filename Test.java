package com.etc.test;

import com.etc.service.JsonService;
import com.etc.tool.JsonTool;

/*
 * ������
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Json���ݸ�ʽ�Ĳ��Խ����");
		
		JsonService  service   = new JsonService();
		
		//��һ����������
		String jsonString1  = JsonTool.createJsonString("book", service.getBook());
		//�ڶ�����������
		String jsonString2  = JsonTool.createJsonString("books", service.getListBook());
		//��������������
		String jsonString3  = JsonTool.createJsonString("listMap", service.getListMap());
	
		
		//�����ص�����
		System.out.println("���Խ��1��"+jsonString1+"\n");
		System.out.println("���Խ��2��"+jsonString2+"\n");
		System.out.println("���Խ��3��"+jsonString3);
	
		
				
		

	}

}
