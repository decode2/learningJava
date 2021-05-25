package poo;

public class Coche {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	
	String color;
	int peso_total;
	boolean asientos_cuero, climatizador;
	
	public Coche() {
		
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
	}
	
	public int obtenerRuedas() {
		return ruedas;
	}
	public int obtenerLargo() {
		return largo;
	}
	public int obtenerAncho() {
		return ancho;
	}
	public int obtenerMotor() {
		return motor;
	}
	public int obtenerPeso() {
		return peso_plataforma;
	}
	
	public String obtenerColor() {
		return color;
	}
	public void setColor(String valor) {
		color = valor;
	}
	
	public void configura_asientos(String asientos_cuero) { // SETTER
		if (asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero = true;
		}
		else {
			this.asientos_cuero = false;
		}
	}
	
	public String getAsientos() {
		boolean cuero = false;
		
		if (this.asientos_cuero) {
			cuero = true;
		}
		
		return (cuero) ? "si" : "no";
	}
	
	public void configura_climatizador(String climatizador) { // SETTER
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		}
		else {
			this.climatizador = false;
		}
	}
	
	public String getClimatizador() {
		boolean climatizador = false;
		
		if (this.climatizador) {
			climatizador = true;
		}
		
		return (climatizador) ? "si" : "no";
	}
	
	public String getPesoCoche() { // SETTER + GETTER, SOLAMENTE EJEMPLO, NO RECOMENDABLE
		int peso_carroceria = 500;
		
		peso_total = peso_total+peso_carroceria;
		
		if (asientos_cuero) {
			peso_total = peso_total+50; // mejorable a peso_total += 50;
		}
		
		if (climatizador) {
			peso_total = peso_total+20;
		}
		
		return "El peso del coche es " + peso_total;
	}
	
	public int getPrecioCoche() {
		
		int precio_final = 10000;
		
		if (asientos_cuero) {
			precio_final += 2000;
		}
		if (climatizador) {
			precio_final += 500;
		}
		
		return precio_final;
	}
	
	public String getDatosGenerales() {
		return "La plataforma del vehiculo tiene " + ruedas + " ruedas" +
				". Mide " + largo/1000 + " metros con un ancho de " + ancho + 
				" cm y un peso de plataforma de " + peso_plataforma + " kg." + "\nAsientos de cuero: " + getAsientos() +
				"\nClimatizador: " + getClimatizador();
	}

}
