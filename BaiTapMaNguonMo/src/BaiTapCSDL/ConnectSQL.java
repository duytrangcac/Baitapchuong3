package BaiTapCSDL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectSQL  {
	        	 public Connection	connect=null;
	        	 
	        	public ConnectSQL(String s) throws SQLException {
	        	 try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					String url ="jdbc:sqlserver://DUYHV\\SQLEXPRESS:1433;databaseName="+s+";integratedSecurity=true";
					String user="sa";
					String pass="To2blMA6";
					connect=DriverManager.getConnection(url,user,pass);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					System.err.println(e.getMessage()+"/n"+e.getClass()+"/n"+e.getCause());
	        	 }}
}