package jdbcProject.com.yedam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("id> ");
		String id = sc.nextLine();



		Connection conn = null;
		PreparedStatement psmt = null;
		String sql = "delete from tbl_users where user_id = ? ";
		//prepare 방식

		try {

			conn = Dao.getConnect();
			psmt = conn.prepareStatement(sql);
			
			//prepare 방식 ->

			psmt.setString(1, id);
			int r = psmt.executeUpdate();
			if (r > 0) {
				System.out.println("처리 성공");
			} else {
				System.out.println("처리 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				psmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("end del.");
	}
}
