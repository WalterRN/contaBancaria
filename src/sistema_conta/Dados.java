package sistema_conta;

public class Dados {
	private int conta;
	private String nome;
	private double deposito;
	
	public Dados(int conta, String nome, double inicialDeposito) {
		this.conta = conta;
		this.nome = nome;
		DepositoConta(inicialDeposito);
	}

	public Dados(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDeposito() {
		return deposito;
	}

	public void DepositoConta(double quantidade) {
		deposito += quantidade;
	}
	
	public void RetiradaConta(double quantidade) {
		deposito -= quantidade + 5.0;
	}

	
	public String toString() {
		return "Dados da conta: "				
				+ conta
				+ ", Nome: "
				+ nome
				+ ", Balanço bancario: R$"
				+ String.format("%.2f", deposito);
	}
	
	
}
