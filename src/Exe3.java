import java.util.Scanner;
//Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra
//escrever: F - Feminino, M - Masculino.
public class Exe3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com o sexo (M/F): ");
		char caractere = entrada.nextLine().charAt(0);
		
		if (caractere == 'M') {
			System.out.println("Masculino!");
		} else {
			if (caractere == 'F') {
				System.out.println("Feminino!");
			} else {
				System.out.println("Caractere inválido!");
			}
		}
		
		entrada.close();
	}

}
