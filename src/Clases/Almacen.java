package Clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Almacen {
	
	public static void cargarDatos() throws FileNotFoundException {
		String[] listaArticulos = new String[100];
		File file = new File("Recursos/AlmacenApp.txt");
		Scanner scan = new Scanner(file);
		
		String linea;
		String[] partes;
		Refresco refresco;
		Cerveza cerveza;
		Vino vino;
		int cont=0;
		
		while(scan.hasNext()) {
			linea = scan.nextLine();
			partes = linea.split("-");
			
			if (partes[0].equals("REFRESCO")) {
				refresco = new Refresco();
				refresco.setSabor(partes[1]);
				refresco.setZumo(Boolean.parseBoolean(partes[2]));
				refresco.setGaseoso(Boolean.parseBoolean(partes[3]));
				refresco.setCantidadAzucar(Integer.parseInt(partes[4]));
				listaArticulos[cont]="REFRESCO";
				
			} else if (partes[0].equals("CERVEZA")) {
				cerveza = new Cerveza();
				cerveza.setOrigen(partes[1]);
				cerveza.setCereales(partes[2]);
				cerveza.setCereales2(partes[3]);
				cerveza.setGradosAlcohol(Double.parseDouble(partes[4]));
				listaArticulos[cont]="CERVEZA";
			
			} else if (partes[0].equals("VINO")) {
				vino = new Vino();
				vino.setColor(partes[1]);
				vino.setOrigen(partes[2]);
				vino.setAnio(Integer.parseInt(partes[3]));
				vino.setTipoUva(partes[4]);
				vino.setGradosAlcohol(Double.parseDouble(partes[5]));
				listaArticulos[cont]="VINO";
			
			}
			cont++;
		}
		scan.close();
	}
	
	public static Articulo elMasCaro() {
		return null;
		
	}
	
	public static Double precio() {
		return null;
		
	}
	
	public static Boolean hayStock() {
		return null;
		
	}
	
	public static ArrayList stockJusto() {
		return null;
		
	}
	
	public static void articulo(String codigoProducto) {
		
	}
	
	public static Boolean disponibilidad(Integer cantidad, String kodigoProducto) {
		return null;
		
	}
	
	public static ArrayList equivalentes(Articulo articulo) {
		return null;
		
	}
	
	public static ArrayList ordenarPorPrecio(String orden) {
		return null;
		
	}
	
	public static void ordenarPorStock (String orden) {
	
	}
}
