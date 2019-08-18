package a.b;

public class User {
	
   // MysqlDataBase mysqlDataBase ;
   // OracleDataBase oracleDataBase;
    
   /* public User(MysqlDataBase mysqlDataBase , OracleDataBase oracleDataBase) {
    	this.mysqlDataBase = mysqlDataBase;
    	this.oracleDataBase = oracleDataBase; 
    }*/
   
/*    
    public void addUser(String data) {
    	mysqlDataBase.add(data);
    	oracleDataBase.add(data);
    }*/
	
	Database db;
	public User(Database db) {
		this.db = db;
	}
	// 
   public void addUser(String data) {
	   db.add(data);
   }
}
