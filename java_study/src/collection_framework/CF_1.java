package collection_framework;

import java.util.*;

public class CF_1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		for(int i=list2.size()-1; i>=0; i--) { // 리스트를 감소시켜가며 찾는 이유는 리스트 삭제되면서 idx 움직이기 때문.
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:" + list1);
		System.out.println("list2:" + list2);
		System.out.println();
	}

}
