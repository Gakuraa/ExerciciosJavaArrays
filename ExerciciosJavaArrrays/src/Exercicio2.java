import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		//Escrever um programa para preencher uma matriz unidimensional que recebe as temperatura ao longo do dia.
		//Exibir a média da temperatura do dia
		float temperaturaSoma = 0;
		float temperatura [] = new float[24];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < temperatura.length; i++) {
			
			System.out.println("Digite a temperatura atual: ");
			temperatura[i] = input.nextFloat();
			
			temperaturaSoma += temperatura[i];
			
		}
		
		float temperaturaMedia = temperaturaSoma/temperatura.length;
		
		System.out.println("A temperatura média do é de: " + temperaturaMedia);
		
		input.close();
	}
}
