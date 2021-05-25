import javax.swing.JOptionPane;

public class Comprobacion_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arroba = 0;
		
		int punto = 0;
		
		String mail = JOptionPane.showInputDialog("Introduce tu email");
		
		for (int i = 0; i < mail.length(); i++) {
			if (mail.charAt(i) == '@') {
				arroba++;
			}
			
			if (mail.charAt(i) == '.') {
				punto++;
			}
		}
		
		if (arroba != 1 || punto < 1 || punto > 2) {
			System.out.println("Email wrong");
		}
		else {
			System.out.println("Email ok");
		}

	}

}
