package Day04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class TestCollections {
	public static void main(String[] args) {
		
		
		Cat cat2=new Cat("mao",1);
		
		List<Object> list=new ArrayList<Object>();
		list.add(cat2);
		list.add(1, new Cat("white",2));
		list.indexOf(cat2);
		
		for(Object d:list){	
			if(d instanceof Cat){
				Cat c = (Cat)d;
			    System.out.println(c.getAge());
				}		
		}
		
		HashSet hashset = new HashSet();
		
		hashset.add("abc");  //向hashset中添加一个字符串 
		
		hashset.add(1); //向hashset中添加一个整数  
		  
		hashset.add('a'); //向hashset中添加一个字符 
		
		//向hashset中添加一个数组  
		int[] abc={10,11,12};  
		hashset.add(abc);  
		//向hashset中添加一个自定义对象  
		Cat cat1=new Cat("猫猫", 2); 
		
		hashset.add(cat1);//向hashset中添加一个对象
		
        //		遍历hashset		
		Iterator  ITT = hashset.iterator();
		while(ITT.hasNext()){
			Object obj = ITT.next();
			if(obj instanceof String){
				System.out.println("输出字符串："+obj);
			}else if(obj instanceof Integer){
				System.out.println("输出整型："+obj);
			
			}
			 else if(obj instanceof Character){
				System.out.println("输出字符："+obj);		
			
     	    }
			 else if(obj instanceof int []){
				System.out.println("输出int[]：");
				for(int i=0;i<abc.length;i++)  
                {  
                    System.out.print(abc[i]+" ");  
                } 
			    System.out.println();
  	        }
			 else if(obj instanceof Cat){
				 Cat cat3 = (Cat)obj;
				 
				System.out.println("输出cat："+cat3.getName()+" "+cat3.getAge());		
				 
	  	        }
		}
	}
		

}
