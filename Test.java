package com.etc.test;

import com.etc.service.JsonService;
import com.etc.tool.JsonTool;

/*
 * 测试类
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Json数据格式的测试结果：");
		
		JsonService  service   = new JsonService();
		
		//第一种数据类型
		String jsonString1  = JsonTool.createJsonString("book", service.getBook());
		//第二种数据类型
		String jsonString2  = JsonTool.createJsonString("books", service.getListBook());
		//第三种数据类型
		String jsonString3  = JsonTool.createJsonString("listMap", service.getListMap());
	
		
		//输出相关的数据
		System.out.println("测试结果1："+jsonString1+"\n");
		System.out.println("测试结果2："+jsonString2+"\n");
		System.out.println("测试结果3："+jsonString3);
	
		
				
		

	}

}
