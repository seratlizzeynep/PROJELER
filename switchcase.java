package yazilimbilimijava;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Lütfen sayi girin:");
		Scanner scanner = new Scanner(System.in);
		
		int sayi = scanner.nextInt();
		
		switch (sayi) {
		case 1:
			System.out.println("bir");
			break;

		case 2:
			System.out.println("iki");
			break;

		case 3:
			System.out.println("uc");
			break;
			
		case 4:
			System.out.println("dort");
			break;
			
	default:
			System.out.println("gecersiz sayi");
			break;



		}
	}

}
