package poo;

import javax.swing.*;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Coche ford = new Coche(); // "ford" es una intancia o ejemplar de clase 
		// USAR "new" envía el flujo de ejecución a la clase donde Coche se declara
		
		System.out.println("El largo del coche es " + ford.obtenerLargo());
		
		ford.setColor(JOptionPane.showInputDialog("Introduce el color del auto"));
		
		System.out.println("color del coche: " + ford.obtenerColor());
		
		ford.configura_asientos(JOptionPane.showInputDialog("Posee asientos de cuero? (si/no)"));
		
		ford.configura_climatizador(JOptionPane.showInputDialog("Posee climatizador? (si/no)"));
		
		System.out.println(ford.getDatosGenerales());
		
		System.out.println("El precio final del coche es: " + ford.getPrecioCoche());*/
		
		Coche coche = new Coche();
		coche.setColor("Rojo");
		
		Furgoneta furgoneta1 = new Furgoneta(7, 590);
		
		furgoneta1.setColor("Azul");
		furgoneta1.configura_asientos("Si");
		furgoneta1.configura_climatizador("Si");
		
		System.out.println(coche.getDatosGenerales() + "\nColor: " + coche.obtenerColor() + "\n");
		System.out.println(furgoneta1.getDatosGenerales() + furgoneta1.getDatosFurgoneta() + "\nColor: " + furgoneta1.obtenerColor() + "\n");
		
		
		
	}

}
