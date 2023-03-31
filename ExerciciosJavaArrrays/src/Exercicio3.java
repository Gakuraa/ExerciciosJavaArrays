import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		// Escrever um programa para preencher uma matriz unidimensional que recebe as
		// temperatura ao longo do dia.
		// Exibir a média da temperatura do dia
		// Alterar o programa anterior para receber uma matriz com 30 linhas (1 mês)
		// Verificar qual foi a maior temperatura, a menor temperatura e a temperatura média


		float temperaturaSomaDia = 0, maiorTemperatura = Float.MIN_VALUE, menorTemperatura = Float.MAX_VALUE;
		float temperatura[][] = new float[30][24];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < temperatura.length; i++) {

			System.out.println("Digite a temperaturas do dia " + (i + 1) + ": ");
			temperaturaSomaDia = 0;

			for (int j = 0; j < temperatura[i].length; j++) {

				System.out.println("Temperatura da hora " + (j + 1) + ": ");
				temperatura[i][j] = input.nextFloat();

				temperaturaSomaDia += temperatura[i][j];

				if (temperatura[i][j] > maiorTemperatura) {
					maiorTemperatura = temperatura[i][j];
				}

				if (temperatura[i][j] < menorTemperatura) {
					menorTemperatura = temperatura[i][j];
				}
			}
			float mediaTemperaturaDia = temperaturaSomaDia / temperatura[i].length;
			System.out.println("A média das temperaturas do dia " + (i + 1) + ":" + mediaTemperaturaDia);

		}
		float somatemperaturaMes = 0;
		for (int i = 0; i < temperatura.length; i++) {
			for (int j = 0; j < temperatura[i].length; j++) {
				somatemperaturaMes += temperatura[i][j];
			}	
		}
		float mediaTemperaturaMes = somatemperaturaMes / (temperatura.length * temperatura[0].length);
		
		System.out.println(" A maior temperatura do mês: " + maiorTemperatura);
		System.out.println(" A menor temperatura do mês: " + menorTemperatura);
		System.out.println(" A temperatura média do mês: " + mediaTemperaturaMes);
		
		input.close();

	}
}
