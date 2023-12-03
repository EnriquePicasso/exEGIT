
public class Persona {
	
	
	private String nombre;
	private String apellidos;
	private int edad;
	private String provincia;
	
	public Persona(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	public void Cumpleaños() {
		edad++;
		System.out.print("Tienes " + edad + " años\n");
	}

	public static void main(String[] args) {
		Persona p = new Persona("Enrique","Martinez", 38);
		p.Cumpleaños();
		p.DatosPersona();

	}
	
	public void DatosPersona() {
		System.out.print("Nombre: " + nombre + "\n" 
						+ "Apellidos: " + apellidos + "\n"
						+ "Edad: " + edad);
	}

}
