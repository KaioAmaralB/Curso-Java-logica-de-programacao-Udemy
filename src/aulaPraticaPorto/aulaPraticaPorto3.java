package aulaPraticaPorto;
import java.util.Scanner;

public class aulaPraticaPorto3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double distancia = 0;
		int quan_litros_inicial = 0;
		int quan_litros_final = 0;
		int quant_comb_gasto = 0;
		double media_cons = 0;
		int escolha;
		double km_inicial = 0;
		double km_final = 0;

		System.out.println(
				"Se preferir digitar a diferência de Ôdometro digite 1, caso já tenha a distância percorrida digite 2");
		escolha = sc.nextInt();
		if (escolha == 1) {
			System.out.println("Digite a KM inicial: ");
			km_inicial = sc.nextDouble();
			System.out.println("Digite a KM final: ");
			km_final = sc.nextDouble();
		} else {

			System.out.println("Digite a distância percorrida pelo veículo em KM: ");
			distancia = sc.nextDouble();
		}

		System.out.println("Digite a quantidade de litros abastecido de combustivel: ");
		quan_litros_inicial = sc.nextInt();
		System.out.println("Digite a quantidade de litros final: ");
		quan_litros_final = sc.nextInt();

		quant_comb_gasto = quan_litros_inicial - quan_litros_final;
		distancia = km_final - km_inicial;
		media_cons = distancia / quant_comb_gasto;

		System.out.printf("A média de consumo é de %.2f%n KM/l", media_cons);

		sc.close();
	}

}
