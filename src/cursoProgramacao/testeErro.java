package cursoProgramacao;
import java.util.Scanner;

public class testeErro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double valor = 0;
		int acima_de = 15;
		char escolha = 0;
		char controle = 's';

		System.out.println("Digite um valor:");
		valor = sc.nextDouble();
		if (valor > 15) {
			System.out.printf("O valor � %.2f%n", valor);
		}

		do {
			System.out.println("Deseja digitar mais um n�mero? (s/n)");
			escolha = sc.next().charAt(0);
			if (escolha == controle) {
				System.out.println("Deseja alterar o n�mero m�nimo para exibi��o? (s/n)");
				escolha = sc.next().charAt(0);
				if (escolha == controle) {
					System.out.println("Digite um valor m�nimo para exibi��o:");
					acima_de = sc.nextInt();
					System.out.println("Digite um valor:");
					valor = sc.nextDouble();
					if (valor > acima_de) {
						System.out.printf("O valor digitado � %.2f%n", valor);
					}
				} else {
					System.out.println("Digite um valor:");
					valor = sc.nextDouble();
					if (valor > acima_de) {
						if (valor > acima_de) {
							System.out.printf("O valor digitado � %.2f%n", valor);
						}
					}
				}
			}
		} while (valor > 0);
		sc.close();
	}
}
