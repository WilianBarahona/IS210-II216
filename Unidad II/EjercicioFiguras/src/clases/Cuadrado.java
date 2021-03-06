package clases;

import java.awt.Color;
import java.awt.Graphics;

public class Cuadrado extends Rectangulo {

	public Cuadrado(int coordenadaX, int coordenadaY, int lado, Color color, double area) {
		super(coordenadaX, coordenadaY, lado, lado, color, area);
	}

	public Cuadrado() {}

	@Override
	public void dibujar(Graphics g){
		g.setColor(color);
		g.drawRect(coordenadaX, coordenadaY, ancho, alto);
		System.out.println("Dibujando cuadrado");
	}

}
