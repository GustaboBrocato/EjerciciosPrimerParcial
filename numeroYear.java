import java.util.Scanner;

//Realizar un programa que solicite al usuario un numero del 1 al 12 y dependiendo el numero mostrara la cantidad de dias que tiene ese mes del año.

public class numeroYear{

	public static void main(String[] args)
	{
		
		Scanner r = new Scanner(System.in);

		System.out.println("Porfavor ingrese un numero del 1 al 12: ");
		int numero = r.nextInt();

		
		switch(numero){
		case 1:
		System.out.println("La numero ingresado: "+numero+" - Pertenece al mes de Enero y contiene 31 dias");
		break;
		case 2:
		System.out.println("La numero ingresado: "+numero+" - Pertenece al mes de Febrero y contiene 28 dias");
		break;
		case 3:
		System.out.println("La numero ingresado: "+numero+" - Pertenece al mes de Marzo y contiene 31 dias");
		break;
		case 4:
		System.out.println("La numero ingresado: "+numero+" - Pertenece al mes de Abril y contiene 30 dias");
		break;
		case 5:
		System.out.println("La numero ingresado: "+numero+" - Pertenece al mes de Mayo y contiene 31 dias");
		break;
		case 6:
		System.out.println("La numero ingresado: "+numero+" - Pertenece al mes de Junio y contiene 30 dias");
		break;
		case 7:
		System.out.println("La numero ingresado: "+numero+" - Pertenece al mes de Julio y contiene 31 dias");
		break;
		case 8:
		System.out.println("La numero ingresado: "+numero+" - Pertenece al mes de Agosto y contiene 31 dias");
		break;
		case 9:
		System.out.println("La numero ingresado: "+numero+" - Pertenece al mes de Septiembre y contiene 30 dias");
		break;
		case 10:
		System.out.println("La numero ingresado: "+numero+" - Pertenece al mes de Octubre y contiene 31 dias");
		break;
		case 11:
		System.out.println("La numero ingresado: "+numero+" - Pertenece al mes de Noviembre y contiene 30 dias");
		break;
		case 12:
		System.out.println("La numero ingresado: "+numero+" - Pertenece al mes de Diciembre y contiene 31 dias");
		break;
		default:
		System.out.println("Ingreso un numero mayor a 12!");
		}
		

	}

}