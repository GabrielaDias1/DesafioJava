package desafioJava1;

import java.util.Scanner;

public class NumeroOperacao {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite dois numero para realizar a operação de multiplicação");

		System.out.println("Digite o primeiro numero: ");
		int valor1 = sc.nextInt();

		System.out.println("Digite o segundo numero: ");
		int valor2 = sc.nextInt();

		int resultado = valor1 * valor2;

		System.out.println("O resultado é: " + resultado);
		sc.close();

	}

}

//10) Escreva um programa que 
//leia dois números e uma operação (adição, subtração, multiplicação ou divisão) e realize a operação correspondente. 