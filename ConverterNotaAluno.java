package desafioJava1;

import java.util.Scanner;

public class ConverterNotaAluno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a nota do aluno");
		int nota = sc.nextInt();
		
		if (nota >= 9) {
            System.out.println("Nota A");
        } else if (nota >= 7) {
            System.out.println("Nota B");
        } else if (nota >= 5) {
            System.out.println("Nota C");
        } else if (nota >= 3) {
            System.out.println("Nota D");
        } else {
            System.out.println("Nota E");
        }
        sc.close();
    }
}

//
 // Escreva um programa que leia a nota de um aluno e converta-a para conceito: A
  //(nota >= 9), B (7 <= nota < 9), C (5 <= nota < 7), D (3 <= nota < 5) e F
 // (nota < 3).
 