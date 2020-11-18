import java.util.Scanner;

//Un programa que solicite 3 numeros y muestre cual es el numero mas grande.

public class numeroMenor{

	public static void main(String[] args)
	{
		
		Scanner r = new Scanner(System.in);

		System.out.println("A continuacion porfavor ingrese tres numeros: ");
		System.out.println("Ingrese el primer numero: ");
		int numero1 = r.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		int numero2 = r.nextInt();
		System.out.println("Ingrese el tercer numero: ");
		int numero3 = r.nextInt();
		
		if(numero1<numero2&&numero1<numero3){
		System.out.println("El numero: "+numero1+" es menor al numero: "+numero2+" y "+numero3+".");
		}else if(numero2<numero1&&numero2<numero3){
		System.out.println("El numero: "+numero2+" es menor al numero: "+numero1+" y "+numero3+".");
		}else if(numero3<numero1&&numero3<numero2){
		System.out.println("El numero: "+numero3+" es menor al numero: "+numero1+" y "+numero2+".");
		}

		
		

	}

}