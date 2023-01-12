package Clases;

public class LineaFactura {
	private Integer numero = 1;
	private Articulo articulo;
	private Integer cantidad;
	private String article;
	
	public static Double precioTotal() {
		return null ; 
	}

	public Integer getNumero() {
		return numero++;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	public String getArticle() {
		return article;
	}

	public void setArticulo(String article) {
		this.article = article;
		
	}
}
