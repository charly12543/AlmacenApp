package almacen;

import java.util.ArrayList;
import java.util.List;

public class Alamacen {
	
	private List<Producto> lista = new ArrayList<Producto>();
	
	
	//Metodo para Agregar Productos
	public void agregarProducto(Producto producto) {
		this.lista.add(producto);
	}
	
	public Producto buscarProducto(int codigo) {
		for(Producto p: this.lista) {
			if(p.getCodigo()== codigo) {
				return p;
			}
		}
	    return null;
		
	}
	
	public void listarProductos() {
		for(Producto p: this.lista) {
			System.out.println(lista.toString());
		}
	}

}
