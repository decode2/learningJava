import javax.swing.*;

public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "asd";
		
		String pass = "";
		
		while (!clave.equals(pass)) {
			pass = JOptionPane.showInputDialog("Introduce la contraseña");
			
			if (!clave.equals(pass)) {
				System.out.println("Contraseña erronea");
			}
		}
		
		System.out.println("Bienvenido!");
	}

}
