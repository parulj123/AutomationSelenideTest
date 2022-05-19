package CollectionFramework;

import java.util.ArrayList;

public class CollectionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };
		// print unique number from the list
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			int k = 0;
			if (!al.contains(arr[i])) {

				al.add(arr[i]);
				k++;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						k++;
					}
				}
				System.out.println(arr[i]);
				System.out.println(k);
				if (k == 1)
					System.out.println(arr[i] + " is unique number");
			}
		}
	}
}
