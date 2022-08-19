import java.util.Scanner;
//Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se
//os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo
//é: equilátero, isósceles ou escaleno.
//Dicas:
//Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o
//terceiro;
//Triângulo Equilátero: três lados iguais;
//Triângulo Isósceles: quaisquer dois lados iguais;
//Triângulo Escaleno: três lados diferentes;
public class Exe18 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float a, b, c;
		do {
			System.out.print("Entre com o lado A: ");
			a = entrada.nextFloat();
			System.out.print("Entre com o lado B: ");
			b = entrada.nextFloat();
			System.out.print("Entre com o lado C: ");
			c = entrada.nextFloat();
		} while(a <= 0 || b <= 0 || c <= 0);
		
		if (a == b && b == c) {
			System.out.println("Triângulo Equilátero");
		} else if (a == b || b == c || a == c) {
			System.out.println("Triângulo Isóceles");
		} else {
			System.out.println("Triângulo Escaleno");
		}
		
		entrada.close();
	}

}
