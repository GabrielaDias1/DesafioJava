package desafioJava1;

import java.util.Scanner;

public class CalculoMedia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite as tr�s notas do aluno para calcular sua m�dia");

		System.out.println("Digite a primeira nota: ");
		int nota1 = sc.nextInt();
		System.out.println("Digite a segunda nota: ");
		int nota2 = sc.nextInt();
		System.out.println("Digite a terceira nota: ");
		int nota3 = sc.nextInt();
		int media;
		media = (nota1 + nota2 + nota3) / 3;

		if (media >= 7) {
			System.out.println("Aluno aprovado.");
		} else if (media >= 5 && media < 7) {
			System.out.println("Aluno em recupera��o.");
		} else {
			System.out.println("Aluno reprovado.");
		}
		sc.close();
	}
}
