import java.util.Scanner;
//Faça um Programa que peça para entrar com um ano com 4 dígitos e determine se o
//mesmo é ou não bissexto.
public class Exe4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entra com um ano de ao menos 4 dígitos: ");
		int ano = entrada.nextInt();
		
		int anoLength = String.valueOf(ano).length();
		
		if (anoLength >= 4) {
			if (ano % 4 == 0) {
				System.out.println("É ano bissexto!");
			} else {
				System.out.println("Não é ano bissexto!");
			}
		} else {
			System.out.println("Ano inválido!");
		}
		
		entrada.close();
	}

}
