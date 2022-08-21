import java.util.Scanner;
//Uma fruteira está vendendo frutas com a seguinte tabela de preços:
//Até 5 Kg Acima de 5 Kg
//Morango R$ 2,50 por Kg R$ 2,20 por Kg
//Maçã R$ 1,80 por Kg R$ 1,50 por Kg
//
//Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra
//ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total.
//Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a
//quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo
//cliente.
public class Exe30 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float valorMorangos, valorMacas, valorTotal;
		
		System.out.println("Kg de maçãs: ");
		float kgMaca = entrada.nextFloat();
		
		System.out.println("Kg de Morangos: ");
		float kgMorango = entrada.nextFloat();
		
		if (kgMorango <= 5) {
			valorMorangos = 2.5f * kgMorango;
		} else {
			valorMorangos = 1.9f * kgMorango;
		}
		
		if (kgMaca <= 5) {
			valorMacas = 1.8f * kgMaca;
		} else {
			valorMacas = 1.5f * kgMaca;
		}
		
		valorTotal = valorMacas + valorMorangos;
		
		if (valorTotal > 25 || kgMaca + kgMorango > 8) {
			valorTotal = valorTotal * 0.9f;
		}
		
		System.out.println("Maçãs (kg): " + kgMaca);
		
		System.out.println("Morangos (kg): " + kgMorango);
		
		System.out.println("Valor Total (R$): " + valorTotal);
		
		entrada.close();
	}

}
