package collection_framework;

import java.util.*;

public class CF_4 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		Iterator it = list.iterator(); // ListIterator�� previous�� ���� Ž���� ����
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}

	}

}
