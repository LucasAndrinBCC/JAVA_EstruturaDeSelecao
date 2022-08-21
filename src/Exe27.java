import java.util.Scanner;
//Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação
//ele deseja realizar. O resultado da operação deve ser acompanhado de uma frase que diga
//se o número é:
//
//o par ou ímpar;
//o positivo ou negativo;
//o inteiro ou decimal.
public class Exe27 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com um número inteiro: ");
		int a = entrada.nextInt();
		System.out.print("Entre com um número inteiro: ");
		int b = entrada.nextInt();
		
		char operacao;
		do {
			System.out.print("Entre com a operação matemática (-, +, *, /): ");
			entrada.nextLine();
			operacao = entrada.nextLine().charAt(0);
		} while (operacao != '-' && operacao != '+' && operacao != '*' && operacao != '/');
		
		float resultado;
		
		if (operacao == '-') {
			resultado = a - b;
		} else if (operacao == '+') {
			resultado = a + b;
		} else if (operacao == '*') {
			resultado = a * b;
		} else {
			resultado = a / b;
		}
		
		System.out.println("Resultado: " + resultado);
		if (resultado < 0) {
			System.out.println("Negativo!");
		} else {
			System.out.println("Positivo!");
		}
		
		if (resultado % 2 == 0) {
			System.out.println("Par!");
		} else {
			System.out.println("Ímpar!");
		}
		
		if (resultado == Math.ceil(resultado)) {
			System.out.println("Inteiro!");
		} else {
			System.out.println("Decimal!");
		}
		
		entrada.close();
	}

}
