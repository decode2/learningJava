import javax.swing.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long resultado = 1;
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		
		for (int i = numero; i > 0; i--) {
			
			if (i != 0 && i != numero) {
				System.out.print("Paso " + (numero-i) + ": ");
			}
			
			resultado = resultado*i;
			
			if (i != 0 && i != numero) {
				System.out.println(resultado + " x " + i + " = " + resultado);
			}
			
			
			
		}
		System.out.println("El factorial de " + numero + " es " + resultado);
	}

}
