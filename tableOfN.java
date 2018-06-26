package practice2;
import java.util.Scanner;
public class tableOfN {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int i ;
		System.out.println("enter a number");
		
		int j = scan.nextInt();
		
		
		for (i = 1; i <=10; i++ ){
			System.out.println(j+"x"+i+" ="+i*j );
		}
		scan.close();
	}

}

