package desafioJava1;

import java.util.Scanner;

public class NumeroIntervaloDobro {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
		
		if (numero>100) {
			System.out.println("Numero maior que cem");
		} else {
			System.out.println("Dobro do numero: "+numero*2);
		}
		sc.close();
	}
}

//Escreva um programa que leia um número e verifique se ele é maior que 100. Se não for, informe o dobro desse número.