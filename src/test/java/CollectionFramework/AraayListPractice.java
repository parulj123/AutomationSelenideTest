package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class AraayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list= new ArrayList<String>();
		
		list.add("Ravi");
		list.add("Pankaj");
		list.add("Ram");
		list.add("Ravi");
		
		System.out.println(list);
		Iterator<String> itr= list.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		list.remove(2);
		System.out.println(list);
		System.out.println(list.get(1));
		System.out.println(list.contains("Ravi"));
		System.out.println(list.indexOf("Ravi"));
		System.out.println(list.isEmpty());
		System.out.println(list.size());
	}

}
