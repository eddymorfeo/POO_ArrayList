package modelo;

public class Raza {

	
	//atributos de la clase
	private String nombre;
	
	//constructores

	public Raza () {
		
	}
	
	public Raza(String nombre) {
		
		this.nombre = nombre;
	}
	
	//getter y setter

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Raza [nombre=" + nombre + "]";
	}
	
	
	
	
}
