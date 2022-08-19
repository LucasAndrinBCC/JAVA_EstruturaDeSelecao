import java.util.Scanner;
//14. Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-
//Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
public class Exe14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		boolean flag;
		do {
			flag = false;
			
			System.out.print("Informe o número da semana: ");
			int num = entrada.nextInt();
			
			switch(num) {
				case 1:
					System.out.println("Domingo");
					break;
				case 2:					System.out.println("Segunda");
					break;
				case 3:
					System.out.println("Terça");					break;
				case 4:
					System.out.println("Quarta");
					break;
				case 5:
					System.out.println("Quinta");
					break;
				case 6:
					System.out.println("Sexta");
					break;
				case 7:
					System.out.println("Sábado");
					break;
				default: 
					System.out.println("Número inválido!");
					flag = true;
			}			
		} while (flag);
		
		entrada.close();
	}

}
