import java.util.Scanner;
//Faça um Programa para leitura de três notas parciais de um aluno. O programa deve
//calcular a média alcançada por aluno e presentar:
//
//◦ A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva
//média alcançada;
//◦ A mensagem "Reprovado", se a média for menor do que 7, com a respectiva
//média alcançada;
//◦ A mensagem "Aprovado com Distinção", se a média for igual a 10.
public class Exe24 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com a primeira nota: ");
		int a = entrada.nextInt();
		System.out.print("Entre com a primeira nota: ");
		int b = entrada.nextInt();
		System.out.print("Entre com a primeira nota: ");
		int c = entrada.nextInt();
		
		float media = (a + b +c)/3f;
		
		if (media == 10) {
			System.out.println("Aprovado com Distinção!");
		} else if (media >= 7) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}
		
		entrada.close();
	}

}
