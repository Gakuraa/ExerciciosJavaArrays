import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
		int numero []  = new int[15];
		
		for (int i = 0; i < numero.length; i++) {
			
			System.out.println("Digite o número que deseja adicionar no array: ");
			numero[i]= input.nextInt();
					
		}
		
		System.out.println("Os elementos presentes no array são:" + Arrays.toString(numero));
		input.close();	
	}
	
}
