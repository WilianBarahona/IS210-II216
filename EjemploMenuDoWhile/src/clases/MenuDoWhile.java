package clases;

import java.util.Scanner;

public class MenuDoWhile {
	public static void main(String[] args) {
		int opcion;
		Scanner entrada = new Scanner(System.in);
		do{
			System.out.println("Menu");
			System.out.println("0 Salir");
			System.out.println("1 Opcion 1");
			System.out.println("2 Opcion 2");
			System.out.println("3 Opcion 3");
			System.out.println("4 Opcion 4");
			System.out.print("�Que opcion desea ejecutar?: ");
			opcion = entrada.nextInt();
			System.out.println("Opcion seleccionada: "+opcion);
		} while (opcion!=0);
		System.out.println("Fin del programa");
	}
}
