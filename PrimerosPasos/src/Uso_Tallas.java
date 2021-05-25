import java.util.*;


public class Uso_Tallas {

	//enum Talla { MINI, MEDIANO, GRANDE, MUY_GRANDE };
	
	enum Talla{
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		
		private Talla(String abreviatura) {
			
			this.abreviatura = abreviatura;
		}
		
		public String getAbreviatura() {
			return this.abreviatura;
		}
		
		private String abreviatura;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Talla s = Talla.MINI;
		Talla m = Talla.MEDIANO;
		Talla l = Talla.GRANDE;
		Talla xl = Talla.MUY_GRANDE;*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
		
		String buffer = entrada.next().toUpperCase();
		
		Talla talla = Enum.valueOf(Talla.class, buffer);
		
		System.out.println("Talla =  " + talla);
		
		System.out.println("Abreviatura = " + talla.getAbreviatura());
	}

}
