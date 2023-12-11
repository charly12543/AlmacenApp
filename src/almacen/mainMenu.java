package almacen;

import java.util.Scanner;

public class mainMenu {
	
	public static void main(String[] args){
	
    Scanner sc = new Scanner(System.in);
    
    Alamacen almacen = new Alamacen();
    int opcion;
    boolean validacion= false;
    
    do {
    	System.out.println("Menu de Tienda ");
    	System.out.println("Elige una opcion : \n"
    			+ "1.- Agregar Producto \n"
    			+ "2.- Listar Producto \n"
    			+ "3.- Buscar Producto \n"
    			+ "4.- Salir ");
    	opcion=sc.nextInt();
    	
    	
    	switch(opcion) {
    	
    	case 1:
    		System.out.println("--------------------------");
    		System.out.println("Agregaremos un Producto ");
    		System.out.println("Ingrese el codigo ");
    		int codigo = sc.nextInt();
    		System.out.println("Ingrese el nombre del producto ");
    		String nombre = sc.next();
    		System.out.println("Ingrese el precio ");
    		int precio = sc.nextInt();
    		System.out.println("Ingrese el stock ");
    		int stock = sc.nextInt();
    		System.out.println("Ingrese el Marca ");
    		String marca = sc.next();
    		
    		//Se instancia la clase y se pasan los valores obtenidos por el usuario.
    		Producto producto = new Producto(codigo, nombre, precio, stock, marca);
    		//Se agrega en el objeto almacen TODOS los valores del objeto producto.
    		almacen.agregarProducto(producto);
    		System.out.println("Producto agregado correctamente ");
    		validacion=true;
    		break;
    	case 2:
    		if(validacion == false) {
    			System.out.println("Primero agrega un producto ");
    			continue;
    		}
    		System.out.println("--------------------------");
    		System.out.println("Lista de Productos Disponibles ");
    		//Usamos el metodo listaProducto para mostrar lo almacenado
    		almacen.listarProductos();
    		break;
    	case 3:
    		if(validacion == false) {
    			System.out.println("Primero agrega un producto ");
    			continue;
    		}
    		System.out.println("--------------------------");
    		System.out.println("Busqueda de Productos Disponibles ");
    		System.out.println("Digite codigo a buscar ");
    		int codigo2 = sc.nextInt();
    		
    		Producto p = almacen.buscarProducto(codigo2);
    		if(p == null) {
    			System.out.println("Producto No encontrado ");
    		}else {
    			System.out.println("Producto Encontrado ");
    			System.out.println(p.toString());
    		}
    		
    		break;

    	}
    	
    }while(opcion !=4);
    
	}

}
