import java.util.Scanner;

//Realizar un programa que solicite al usuario un numero del 1 al 7 y el programa le mostrara a que dia de la semana pertenece ese dia. El dia 1 sera Lunes

public class numeroDia{

	public static void main(String[] args)
	{
		
		Scanner r = new Scanner(System.in);

		System.out.println("Porfavor ingrese un numero del 1 al 7: ");
		int numero = r.nextInt();

		
		switch(numero){
		case 1:
		System.out.println("La numero ingresado fue : "+numero+" - El dia que pertenece al numero es Lunes.");
		break;
		case 2:
		System.out.println("La numero ingresado fue : "+numero+" - El dia que pertenece al numero es Martes.");
		break;
		case 3:
		System.out.println("La numero ingresado fue : "+numero+" - El dia que pertenece al numero es Miercoles.");
		break;
		case 4:
		System.out.println("La numero ingresado fue : "+numero+" - El dia que pertenece al numero es Jueves.");
		break;
		case 5:
		System.out.println("La numero ingresado fue : "+numero+" - El dia que pertenece al numero es Viernes.");
		break;
		case 6:
		System.out.println("La numero ingresado fue : "+numero+" - El dia que pertenece al numero es Sabado.");
		break;
		case 7:
		System.out.println("La numero ingresado fue : "+numero+" - El dia que pertenece al numero es Domingo.");
		break;
		default:
		System.out.println("Ingreso un numero mayor a 7!");
		}
		

	}

}