package LibraryManagement;
import java.util.Scanner;
import java.util.ArrayList;

public class LibraryManagementSystem {
	
	
	public static void information(Library library)
	{
		
		Scanner input = new Scanner(System.in);
	     while(true)
	     {
	    	 
	    	 System.out.println("enter the range between 1 to 6 ");
	    	 System.out.println("1. add a book ");
	    	 System.out.println("2. display books ");
	    	 System.out.println("3. checkout a book ");
	    	 System.out.println("4. return a book ");
	    	 System.out.println("5. books count in library ");
	    	 System.out.println("6. exit to library ");
	    	 System.out.println("enter your choice :");
	    	 
	    	 int choice=input.nextInt();
	    	 input.nextLine();
	    	 switch(choice)
	    	 {
	    	 case 1:
	    		 System.out.println("enter the book id");
	    		 int total=input.nextInt();
	    		 System.out.println("Enter the title of the book: ");
                         String title = input.next();
                         System.out.println("Enter the author of the book: ");
                         String author = input.next();
                         input.nextLine();
                         System.out.println("enter book count");
                         int count=input.nextInt();
                         library.addBooks(new Book(total,title,author,count));
                          break;
	 	        
                
                 case 2:
	    		 library.display();
                         break;
	    		
	    	 case 3:
	    		 System.out.println("enter the book name to check out :");
	    		 String checkoutTitle=input.nextLine();
	    		 Book checkoutBook=library.findBook(checkoutTitle);
                         if(checkoutBook!=null)
	    		 {
	    			 if(!checkoutBook.isCheckedOut())
	    			 {
	    				 
	    				 checkoutBook.checkOut();
	    				 System.out.println(checkoutTitle + " is checked out ");
	    			 }
	    			 else 
	    			 {
	    				 System.out.println(checkoutTitle + "is not checked out ");
	    			 }
	    			
	    		 }
	    		 else
   			 {
   				 System.out.println(checkoutTitle + "not found in library ");
   			 }
	    		 break;
	    	 case 4:
	    		 
	    		 System.out.println("enter the book title to return :");
	    		 String returnTitle=input.nextLine();
	    		 Book returnBook=library.findBook(returnTitle);

	    		 if(returnBook!=null)
	    		 {
	    			 if(returnBook.isCheckedOut())
	    			 {
	    				 returnBook.returnBook();
	    				 System.out.println(returnTitle +" has been return ");
	    			 }
	    			 else
	    			 {
	    				 System.out.println(returnTitle +" is already checked out ");
	    			 }
	    		 }
	    		 else
	    		 {
	    			 System.out.println(returnTitle +" not found in library ");
	    		 }
	    		 break;
	    	 case 5:
	    		 library.count("wings of fire");
	    		 break;
	    	 case 6:
	    		 System.out.println("exit the library management system " );
	    		 input.close();
	    		 
	    		 break;
	    	default:
	    		System.out.println("invalid choice please try again ");
	    	 }
	     }
	     
	     

	}
	
	public static void selectLibrary(Library library,Library library1)
	{
		System.out.println("enter your choice to choose library");
		Scanner scanner=new Scanner(System.in);
	   	int choice=scanner.nextInt();
	   	System.out.println("select 1 for anna library and 2 for periyar library");
	   	
	   	switch(choice)
	   	{
	   	case 1:
	   		System.out.println("welcome to "+library.getLibraryName());
	   		information(library);
	   		break;
	   	case 2:
	   		System.out.println("welcome to"+library1.getLibraryName());
	   		information(library1);
	   		break;
	   	
	   	}
	}

	public static void login(Library library,Library library1)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the user details to login");
   		System.out.println("enter the user name");
   	    String name=input.nextLine();
   		System.out.println("enter the user pass word");
   	    String passWord=input.nextLine();
   		System.out.println("enter the user id");
   		int id=input.nextInt();
   		boolean ans=library.checkUserDetails(name, passWord, id);
   		if(ans)
   		{
   			selectLibrary(library,library1);
   		}
	}
	
	public static void main(String[] args)
	{
		

		Library library=new Library("Anna library");
	   	Library library1=new Library("Periyar library");
	   
	    
	   	
	   	
	   	library.addBooks(new Book(1,"aniladum munril","muthu kumar",1));
	   	library.addBooks(new Book(2,"poniyin selvan","kalki",3));
	   	library.addBooks(new Book(2,"poniyin selvan2","kalki",5));
	   	library.addBooks(new Book(3,"wings of fire","A.P.J",2));
	   	library.addBooks(new Book(4,"karuvachi kaviyam","viramuthu",1));
	   	library.addBooks(new Book(5,"sila nerangali sila manithargal","jeyakanthan",6));
	   	
	   	library1.addBooks(new Book(1,"children stories","suchila",5));
	   	library1.addBooks(new Book(2,"novels","krishna moorthy",4));
	   	
	   	library.addUser(new User("tamil","tamil12",123));
       
	   	Scanner input=new Scanner(System.in);
		System.out.println("enter the user details to login");
   		System.out.println("enter the user name");
   	    String name=input.nextLine();
   		System.out.println("enter the user pass word");
   	    String passWord=input.nextLine();
   		System.out.println("enter the user id");
   		int id=input.nextInt();
   		
   		boolean ans=library.checkUserDetails(name, passWord, id);
   		if(ans)
   		{
   			selectLibrary(library,library1);
   		}
   		else
   		{
   			login(library,library1);
   			
   		}

	  
	   	
	   

	   }

	
}
