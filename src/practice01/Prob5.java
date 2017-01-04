package practice01;

public class Prob5 {
	public static void main(String[] args) {
		String s = null;
		int k, k1;

		for (int i = 1; i <= 99; i++) {
			s = "" + i;

			if (i < 10) {
				k = (int) s.charAt(0) - 48;

				if (k % 10 == 3 || k % 10 == 6 || k % 10 == 9)

				{

					System.out.println(s + " 짝");
				}

			}

			else

			{
				k = (int) s.charAt(0) - 48;
				k1 = (int) s.charAt(1) - 48;

				if (k % 10 == 3 || k % 10 == 6 || k % 10 == 9) {

					if (k1 % 10 == 3 || k1 % 10 == 6 || k1 % 10 == 9) {
						System.out.println(s + " 짝짝");
					} else {
						System.out.println(s + " 짝");
					}
				}

			}

		}

	}
}
