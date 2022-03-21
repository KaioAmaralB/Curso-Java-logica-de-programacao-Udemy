package aulaPraticaPorto;
import java.util.Scanner;

public class aulaPraticaPorto8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double valor_produto = 0.00;
		int quant_prest = 0;
		double valor_parc = 0.00;

		System.out.println("Digite o valor do produto:");
		valor_produto = sc.nextDouble();

		System.out.println("Digite o total de parcela:");
		quant_prest = sc.nextInt();

		valor_parc = valor_produto / quant_prest;

		System.out.printf(" O valor do produto é R$ %.2f%n", valor_produto);
		System.out.printf(" O total de parcelas é %dx%n ", quant_prest);
		System.out.printf("O valor das parcelas é R$ %.2f%n ", valor_parc);

		sc.close();
	}

}
