import java.util.Scanner;

//12.As Organizações Tabajara resolveram dar um aumento de salário aos seus
//colaboradores e lhe contrataram para desenvolver o programa que calculará os
//reajustes.
//o Faça um programa que recebe o salário de um colaborador e calcule o reajuste
//segundo o seguinte critério, baseado no salário atual:
//o salários até R$ 280,00 (incluindo) : aumento de 20%
//o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
//o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
//o salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser
//realizado, informe na tela:
//o o salário antes do reajuste;
//o o percentual de aumento aplicado;
//o o valor do aumento;
//o o novo salário, após o aumento.

public class Exe12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com seu salário atual: ");		
		float salarioAntigo = entrada.nextFloat();
		float novoSalario;
		
		if (salarioAntigo < 280) {
			novoSalario = salarioAntigo * 1.2f;
		} else if (salarioAntigo < 700) {
			novoSalario = salarioAntigo * 1.15f;
		} else if (salarioAntigo < 1500) {
			novoSalario = salarioAntigo * 1.1f;
		} else {
			novoSalario = salarioAntigo * 1.05f;
		}
		
		System.out.println("Salario antigo: " + salarioAntigo);
		System.out.println("Reajuste percentual: " + (novoSalario * 100)/salarioAntigo);
		System.out.println("Reajuste: " + (novoSalario - salarioAntigo));
		System.out.println("Novo salário: " + novoSalario);
		
		entrada.close();
	}

}
