package poo;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DameLaHora oyente = new DameLaHora();
		Timer timer = new Timer(3000, oyente);
		
		timer.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para salir");
		
		System.exit(0);
	}

}

class DameLaHora implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		Date ahora = new Date();
		System.out.println("Set de hora cada 5 segs: " + ahora);
		
		Toolkit.getDefaultToolkit().beep();
	}
}
