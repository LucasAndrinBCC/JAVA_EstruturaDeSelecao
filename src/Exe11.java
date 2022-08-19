import java.util.Scanner;

//Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-
//Matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa
//Tarde!" ou "Boa Noite!" , conforme o caso.

public class Exe11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		char turno;
		boolean flag = true;
		
		while (flag) {
			System.out.print("Informe seu turno: ");
			turno = entrada.nextLine().charAt(0);
			
			if (turno == 'M') {
				System.out.println("Bom dia!");
				flag = false;
			} else if (turno == 'V') {
				System.out.println("Boa tarde!");
				flag = false;
			} else if (turno == 'N') {
				System.out.println("Boa noite!");
				flag = false;
			} else {
				System.out.println("Turno inválido!");
			}
		}
		
		entrada.close();
	}

}
