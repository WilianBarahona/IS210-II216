package clases;

import java.awt.Graphics;

import javax.swing.JFrame;

public class Formulario extends JFrame{

	public Formulario(){
		setTitle("Figuras");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g){
		super.paint(g);
		g.drawString("Hola mundo", 100, 100);
	}

	public static void main(String[] args) {
		new Formulario();
	}

}