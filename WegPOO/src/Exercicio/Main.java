package Exercicio;

public class Main {

	public static void main (String [] args) {
		
		Weg weg = new Weg();
		
		MotorEletrico motor =new MotorEletrico("Motor Weg", "1234567", 40000, "enrolado", "boa");
		
		weg.adicionarProduto(motor);
		
		weg.imprimirProdutos();
	}
}
