package desafioJava1;

import java.util.Scanner;

public class TrianguloValido {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite três números para verificar se formam um triângulo válido.");

		System.out.println("Digite o primeiro número: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		int valor2 = sc.nextInt();
		System.out.println("Digite o terceiro número: ");
		int valor3 = sc.nextInt();

		if (valor1 + valor2 > valor3 && valor1 + valor3 > valor2 && valor2 + valor3 > valor1) {
			System.out.println("O triângulo é valido!");
		} else {
			System.out.println("O triângulo é invalido!");
		}
		sc.close();
	}
}
