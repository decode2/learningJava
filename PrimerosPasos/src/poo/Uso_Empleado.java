package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Empleado empleado1 = new Empleado("Carlos Vives", 85000, 2021, 3, 15);
		Empleado empleado2 = new Empleado("Leo Vives", 2000, 2021, 4, 17);
		Empleado empleado3 = new Empleado("Franco Barbaffo", 3000, 2021, 8, 23);
		
		empleado1.aumentarSueldo(5);
		empleado2.aumentarSueldo(5);
		empleado3.aumentarSueldo(5);
		
		System.out.println("Nombre: " + empleado1.getNombre() + " | Sueldo: " + empleado1.getSueldo() + " | Fecha de alta: " + empleado1.getFechaContrato());
		System.out.println("Nombre: " + empleado2.getNombre() + " | Sueldo: " + empleado2.getSueldo() + " | Fecha de alta: " + empleado2.getFechaContrato());
		System.out.println("Nombre: " + empleado3.getNombre() + " | Sueldo: " + empleado3.getSueldo() + " | Fecha de alta: " + empleado3.getFechaContrato());*/
		
		Jefatura jefeRRHH = new Jefatura("Ricardo Bolaslargas", 120000, 2021, 8, 15);
		jefeRRHH.setIncentivo(2500);
		
		Empleado[] misEmpleados = new Empleado[5];
		
		misEmpleados[0] = new Empleado("Carlos Vives", 85000, 2021, 3, 15);
		misEmpleados[1] = new Empleado("Leo Vives", 2000, 2021, 4, 17);
		misEmpleados[2] = new Empleado("Franco Barbaffo", 3000, 2021, 8, 23);
		misEmpleados[3] = jefeRRHH; // polimorfismo en acción: principio de sustitución
		misEmpleados[4] = new Jefatura("María", 95000, 1999, 3, 8);
		
		Jefatura jefaFinanzas = (Jefatura) misEmpleados[4]; // casting -> convierte un objeto de un tipo a otro
		
		jefaFinanzas.setIncentivo(8000);
		
		System.out.println(jefaFinanzas.tomarDecisiones("Dar 1 día más de vacaciones"));
		
		System.out.println("El jefe " + jefaFinanzas.getNombre() + " tiene un bonus de: " +  jefaFinanzas.estableceBonus(500));
		
		System.out.println(misEmpleados[3].getNombre() + " tiene un bonus de: " + misEmpleados[3].estableceBonus(200));
		
		
		/*
		for (int i = 0; i < misEmpleados.length; i++) {
			
			misEmpleados[i].aumentarSueldo(5);
			
			System.out.println("Nombre: " + misEmpleados[i].getNombre() + " | Sueldo: " + misEmpleados[i].getSueldo() + " | Fecha de alta: " + misEmpleados[i].getFechaContrato());
		}*/
		
		for (Empleado e: misEmpleados) {
			
			e.aumentarSueldo(5);
			//System.out.println("Nombre: " + e.getNombre() + " | Sueldo: " + e.getSueldo() + " | Fecha de alta: " + e.getFechaContrato());
		}
		
		// Sorteamos de menor a mayor sueldo segun el override dentro de Empleado
		Arrays.sort(misEmpleados);
		
		// Clases de interfaces
		/*
		Empleado director = new Jefatura("Horacio", 123123, 2011, 9, 13);
		
		Comparable asd = new Empleado("Asd", 213133, 2010, 3, 4);
		
		if (director instanceof Empleado) {
			System.out.println("Es de tipo Jefatura > Empleado");
		}
		
		if (asd instanceof Comparable) {
			System.out.println("Implementa la interfaz comparable");
		}*/
		
		for (Empleado e: misEmpleados) {
			System.out.println("Nombre: " + e.getNombre() + " | Sueldo: " + e.getSueldo() + " | Fecha de alta: " + e.getFechaContrato());
		}
	}

}

class Empleado implements Comparable<Object>, Trabajadores{
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		
		nombre = nom;
		sueldo = sue;
		
		GregorianCalendar calendar = new GregorianCalendar(agno, mes-1, dia);
		
		altaContrato = calendar.getTime();
		
		++idSiguiente;
		id = idSiguiente;
		
	}
	
	public double estableceBonus(double gratificacion) {
		return Trabajadores.bonusBase+gratificacion;
	}
	
	public String getNombre() { // getter
		return nombre;
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
	
	private int id;
	private int idSiguiente;
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
			
		Empleado anotherEmployee = (Empleado) o;
		
		if (this.sueldo < anotherEmployee.sueldo) {
			return -1;
		}
		else if (anotherEmployee.sueldo < this.sueldo) {
			return 1;
		}
		
		return 0;
	}
	
}

class Jefatura extends Empleado implements Jefes{
	
	public Jefatura(String nom, double sue, int año, int mes, int dia) {
		super(nom, sue, año, mes, dia);
	}
	
	private double incentivo;
	
	public void setIncentivo(double b) {
		incentivo = b;
	}
	
	public double getSueldo() {
		//return super.getSueldo()+incentivo;
		
		double sueldoJefe = super.getSueldo();
		
		return sueldoJefe + incentivo;
	}
	
	public String tomarDecisiones(String decision) {
		return "Un miembro de la dirección ha tomado la decisión: " + decision;
	}
	
	public double estableceBonus(double gratificacion) {
		
		double prima = 2000;
		
		return Trabajadores.bonusBase+gratificacion+prima;
	}
}

class Director extends Jefatura{
	
	public Director(String nombre, double sueldo, int año, int mes, int dia) {
		super(nombre, sueldo, año, mes, dia);
	}
	
	
}
