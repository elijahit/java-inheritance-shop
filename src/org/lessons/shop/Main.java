package org.lessons.shop;

public class Main {

	public static void main(String[] args) {
		Prodotto prodotto = new Prodotto("Biberon", "Ottimo per bambini", 12.50, 20);
		Smartphone prodottoSmartphone = new Smartphone("IPHONE 15 Pro Max", "Ottimo telefono marcato Apple", 1230, 22, "350123451234560", 512, 4);
		Televisori prodottoTelevisori = new Televisori("LG OLED", "Spledità televisione", 1500, 22, "125cm", "355cm", "22cm", false);
		Cuffie prodottoCuffie = new Cuffie("Logitech G733", "Ottime cuffie DTS X 2.0" , 144, 22, "Blu", true);
		
		
		
		System.out.println(prodotto);
		System.out.println();
		System.out.println(prodottoSmartphone);
		System.out.println();
		System.out.println(prodottoTelevisori);
		System.out.println();
		System.out.println(prodottoCuffie);
		

	}

}
