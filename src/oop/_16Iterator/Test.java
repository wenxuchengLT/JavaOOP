package oop._16Iterator;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {  
        Collection collection = new MyCollection();  
        Iterator it = collection.iterator();  
          
        while(it.hasNext()){  
            System.out.println(it.next());  
        }  
        System.out.println(it.previous());
        System.out.println("µü´úÆ÷£º");
        
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
			list.add(i);
		}
        
        java.util.Iterator<Integer> it2 = list.iterator();
        while(it2.hasNext()){  
            System.out.println(it2.next());  
        }  
        while(it2.hasNext()){  
            System.out.println(it2.next());  
        }  
        for (Integer integer : list) {
			System.out.println(integer);
		}
    }  
}
