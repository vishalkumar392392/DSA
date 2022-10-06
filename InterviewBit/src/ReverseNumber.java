
public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println(reverse(-445));
	}

	public static int reverse(int A) {
		try {
			int temp2 = A;
			int temp = 1;
			if (A < 0) {
				A = A * -1;
				temp = A * -1;
			}
			String rev = "";
			while (temp != 0) {
				rev = rev + A % 10;
				A = A / 10;
				temp = A;
			}
			if (temp2 > 0) {
				return Integer.parseInt(rev);
			} else {
				return -1 * Integer.parseInt(rev);
			}
		} catch (Exception e) {
			return 0;
		}

	}

}
