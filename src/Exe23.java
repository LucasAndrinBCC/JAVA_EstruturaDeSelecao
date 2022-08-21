import java.util.Scanner;

//Faça um Programa para ler três idades de alunos e seguir as seguintes instruções:
//◦ Se a média de idade dos alunos é inferior de 25, apresentar a mensagem
//"Turma Jovem";
//◦ Se a média de idade dos alunos é entre 25 e 40, apresentar a mensagem
//"Turma Adulta";
//◦ Se a média de idade dos alunos é acima de 40 anos, apresentar a
//mensagem "Turma Idosa".

public class Exe23 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com a primeira idade: ");
		int a = entrada.nextInt();
		System.out.print("Entre com a segunda idade: ");
		int b = entrada.nextInt();
		System.out.print("Entre com a terceira idade: ");
		int c = entrada.nextInt();
		
		float media = (a + b + c)/3f;
		
		if (media < 25) {
			System.out.println("Turma Jovem!");
		} else if (media < 40) {
			System.out.println("Turma Adulta!");
		} else {
			System.out.println("Turma Idosa!");
		}
		
		entrada.close();
	}

}
