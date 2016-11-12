package clases;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EjemploObjectOutputStream {
	private ObjectOutputStream flujoEscritura;
	public EjemploObjectOutputStream(){
		try {
			flujoEscritura = new ObjectOutputStream(new FileOutputStream("objetos.juan"));
			Persona p1 = new Persona("Juan","Perez",30,"M");
			Persona p2 = new Persona("Maria","Rodriguez",30,"F");

			flujoEscritura.writeObject(p1);
			flujoEscritura.writeObject(p2);

			flujoEscritura.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new EjemploObjectOutputStream();
	}
}
