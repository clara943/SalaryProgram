
/**
 * 정규직 관리?
 */
public class PermanentWorkerHasA {
	
	
	private String name;
	private int age;
	private int employeeNumber;
	private int birthDate;
	private String address;
	private int phoneNumber;
	private String bank;
	private int accountNumber;
	private int jobGrade;
	private int union;
	PSalary base;
	PSalary add;
	PSalary deduct;
	PSalary total;
	
	public PermanentWorkerHasA() {
		
	}
	

	public PermanentWorkerHasA(String name, int age, int employeeNumber, int birthDate, String address, int phoneNumber,
			String bank, int accountNumber, int jobGrade, int union) {
		this.name = name;
		this.age = age;
		this.employeeNumber = employeeNumber;
		this.birthDate = birthDate;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.bank = bank;
		this.accountNumber = accountNumber;
		this.jobGrade = jobGrade;
		this.union = union;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public int getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getJobGrade() {
		return jobGrade;
	}

	public void setJobGrade(int jobGrade) {
		this.jobGrade = jobGrade;
	}

	public int Union() {
		return union;
	}

	public void setUnion(int union) {
		this.union = union;
	}

	
	public PSalary getTotal() {
		return total;
	}

	public void setTotal(PSalary total) {
		this.total = total;
	}


	

}
