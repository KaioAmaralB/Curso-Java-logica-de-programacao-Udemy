package aulaPraticaPorto;
import java.util.Scanner;

public class aulaPraticaPorto10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double a = 0.00;
		double b = 0.00;
		double y = 0.00;

		System.out.println("Digite o valor para a:");
		a = sc.nextDouble();
		System.out.println("Digite o valor para b:");
		b = sc.nextDouble();

		y = a;
		a = b;
		b = y;

		System.out.printf("O valor em ordem diferente de a é %.2f%n", a);
		System.out.printf("O valor em ordem diferente de b é %.2f%n", b);

		sc.close();
	}

}
