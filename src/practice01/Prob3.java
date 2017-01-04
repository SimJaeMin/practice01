package practice01;
import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		for (; true;) {
			System.out.print("숫자 하나를 입력하세요 :");
			int num = ss.nextInt();
			if (num % 2 == 1) {
				int sum = 0;
				for (int i = 1; i <= num; i = i + 2) {
					sum = sum + i;
				}
				System.out.println("합은 : " + sum);
			} else {
				int sum = 0;
				for (int i = 0; i <= num; i = i + 2) {
					sum = sum + i;
				}
				System.out.println("합은 : " + sum);
			}
		}
	}
}