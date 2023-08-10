package jdbcexam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class VisitorList {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		Connection conn = DriverManager.getConnection(url,user,passwd);
		Statement stmt = conn.createStatement();
		
		// 프로그램에서 * 보다는 일일이 컬럼명을 입력하는 것을 권장한다.
		// ==> 읽기 쉽고, 빠르게 불러올 수 있다.
		// ==> 그럼에도 * 를 사용하는 것 또한 좋다.
		String sql = "SELECT id, name, writedate, memo FROM visitor";
		ResultSet rs = stmt.executeQuery(sql);		
		while(rs.next()) {
			System.out.print(rs.getString("id")+"\t");
			System.out.print(rs.getString("name")+"\t");
			System.out.print(rs.getString("writedate")+"\t");
			System.out.println(rs.getString("memo"));
		}	
		rs.close();
		stmt.close();
		conn.close();
	}
}




