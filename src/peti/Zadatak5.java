package peti;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = "";
		String novi = "";
		
		while(!str.equals("kraj")){
			System.out.println("Unesite rijec:");
			str = sc.next();
			if(!str.equals("kraj")){
			novi += str + " ";
			}
		}
		
		System.out.println("Output: " +novi);
		sc.close();
		

	}

}
