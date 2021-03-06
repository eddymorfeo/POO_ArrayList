package Main;

import modelo.ListaPersonas;
import modelo.Mascota;
import modelo.Persona;
import modelo.Raza;


public class Main {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona();
		persona1.setId(2);
		persona1.setNombre("Edward");
		persona1.setSexo('I');
		Raza raza1 = new Raza("Gato");
		Mascota mascota1 = new Mascota(raza1, "Misufu");
		persona1.setMascota(mascota1);
		//System.out.println(persona1.getMascota().getRaza());
		
		
		Raza raza2 = new Raza("Kiltro");
		Mascota mascota2 = new Mascota(raza2, "Espayk");
		Persona persona2 = new Persona(10, "Carlos",'m', mascota2, true );
		//System.out.println(persona2);
		
		
		
		//LLamado a listas
		ListaPersonas listaPersonas = new ListaPersonas();
		listaPersonas.agregarPersona(persona1);
		listaPersonas.agregarPersona(persona2);
		
		
		for (int i = 0; i < listaPersonas.listarPersona().size(); i++) {
			System.out.println(listaPersonas.listarPersona().get(i));
		}
		
		listaPersonas.eliminarPersona(0);
		System.out.println("");
		
		for (int i = 0; i < listaPersonas.listarPersona().size(); i++) {
			System.out.println(listaPersonas.listarPersona().get(i));
		}
		
		Persona persona3 = new Persona(3,"Clabio", 'I',mascota1, true);
		listaPersonas.actualizarPersona(0, persona3);
		System.out.println("");
		
		for (int i = 0; i < listaPersonas.listarPersona().size(); i++) {
			System.out.println(listaPersonas.listarPersona().get(i));
		}
	}

}
