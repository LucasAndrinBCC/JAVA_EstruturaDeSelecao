import java.util.Scanner;
//19. Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2
//+ bx + c. O programa deverá pe seguintes situações:
//Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o
//programa não deve fazer pedir os demais valores, sendo encerrado;
//Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e
//encerre o programa;
//Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao
//usuário;
//Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;
public class Exe19 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com o coeficiente A: ");
		float a = entrada.nextFloat();
		
		System.out.print("Entre com o coeficiente B: ");
		float b = entrada.nextFloat();
		
		System.out.print("Entre com o coeficiente C: ");
		float c = entrada.nextFloat();
		
		if (a != 0) { 
			
			double delta = Math.pow(b, 2) - 4 * a * c;
			
			if (delta < 0) {
				
				System.out.println("Não possui raiz real!");
				
			} else if (delta == 0) {
				System.out.println("Apenas uma raiz real em: x = " + (-b/(2 * a)));
			} else {
				System.out.println("Duas Raizes Reais: x = {"+ (Math.sqrt(delta) - b)/(2 * a) + ", " + (-Math.sqrt(delta) - b)/(2 * a) +"}");
			}
			
		} else {
			System.out.println("Equação não é do Segundo Grau!");
		}
		
		entrada.close();
	}

}
