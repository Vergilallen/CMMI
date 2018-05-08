package com.etc.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.etc.entity.Book;
import com.etc.entity.Book;

/*
 * JsonService �������ɰ���JSON���ݵ�Java�������������List  Map ����
 */
public class JsonService {
	
	/*
	 * һ���������ͣ���ȡBook����
	 */
	public Book getBook()
	{
		//ʵ����һ��Book����
		Book book  = new Book(1001, "Java�������", "������");
		return book;
		
	}
	
	/*
	 * �ڶ����������ͣ���ȡBook�б����  List
	 */

	public List<Book> getListBook()
	{
		//1.����һ���б�list
		
		List<Book> list  = new  ArrayList<Book>();
		//2.����һ��Book����
		Book Book1  = new Book(1002, "AndroidӦ�ÿ���", "������");
		Book Book2  = new Book(1003, "��ѧӢ��", "������");
		Book Book3  = new Book(1004, "�ߵ���ѧ", "��ѧ��");
		//3.������Book�������list�б���
		list.add(Book1);
		list.add(Book2);
		list.add(Book3);
		return list;
		
	}
	

	
	/*
	 * �������������ͣ���ȡBook�б���� list��Map<key,value>)
	 */
	
	public List<Map<String,Object>> getListMap()
	{
		//1.����һ���б����
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		
		//2.����2��Map����
		Map<String,Object> map1 = new HashMap<String, Object>();
		Map<String,Object> map2 = new HashMap<String, Object>();
		
		//3.��Book�������Ϣ���뵽Map��
		//���⣺map��������Ԫ��
		
		map1.put("bookid", 1001);
		map1.put("bookname", "Java�������");
		map1.put("booktype", "������");
		
		map2.put("bookid", 1002);
		map2.put("bookname", "AndroidӦ�ÿ���");
		map2.put("booktype", "������");
		
		
		//4.��map�������list�б���
		list.add(map1);
		list.add(map2);
		return list;
		
	}
	
	
	
}
