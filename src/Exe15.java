import java.util.Scanner;

//15. Faça um Programa que tendo como dados de entrada o preço de custo de um produto e
//um código de origem, emita o preço junto de sua procedência. Caso o código não seja
//nenhum dos especificados, o produto deve ser classificado como importado. Código de
//origem: 1 - Sul, 2 - Norte 3 - Leste, 4 - Oeste, 5 ou 6 - nordeste 7 ou 8 Centro-oeste.

public class Exe15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com o código de origem: ");
		int prodCod = entrada.nextInt();
		
		System.out.print("Entre com o preço do produto: ");
		float prodPreco = entrada.nextFloat();
				
		switch (prodCod) {
			case 1:
				informaDados(prodCod, prodPreco, "Sul");
				break;
			case 2:
				informaDados(prodCod, prodPreco, "Norte");
				break;
			case 3:
				informaDados(prodCod, prodPreco, "Leste");
				break;
			case 4:
				informaDados(prodCod, prodPreco, "Oeste");
				break;
			case 5, 6:
				informaDados(prodCod, prodPreco, "Nordeste");
				break;
			case 7, 8:
				informaDados(prodCod, prodPreco, "Centro-oeste");
				break;
			default:
				informaDados(prodCod, prodPreco, "Importado");
		}
		
		entrada.close();
	}
	
	public static void informaDados(int prodCod, float prodPreco, String prodClass) {
		System.out.println("Código: " + prodCod);
		System.out.println("Preço: " + prodPreco);
		System.out.println("Procedência: " + prodClass);
	}

}
