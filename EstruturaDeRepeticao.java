package aula1704;

import java.util.Scanner;
public class EstruturaDeRepeticao {

	public static void main(String[] args) throws InterruptedException {
		Scanner jc = new Scanner (System.in);
		
		int num, res;
		
		System.out.print("Informe o número para ver a tabuada: ");
		num = jc.nextInt();
		System.out.println();
		
		for (int i = 1; i <= 10; i++) {
			res = num * i;
			System.out.println(num + " X " + i + " = " + res + "\n");
			Thread.sleep(750);
		}
	}

}
