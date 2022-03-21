package aulaPraticaPorto;
import java.util.Scanner;

public class aulaPraticaPorto1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1;
		int num2;

		System.out.println("Digite o número 1:");
		num1 = sc.nextInt();
		System.out.println("Digite o número 2:");
		num2 = sc.nextInt();

		int soma;
		soma = num1 + num2;

		System.out.println("Seu resultado é " + soma);

		sc.close();
	}

}
