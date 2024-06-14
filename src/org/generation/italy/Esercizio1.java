package org.generation.italy;

import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {

		boolean conseguiti = false;
		boolean conseguito1 = false;
		boolean conseguito2 = false;
		boolean conseguito3 = false;
		boolean conseguito4 = false;
		boolean conseguito5 = false;
		Scanner sc = new Scanner(System.in);
		String risposta;

		System.out.println("5 buoni propositi");

		do {
			
			if (conseguito1 && conseguito2 && conseguito3 && conseguito4 && conseguito5) {
				System.out.println();
				System.out.println("Propositi Conseguiti");
				conseguiti = true;
			} else {

				System.out.println("Indicare quali propositi sono stati completati (inserisci -si- per completare)");
				System.out.println();

				if (!conseguito1) {
					System.out.println("Fare Attività fisica");
					risposta = sc.nextLine().toLowerCase();
					conseguito1 = rispondere(risposta, conseguito1);
				}

				if (!conseguito2) {
					System.out.println("Andare a letto presto");
					risposta = sc.nextLine().toLowerCase();
					conseguito2 = rispondere(risposta, conseguito2);
				}
				if (!conseguito3) {
					System.out.println("Mangiare cibo sano");
					risposta = sc.nextLine().toLowerCase();
					conseguito3 = rispondere(risposta, conseguito3);
				}
				if (!conseguito4) {
					System.out.println("Imparare qualcosa di nuovo");
					risposta = sc.nextLine().toLowerCase();
					conseguito4 = rispondere(risposta, conseguito4);
				}
				if (!conseguito5) {
					System.out.println("Visitare nuovi paesi");
					risposta = sc.nextLine().toLowerCase();
					conseguito5 = rispondere(risposta, conseguito5);
				}

			}

		} while (!conseguiti);
		System.out.println("Fine programma");
		sc.close();

	}

	public static boolean rispondere(String risposta, boolean conseguito) {

		if (risposta.equals("si")) {
			conseguito = true;
			return conseguito;
		} else {
			return conseguito;
		}

	}

}
