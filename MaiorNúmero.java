package desafioJava1;

import java.util.Scanner;

public class MaiorN�mero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite dois n�meros para descobrir qual deles � o maior.");

		System.out.println("Digite o primeiro n�mero: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int valor2 = sc.nextInt();

		if (valor1 > valor2) {
			System.out.println("O n�mero " + valor1 + " � o maior.");
		} else {
			System.out.println("O n�mero " + valor2 + " � o maior.");
		}
		sc.close();
	}
}
