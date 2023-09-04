package util;

import org.w3c.dom.ls.LSProgressEvent;

import model.Paciente;

/**
 * Clase que implementa una lista con nodos enlazados, 
 * implementa la interfaz Lista
 * @author angievig
 * @version 1.0
 * @since August 2023
 */

public class ListaEnlazada implements Lista {
	/**
	 * referencia al primer elemento de la lista
	 */
	private Nodo primero;
	/**
	 * entero que guarda la cantidad de elementos de la lista
	 */
	private int numElementos;
	
	
	
	public ListaEnlazada() {
		primero= null;
		numElementos = 0;
	}
	
	/**
	 * Informa si la lista estA vacIA
	 */
	@Override
	public boolean esVacia() {
		return (primero== null);
	}
	
	@Override
	public void agregarPrimero(Object n) {
		// TODO conectar el nuevo nodo y actualizar la cantidad de pacientes
		if(primero != null){
			((Nodo)n).setSiguiente(primero);

		}
		
	}

	@Override
	public void agregarUltimo(Object content) {
		Nodo actual= primero;
		Nodo nuevo = new Nodo(content);
		
		if (primero ==null) { //Si la lista es vacIa el nuevo es el primero
			primero = nuevo;
			
		}else { //Se encuentra el ultimo nodo
			while(actual.getSiguiente() != null) {
				actual=actual.getSiguiente();
			}
			actual.setSiguiente(nuevo);	
			
		}
		
		
	}

	@Override
	public Object buscar(Object clave) {
		Object found =  null;
		Nodo actual= primero;
		
		if (primero !=null) { //Si la lista es no es vacIA se hace el recorrido
			
			while(actual.getSiguiente() != null && found!=null) {
				if (actual.getContenido().equals(clave)){
					found = actual.getContenido();
					actual=actual.getSiguiente();
				}
			}
			//si se llegO al ultimo nodo y aun no se encuentra la clave 
			if (actual.getSiguiente()==null && found==null) {
				if (actual.getContenido().equals(clave)){ //buscando en el ultimo nodo
					found = actual.getContenido();
				}
			}
		} // si la lista es vacía no se hace nada
		
		return found;
	}

	@Override
	public void eliminar(Object clave) {
		// TODO buscar el nodo por clave y luego desconectar el nodo
		Object found =  null;
		Nodo actual= primero;
		
		if (primero !=null) { //Si la lista es no es vacIA se hace el recorrido
			
			while(actual.getSiguiente() != null && found!=null) {
				if(actual.getSiguiente().getContenido().equals(clave)){
					actual.setSiguiente((Nodo)((actual.getSiguiente()).getSiguiente()).getContenido());
					found = actual.getContenido();
				}
				actual=actual.getSiguiente();
				
			}
			//si se llegO al ultimo nodo y aun no se encuentra la clave 
			if (actual.getSiguiente()==null && found==null) {
				if (actual.getContenido() == (clave)){ //buscando en el ultimo nodo
					found = actual.getContenido();
				}
			}
		} // si la lista es vacía no se hace nada
		
		
	}
	
	@Override
	public String toString() {
		String out="size: "+numElementos + " [";
		Nodo actual= primero;
		
		if (primero !=null) { //si la lista no es vacia
			while(actual.getSiguiente() != null) {
				out+= actual.toString() + " ";
				actual=actual.getSiguiente();
			}
			out+= actual.toString(); //se incluye el ultimo
			
		}//Si la lista es vacIa no se hace nada
		
		
		
		return out + "]";
	}

	public Nodo getPrimero() {
		return primero;
	}

	public void setPrimero(Nodo primero) {
		this.primero = primero;
	}

	public int getNumElementos() {
		return numElementos;
	}

	public void setNumElementos(int numElementos) {
		this.numElementos = numElementos;
	}




}
