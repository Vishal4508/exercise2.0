package practice2;

import java.util.Scanner;

public class oneToN {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("print numbers upto :");
		int i = scan.nextInt();
		int j = 1;
		for (j =1; j <= i; j++ ){
			System.out.println(j);
		}
		}

}
