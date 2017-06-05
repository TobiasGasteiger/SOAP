package webservice;

import java.util.Scanner;

import webservice.gen.rechnerws.RechnerWebServices;
import webservice.gen.rechnerws.MyWebServiceService;



public class MyClient {

	public static void main(String[] args){
		System.out.println("Java SOAP Rechner Webservice:\n-------------------");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welche Rechenoperation möchtest du durchführen (+, -, *, /)");
		String rechneoperation = scanner.nextLine();

		System.out.println("Gib deine erste Zahl ein:");
		String zahl1 = scanner.nextLine();
		System.out.println("Gib deine zweite Zahl ein:");
		String zahl2 = scanner.nextLine();


		RechnerWebServices service = new MyWebServiceService().getRechnerWebServicesPort();

		try {
			switch (rechneoperation) {
				case "+":
					System.out.println("Ergebnis: " + service.addition(Float.parseFloat(zahl1), Float.parseFloat(zahl2)));
					break;
				case "-":
					System.out.println("Ergebnis: " + service.subtrakiton(Float.parseFloat(zahl1), Float.parseFloat(zahl2)));
					break;
				case "*":
					System.out.println("Ergebnis: " + service.multiplikation(Float.parseFloat(zahl1), Float.parseFloat(zahl2)));
					break;
				case "/":
					System.out.println("Ergebnis: " + service.division(Float.parseFloat(zahl1), Float.parseFloat(zahl2)));
					break;
				default:
					System.err.println("Ungültige Rechneoperation, Vorgang bitte wiederholen!");
			}
		} catch(NumberFormatException e){
			System.err.println("Ungültige Zahleneingabe, Vorgang bitte wiederholen!");
		}

	}
}
