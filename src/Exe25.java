import java.util.Scanner;
//Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a
//valor do saque e depois informar quantas notas de cada valor serão fornecidas. As notas
//disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de
//600 reais. O programa não deve se preocupar com a quantidade de notas existentes na
//máquina.
//Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma
//nota de 50, uma nota de 5 e uma nota de 1;
//Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma
//nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.
public class Exe25 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int saque;
		
		do {
			System.out.println("Entre com o valor do saque entre (10, 600): ");
			saque = entrada.nextInt();
		} while (saque < 10 || saque > 600);
		
		int notas100 = saque/100;
		
		int notas50 = saque%100/50;
		
		int notas10 = saque%100%50/10;
		
		int notas5 = saque%100%50%10/5;
		
		int notas1 = saque%100%50%10%5;
		
		System.out.println("Notas de 100: " + notas100);
		System.out.println("Notas de 50: " + notas50);
		System.out.println("Notas de 10: " + notas10);
		System.out.println("Notas de 5: " + notas5);
		System.out.println("Notas de 1: " + notas1);
		
		entrada.close();
	}

}
