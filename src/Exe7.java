import java.util.Scanner;
//Faça um Programa que leia três números e mostre-os em ordem decrescente.
public class Exe7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com um número: ");
		int a = entrada.nextInt();
		System.out.print("Entre com um número: ");
		int b = entrada.nextInt();
		System.out.print("Entre com um número: ");
		int c = entrada.nextInt();
		
		int primeiro;
		int meio;
		int ultimo;
		
		if (a > b && a > c) {
			
			primeiro = a;
			
			if (b > c) {
				meio = b;
				ultimo = c;
			} else {
				meio = c;
				ultimo = b;
			}
			
		} else if (b > a && b > c) {
			
			primeiro = b;
			
			if (a > c) {
				meio = a;
				ultimo = c;
			} else {
				meio = c;
				ultimo = a;
			}
			
		} else {
			
			primeiro = c;
			
			if (a > b) {
				meio = a;
				ultimo = b;
			} else {
				meio = b;
				ultimo = a;
			}
		}
		
		System.out.println(primeiro + ", "  + meio + ", " + ultimo);
		
		entrada.close();
	}

}
