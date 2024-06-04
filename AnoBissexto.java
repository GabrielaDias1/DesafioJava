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
			System.out.println("Ano não bissexto.");
		}
		sc.close();
	}
}

// Escreva um programa que leia um ano e verifique se ele é bissexto. Um ano é bissexto se for divisível por 4,
// mas não por 100, exceto se for divisível por 400. 
