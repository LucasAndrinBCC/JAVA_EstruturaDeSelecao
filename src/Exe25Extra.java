import java.util.Scanner;
//Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica:
//utilize o operador módulo (resto da divisão).
public class Exe25Extra {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro: ");		
		int num = entrada.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Par!");
		} else {
			System.out.println("Ímpar!");
		}
		
		entrada.close();
	}

}
