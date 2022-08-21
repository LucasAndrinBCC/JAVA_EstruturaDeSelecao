import java.util.Scanner;
//Um posto está vendendo combustíveis com a seguinte tabela de descontos:
//Álcool:
//até 20 litros, desconto de 3% por litro
//acima de 20 litros, desconto de 5% por litro
//Gasolina:
//até 20 litros, desconto de 4% por litro
//acima de 20 litros, desconto de 6% por litro
public class Exe29 {
	
	private static final int ALCOOL = 'A';
	private static final int GASOLINA = 'G';

	public static void main(String[] args) {
		
		float valor;
		char tipo;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.print("Entre com o tipo de Combustível (A - Álcool, G - Gasolina): ");
			tipo = entrada.nextLine().charAt(0);
		} while (tipo != GASOLINA && tipo != ALCOOL);
		
		System.out.println("Entre com os litros comprados: ");
		float litros = entrada.nextFloat();
		
		float desconto = 0;
		
		if (tipo == ALCOOL) {
			
			valor = litros * 1.9f;
			
			if (litros <= 20) {
				desconto = 0.03f;
			} else {
				desconto = 0.05f;
			}
			
		} else {
			valor = litros * 2.5f;
			
			if (litros <= 20) {
				desconto = 0.04f;
			} else {
				desconto = 0.06f;
			}
		}
		
		valor = valor - valor * desconto;
		
		System.out.println("Valor final: " + valor);
		
		entrada.close();
	}

}
