package desafioJava1;

import java.util.Scanner;

public class NumeroRaiz {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int numero = sc.nextInt();
		
		if (numero> 0) {
			System.out.println("Seu numero � positivo e o resultado do calculo � : "+( Math.sqrt(numero))) ;
		} else {
			System.out.println("Seu numero � negativo e o resultado do numero ao quadrado �: "+(numero * numero));
		}
		sc.close();
	}
}

//14) Escreva um programa que leia um n�mero 
//e informe se ele � positivo ou negativo. Se for positivo, calcule a raiz quadrada; se for negativo, informe o n�mero ao quadrado. 