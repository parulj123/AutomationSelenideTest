package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hst = new HashSet<String>();

		hst.add("Jaipur");
		hst.add("Noida");
		// hst.add("Noida");
		hst.add("Pune");
		hst.add("Mumbai");
		hst.add("Udaipur");
		Iterator<String> itr = hst.iterator();
		System.out.println(itr.next());
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(hst);
		System.out.println(hst.remove("Noida"));
		System.out.println(hst.isEmpty());
		System.out.println(hst.size());
	}

}
