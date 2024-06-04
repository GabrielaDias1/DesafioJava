package desafioJava1;

import java.util.Scanner;

public class ParidadeNumerica {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número para saber se ele é par ou impar.");

		System.out.println("Digite um número: ");
		int numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O número " + numero + " é par.");
		} else {
			System.out.println("O número " + numero + " é impar");
		}
		sc.close();
	}
}
