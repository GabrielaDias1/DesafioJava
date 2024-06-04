package desafioJava1;

import java.util.Scanner;

public class CalculoIMC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu peso: ");
		double peso = sc.nextDouble();

		System.out.println("Digite sua altura: ");
		double altura = sc.nextDouble();

		double IMC = (peso / (altura * altura));
System.out.println(IMC);
		if (IMC < 18.5) {
			System.out.println("Abaixo do peso: " + IMC);

		} else if (IMC < 24) {
			System.out.println("Peso normal" + IMC);

		} else if ( IMC < 29.9) {
			System.out.println("Sobrepeso: " + IMC);

		} else if ( IMC < 34.9) {
			System.out.println("Obesidade grau I: " + IMC);

		} else if (IMC <= 39.9) {
			System.out.println("Obesidade grau II: " + IMC);

		} else {
			System.out.println("Obesidade grau III: " + IMC);

		}
		sc.close();
	}
}

//15) Escreva um programa que leia o peso e a altura de uma pessoa, calcule o IMC e informe a categoria: 

//Abaixo do peso: IMC < 18.5 

//Peso normal: 18.5 <= IMC < 24.9 

//Sobrepeso: 25 <= IMC < 29.9 -

//Obesidade grau I: 30 <= IMC < 34.9 

//Obesidade grau II: 35 <= IMC < 39.9 

//Obesidade grau III: IMC >= 40