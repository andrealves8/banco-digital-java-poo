package com.dio; 

public class Main {

	public static void main(String[] args) {
		Cliente cli = new Cliente();
		cli.setNome("André");
		
		Conta cc = new ContaCorrente(cli);
		cc.depositar(100);
		
		Conta cp = new ContaPoupanca(cli);
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
