package aulaPraticaPorto;
import java.util.Scanner;

public class aulaPraticaPorto2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1;
		int num2;
		int soma;
		int subt;
		int mult;
		double divi;

		System.out.println("Digite o n�mero 1:");
		num1 = sc.nextInt();
		System.out.println("Digite o n�mero 2:");
		num2 = sc.nextInt();

		soma = num1 + num2;
		subt = num1 - num2;
		mult = num1 * num2;
		divi = (double) num1 / num2;

		System.out.println("Seu resultado � " + soma);
		System.out.println("Seu resultado � " + subt);
		System.out.println("Seu resultado � " + mult);
		System.out.printf("Seu resultado � %.2f%n", divi);

		sc.close();
	}

}