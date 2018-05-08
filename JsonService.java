package com.etc.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.etc.entity.Book;
import com.etc.entity.Book;

/*
 * JsonService 用于生成包含JSON数据的Java对象和容器对象（List  Map ）。
 */
public class JsonService {
	
	/*
	 * 一种数据类型：获取Book对象
	 */
	public Book getBook()
	{
		//实例化一个Book对象
		Book book  = new Book(1001, "Java程序设计", "开发类");
		return book;
		
	}
	
	/*
	 * 第二种数据类型：获取Book列表对象  List
	 */

	public List<Book> getListBook()
	{
		//1.创建一个列表list
		
		List<Book> list  = new  ArrayList<Book>();
		//2.创建一组Book对象
		Book Book1  = new Book(1002, "Android应用开发", "开发类");
		Book Book2  = new Book(1003, "大学英语", "语言类");
		Book Book3  = new Book(1004, "高等数学", "数学类");
		//3.将这组Book对象加入list列表中
		list.add(Book1);
		list.add(Book2);
		list.add(Book3);
		return list;
		
	}
	

	
	/*
	 * 第三种数据类型：获取Book列表对象 list（Map<key,value>)
	 */
	
	public List<Map<String,Object>> getListMap()
	{
		//1.创建一个列表对象
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		
		//2.创建2个Map对象
		Map<String,Object> map1 = new HashMap<String, Object>();
		Map<String,Object> map2 = new HashMap<String, Object>();
		
		//3.将Book对象的信息加入到Map中
		//问题：map中如何添加元素
		
		map1.put("bookid", 1001);
		map1.put("bookname", "Java程序设计");
		map1.put("booktype", "开发类");
		
		map2.put("bookid", 1002);
		map2.put("bookname", "Android应用开发");
		map2.put("booktype", "开发类");
		
		
		//4.将map对象添加list列表中
		list.add(map1);
		list.add(map2);
		return list;
		
	}
	
	
	
}
