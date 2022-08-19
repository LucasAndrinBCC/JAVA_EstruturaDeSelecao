import java.util.Scanner;
//Faça um Programa que leia três números e mostre o maior e o menor deles.
public class Exe10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int a = entrada.nextInt();
		System.out.print("Informe um número: ");
		int b = entrada.nextInt();
		System.out.print("Informe um número: ");
		int c = entrada.nextInt();
		
		int maior, menor;
		
		if (a > b && a > c) {
			
			maior = a;
			
			if (b > c) {
				menor = c;
			} else {
				menor = b;
			}
			
		} else if (b > a && b > c) {
			
			maior = b;
			
			if (a > c) {
				menor = c;
			} else {
				menor = a;
			}
			
		} else {
			
			maior = c;
			
			if (a > b) {
				menor = b;
			} else {
				menor = a;
			}
		}
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		
		entrada.close();
	}

}
