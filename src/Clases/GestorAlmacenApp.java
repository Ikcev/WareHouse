package Clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class GestorAlmacenApp {
	public void run() throws ParseException {
		
		int select;
		String fin;
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
				Factura factura = new Factura();
				System.out.println("Para realizar la venta seleccionada debe rellenar los siguientes datos:");
				System.out.println("Introduce el número de factura");
				factura.setNumero(Integer.parseInt(scan.nextLine()));
				System.out.println("Introduce el nombre de la empresa");
				factura.setNombreEmpresa(scan.nextLine());
				System.out.println("Introduce a fecha en la que se realiza la factura");
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				factura.setFecha(sdf.parse(scan.nextLine()));
				System.out.println("Introduce el concepto por el cual se crea la siguiente factura");
				factura.setConcepto(scan.nextLine());
				
				System.out.println("A continuación se comenzarán a rellenar los parametros que corresponden a una linea de factura");
				do {
				LineaFactura lineaFactura = new LineaFactura();
				System.out.println(lineaFactura.getNumero());
				System.out.println("Introduce nombre de producto a adquirir");
				lineaFactura.setArticulo(scan.nextLine());
				System.out.println("Introduce cantidad");
				lineaFactura.setCantidad(Integer.parseInt(scan.nextLine()));
				System.out.println("En caso de estar ser la última línea de la factura introduzca la letra ''f''");
				fin = scan.nextLine().toLowerCase();
				}while(!fin.equals("f"));
				
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
