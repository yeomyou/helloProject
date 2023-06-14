package com.yedam.phonebook;
//p Info : 이름 연락처

//p CompanyInfo :회사포함.
//p UnivInfo : 학교 포함
//p BookManager : 기능 포함
//menuChoiceException, 메뉴: INIT_MENU, INPUT_SELECT 
//메뉴출력 : MenuViewer

public class PhoneBookApp {
	public static void main(String[] args) {
		PhoneBookManager app = PhoneBookManager.getInstance();
		int menu;
		UserCheck userCheck = UserCheck.getInstance();

		// userCheck.loginCheck(id,pw);
		String id;
		String pw;
		boolean login = false;
		while (true) {
			System.out.println("ID를 입력하세요.");
			id = MenuViewer.sc.nextLine();
			System.out.println("PW를 입력하세요.");
			pw = MenuViewer.sc.nextLine();

			if (userCheck.loginCheck(id, pw)) {
				login = true;
				break;
			}else {
				System.out.println("ID 혹은 PW가 틀렸습니다. 다시 입력해주세요. ");
			}
		}

		while (login) {
			try {
				MenuViewer.showMenu();
				menu = MenuViewer.sc.nextInt();
				MenuViewer.sc.nextLine();

				if (menu < INIT_MENU.INPUT || menu > INIT_MENU.EXIT) {
					throw new MenuChoiceException(menu);
				}
				switch (menu) {
				case INIT_MENU.INPUT:
					app.inputData();
					break;

				case INIT_MENU.SEARCH:
					app.searchData();
					break;
				case INIT_MENU.DELETE:
					app.deleteData();
					break;
				case INIT_MENU.EXIT:
					app.storeToFile();
//					app.storeToStream();
					return;
				}

			} catch (MenuChoiceException e) {
				e.showWrongChoice();
			}
		}
	}
}
