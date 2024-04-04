package Banco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Nome do cliente: ");
		String NomeCliente = sc.nextLine();
		
		System.out.println("Numero da agencia: ");
		String Agencia = sc.next();
		
		System.out.println("numero da conta: ");
		int Numero = sc.nextInt();
		
		System.out.println("Saldo da conta: ");
		Double Saldo = sc.nextDouble();	//SÓ COM ".", MINHA MÁQUINA NÃO ACEITA ","!!!
		
		System.out.println("﻿\r\n"
				+ "\r\n"
				+ "Olá "+NomeCliente+", obrigado por criar "
				+ "uma conta em nosso banco, sua agência é "
				+ ""+Agencia+", conta "+Numero+" e seu saldo "+Saldo+""
				+ " já está disponível para saque.");
		//  |^||^||^||^|PARA NAO FICAR COM BARRA HORIZONTAL|^||^||^||^|
		
		//System.out.println("Olá "+NomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+", conta "+Conta+" e seu saldo "+Saldo+" já está disponível para saque.");
		
	}

}