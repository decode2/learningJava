import javax.swing.*;

public class JueguitoNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = (int)(Math.random()*100);
		
		int intentos = 0;
		
		int data = Integer.parseInt(JOptionPane.showInputDialog("Adivina el numero que sali� (0 al 100)"));
		
		while (numero != data) {
			
			if (numero < data) {
				if (data > 100) {
					data = Integer.parseInt(JOptionPane.showInputDialog("El n�mero va entre 0 y 100"));
				}
				else {
					data = Integer.parseInt(JOptionPane.showInputDialog("M�s bajo"));
				}
			}
			else if (numero > data) {
				if (data < 0) {
					data = Integer.parseInt(JOptionPane.showInputDialog("El n�mero va entre 0 y 100"));
				}
				else {
					data = Integer.parseInt(JOptionPane.showInputDialog("M�s alto"));
				}
			}
			else {
				data = Integer.parseInt(JOptionPane.showInputDialog("El n�mero va entre 0 y 100"));
			}
			
			intentos++;
		}
		
		System.out.println("Bien! Acertaste en " + intentos + " intentos");

	}

}
