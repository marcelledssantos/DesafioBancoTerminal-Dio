package contaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite sua conta:");
			int numero= in.nextInt();
		
		System.out.println("Digite sua agência:");
		 	String agencia= in.next();
		
		System.out.println("Digite seu nome: ");
		 	String nomeCliente = in.next();
		  
		 	double saldo = 237.48;
		 	
	   	System.out.println("Olá " + nomeCliente + " , obrigada por criar uma conta em nosso banco, sua agência é " 
		 	+ agencia + " e o número da sua conta é " + numero + " e o saldo disponível para saque é de R$ " + saldo);
		
	}

}
