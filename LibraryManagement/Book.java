package LibraryManagement;

import java.util.ArrayList;

public class Book {
	
	 private String bookName;
	 private String authorName;
	 private boolean checkedOut;
	 private int bookId;
	 private int count;
	
	public Book(int bookId,String bookName,String authorName,int count)
	{
		this.bookName=bookName;
		this.authorName=authorName;
		this.checkedOut=false;
		this.bookId=bookId;
		this.count=count;
	}
	
	public String getBookName()
	{
		return bookName;
	}
	
	public String getAuthorName()
	{
		return authorName;
	}
	
	public boolean isCheckedOut()
	{
		return checkedOut ;
	}
	
	
	
	public void checkOut()
	{
		checkedOut=true;
	}
	
	public void returnBook()
	{
		checkedOut=false;
	}
	
	public int getId()
	{
		return bookId;
	}
	

	
	public int getCount()
	{
		return count;
	}
	
	
	
	

	
	public String toString()
	{
		return ( "Title: " + bookName+ ", Author: " + authorName +"  ,checked out : "+(checkedOut ? "yes" :"No")+ " ,book id :"+bookId +" ,books count :"+count) ;		
		

	}
	
	
	
	

}



