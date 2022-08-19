import java.util.Scanner;
//16. Altere o programa que calcula a média do aluno, e mostre a mensagem de acordo com a
//média. De 0 a 3 - Reprovado, de 3 a 6.9 - Em Exame, de 7 a 10 - Aprovado
public class Exe16 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float a, b;
		do {
			System.out.print("Informe a nota: ");
			a = entrada.nextFloat();
			System.out.print("Informe a nota: ");
			b = entrada.nextFloat();
		} while (a < 0 && a > 10 || b < 0 && b > 10);
		
		float media = (a + b)/2;
		
		if (media <= 3) {
			System.out.println("Reprovado!");
		} else if (media < 7) {
			System.out.println("Em exame!");
		} else {
			System.out.println("Aprovado!");
		}
		
		entrada.close();
	}

}
