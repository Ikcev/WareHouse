package Clases;

public class Cerveza extends Articulo implements Alcoholico{
	private String origen;
	private String cereales, cereales2;
	private Double gradosAlcohol;
	
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getCereales() {
		return cereales;
	}
	public void setCereales(String cereales) {
		this.cereales = cereales;
	}
	public Double getGradosAlcohol() {
		return gradosAlcohol;
	}
	public void setGradosAlcohol(Double gradosAlcohol) {
		this.gradosAlcohol = gradosAlcohol;
	}
	public String getCereales2() {
		return cereales2;
	}
	public void setCereales2(String cereales2) {
		this.cereales2 = cereales2;
	}
	
}
