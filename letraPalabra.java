import java.util.Scanner;

//Realizar un programa que solicite al usuario el ingreso de una vocal y el programa debera mostrar 3 palabras que empiezan con esa vocal.

public class letraPalabra{

	public static void main(String[] args)
	{
		
		Scanner r = new Scanner(System.in);

		System.out.println("Porfavor ingrese una vocal: ");
		char letra = r.next().charAt(0);

		
		switch(letra){
		case 'a':
		System.out.println("La letra ingresada fue : "+letra+" - Angel, Arco, Arbol.");
		break;
		case 'e':
		System.out.println("La letra ingresada fue : "+letra+" - Elefante, Enano, Egoista.");
		break;
		case 'i':
		System.out.println("La letra ingresada fue : "+letra+" - Iglesia, Iluminar, Introducir.");
		break;
		case 'o':
		System.out.println("La letra ingresada fue : "+letra+" - Ojo, Objeto, Oceano.");
		break;
		case 'u':
		System.out.println("La letra ingresada fue : "+letra+" - Unidad, Uno, Uniforme.");
		break;
		default:
		System.out.println("La letra ingresada:"+letra+" - no es una vocal.");
		}
		

	}

}