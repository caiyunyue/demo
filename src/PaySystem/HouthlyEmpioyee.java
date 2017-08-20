package PaySystem;

public class HouthlyEmpioyee extends Employee{
	private int wage;
	private int hour;
	
	
	public HouthlyEmpioyee(String name, int number, Mydate birthday, int wage,
			int hour) {
		super(name, number, birthday);
		this.wage = wage;
		this.hour = hour;
	}

	@Override
	int earning() {
		
		return wage*hour;
	}
	
	@Override
	public String toString() {
		
		return  "EmployeeType=HouthlyEmpioyee, "+ super.toString();
	}

}
