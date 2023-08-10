package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectWhereEmp {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		Connection conn = DriverManager.getConnection(url, user, passwd);
		Statement stmt = conn.createStatement();
		// DB 서버 접속 및 SQL 구문 변수 선언 ==> 전부 동일.
		
		ResultSet rs = stmt.executeQuery("SELECT ename, sal, comm "
				+ "FROM emp "
				+ "WHERE comm is not null");
		// 여기서 null로 된 것들은 값이 0을 뜻하는 것이 아닌, 아직 값들이 정해지지 않은 상태이다.
		
		System.out.printf("%8s%8s%8s\n", "성명", "급여", "커미션");
		System.out.println("  -----------------------------------");
		while (rs.next()) {
			System.out.printf("%10s%10d%10d\n", rs.getString("ename"), rs.getInt("sal"), rs.getInt("comm"));
		}
		rs.close();
		stmt.close();
		conn.close();
	}
}
