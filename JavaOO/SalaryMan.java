package systemprj;

public class SalaryMan {
	public int salary = 1000000;

	public SalaryMan() {
		super();
	}

	public SalaryMan(int salary) {
		this.salary=salary;
	}
	
	public int getAnnualGross() {
		return (salary*12)+(salary*5);
	}
	
	public static void main(String[] args) {
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2_000_000).getAnnualGross());
	}
}
