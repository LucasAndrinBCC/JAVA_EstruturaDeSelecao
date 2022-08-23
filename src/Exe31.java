import java.util.Scanner;

public class Exe31 {
	
	private static final int FILE_DUPLO = 1;
	private static final int ALCATRA = 2;
	private static final int PICANHA = 3;
	

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com o tipo de carne: ");
		int tipo = entrada.nextInt();
		
		System.out.print("Entre com o peso da carne: ");
		float kg = entrada.nextFloat();
		
		System.out.println("Foi utilizado  o cartão Tabajara? ");
		boolean cartao = entrada.nextBoolean();
		
		String tipoTexto = "Error";
		float valor = 0;
		if (tipo == FILE_DUPLO) {
			tipoTexto = "File Duplo";
			valor = retornaValor(kg, 4.9f, 5.8f);
		} else if (tipo == ALCATRA) {
			tipoTexto = "Alcatra";
			valor = retornaValor(kg, 5.9f, 6.8f);
		} else if (tipo == PICANHA) {
			tipoTexto = "Picanha";
			valor = retornaValor(kg, 6.9f, 7.8f);
		}
		
		float valorFinal = valor;
		
		if (cartao) {
			valorFinal *= 0.95f;
		}
		
		System.out.println("Tipo: " + tipoTexto);
		System.out.println("Quantidade: " + kg + "kg");
		System.out.println("Preço Total: R$" + valor);
		System.out.println("Tipo de Pagamento: " + (cartao ? "Cartão Tabajara" : "Sem Cartão Tabajara"));
		System.out.println("Desconto: R$" + (valor - valorFinal));
		System.out.println("Valor Final: R$" + valor);
		
		entrada.close();
	}
	
	public static float retornaValor(float kg, float menorQue5, float maiorQue5) {
	
		if (kg < 5) {
			return kg * menorQue5;
		} else {
			return kg * maiorQue5;
		}
		
	}

}
