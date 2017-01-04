package practice01;

public class Prob2 {

	public static void main(String[] args) {
		int count=1;
		for(int i=1;i<10;i++){
			for(int j=count;j<=count+9;j++){
				System.out.print(j+" ");
			}
			System.out.println();
			count++;
		}
	}
}
