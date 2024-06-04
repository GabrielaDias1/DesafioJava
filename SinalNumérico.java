package desafioJava1;

import java.util.Scanner;

public class SinalNumérico {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número para saber seu sinal númerico");
		int valor = sc.nextInt();

		if (valor > 0) {
			System.out.println("O número " + valor + " é positivo");
		} else if (valor < 0) {
			System.out.println("O número " + valor + " é negativo");
		} else {
			System.out.println("O número é " + valor + " zero");
		}
		sc.close();
	}
}
