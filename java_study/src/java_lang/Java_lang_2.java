package java_lang;

class Point implements Cloneable{
	int x; int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x="+x+", y="+y;
	}
	
	public Object clone() {
		Object obj=null;
		try {
			obj = super.clone();
		} catch(CloneNotSupportedException e) {}
		return obj;
	}
}

public class Java_lang_2 {
	public static void main(String[] args) {
		Point original = new Point(3,5);
		Point copy = (Point)original.clone();
		System.out.println(original);
		System.out.println(copy);

	}

}

/*
 int[] arr = [1,2,3,4,5];
 int[] arrClone = arr.clone();
 
  È¤Àº
  
 int[] arr = [1,2,3,4,5];
 int[] arrClone = new int[arr.length];
 System.arraycopy(arr, 0, arrClone, 0, arr.length);
 */



