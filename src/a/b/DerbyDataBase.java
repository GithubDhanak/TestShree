package a.b;

public class DerbyDataBase implements Database {

	@Override
	public void add(String data) {
		System.out.println( data + " is stored in Derby database");
		
	}

}
