package TiposConta;

public class Conta {
	private int agencia;
	private int conta;
	private String cpf;
	private String nome;
	
	private double saldo = 0;
	
	// dica para construtor
	// inicializar com tudo o que o objeto precisa
	public Conta(int agencia, int conta, String cpf, String nome) {
		this.agencia = agencia;
		this.conta = conta;
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public void creditar(double valor, int diaMes) {
		saldo += valor;
	}
	
	public void debitar(double valor, int diaMes) {
		this.saldo -= valor;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
