package desafioJava1;

import java.util.Scanner;

public class NumeroOperacao {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite dois numero para realizar a opera��o de multiplica��o");

		System.out.println("Digite o primeiro numero: ");
		int valor1 = sc.nextInt();

		System.out.println("Digite o segundo numero: ");
		int valor2 = sc.nextInt();

		int resultado = valor1 * valor2;

		System.out.println("O resultado �: " + resultado);
		sc.close();

	}

}

//10) Escreva um programa que 
//leia dois n�meros e uma opera��o (adi��o, subtra��o, multiplica��o ou divis�o) e realize a opera��o correspondente. 