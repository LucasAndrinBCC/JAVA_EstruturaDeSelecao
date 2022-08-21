import java.util.Scanner;
//20. Faça um Programa que peça um número correspondente a um determinado ano e em
//seguida informe se este ano é ou não bissexto.
public class Exe20 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o ano: ");
		int ano = entrada.nextInt();
		
		if (ano % 4 == 0) {
			System.out.println("Ano bissexto");
		} else {
			System.out.println("Ano não é bissexto!");
		}
		
		entrada.close();
	}

}
