import java.util.Scanner;
//Faça um Programa que peça dois números e imprima o maior deles.
public class Exe1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int a = entrada.nextInt();
		
		System.out.print("Informe um número: ");
		int b = entrada.nextInt();
		
		if (a == b) {
			System.out.println("Números iguais");
		} else {
			if (a > b) {
				System.out.println("O primeiro número informado é o maior");
			} else {
				System.out.println("O segundo número informado é o maior");
			}
		}		
		
		entrada.close();

	}

}
