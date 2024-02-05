package LibraryManagement;
import java.util.List;
import java.util.ArrayList;

public class Library {
	
	private String libraryName;
	
	public Library(String libraryName)
	{
		this.libraryName=libraryName;
	}
	
	public String getLibraryName()
	{
		return libraryName;
	}
    
	ArrayList<Book> books=new ArrayList();
	
	List<User> users=new ArrayList();
	

	public void addUser(User user)
	{
		users.add(user);
	}
	
	public void addBooks(Book book)
	{
		books.add(book);
	}
	
	public void  display()
	{
		for(Book book:books)
		{
			System.out.println(book);
		}
		
			
	}
	

   	
	
	public Book findBook(String title)
	{
		
	    for(Book book:books)
	    {
	    	if(book.getBookName().equalsIgnoreCase(title))
	    	{
	    		return book;
	    	}
	    }
	    return null;
	
	}
	

	
	public void count(String bookName)
	{
		for(Book book:books)
		{
			if(book.getBookName().equals(bookName))
			{
				 System.out.println("the book name is :"+book.getBookName()+"book count is :"+book.getCount());
			}
		}
		
	}
	
	public boolean checkUserDetails(String name,String pwd,int id)
	{
		boolean flag=false;
		for(User user:users)
		{
			if(user.getUserName().equals(name))
			{
			if(user.getPassWord().equals(pwd))
				{
			 if(user.getUserId()==id)
					{
						System.out.println("your login is successfully and choose library");
					flag=true;
					}
			 
			
				}
			}
			 else
			 {
				 System.out.println("invalid user information and try to login correct information");
			
			 }
		}
		return flag;

		
	}

	
	
		
				
	}
		
		
	
	
	
	

