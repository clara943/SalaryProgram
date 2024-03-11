
public class PSalary {

	SalaryCal base;
	double add;
	double deduct;
	JobGrade percent;

	double total;
	double tax;
	double sum;

	public PSalary() {
		base = new SalaryCal();
		percent = new JobGrade();
	}

	public SalaryCal getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base.setSalaryCal(base);
	}


	public double getAdd() {
		return (getBase().getSalaryCal() * getPercent().getPercent());
	}

	public double getDeduct() {
		int union = 0;
		if (union == 1) {
			return 50000;
		} else
			return 0;

	}

	public void setDeduct(double deduct) {
		this.deduct = deduct;
	}

	public JobGrade getPercent() {
		return percent;
	}

	public void setPercent(JobGrade percent) {
		this.percent = percent;
	}

	public double getTotal() {
		return getSum() - getTax();
	}

	public double getTax() {
		return getSum() * 0.154;
	}

	public double getSum() {
		return getBase().getSalaryCal() + getAdd() - getDeduct();
	}

}
