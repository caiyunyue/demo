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
//		//����һ�������ֽ�������
//		InputStream in = new FileInputStream("F:\\workspace\\EgDemo\\src\\IoTest\\prote.txt");
//		String str = new String("��");
//		System.out.println(str.getBytes());
//	
//		str.getByte("GBK"),"UTF-8"��;
		// һ�ζ�ȡһ��: һ���ַ�10���ַ� 
		//����һ��ʵ�ʶ�ȡ���ֽ���, ��Ϊ -1 ��ʾ��ȡ���ļ��Ľ�β
		InputStream fis = new FileInputStream("F:\\workspace\\EgDemo\\src\\IoTest\\prote.txt");
		

		InputStreamReader isr = new InputStreamReader(fis, "GBK"); //GBK�滻�����ļ�����ʹ�õı���
		BufferedReader br = new BufferedReader(isr); 
		
	     
		int size = 	br.read();
		
		while((size = br.read()) != -1){
		
				System.out.print((char)size);
				size = br  .read();
			}
		}
		
	}
	


