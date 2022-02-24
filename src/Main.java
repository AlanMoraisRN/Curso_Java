import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner num1 = new Scanner (System.in);
		System.out.print("Digite um valor: ");
		int x = num1.nextInt();
		
		System.out.println();
		
		Scanner num2 = new Scanner (System.in);
		System.out.print("Digite outro valor: ");
		int y = num2.nextInt();
		
		System.out.println();
		
		int media = (x + y)/2;
		System.out.print("O valor da média dos valores é: " + media);
	}

}
