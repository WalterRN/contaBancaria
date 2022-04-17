package Princpial;

import java.util.Locale;


import javax.swing.JOptionPane;

import sistema_conta.Dados;

public class Execucao_conta {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Dados dados;
		
		
		int conta = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com Numero da conta:",
				"Dados", JOptionPane.INFORMATION_MESSAGE));
		
		String nome = JOptionPane.showInputDialog(null, "Entre com Nome da conta:",
				"Dados", JOptionPane.INFORMATION_MESSAGE);
		
		char resposta = JOptionPane.showInputDialog(null, "Quer fazer um deposito inicial (y/n)? ",
				"Dados", JOptionPane.INFORMATION_MESSAGE).charAt(0);
		
		if (resposta == 'y') {
			double inicialDeposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com deposito inicial:",
					"Dados", JOptionPane.INFORMATION_MESSAGE));
			dados = new Dados(conta, nome, inicialDeposito);
		}
		else {
			dados = new Dados(conta, nome);
		}
		
		
		JOptionPane.showInternalMessageDialog(null,"Dados da conta:\n" + dados , 
				"Dados", JOptionPane.INFORMATION_MESSAGE);
		
		
		double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com valor de deposito da conta:",
				"Dados", JOptionPane.INFORMATION_MESSAGE));
		dados.DepositoConta(valorDeposito);
		JOptionPane.showInternalMessageDialog(null,"Conta Atualizada:\n" + dados , 
				"Dados", JOptionPane.INFORMATION_MESSAGE);
		
		
		
		double retirada = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com valor de retirada da conta:",
				"Dados", JOptionPane.INFORMATION_MESSAGE));
		dados.RetiradaConta(retirada);
		JOptionPane.showInternalMessageDialog(null,"Conta Atualizada:\n" + dados , 
				"Dados", JOptionPane.INFORMATION_MESSAGE);
	
		
		
	}

}
