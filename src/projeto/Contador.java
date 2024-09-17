package projeto;

import java.util.*;

public class Contador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro");
		int num1 = ler.nextInt();
		
		System.out.println("Digite o segundo parâmetro");
		int num2 = ler.nextInt();
		
		try {
			
			contar(num1, num2);
			
		} catch(ParametrosInvalidosException e ) {
			System.out.println("\nErro: " + e.getMessage());
		}
		
			
	}
		static void contar(int num1, int num2 ) throws ParametrosInvalidosException {
			if(num1 > num2) {
				throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
			}
			
			int contagem = num2 - num1;
			
			int contador = 1;
			for(int i = num1; i < num2; i++) {
				System.out.println("\nImprimindo o " + contador++ + "º número: " + i);
			}
			System.out.println("\nO laço teve " + contagem + " iterações");
	}

}
