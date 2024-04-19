package aula1704;

import java.util.Scanner;
public class atividade2 {

	public static void main(String[] args) {
		Scanner jc = new Scanner (System.in);

		double num, res;
		double soma = 0 ;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Valor: ");
			num = jc.nextDouble();
			soma += num;		
		}
		res = soma/5;
		System.out.println(res);
	}

}
