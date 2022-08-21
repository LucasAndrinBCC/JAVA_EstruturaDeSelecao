import java.util.Scanner;
//Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas
//são:
//"Telefonou para a vítima?"
//"Esteve no local do crime?"
//"Mora perto da vítima?"
//"Devia para a vítima?"
//"Já trabalhou com a vítima?"

//O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
//Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
//entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como
//"Inocente".
public class Exe28 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Telefonou para a vítima?");
		boolean telefone = entrada.nextBoolean();
		
		System.out.print("Esteve no local do crime?");
		boolean local = entrada.nextBoolean();
		
		System.out.print("Mora perto da vítima?");
		boolean mora = entrada.nextBoolean();		
		
		System.out.print("Devia para a vítima?");
		boolean dever = entrada.nextBoolean();
		
		System.out.print("Já trabalhou com a vítima?");
		boolean trabalhar = entrada.nextBoolean();
		
		int ContadorCriminal = 0;
		
		if (telefone) {
			ContadorCriminal++;
		}
		
		if (local) {
			ContadorCriminal++;
		}
		
		if (mora) {
			ContadorCriminal++;
		}
		
		if (dever) {
			ContadorCriminal++;
		}
		
		if (trabalhar) {
			ContadorCriminal++;
		}
		
		if (ContadorCriminal == 0) {
			System.out.println("Inocente!");
		} else if (ContadorCriminal < 3) {
			System.out.println("Suspeita!");
		} else if (ContadorCriminal < 5) {
			System.out.println("Cúmplice!");
		} else {
			System.out.println("Assassino!");
		}
		
		entrada.close();
	}

}
