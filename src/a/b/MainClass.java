package a.b;

public class MainClass {
	
	public static void main(String ar[]) {
		
		// User user = new User(new MysqlDataBase() , new OracleDataBase());
		//this is a new comment
		User user = new User(new DerbyDataBase());
		user.addUser("Ram");
	}	

}
