package CollectionFramework;

import java.util.Iterator;
import java.util.Vector;

public class VectorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v=new Vector<String>();
		
		v.add("Ayush");  
		v.add("Amit");  
		v.add("Ashish");  
		v.add("Garima");  
		v.add("Ashish"); 
		
		Iterator<String> itr=v.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
