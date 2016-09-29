package clases;

import java.awt.Canvas;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Formulario extends Canvas{
	private JFrame ventana;
	public Formulario(){
		ventana = new JFrame("Juego");
		//ventana.setTitle("Juego");
		ventana.setSize(500,500);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.add(this);
		ventana.setVisible(true);
	}
	public static void main(String[] args) {
		new Formulario();
	}

	public void paint(Graphics g){
		super.paint(g);
		g.drawString("Hola mundo",100,100);
	}

}
