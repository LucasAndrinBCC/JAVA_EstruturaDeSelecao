import java.util.Scanner;

public class Exe32 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		char[] gabarito = {'a','a','b','b','c','c','d','d','e','e'};
		char[] respostas = {'a','a','b','b','c','c','d','d','e','e'};
		String texto;
		int nota = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Entre com a resposta da questão " + (i + 1) + ": ");
			respostas[i] = entrada.nextLine().charAt(0);
		}
		
		for (int i = 0; i < 10; i++) {
			if (gabarito[i] == respostas[i]) {
				texto = "Acertou!";
				nota++;
			} else {
				texto = "Errou!";
			}
			
			System.out.println("Q1: " + gabarito[i] + ": " + texto);
		}
		
		System.out.println("#===========#==========#");
		System.out.println("Pontuação Final: " + nota);
		
		entrada.close();
	}

}
