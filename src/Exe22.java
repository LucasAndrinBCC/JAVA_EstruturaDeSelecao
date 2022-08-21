import java.util.Scanner;

//Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade
//de centenas, dezenas e unidades do mesmo.

public class Exe22 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.println("Entre com um número menor que 1000: ");
			num = entrada.nextInt();
		} while (num < 0 || num >= 1000);
		
		int centenas = num/100;
		int dezenas = (num%100)/10;
		int unidades = (num%100)%10;
		
		System.out.println("Centenas: " + centenas);
		System.out.println("Dezenas: " + dezenas);
		System.out.println("Unidades: " + unidades);
		
		entrada.close();
	}

}
