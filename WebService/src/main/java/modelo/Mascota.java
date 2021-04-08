package modelo;

public class Mascota {
	
	private Raza raza;
	private String nombre;
	
	public Mascota() {
		
	}

	public Mascota(Raza raza, String nombre) {
		
		this.raza = raza;
		this.nombre = nombre;
	}

	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Mascota [raza=" + raza + ", nombre=" + nombre + "]";
	}

	
}
