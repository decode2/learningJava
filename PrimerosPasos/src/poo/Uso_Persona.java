package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		
		
		Persona[] people = new Persona[2];
		
		people[0] = new Empleado2("Carlitos", 25000, 2007, 1, 3);
		people[1] = new Alumno("Pedro", "RRHH");
		
		for (Persona p: people) {
			System.out.println(p.getNombre() + ", " + p.getDescripcion());
		}
	}

}

abstract class Persona{
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public abstract String getDescripcion();
	
	private String nombre;
}

class Empleado2 extends Persona{
	
	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom);
		
		sueldo = sue;
		
		GregorianCalendar calendar = new GregorianCalendar(agno, mes-1, dia);
		
		altaContrato = calendar.getTime();
		
		++idSiguiente;
		id = idSiguiente;
		
	}
	
	public String getDescripcion() {
		return "Este empleado tiene un ID = " + id + " con un sueldo = " + sueldo;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	public Date getFechaContrato() {
		return altaContrato;
	}
	
	public void aumentarSueldo(double porcentaje) {
		
		double aumento = sueldo*porcentaje/100;
		
		sueldo += aumento;
	}
	
	private double sueldo;
	private Date altaContrato;
	private int id;
	private int idSiguiente;

	
}

class Alumno extends Persona{

	public Alumno(String nombre, String carrera) {
		super(nombre);
		
		this.carrera = carrera;
	}
	
	public String getDescripcion() {
		return "Este alumno está estudiando la carrera de " + carrera;
	}
	
	private String carrera;
	
}