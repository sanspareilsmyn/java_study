package exception;

public class Exception2 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("���Ƿ� �߻�������!");
			throw e; //���ܸ� �߻���Ŵ
		} catch (Exception e) {
			System.out.println("���� �޽��� : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷��� ���� ����Ǿ���.");
	}

}