package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da Agencia:");
		int numeroAgencia = sc.nextInt();
		System.out.println("Por favor, informe a agencia:");
		String agencia = sc.next();
		System.out.println("Informe o seu nome");
		sc.nextLine();
		String nomeClient = sc.nextLine();
		System.out.println("Informe o Saldo inicial");
		double saldo = sc.nextDouble();
		sc.close();
		
		ContaTerminal conta = new ContaTerminal();
		conta.setNumero(numeroAgencia);
		conta.setAgencia(agencia);
		conta.setNomeCliente(nomeClient);
		conta.setSaldo(saldo);
		
		System.out.println(conta);
	}

}
