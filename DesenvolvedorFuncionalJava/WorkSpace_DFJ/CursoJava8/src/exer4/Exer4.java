package exer4;

import java.math.BigDecimal;

import org.junit.Test;

public class Exer4 {

	/* Static metodos na interface */

	@Test
	public void exer4() {
		// Referencia statica somente pela interface..
		System.out.println(Venda.vazio(null));
		System.out.println(Venda.vazio("fer"));
		System.out.println(Venda.vazio(10));

		// Sendo usado pela classe...
		Fornecedor f = new Fornecedor();
		f.vender(null);
		f.vender(BigDecimal.TEN);

		// Aten��o: A classe n�o tem esse metodo por que n�o � herdado.
		// Fornecedor.vazio(null)

	}

}
