package desafioJava1;

import java.util.Scanner;

public class TrianguloValido {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite tr�s n�meros para verificar se formam um tri�ngulo v�lido.");

		System.out.println("Digite o primeiro n�mero: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int valor2 = sc.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		int valor3 = sc.nextInt();

		if (valor1 + valor2 > valor3 && valor1 + valor3 > valor2 && valor2 + valor3 > valor1) {
			System.out.println("O tri�ngulo � valido!");
		} else {
			System.out.println("O tri�ngulo � invalido!");
		}
		sc.close();
	}
}
