package aulaPraticaPorto;
import java.util.Scanner;

public class aulaPraticaPorto5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1_1;
		int n2_1;
		int n3_1;
		int n1_2;
		int n2_2;
		int n3_2;
		double media_1;
		double media_2;
		double media_f;

		System.out.println("Digite a nota 1, nota 2 e nota 3 do primeiro semestre: ");
		n1_1 = sc.nextInt();
		n2_1 = sc.nextInt();
		n3_1 = sc.nextInt();

		System.out.println("Digite a nota 1, nota 2 e nota 3 do segundo semestre: ");
		n1_2 = sc.nextInt();
		n2_2 = sc.nextInt();
		n3_2 = sc.nextInt();

		media_1 = (double) (n1_1 + n2_1 + n3_1) / 3;
		media_2 = (double) (n1_2 + n2_2 + n3_2) / 3;
		media_f = (double) media_1 + media_2;

		System.out.printf(
				"O resumo do primeiro semestre é %.2f%n O resumo do segundo semestre é %.2f%n A media final é %.2f%n",
				media_1, media_2, media_f);

		sc.close();
	}

}
