package exer3;

// Exercicio 1:
// Fa�a a classe animal gerar o erro de 
// compila��o public class Animal implements Rato, Gato {}

public class Animal implements Gato, Rato {
	// Exercicio 2:
	// Fa�a com especializa��o e rode o teste
	// @Override
	// public void comer(){
	// System.out.println("Eu como do meu jeito");
	// }

	// Exercicio 3:
	// Fa�a com escolhe de super pelo nome da classe e rode o teste.

	@Override
	public void comer() {
		Rato.super.comer();
	}

}
