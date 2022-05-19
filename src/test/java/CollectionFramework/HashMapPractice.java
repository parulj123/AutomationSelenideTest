package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(0, "Jaipur");
		hm.put(1, "Udaipur");
		hm.put(2, "Jodhpur");
		hm.put(3, "jaisalmer");
		System.out.println(hm.get(2));
		Set sm=hm.entrySet();
		Iterator itr=sm.iterator();
		while(itr.hasNext()) {
			
			Map.Entry mp=(Map.Entry)itr.next();
			//System.out.print(false);
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
	}

}
