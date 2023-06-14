package jdbcProject.com.yedam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("id> ");
		String id = sc.nextLine();
		System.out.print("pw> ");
		String pw = sc.nextLine();
		System.out.print("name> ");
		String name = sc.nextLine();
		

		Connection conn = null;
		Statement stmt = null;
		String sql = "insert into tbl_users (user_id, user_pw, user_name) values ('"+id+"', '"+pw+"', '"+name+"')";
		try {

			conn = Dao.getConnect();

			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);  // dml 처리 = Update 
			if(r>0) {
				System.out.println("처리 성공");
			} else {
				System.out.println("처리 실패");
			}
		} catch(Exception e) {
			System.out.println("처리 중 에러 발생");
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("end.");
	}
}
