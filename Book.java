package com.etc.entity;
/*
 * ʵ���� Book
 * 3������ ���  bookid bookname booktype
 * 
 */
public class Book {

	//����3������
    private int bookid;
	private String bookname;
	private String booktype;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBooktype() {
		return booktype;
	}
	public void setBooktype(String booktype) {
		this.booktype = booktype;
	}

	//��װ  ��ݼ�   shift+alt+S 

	//���췽��
	public Book(int bookid, String bookname, String booktype) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.booktype = booktype;
	}
	public Book() {
		super();
	}
	//toString()����
	
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname
				+ ", booktype=" + booktype + "]";
	}

	
	
	
}
