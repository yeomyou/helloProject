package jdbcProject.com.yedam.user;

import java.util.List;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		UserDao dao = new UserDao();
		loop: while (true) {
			System.out.println("1.추가 2.조회 3.수정 4.삭제 5.전부 조회 6. 종료");
			System.out.print("선택> ");
			menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {
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

				if (dao.add(user)) {
					System.out.println("처리 성공");
				} else {
					System.out.println("처리 실패");
				}
			} else if (menu == 2) {
				System.out.print("id> ");

				String id = sc.nextLine();

				UserVo user = dao.search(id);
				if (user == null) {
					System.out.println("조회된 결과가 없습니다.");
				} else {
					System.out.println(user.toString());
				}
			} else if (menu == 3) {
				System.out.print("수정할 id> ");
				String id = sc.nextLine();
				System.out.print("pw> ");
				String pw = sc.nextLine();
				System.out.print("name> ");
				String name = sc.nextLine();
				System.out.print("birth> ");
				String birth = sc.nextLine();
				System.out.print("phone> ");
				String phone = sc.nextLine();
				System.out.print("addr> ");
				String addr = sc.nextLine();

				UserVo user = new UserVo(id, pw, name, birth, phone, addr);
				if (dao.modify(user)) {
					System.out.println("수정 성공");
				} else {
					System.out.println("수정 실패");
				}

			} else if (menu == 4) {
				System.out.print("id> ");
				String id = sc.nextLine();

				if (dao.delete(id)) {
					System.out.println("삭제 성공");
				} else {
					System.out.println("삭제 실패");
				}
				
				
			}else if(menu ==5) {
				List<UserVo> list = dao.list();
				
				if(list.size()==0) {
					System.out.println("결과가 없습니다.");
				}else {
					for(UserVo user : list) {
						System.out.println(user.toString());
					}
				}
				
			}else if (menu == 6) {
				System.out.println("종료합니다.");
				break loop;
			}

		}
		System.out.println("end.");
	}
}
