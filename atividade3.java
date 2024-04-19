package aula1704;

import java.util.Scanner;
public class atividade3 {

	public static void main(String[] args) throws InterruptedException {
		Scanner jc = new Scanner (System.in);
	
	int somapar = 0, somaimpar = 0, num = 0;
	
	for (int i = 1; i <= 10; i++) {
		System.out.println("Valor: ");
		num = jc.nextInt();
		
		if (num % 2 == 0) {
		somapar++;	
		}
		else {
		somaimpar++;
		}
		
	}
	System.out.println("A quantidade de números pares é "+somapar);
	System.out.println("A quantidade de números impares é "+somaimpar);
	
}
}
