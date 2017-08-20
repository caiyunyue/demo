package IoTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TestIO {
	public static void main(String[] args) throws IOException{
//		File file = new File("prote.txt");
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.getName());
//		System.out.println(file.isAbsolute());
//		System.out.println(file.getAbsoluteFile());
//		System.out.println(file.getPath());
//		File file2 = new File("D:\\a.txt");
//		System.out.println(file2.isFile());
		TestIO i = new TestIO() ;
		i.tsetInputStream();
		
	}
	
	public void tsetInputStream() throws IOException {
//		//创建一个输入字节流对象
//		InputStream in = new FileInputStream("F:\\workspace\\EgDemo\\src\\IoTest\\prote.txt");
//		String str = new String("中");
//		System.out.println(str.getBytes());
//	
//		str.getByte("GBK"),"UTF-8"）;
		// 一次读取一组: 一组字符10个字符 
		//返回一次实际读取的字节数, 若为 -1 表示读取到文件的结尾
		InputStream fis = new FileInputStream("F:\\workspace\\EgDemo\\src\\IoTest\\prote.txt");
		

		InputStreamReader isr = new InputStreamReader(fis, "GBK"); //GBK替换成你文件内容使用的编码
		BufferedReader br = new BufferedReader(isr); 
		
	     
		int size = 	br.read();
		
		while((size = br.read()) != -1){
		
				System.out.print((char)size);
				size = br  .read();
			}
		}
		
	}
	


