package aula1704;
import java.util.Scanner;
public class atividade5 {

	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);

		System.out.print("Digite a quantidade de funcionários da empresa: ");
		int quantidadeFuncionarios = jc.nextInt();
		double totalSalarios = 0;


		for (int i = 1; i <= quantidadeFuncionarios; i++) {
			System.out.print("Digite o salário do funcionário " + i + ": ");
			double salario = jc.nextDouble();
			totalSalarios += salario;
		}

		double mediaSalarial = totalSalarios / quantidadeFuncionarios;

		System.out.println("A média salarial da empresa é: " + mediaSalarial);

		jc.close();
	}

}

