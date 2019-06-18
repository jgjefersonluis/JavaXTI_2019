package exer8;

import org.junit.Test;

public class Exer8 {

	@Test
	public void exer8() {
		Calabreza calabreza = new Calabreza();
		Napolitana napolitana = new Napolitana();
		Forno forno = new Forno();
		forno.assar(calabreza);
		forno.assar(napolitana);
		

	}
}
