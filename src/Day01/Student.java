package Day01;

public class Student {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age >= 100 | age <= 0){
			System.out.println("������Ϸ�������");
			return;
		}
		this.age = age;
	}
    
}
