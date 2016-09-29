package clases;

import java.awt.Color;
import java.awt.Graphics;

public class Circulo extends Ovalo {

	public Circulo(int coordenadaX, int coordenadaY, int diametro, Color color, double area) {
		super(coordenadaX, coordenadaY, diametro, diametro, color, area);
	}

	public Circulo() {}

	@Override
	public void dibujar(Graphics g) {
		super.dibujar(g);
		System.out.println("Dibujar un circulo");
	}
}
