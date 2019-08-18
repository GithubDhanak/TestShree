package a.b;

public class MainClass {
	
	public static void main(String ar[]) {
		
		// User user = new User(new MysqlDataBase() , new OracleDataBase());
		
		User user = new User(new DerbyDataBase());
		user.addUser("Ram");
	}	

}
