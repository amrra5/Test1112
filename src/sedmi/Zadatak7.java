package sedmi;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite string:");
		String str = sc.nextLine();
		
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			if(Character.isLetter(ch)){
				if(i%2 !=0){
					System.out.print(Character.toUpperCase(ch));
				}else{
					System.out.print(ch);
				}
			}else{
				System.out.print(ch);
			}
		}
		sc.close();

	}

}
