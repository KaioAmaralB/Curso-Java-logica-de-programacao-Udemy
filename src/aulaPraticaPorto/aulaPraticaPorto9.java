package aulaPraticaPorto;
import java.util.Scanner;

public class aulaPraticaPorto9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double valor_produto = 0.00;
		int quant_prest = 0;
		double valor_parc = 0.00;
		int taxa_acima_de = 5;
		double valor_total = 0.00;
		int dife_parc = 0;
		double juros = 0.00;
		double valor_parc_juros = 0.00;

		System.out.println("Digite o valor do produto:");
		valor_produto = sc.nextDouble();

		System.out.println("Digite o total de parcela:");
		quant_prest = sc.nextInt();

		if (quant_prest > 5) {
			dife_parc = quant_prest - taxa_acima_de;
			juros = valor_produto * Math.pow((1 + 0.01), dife_parc) - valor_produto;
			valor_total = valor_produto + juros;
			valor_parc_juros = valor_total / quant_prest;

			System.out.printf("O valor do produto é R$ %.2f%n", valor_produto);
			System.out.printf("A quantidade de parcela é %dx%n", quant_prest);
			System.out.printf("O valor de juros é R$ %.2f%n", juros);
			System.out.printf("O valor total é R$ %.2f%n", valor_total);
			System.out.printf("O valor das parcelas é R$ %.2f%n", valor_parc_juros);

		} else {

			valor_parc = valor_produto / quant_prest;

			System.out.printf(" O valor do produto é R$ %.2f%n", valor_produto);
			System.out.printf(" O total de parcelas é %dx%n ", quant_prest);
			System.out.printf("O valor das parcelas é R$ %.2f%n ", valor_parc);

		}

		sc.close();
	}

}