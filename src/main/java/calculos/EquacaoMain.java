package calculos;

import java.util.Scanner;

public class EquacaoMain {

	public static void main(String[] args) {

		EquacaoSegundoGrau E = new EquacaoSegundoGrau();

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Digite o coeficiente 'a': ");
			double a = scanner.nextDouble();

			System.out.print("Digite o coeficiente 'b': ");
			double b = scanner.nextDouble();

			System.out.print("Digite o coeficiente 'c': ");
			double c = scanner.nextDouble();

			E.calcularEquacaoSegundoGrau(a, b, c);

			System.out.print("Deseja calcular outra equação? (s/n): ");
			String opcao = scanner.next();
			if (!opcao.equalsIgnoreCase("s")) {
				break;
			}
		}

		scanner.close();

	}

}
