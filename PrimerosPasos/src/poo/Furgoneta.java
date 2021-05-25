package poo;

public class Furgoneta extends Coche{
		
		private int capacidad_extra;
		private int plazas_extra;
		
		public Furgoneta(int plazas_extra, int capacidad_carga) {
			
			super(); // llama al constructor de la clase padre
			this.capacidad_extra = capacidad_carga;
			this.plazas_extra = plazas_extra;
		}
		
		public String getDatosFurgoneta() {
			return " La capacidad de carga es: " + capacidad_extra + " y las plazas son: " + plazas_extra;
		}

}
