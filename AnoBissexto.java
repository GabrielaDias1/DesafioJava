package desafioJava1;

import java.util.Scanner;

public class AnoBissexto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um ano: ");
		int valor = sc.nextInt();
		
		if((valor % 4 == 0 && valor % 100 != 0) || (valor % 400 == 0)) {
			System.out.println("Ano bissexto!");
		} else {
			System.out.println("Ano n�o bissexto.");
		}
		sc.close();
	}
}

// Escreva um programa que leia um ano e verifique se ele � bissexto. Um ano � bissexto se for divis�vel por 4,
// mas n�o por 100, exceto se for divis�vel por 400. 
