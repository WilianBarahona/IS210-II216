package clases;

public class Switch {
	public static void main(String[] args) {
		int mes = 15;
        String nombreMes;

        if (mes == 1)
        	nombreMes = "Enero";
        else if (mes == 2)
        	nombreMes = "Febrero";
        ///....
        else
        	nombreMes = "Mes Invalido";

        switch (mes) {
            case 1:
            	nombreMes = "Enero";
            	///.....
            	////....
            break;
            case 2:  nombreMes = "Febrero"; break;
            case 3:  nombreMes = "Marzo"; break;
            case 4:  nombreMes = "Abril"; break;
            case 5:  nombreMes = "Mayo"; break;
            case 6:  nombreMes = "Junio"; break;
            case 7:  nombreMes = "Julio"; break;
            case 8:  nombreMes = "Agosto"; break;
            case 9:  nombreMes = "Septiembre"; break;
            case 10: nombreMes = "Octubre"; break;
            case 11: nombreMes = "Noviembre"; break;
            case 12: nombreMes = "Diciembre"; break;
            default: nombreMes = "Mes invalido";  break;
        }
        System.out.println(nombreMes);
	}
}
