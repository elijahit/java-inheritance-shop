package org.lessons.shop;

import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci cosa vuoi acquistare: \n"
				+ "[1]: Smartphone \n"
				+ "[2]: Cuffie \n"
				+ "[3]: Televisore");
		
		Prodotto prodotto = null;
		int selectOption = scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		
		switch(selectOption) {
			case 1: 
				prodotto =  new Smartphone("IPHONE 15 Pro Max", "Ottimo telefono marcato Apple", 1230, 22, "350123451234560", 512, 4);
				break;
			case 2:
				prodotto = new Cuffie("Logitech G733", "Ottime cuffie DTS X 2.0" , 144, 22, "Blu", true);
				break;
			case 3:
				prodotto =  new Televisori("LG OLED", "Spledità televisione", 1500, 22, "125cm", "355cm", "22cm", false);
				break;
			default:
			System.out.println("Scelta non valida");
		}
		
		if(prodotto != null) {
			System.out.println(prodotto);
		}
		

	}

}
