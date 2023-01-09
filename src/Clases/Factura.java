package Clases;

import java.util.Date;

public class Factura {
	
	static Integer IVA = 21;
	private Integer numero;
	private String nombreEmpresa;
	private Date fecha;
	private String concepto;
	
	public static void addLinea(LineaFactura lineaFactura) {
		
	}
	
	public static void eliminarLinea(Integer numeroLinea) {
		
	}
	
	public static Double precioTotal() {
		return null;
		
	}
	
	public static void mostrarEnPantalla() {
		
	}
	
	public static void guardarEnFichero() {
		
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
}
