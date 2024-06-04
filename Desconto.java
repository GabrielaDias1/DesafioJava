package desafioJava1;
import java.util.Scanner;
public class Desconto {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da compra");
		int compra = sc.nextInt();
		System.out.println("Digite a categoria do cliente: ");
		int  categoria = sc.nextInt();
		
		if (categoria == 1) {
			System.out.println("Valor total: "+ compra);
		} else if (categoria == 2) {
			System.out.println("Valor total com desconto: "+ (compra - 0.10));
		}else {
			System.out.println("Valor total com desconto: "+(compra - 0.20));
		}
		sc.close();
	}
}



//13) Escreva um programa que leia o valor de uma compra e a categoria do cliente 
//(1 para comum, 2 para associado e 3 para VIP). Aplique os seguintes descontos: 
//Comum: Sem desconto 
//Associado: 10% de desconto 
//VIP: 20% de desconto 
//Informe o valor final da compra. 