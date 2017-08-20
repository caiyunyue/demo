package Day01;

public class Student {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age >= 100 | age <= 0){
			System.out.println("请输入合法的年龄");
			return;
		}
		this.age = age;
	}
    
}
