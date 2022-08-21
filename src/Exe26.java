import java.util.Scanner;
//Faça um Programa que peça um número e informe se o número é inteiro ou decimal.
//Dica: utilize uma função de arredondamento.
public class Exe26 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");		
		float num = entrada.nextFloat();
		
//		System.out.println("num: " + num);
//		System.out.println("Math.ceil(num): " + Math.ceil(num));
		
		if (num == Math.ceil(num)) {
			System.out.println("Número inteiro");
		} else {
			System.out.println("Número decimal");
		}
		
		entrada.close();
	}

}
