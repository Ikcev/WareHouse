package Clases;

public class Cerveza implements Alcoholico{
	private String origen;
	private String cereales;
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
	
}
