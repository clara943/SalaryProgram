
public class JobGrade {
	String grade = "";
	double percent;
	public String JobGrade(int pos) {
		

		switch (pos) {
		case 1:
			grade = "사원";
			percent = 0.1;
			break;
		case 2:
			grade = "주임";
			percent = 0.2;
			break;
		case 3:
			grade = "계장";
			percent = 0.3;
			break;
		case 4:
			grade = "대리";
			percent = 0.4;
			break;
		case 5:
			grade = "과장";
			percent = 0.5;
			break;
		case 6:
			grade = "차장";
			percent = 0.6;
			break;
		case 7:
			grade = "수석차장";
			percent = 0.7;
			break;
		case 8:
			grade = "부장";
			percent = 0.8;
			break;
		case 9:
			grade = "본부장";
			percent = 0.9;
			break;
		case 10:
			grade = "사장";
			percent = 1;
			break;
		default:
			grade = "알 수 없음";
			break;
		}
		return grade;
	}
	public String getGrade() {
		return grade;
	}
	public double getPercent() {
		return percent;
	}
	
}

