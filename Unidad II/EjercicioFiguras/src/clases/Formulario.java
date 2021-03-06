package clases;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Formulario extends JFrame{
	private ArrayList<Figura> figuras;
	/*private Rectangulo r1;
	private Ovalo o1;
	private Cuadrado q1;
	private Circulo c1;*/
	public Formulario(){
		inicializarFiguras();
		setTitle("Figuras");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void inicializarFiguras(){
		figuras = new ArrayList<Figura>();
		figuras.add(new Rectangulo(100,200, 32,553,new Color(255,101,252),453));
		figuras.add(new Rectangulo(34,34, 45,553,new Color(255,101,252),453));
		figuras.add(new Rectangulo(45,67, 788,553,new Color(255,101,252),453));
		figuras.add(new Rectangulo(300,89, 45,553,new Color(255,101,252),453));
		figuras.add(new Rectangulo(100,37, 350,553,new Color(255,101,252),453));
		figuras.add(new Ovalo(100,200,350,553, new Color(40,104,199),453));
		figuras.add(new Cuadrado(30,100,350, new Color(213,68,46),453));
		for (int i=0;i<100;i++)
			figuras.add(new Circulo(30+(i*i),100+(i*i),350+(i*i), new Color(213,148,46),453));
	}

	@Override
	public void paint(Graphics g){
		super.paint(g);
		g.drawString("Hola mundo", 100, 100);
		/*r1.dibujar(g);
		o1.dibujar(g);
		q1.dibujar(g);
		c1.dibujar(g);*/
		for (int i=0;i<figuras.size();i++)
			figuras.get(i).dibujar(g);
	}

	public static void main(String[] args) {
		new Formulario();
	}

}
