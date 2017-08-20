package PaySystem;

public class SalarieEmployee extends Employee {
	
	private int weeklySalary;
	

	
	public SalarieEmployee(String name, int number, Mydate birthday,
			int weeklySalary) {
		super(name, number, birthday);
		this.weeklySalary = weeklySalary;
	}


	@Override
	int earning() {
		
		return weeklySalary;
	}


	@Override
	public String toString() {
		return "EmployeeType=SalarieEmployee, "+ super.toString();
	}
	
	
	
    

}
