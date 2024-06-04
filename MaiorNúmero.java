package desafioJava1;

import java.util.Scanner;

public class MaiorNúmero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite dois números para descobrir qual deles é o maior.");

		System.out.println("Digite o primeiro número: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		int valor2 = sc.nextInt();

		if (valor1 > valor2) {
			System.out.println("O número " + valor1 + " é o maior.");
		} else {
			System.out.println("O número " + valor2 + " é o maior.");
		}
		sc.close();
	}
}
