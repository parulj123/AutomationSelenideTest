package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<String> list= new LinkedList<String>();
		 
		 list.add("Pune");
		 list.add("Jaipur");
		 list.add("Noida");
		 list.add("Jaipur");
		 Iterator<String> itr=list.iterator();
		 
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
	}

}
