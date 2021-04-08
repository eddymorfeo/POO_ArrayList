package modelo;

public class Persona implements Ipersona{

	private int id;
	private String nombre;
	private char sexo;
	private Mascota mascota;
	private boolean activo;
	
	public Persona() {
		
	}
	
	public Persona(int id, String nombre, char sexo, Mascota mascota, boolean activo) {
		this.id = id;
		this.nombre = nombre;
		this.sexo = sexo;
		this.mascota=mascota;
		this.activo=activo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", sexo=" + sexo + ", mascota=" + mascota + ", activo="
				+ activo + "]";
	}

	public void Comer() {
		// TODO Auto-generated method stub
		
	}

	public String Dormir() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
		
	}
