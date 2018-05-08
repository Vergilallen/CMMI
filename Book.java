package com.etc.entity;
/*
 * 实体类 Book
 * 3个属性 编号  bookid bookname booktype
 * 
 */
public class Book {

	//定义3个属性
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

	//封装  快捷键   shift+alt+S 

	//构造方法
	public Book(int bookid, String bookname, String booktype) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.booktype = booktype;
	}
	public Book() {
		super();
	}
	//toString()方法
	
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname
				+ ", booktype=" + booktype + "]";
	}

	
	
	
}
