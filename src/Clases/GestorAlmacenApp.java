package Clases;

import java.util.Scanner;

public class GestorAlmacenApp {
	public void run() {
		
		int select;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Menú:");
		System.out.println("1.	Realizar Venta");
		System.out.println("2.	Realizar Compra");
		System.out.println("3.	Ver artículos saludables");
		System.out.println("4.	Ver artículo más caro");
		System.out.println("5.	Ver los artículos con menos stock que X...");
		System.out.println("6.	Salir");
		
		do {
			System.out.println("Elija una opción");
			select= Integer.parseInt(scan.nextLine());
			if (select==1) {
				System.out.println("1");
			} else if (select==2) {
				System.out.println("2");
			}else if (select==3) {
				System.out.println("3");
			}else if (select==4){
				System.out.println("4");
			}else if (select==5) {
				System.out.println("5");
			}else if (select==6) {
				System.out.println("ADIÓS");
			}else {
				System.out.println("Opcion inexistente");
			}
		}while(select!=6);
		scan.close();
	}
}
