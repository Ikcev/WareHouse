package Clases;

public class Vino extends Articulo implements Alcoholico {
	
	private String color;
	private String origen;
	private Integer anio;
	private String tipoUva;
	private Double gradosAlcohol;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	public String getTipoUva() {
		return tipoUva;
	}
	public void setTipoUva(String tipoUva) {
		this.tipoUva = tipoUva;
	}
	public Double getGradosAlcohol() {
		return gradosAlcohol;
	}
	public void setGradosAlcohol(Double gradosAlcohol) {
		this.gradosAlcohol = gradosAlcohol;
	}
	
}
