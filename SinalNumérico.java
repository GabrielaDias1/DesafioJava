package desafioJava1;

import java.util.Scanner;

public class SinalNum�rico {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o n�mero para saber seu sinal n�merico");
		int valor = sc.nextInt();

		if (valor > 0) {
			System.out.println("O n�mero " + valor + " � positivo");
		} else if (valor < 0) {
			System.out.println("O n�mero " + valor + " � negativo");
		} else {
			System.out.println("O n�mero � " + valor + " zero");
		}
		sc.close();
	}
}
