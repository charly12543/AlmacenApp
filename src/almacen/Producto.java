package almacen;

public class Producto {
	private int Codigo;
	private String Nombre;
	private int precio;
	private int Stock;
	private String Marca;

	public Producto() {
		super();
	}

	public Producto(int codigo, String nombre, int precio, int stock, String marca) {
		super();
		Codigo = codigo;
		Nombre = nombre;
		this.precio = precio;
		Stock = stock;
		Marca = marca;
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	@Override
	public String toString() {
		return "Producto [Codigo=" + Codigo + ", Nombre=" + Nombre + ", precio=" + precio + ", Stock=" + Stock
				+ ", Marca=" + Marca + "]";
	}
	
	
	

}
