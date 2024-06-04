package desafioJava1;

import java.util.Scanner;

public class NumeroIntervalo {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		
		if (numero >= 10 && numero<= 20) {
			System.out.println("Numero dentro do intervalo");
		} else {
			System.out.println("Numero fora do intervalo");
		}
	sc.close();
}
}

//11) Escreva um programa que leia um número e verifique se ele está no intervalo de 10 a 20 (inclusive). 