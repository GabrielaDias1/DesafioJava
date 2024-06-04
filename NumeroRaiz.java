package desafioJava1;

import java.util.Scanner;

public class NumeroRaiz {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		
		if (numero> 0) {
			System.out.println("Seu numero é positivo e o resultado do calculo é : "+( Math.sqrt(numero))) ;
		} else {
			System.out.println("Seu numero é negativo e o resultado do numero ao quadrado é: "+(numero * numero));
		}
		sc.close();
	}
}

//14) Escreva um programa que leia um número 
//e informe se ele é positivo ou negativo. Se for positivo, calcule a raiz quadrada; se for negativo, informe o número ao quadrado. 