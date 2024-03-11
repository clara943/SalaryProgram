import java.util.Scanner;

public class PermanentManagement {

	static PermanentWorkerHasA WorkerList[];
	static PSalary PSalaryList[];
	static int numOfWorker;
	Scanner sc = new Scanner(System.in);

	public PermanentManagement() {
		this(0);
	}

	public PermanentManagement(int numOfWorker) {
		WorkerList = new PermanentWorkerHasA[numOfWorker];
		PSalaryList = new PSalary[numOfWorker];
	}

	public void input() {
		System.out.print("직원 수 입력 : ");
		numOfWorker = sc.nextInt();

		if (numOfWorker > 100) {
			System.out.println("100명 이하로 입력해주세요");
			return;
		}

		WorkerList = new PermanentWorkerHasA[numOfWorker];
		PSalaryList = new PSalary[numOfWorker];

		for (int i = 0; i < numOfWorker; i++) {
			WorkerList[i] = new PermanentWorkerHasA();
			System.out.println("이름 : ");
			WorkerList[i].setName(sc.next());
			System.out.println("나이 : ");
			WorkerList[i].setAge(sc.nextInt());
			System.out.println("사원번호 : ");
			WorkerList[i].setEmployeeNumber(sc.nextInt());
			System.out.println("생년월일 : ");
			WorkerList[i].setBirthDate(sc.nextInt());
			System.out.println("주소 : ");
			WorkerList[i].setAddress(sc.next());
			System.out.println("휴대폰번호 : ");
			WorkerList[i].setPhoneNumber(sc.nextInt());
			System.out.println("은행명 : ");
			WorkerList[i].setBank(sc.next());
			System.out.println("계좌번호 : ");
			WorkerList[i].setAccountNumber(sc.nextInt());
			System.out.println("직급 : (1.사원, 2.주임, 3.계장, 4.대리, 5.과장, 6.차장, 7.수석차장, 8.부장, 9.본부장, 10.사장)");
			WorkerList[i].setJobGrade(sc.nextInt());
			System.out.println("노조가입여부 : (1.가입, 2.미가입");
			WorkerList[i].setUnion(sc.nextInt());
			System.out.println("기본급 : ");
			PSalaryList[i].setBase(sc.nextDouble());

		}
		printAll();
	}

	public void modify() {
		int employeeNumber;
		boolean ret = false;
		int i;
		System.out.println("변경할 사원번호 입력 : ");
		employeeNumber = sc.nextInt();

		for (i = 0; i < numOfWorker; i++) {
			if (employeeNumber == WorkerList[i].getEmployeeNumber()) {
				ret = true;
				break;
			}
		}
		if (ret == true) {
			System.out.println("변경내용을 입력해주세요");
			System.out.println("이름 : ");
			WorkerList[i].setName(sc.next());
			System.out.println("나이 : ");
			WorkerList[i].setAge(sc.nextInt());
			System.out.println("생년월일 : ");
			WorkerList[i].setBirthDate(sc.nextInt());
			System.out.println("주소 : ");
			WorkerList[i].setAddress(sc.next());
			System.out.println("휴대폰번호 : ");
			WorkerList[i].setPhoneNumber(sc.nextInt());
			System.out.println("은행명 : ");
			WorkerList[i].setBank(sc.next());
			System.out.println("계좌번호 : ");
			WorkerList[i].setAccountNumber(sc.nextInt());
			System.out.println("직급 : (1.사원, 2.주임, 3.계장, 4.대리, 5.과장, 6.차장, 7.수석차장, 8.부장, 9.본부장, 10.사장)");
			WorkerList[i].setJobGrade(sc.nextInt());
			System.out.println("노조가입여부 : (1.가입, 2.미가입");
			WorkerList[i].setUnion(sc.nextInt());
			System.out.println("기본급 : ");
			PSalaryList[i].setBase(sc.nextDouble());

			print(i);

		} else {
			System.out.println("잘못된 입력입니다");
		}

	}
	public void delete() {
		if (num == 0) {
			
		}
		
		
	}
	

	public void printAll() {
		for (int i = 0; i < numOfWorker; i++) {
			print(i);
		}
	}
}
