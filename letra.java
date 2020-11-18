import java.util.Scanner;

//Realizar un programa que solicite al usuario el ingreso de un caracter e imprima si es una vocal o no

public class letra{

	public static void main(String[] args)
	{
		
		Scanner r = new Scanner(System.in);

		System.out.println("Porfavor ingrese un caracter: ");
		char letra = r.next().charAt(0);

		
		switch(letra){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		System.out.println("La letra ingresada:"+letra+" es una vocal.");
		break;
		default:
		System.out.println("La letra ingresada:"+letra+" no es una vocal.");
		}
		

	}

}