package aulaPraticaPorto;
import java.util.Scanner;

public class aulaPraticaPorto6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double temp_c;
		double temp_f;

		System.out.println("Digite o valor da tempetura em Celsius: ");
		temp_c = sc.nextDouble();

		temp_f = (9 * temp_c + 160) / 5;

		System.out.printf("O valor em Fahrenheit é %.2f", temp_f);

		sc.close();
	}

}
