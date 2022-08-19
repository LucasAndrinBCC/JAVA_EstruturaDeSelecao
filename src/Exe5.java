import java.util.Scanner;
//Faça um Programa que verifique se uma letra digitada é vogal.
public class Exe5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um caractere: ");		
		char caractere = entrada.nextLine().charAt(0);
		
		caractere = Character.toLowerCase(caractere);
		
		if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
			System.out.println("É vogal!");
		} else {
			System.out.println("Nâo é vogal!");
		}
		
		entrada.close();
	}

}
