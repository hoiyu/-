package Data;


	import java.sql.Connection;
	import java.sql.DriverManager;
import java.sql.PreparedStatement;

	import java.sql.SQLException;




	public class DataConnection {
		
		
		private static Connection getConnection(){
			String driver ="com.mysql.jdbc.Driver";
			String url ="jdbc:mysql://118.89.244.24:3306/rent_system";
			String account="root";
			String password = "123456";
			Connection conn = null;
			
			try {
				Class.forName(driver);
				conn=DriverManager.getConnection(url, account, password);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("数据库连接失败");
			}
			return conn;
		}
		
		public static PreparedStatement getPs(String sql) {
			Connection connection = getConnection();
			PreparedStatement ps = null;
			try {
				ps = connection.prepareStatement(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ps;
		}

		public static Object getStat() {
			// TODO Auto-generated method stub
			return null;
		}

		
		
		

		
	}



