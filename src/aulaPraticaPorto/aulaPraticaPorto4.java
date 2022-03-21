package aulaPraticaPorto;
import java.util.Scanner;

public class aulaPraticaPorto4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double sal_fixo = 0;
		double valor_venda = 0;
		double total_comi = 0;
		double sal_final = 0;

		System.out.println("Digite o valor do salario fixo: ");
		sal_fixo = sc.nextDouble();
		System.out.println("Digite o valor de vendas: ");
		valor_venda = sc.nextDouble();

		total_comi = valor_venda * 0.15;
		sal_final = sal_fixo + total_comi;

		System.out.printf(
				"O salário fixo é %.2f%n O total de vendas é %.2f%n O valor total de comissáo é %.2f%n.E salário final é %.2f%n",
				sal_fixo, valor_venda, total_comi, sal_final);

		sc.close();
	}

}
