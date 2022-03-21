package aulaPraticaPorto;
import java.util.Scanner;
import java.util.Locale;

public class aulaPraticaPorto7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);

		double brl = 0;
		double usd = 0;
		double eur = 0;
		double eur_conv = 6.20;
		double usd_conv = 5.26;
		char escolha;
		char n = 'n';

		System.out.println("Digite o valor em BRL: ");
		brl = sc.nextDouble();

		System.out.println("A cotação de EUR R$ 6,20 e USD R$ 5.26 está correta? (s/n)");
		escolha = sc.next().charAt(0);
		if (escolha == n) {
			System.out.println("Defina o valor de cotação EUR: ");
			eur_conv = sc.nextDouble();
			System.out.println("Defina o valor de cotação USD: ");
			usd_conv = sc.nextDouble();

		}

		usd = brl / usd_conv;
		eur = brl / eur_conv;

		System.out.printf("O saldo em BRL %.2f%n O saldo em EUR %.2f%n O saldo em USD %.2f%n", brl, eur, usd);

		sc.close();
	}

}
