package jdbcProject.com.yedam.user;

import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		UserDao dao = new UserDao();

		while (true) {
			System.out.println("1.추가 2.조회 3.수정 4.삭제 5.종료");
			System.out.print("선택> ");
			menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:
				System.out.print("id> ");
				String id = sc.nextLine();
				System.out.print("pw> ");
				String pw = sc.nextLine();
				System.out.print("name> ");
				String name = sc.nextLine();
				UserVo user = new UserVo();
				
				user.setUserId(id);
				user.setUserPw(pw);
				user.setUserName(name);
				
				if(dao.add(user)) {
					System.out.println("처리 성공");
				}else {
					System.out.println("처리 실패");
				}
				
				break;
			case 2:
				System.out.print("id> ");
				String id = sc.nextLine();
				
				
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;

			}

		}
	}
}
