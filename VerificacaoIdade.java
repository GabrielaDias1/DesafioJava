package desafioJava1;

import java.util.Scanner;

public class VerificacaoIdade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		if (idade<12) {
			System.out.println("Crianca");
		}else if (idade>= 13 && idade<17) {
			System.out.println("Adolescente");
		}else if (idade>=18 && idade<59) {
			System.out.println("Adulto");
		} else {
			System.out.println("Idoso");
		}
		sc.close();
	}
}

// Escreva um programa que leia a idade de uma pessoa e informe se ela é uma criança (0-12 anos), adolescente (13-17 anos), 
// adulto (18-59 anos) ou idoso (60 anos ou mais). 