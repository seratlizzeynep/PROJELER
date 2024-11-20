package proje1;

import java.util.Iterator;

public class sekizinciproje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mesaj= "Bügün hava çok güzel.";
		System.out.println(mesaj);
		System.out.println("Eleman sayısı :" +  mesaj.length());
	
		System.out.println("Beşinci eleman : " + mesaj.charAt(4));
	
	    System.out.println(mesaj.concat("YUPPİ!"));
	    
	    System.out.println(mesaj.startsWith("b"));
	    System.out.println(mesaj.endsWith("."));
	    
	    System.out.println(mesaj.indexOf("av"));
	    System.out.println(mesaj.lastIndexOf("zel"));//aynı numarayı verir ama aramaya sagdan baslar
	    
	    String yeniMesaj= mesaj.replace("güzel","kötü" );
	    System.out.println(yeniMesaj);
	    
	    System.out.println(mesaj.substring(2,5));
	    for (String kelime:mesaj.split(" ")) {
			System.out.println(kelime);
		}
	    
	    System.out.println(mesaj.toLowerCase());
	    System.out.println(mesaj.toUpperCase ());
	}

}
