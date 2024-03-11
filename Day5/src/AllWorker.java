import java.util.Scanner;

public class AllWorker {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PermanentManagement pManagement = new PermanentManagement();
		int num;

		while (true) {
			System.out.println("기능 입력 하세요(1.입력, 2.수정, 3.삭제, 4.검색, 5.출력, 6.종료)");
			num = sc.nextInt();

			if (num == 1) {
				pManagement.input();
			} else if (num == 2) {
				pManagement.modify();
			} else if (num == 3) {
				pManagement.delete();
			} else if (num == 4) {
				pManagement.search();
			} else if (num == 5) {
				pManagement.printAll();
			} else if (num == 6) {
				break;
			} else {
				System.out.println("잘못된 번호를 입력했습니다");
			}
		}
	}

}
