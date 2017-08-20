package Day05;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class1 {
	@Parameters("s")
	@Test(groups={"group1","group2"}) 
	public void method1(String a){
		System.out.println(a);
	}
	
	@Test
	public void method2(){
		System.out.println("·½·¨2");
	}
}
