package jdbcProject.com.yedam.user;

import java.sql.*;

import jdbcProject.com.yedam.Dao;

public class UserDao {
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	String sql;

	private void close() {
		try {
			if (conn != null) {
				conn.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (rs != null) {
				rs.close();
			}
			
		} catch (Exception e) {

		}
	}

	public boolean add(UserVo user) {
		sql = "insert into tbl_users (user_id, user_pw, user_name) values (?,?,?)";
		conn = Dao.getConnect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, user.getUserId());
			psmt.setString(2, user.getUserPw());
			psmt.setString(3, user.getUserName());
			
			int r = psmt.executeUpdate(); //쿼리 실행
			if(r>0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return false;
	}

	public boolean modify(UserVo user) {
		
		close();
		return false;
	}
	public UserVo search(String id) {
		sql = "select * from tbl_users where user_id = ?";
		conn = Dao.getConnect();
		UserVo user = new UserVo();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if(rs.next()) {
				user.setUserId(rs.getString("user_id"));
				user.setUserPw(rs.getString("user_pw"));
				user.setUserName(rs.getString("user_name"));
				user.setUserBirth(rs.getString("user_birth"));
				user.setUserPhone(rs.getString("user_phone"));
				user.setUserAddr(rs.getString("user_addr"));
				return user;
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return null;
	}
}
