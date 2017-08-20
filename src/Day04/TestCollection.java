package Day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollection {
	public static void main(String[] args) {
		Collection collection = new ArrayList();
		String si = new String("a");
		collection.add(si);
		
		collection.add(new String("b"));
		System.out.println(collection.size());
		
		Collection con = new ArrayList();
		con.addAll(collection );
		System.out.println(con.size());
		con.equals(si);
//		Iterator 遍历集合中元素
        Iterator iterator = collection.iterator();
		
		while(iterator.hasNext()){
			Object obj = iterator.next();
			System.out.println(obj); 
		}
		
	}
	

}
