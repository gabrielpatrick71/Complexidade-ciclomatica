package calculos;

public class EquacaoSegundoGrau {
	public String calcularEquacaoSegundoGrau(double a, double b, double c) {
		
		String mensagem;
		
		if (a == 0 && b == 0 && c != 0) {
			System.out.println("Coeficientes informados incorretamente.");
			mensagem = "Coeficientes informados incorretamente.";
		} else if (c == 0) {
			System.out.println("Igualdade confirmada: 0 = 0");
			mensagem = "Igualdade confirmada: 0 = 0";
		} else if (a == 0 && b != 0) {
			System.out.println("Esta é uma equação de primeiro grau");
			mensagem = "Esta é uma equação de primeiro grau";
			double raiz = -c / b;
			System.out.println("Raiz real da equação: " + raiz);
		} else {
			double delta = b * b - 4 * a * c;

			if (delta < 0) {
				System.out.println("Esta equação não possui raízes reais");
				mensagem = "Esta equação não possui raízes reais";
			} else if (delta == 0) {
				System.out.println("Esta equação possui duas raízes reais iguais");
				mensagem = "Esta equação possui duas raízes reais iguais";
				double raiz = -b / (2 * a);
				System.out.println("Valor das raízes: " + raiz);
			} else {
				System.out.println("Esta equação possui duas raízes reais diferentes");
				mensagem = "Esta equação possui duas raízes reais diferentes";
				double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
				double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Valores das raízes: " + raiz1 + " e " + raiz2);
			}
		}
		return mensagem;
	}
}
