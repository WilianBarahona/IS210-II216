package clases;

import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

//awt
//swing
//javafx

public class Formulario extends JFrame{
	public Formulario(){
		setTitle("Super formulario");
		setSize(500, 500);
		/*Point p = new Point(200,20);
		setLocation(p);*/
		setLocationRelativeTo(null);//Centrar el formulario

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void paint(Graphics g){
		super.paint(g);
		try {
			g.drawImage(
					ImageIO.read(
						getClass().getResource("/imagenes/vegeta.jpg")),
						50, 50, this);
		} catch (IOException e) {
			e.printStackTrace();
		}
		g.setColor(new Color(255,0,0));
		g.drawOval(50,50,200,200);
		g.drawOval(100,120,20,20);
		g.drawOval(200,120,20,20);
		g.drawArc(100,200,100,30,12,50);

		g.fillRect(30, 400, 20, 200);
		//RedGreenBlue
		g.setColor(new Color(0,255,0));
		g.fillOval(10, 300, 100, 100);
		for (int i=0;i<500;i++)
			g.drawRect(200+(i*10), 300+(i*10), 100, 100);
		g.setColor(new Color(0,0,255));
		g.drawString("Puntuacion: 99999", 20, 50);


		//System.out.println("Se ejecuto el metodo paint");
	}

	public static void main(String[] args) {
		new Formulario();
	}
}
