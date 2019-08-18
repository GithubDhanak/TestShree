package a.b;

public class OracleDataBase implements Database {
	
	 public void add(String data) {
	    	System.out.println( data + " is stored in Oracle database");
	    }
	 
	    public void add1(String data) {
	    	System.out.println( data + " is stored in Mysql database");
	    }

}
