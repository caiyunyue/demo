package Day04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class TestTryCatch {
	public static void main(String[] args) throws FileNotFoundException {
		
		TestTryCatch t = new TestTryCatch();
		t.jiSuan(-1, -1);
		
		
	}
	
	public int  jiSuan(int i ,int j){
		
		if(i <0 || j <0){
			throw new ShuJuNotMatch("ֻ������������");
			
		}else{
			return i+j;
		}
		
	}

}
