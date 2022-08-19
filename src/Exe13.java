import java.util.Scanner;

//13.Faça um programa para o cálculo de uma folha de pagamento, sabendo que os
//descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela
//abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas
//não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao
//Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua
//hora e a quantidade de horas trabalhadas no mês.
//Desconto do IR:
//Salário Bruto até 900 (inclusive) - isento
//Salário Bruto até 1500 (inclusive) - desconto de 5%
//Salário Bruto até 2500 (inclusive) - desconto de 10%
//Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas
//conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.
//Salário Bruto: (5 * 220) : R$ 1100,00
//(-) IR (5%) : R$ 55,00
//(-) INSS ( 10%) : R$ 110,00
//FGTS (11%) : R$ 121,00
//Total de descontos : R$ 165,00
//Salário Liquido : R$ 935,00

public class Exe13 {
	
	final static float SINDICATO = 0.03f;
	final static float FGTS = 0.11f;

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com o valor/hora de salário: ");
		float valorHora = entrada.nextFloat();
		
		System.out.println("Entre com as horas trabalhadas: ");
		int horas = entrada.nextInt();
		
		float salarioBruto = valorHora * horas;
		float salarioLiquido, IR;
		
		if (salarioBruto <= 900) {
			IR = 0;
		} else if (salarioBruto <= 1500) {
			IR = 0.05f;
		} else if (salarioBruto <= 2500) {
			IR = 0.1f;
		} else {
			IR = 0.2f;
		}
		
		float descontoIR = IR * salarioBruto;
		float descontoSindicato = (SINDICATO * salarioBruto);
		float descontoFgts = (FGTS * salarioBruto);
		
		salarioLiquido = salarioBruto - descontoIR - descontoSindicato - descontoFgts;
		
		System.out.println("Salário Bruto: (" + valorHora + " * " + horas + "): R$" + salarioBruto);
		
		System.out.println("(-) IR (" + (IR * 100) + "%): R$" + descontoIR);
		
		System.out.println("(-) SINDICATO (" + (SINDICATO * 100) + "%): R$" + descontoSindicato);
		
		System.out.println("(-) FGTS (" + (FGTS * 100) + "%): R$" + descontoFgts);
		
		System.out.println("Salário Líquido: " + salarioLiquido);
		
		System.out.println("Descontos Totais: " + (descontoIR + descontoSindicato + descontoFgts));
		
		entrada.close();
	}

}
