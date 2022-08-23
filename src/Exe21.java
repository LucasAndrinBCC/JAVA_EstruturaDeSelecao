import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma
//é uma data válida.
public class Exe21 {

	public static void main(String[] args) throws ParseException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com uma data no formato dd/mm/aaaa: ");		
		String dataInformada = entrada.nextLine();
		
		if (dataInformada.length() != "dd/mm/aaaa".length()) {
			
			System.out.println("Data informada inválida! Tamanho da data errático!");
			
		} else if (dataInformada.charAt(2) != '/' || dataInformada.charAt(5) != '/') {
			
			System.out.println("Data informada inválida! Não foram encontradas barras nas posições corretas");
			
		} else {
			SimpleDateFormat diaMesAno = new SimpleDateFormat("dd/MM/yyyy");
			
			Date dataFormatada = diaMesAno.parse(dataInformada);
			
			System.out.println("Data formatada final: " + diaMesAno.format(dataFormatada));
		}
		
		
		entrada.close();
	}

}
