package exer3;

// Exercicio 1:
// Faça a classe animal gerar o erro de 
// compilação public class Animal implements Rato, Gato {}

public class Animal implements Gato, Rato {
	// Exercicio 2:
	// Faça com especialização e rode o teste
	// @Override
	// public void comer(){
	// System.out.println("Eu como do meu jeito");
	// }

	// Exercicio 3:
	// Faça com escolhe de super pelo nome da classe e rode o teste.

	@Override
	public void comer() {
		Rato.super.comer();
	}

}
