package practice01;
import java.util.Scanner;
public class Prob1 {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.print("정수를 입력하세요");
		int k = ss.nextInt();
		if (k % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의배수가 아닙니다.");
		}

	}
}
