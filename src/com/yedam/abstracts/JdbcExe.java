package com.yedam.abstracts;

public class JdbcExe {
	public static void main(String[] args) {
		Dao dao = new MysqlDao();
		
		OracleDao odao = new OracleDao();
		
		dao.start();
		dao.add();
		dao.modify();
		dao.remove();
		dao.stop();
	}
}
