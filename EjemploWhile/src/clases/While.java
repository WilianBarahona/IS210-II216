package clases;

public class While {
	public static void main(String[] args) {
		int contador = 1;
        while (contador < 11) {
            System.out.println("Contador: " + contador);
            contador++; //contador = contador+1;
        }


        //Banderas, centinelas
        boolean jugando=true;
        int vidas = 4;
        while (jugando){
        	System.out.println("Ejecutando...");
        	///...
        	if (vidas<=0){
        		System.out.println("Perdio :(");
        		jugando = false;
        	}
        }
	}
}
