package Clases;

public abstract class Articulo {
	
	private String code;
	private String name;
	private String mark;
	private Integer capacidadBotella;
	private Double precio;
	private Integer stock;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public Integer getCapacidadBotella() {
		return capacidadBotella;
	}

	public void setCapacidadBotella(Integer capacidadBotella) {
		this.capacidadBotella = capacidadBotella;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public static void incrementarStock(Integer cantidad) {
		
	}
	
	public static void disminuirStock(Integer cantidad) {
		
	}
	
	public static void visualizarArticulo() {
		
	}
	
	public static Boolean saludable() {
		return null;
		
	}
	
	public static void precioTotal() {
		
	}
}
