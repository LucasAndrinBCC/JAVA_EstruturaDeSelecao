import java.util.Scanner;
//Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve
//calcular a média alcançada pelo aluno e apresentar:
//o A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//o A mensagem "Reprovado", se a média for menor do que sete;
public class Exe8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe sua nota: ");
		float a = entrada.nextFloat();
		
		System.out.print("Informe sua nota: ");
		float b = entrada.nextFloat();
		
		float media = (a + b)/2;
		
		if (media < 7) {
			System.out.println("Reprovado!");
		} else {
			System.out.println("Aprovado!");
		}
		
		entrada.close();
	}

}
