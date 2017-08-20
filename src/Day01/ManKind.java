package Day01;

public class ManKind {
	public int sex;
	public int salary;
	
	public void manOrWorman(){
		if (sex == 0){
			System.out.println("women");    
			
		
		}
		else if(sex ==1){
			System.out.println("man");
		}
		else{
			System.out.println("你输入的性别不合法");
		}
	}
	
	public void  employeed(){
		if (salary == 0){
			System.out.println("no job");   
			
		}
		else if(salary != 0){
			System.out.println("job");
		}
	}
	

}
