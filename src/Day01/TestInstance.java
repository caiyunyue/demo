package Day01;

class Person1 {
	protected String name="person";
	protected int age=50;
	public String getInfo() {
	          return "Name: "+ name + "\n" +"age: "+ age;
	}
}
class Student1 extends Person1 {
	protected String school="pku";
	public String getInfo() {
  	          return  "Name: "+ name + "\nage: "+ age 
	          + "\nschool: "+ school;
	}
	
}
class Graduate extends Student1{
	public String major="IT";
	public String getInfo()
	{
		return  "Name: "+ name + "\nage: "+ age 
	          + "\nschool: "+ school+"\nmajor:"+major;
	}
}


public class TestInstance {
	public void method1(Person1 e){
		
		if(e instanceof Graduate){
			System.out.println("a person");
		}
		 else if (e instanceof Student1) {
				System.out.println("a student" + "\n" + "a person"  );
			}
		 else if (e instanceof Person1 ){
			 System.out.println("a graduated student"+"\n"+"a student" + "\n" + "a person" );
		 }
	}  
	public static void main(String[] args) {
		TestInstance t = new TestInstance();
		Person1 a = new Person1();
		Student1 b = new Student1();
		Graduate c = new Graduate();
		
		t.method1(a);
		t.method1(b);
		t.method1(c);
	}

}
