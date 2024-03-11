
public class PSalary {

	SalaryCal base;
	SalaryCal add;
	SalaryCal deduct;

	JobGrade percent;

	double total;
	double tax;
	double sum;

	public PSalary() {
		base = new SalaryCal();
		add = new SalaryCal();
		deduct = new SalaryCal();
		percent = new JobGrade();
	}

	public SalaryCal getBase() {
		return base;
	}

	public void setBase(SalaryCal base) {
		this.base = base;
	}

	public SalaryCal getAdd() {
		return add;
	}

	public void setAdd(SalaryCal add) {
		this.add = add;
	}

	public SalaryCal getDeduct() {
		return deduct;
	}

	public void setDeduct(SalaryCal deduct) {
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
		return (getBase().getSalaryCal() * getPercent().getPercent()) + getAdd().getSalaryCal() - getDeduct().getSalaryCal();
	}

}
