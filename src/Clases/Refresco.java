package Clases;

public class Refresco extends Articulo {
	
	private String sabor;
	private Boolean zumo;
	private Boolean gaseoso;
	private Integer cantidadAzucar;
	
	public static void visualizarPropiedades() {
		
	}
	
	public static Boolean esSaludable() {
		return null;
		
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public Boolean getZumo() {
		return zumo;
	}

	public void setZumo(Boolean zumo) {
		this.zumo = zumo;
	}

	public Boolean getGaseoso() {
		return gaseoso;
	}

	public void setGaseoso(Boolean gaseoso) {
		this.gaseoso = gaseoso;
	}

	public Integer getCantidadAzucar() {
		return cantidadAzucar;
	}

	public void setCantidadAzucar(Integer cantidadAzucar) {
		this.cantidadAzucar = cantidadAzucar;
	}
}
