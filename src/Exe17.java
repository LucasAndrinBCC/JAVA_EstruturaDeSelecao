import java.util.Scanner;
//Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao
//longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela
//abaixo:
//Média de Aproveitamento Conceito
//Entre 9.0 e 10.0 A
//Entre 7.5 e 9.0 B
//Entre 6.0 e 7.5 C
//Entre 4.0 e 6.0 D
//Entre 4.0 e zero E
public class Exe17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float a, b;
		do {
			System.out.print("Informe a 1º nota: ");
			a = entrada.nextFloat();
			System.out.print("Informe a 1º nota: ");
			b = entrada.nextFloat();
		} while (a < 0 && a > 10 || b < 0 && b > 10);
		
		float media = (a + b)/2;
		String nota;
			
		if (media <= 4) {
			nota = "E";
		} else if (media <= 6) {
			nota = "D";
		} else if (media <= 7.5f) {
			nota = "C";
		} else if (media <= 9) {
			nota = "B";
		} else {
			nota = "A";
		}
		
		System.out.println("Notas: ");
		System.out.println(a + ", " + b);
		System.out.println("Média: " + media);
		System.out.println("Nota Final: " + nota);
		
		if (nota.equals("A") || nota.equals("B") || nota.equals("C")) {
			System.out.println("APROVADO!");
		} else {
			System.out.println("REPROVADO!");
		}
		
		entrada.close();
	}

}
