import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EjemploFileInputStream {
	private BufferedInputStream flujoLectura;
	public EjemploFileInputStream(){
		try {
			flujoLectura = new BufferedInputStream(new FileInputStream("C:/Prueba/HolaMundo.java"));
			int valor;
			while((valor = flujoLectura.read())!=-1){
				System.out.print((char)valor);
			}
			flujoLectura.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new EjemploFileInputStream();
	}

}
