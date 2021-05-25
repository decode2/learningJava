import javax.swing.*;

public class AprendiendoSwing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = JOptionPane.showInputDialog("Introduce tu nombre de usuario, por favor");
		
		String password = JOptionPane.showInputDialog("Introduce tu contraseña");
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		
		System.out.println("User: " + username);
		System.out.println("Password: " + password);
		System.out.println("Edad: " + age + " años");
	}

}
