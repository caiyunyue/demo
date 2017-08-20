 package PaySystem;


/**
 *编写工资支付系统测试类
 *
 */
public class PaySystem {
	public static void main(String[] args) {
		Employee emp[] = new Employee[2];
		emp[0] = new SalarieEmployee("Tom", 1000,new Mydate("4", "3", "2017"), 300);
		emp[1] = new HouthlyEmpioyee("James", 1001, new Mydate("5", "3", "2017"), 80, 3);
		
		for(Employee e :emp){
			System.out.println(e);
			if (e.getBirthday().getMonth() == "4"){
				System.out.println("本月生日福利：加100元");
			}
		}
		
		
	}

}
