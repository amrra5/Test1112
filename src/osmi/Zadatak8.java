package osmi;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite pocetni broj:");
		int n = scanner.nextInt();
		System.out.println("Hailstone sekvenca za broj " +n +" je:");
		
		while(n>1){
			System.out.print(n + " ");
			if(n%2==0){
				n /=2;
			}else{
				n = (3*n)+1;
			}
			if(n==1){
				System.out.print(n);
				break;
			}
			
		}
		scanner.close();

	}

}
