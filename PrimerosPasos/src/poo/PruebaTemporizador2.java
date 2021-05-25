package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj reloj = new Reloj(3000, true);
		reloj.enMarcha();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para salir");
		System.exit(0);
		
	}

}

class Reloj{
	
	public Reloj(int intervalo, boolean sonido){
		this.intervalo = intervalo;
		this.sonido = sonido;
	}
	
	public void enMarcha() {
		ActionListener oyente = new DameLaHora2();
		
		Timer tempo = new Timer(intervalo, oyente);
		
		tempo.start();
	}
	
	private int intervalo;
	private boolean sonido;
	
	public class DameLaHora2 implements ActionListener{
		
		public void actionPerformed(ActionEvent evento) {
			
			Date now = new Date();
			
			System.out.println("Hora cada " + intervalo/1000 + " segundos: " + now);
			
			if (sonido) {
				Toolkit.getDefaultToolkit().beep();
			}
		}
	}
}