package modelo;

import java.util.ArrayList;

public class ListaPersonas {
	
	private ArrayList<Persona> lista= new ArrayList<Persona>();
	
	public void agregarPersona(Persona persona) {
		lista.add(persona);
	}
	
	public void eliminarPersona(int posicion) {
		lista.remove(posicion);
	}
	
	public void actualizarPersona(int posicion, Persona persona) {
		lista.set(posicion, persona);
	}
	
	public ArrayList<Persona> listarPersona(){
		return lista;
		
	}
	

}
