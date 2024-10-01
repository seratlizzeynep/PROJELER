package personelkayit;

import java.util.Scanner;

public class PersonelKayitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
	        
	        System.out.println("Kac personelin kaydi yapilacak: ");
	        int persay = scanner.nextInt();

	        
	        Personel[] personeller = new Personel[persay];

	        ;
	        for (int i = 0; i < persay; i++) {
	           personeller[i] = new Personel(); 
	           
	           
	            System.out.println((i + 1) +". personelin numarasini giriniz:");
	            personeller[i].personelNo = scanner.nextInt();
	            scanner.nextLine();
	            System.out.println((i + 1) +". personelin adini giriniz:");
	            personeller[i].isim = scanner.nextLine();
	            System.out.println((i + 1) +". personelin brut maasini giriniz:");
	            personeller[i].brutMaas = scanner.nextDouble();
	            System.out.println((i + 1) +". personelin maas kesintisini giriniz:");
	            personeller[i].kesinti = scanner.nextDouble();

	           
	            personeller[i].maasHesapla();
	        }

                 for (int i = 0; i < personeller.length-1; i++) {
				
	        	for (int j = 0; j < personeller.length-i-1; j++) {
				if (personeller[i].netMaas< personeller[j].netMaas) {
				      Personel temp=personeller[i];
				      personeller[i] = personeller[j];
	                              personeller[j] = temp;
				}
			}
	    }


	        System.out.println("Maaslarina gore siralanmis personel listesi:");
	        for (Personel p : personeller) {
	            System.out.println(p);
	        }
	}

}
