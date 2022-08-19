import java.util.Scanner;
//Tendo como dado de entrada a altura, peso e sexo, construa um algoritmo que calcule
//o peso ideal, utilizando as seguintes fórmulas:
//Para homens: (72.7*h) - 58
//Para mulheres: (62.1*h) - 44.7
//(h = altura)
//Ao final o algoritmo deve mostrar:
//- Altura, peso e sexo;
//- Peso Ideal;
//- Mensagem se está acima, abaixo ou no peso ideal;
public class Exe9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float pesoIdeal;
		
		System.out.print("Informe sua altura: ");
		float altura = entrada.nextFloat();

		System.out.print("Informe seu peso: ");
		float peso = entrada.nextFloat();
		
		entrada.nextLine();		
		System.out.print("Informe seu sexo (Masculino/Feminino): ");
		String sexo = entrada.nextLine();
		
		System.out.println(sexo);
		
		if (sexo.equals("Masculino")) {
			
			pesoIdeal = (72.7f * altura) - 58f;
			apresentaDados(pesoIdeal, altura, peso, sexo);
			
		} else if (sexo.equals("Feminino")) {
			
			pesoIdeal = (62.1f * altura) - 44.7f;
			apresentaDados(pesoIdeal, altura, peso, sexo);
			
		} else {
			System.out.println("Sexo inválido!");
		}
		
		entrada.close();
	}
	
	public static void apresentaDados(float pesoIdeal, float altura, float peso, String sexo) {
		if (peso > pesoIdeal) {
			System.out.println("Acima do peso!");
		} else if (peso < pesoIdeal) {
			System.out.println("Abaixo do peso!");
		} else {
			System.out.println("Peso Ideal!");
		}
		
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);
		System.out.println("Sexo: " + sexo);
	}
}
