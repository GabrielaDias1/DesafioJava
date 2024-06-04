package desafioJava1;

import java.util.Scanner;

public class CodigoProduto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do produto");
		int codigo = sc.nextInt();
		
		if (codigo >= 1 && codigo <= 10){
			System.out.println("Alimento não-perecível");
			
		} else if (codigo<=20) {
			System.out.println("Alimento perecível");
			
		} else if (codigo<=30) {
			System.out.println("Vestuário");
			
		}else if (codigo<=40) {
			System.out.println("Eletrônicos");
			
		}else {
			System.out.println("Código inválido");
		}
		sc.close();
	}
}









 // 9)Escreva um programa que leia o código de um produto e informe a sua
 // categoria: 1 a 10: Alimento não-perecível 11 a 20: Alimento perecível 21 a
 // 30: Vestuário 31 a 40: Eletrônicos Outros: Código inválido
 
