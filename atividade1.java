package aula1704;
import java.util.Scanner;
public class atividade1 {

	public static void main(String[] args) throws InterruptedException {
		Scanner jc = new Scanner (System.in);
		
		System.out.print("Informe o número inicial do intervalo: ");
		int ini = jc.nextInt();
		System.out.print("Informe o número final do intervalo: ");
		int fin = jc.nextInt();
		
		for (int i = ini; i <= fin; i++) {
			if (i % 2 != 0) {
				System.out.println(i+" é impar");
			Thread.sleep(500);
			}
			
		}
		
		
	}

}
