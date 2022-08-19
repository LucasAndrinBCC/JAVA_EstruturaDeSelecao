import java.util.Scanner;
//Faça um Programa que peça um valor e mostre na tela se o valor é positivo, negativo
//ou zero.
public class Exe2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro: ");
		int num = entrada.nextInt();
		
		if (num == 0) {
			System.out.println("Número é igual a zero!");
		} else {
			if (num > 0) {
				System.out.println("Número é positivo!");
			} else {
				System.out.println("Número é negativo!");
			}
		}
		
		entrada.close();
	}

}
