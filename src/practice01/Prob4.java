package practice01;
import java.util.Scanner;
public class Prob4 {
	public static void main(String[] args) {
	//String Method Test
//		String s ="Hello World";
//		int length=s.length();// 메소드를 계속 호출하는 것보다 변수로 받아서 하는게 더 빠르다.
//		System.out.println(s.length()); //객체의 길이
//		for(int i=0;i<s.length();i++){
//			System.out.print(s.charAt(i));
		
		Scanner ss =new Scanner(System.in);
		System.out.println("문자열 하나를 입력하세요");
		String s =ss.nextLine();
		int length=s.length();
		for(int i=0;i<length;i++){
			for(int j=0;j<=i;j++){
				System.out.print(s.charAt(j));			
		}
			System.out.println();
	}
	}
}

