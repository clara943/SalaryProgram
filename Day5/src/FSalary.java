
public class FSalary {

	SalaryCal base;
	SalaryCal add;
	SalaryCal deduct;

	double total;
	double tax;
	double sum;

	public FSalary() {
		base = new SalaryCal();
		add = new SalaryCal();
		deduct = new SalaryCal();
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

	public double getTotal() {
		return getSum() - getTax();
	}

	public double getTax() {
		return getSum() * 0.154;
	}

	public double getSum() {
		return getBase().getSalaryCal() + getAdd().getSalaryCal() - getDeduct().getSalaryCal();
	}

}
