package LibraryManagement;

public class User {
	
	private String userName;
	private String passWord;
	private int userId;
	
	public  User(String userName,String passWord,int userId)
	{
		this.userName=userName;
		this.passWord=passWord;
		this.userId=userId;
	}

	public String getUserName()
	{
		return userName;
	}
	
	public String getPassWord()
	{
		return passWord;
		
	}
	
	public int getUserId()
	{
		return userId;
	}
}
