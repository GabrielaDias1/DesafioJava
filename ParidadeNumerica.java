package desafioJava1;

import java.util.Scanner;

public class ParidadeNumerica {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um n�mero para saber se ele � par ou impar.");

		System.out.println("Digite um n�mero: ");
		int numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O n�mero " + numero + " � par.");
		} else {
			System.out.println("O n�mero " + numero + " � impar");
		}
		sc.close();
	}
}
