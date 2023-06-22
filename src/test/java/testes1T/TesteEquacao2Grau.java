package testes1T;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import calculos.EquacaoSegundoGrau;

public class TesteEquacao2Grau {
	
	EquacaoSegundoGrau E;
	
	@Before
	public void setUp() throws Exception {
		E = new EquacaoSegundoGrau();
	}

	@Test
	public void testCalcularEquacaoSegundoGrau() {
		assertTrue("Caso 1:", "Coeficientes informados incorretamente." == E.calcularEquacaoSegundoGrau(0, 0, 8));
		assertTrue("Caso 2:", "Igualdade confirmada: 0 = 0" == E.calcularEquacaoSegundoGrau(0, 0, 0));
		assertTrue("Caso 3:", "Esta é uma equação de primeiro grau" == E.calcularEquacaoSegundoGrau(0, 2, -8));
		assertTrue("Caso 4:", "Esta equação não possui raízes reais" == E.calcularEquacaoSegundoGrau(10, -4, 12));
		assertTrue("Caso 5:", "Esta equação possui duas raízes reais iguais" == E.calcularEquacaoSegundoGrau(4, -4, 1));
		assertTrue("Caso 6:", "Esta equação possui duas raízes reais diferentes" == E.calcularEquacaoSegundoGrau(1, 6, 7));
	}

}
