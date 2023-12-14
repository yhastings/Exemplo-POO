package conta;

import conta.Conta;

public class Menu {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(123456, 123, 1, "Maria Joaquina", 2500.0f);
		
		c1.visualizar();
		
		Conta c2 = new Conta(123456, 123, 1, "João Marcos", 10000.0f);
		
		c2.visualizar();
		
		c2.setTitular("João");

		
	
		c2.visualizar();
		
		
	}

}
