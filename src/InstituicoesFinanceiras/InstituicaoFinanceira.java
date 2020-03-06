package InstituicoesFinanceiras;
import TiposConta.Conta;

public class InstituicaoFinanceira {
	private String nome;
	private int codigo;
	private Conta[] contas = new Conta[10];
	private int totalContas = 0;
	
	public InstituicaoFinanceira(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void abrirConta(Conta conta) {
		contas[totalContas] = conta;
		totalContas++;
	}
	
	public void tranferirEntreContas(Conta contaOrigem, Conta contaDestino, double valor, int diaMes) {
		contaOrigem.debitar(valor, diaMes);
		contaDestino.debitar(valor, diaMes);
	}
	
	public void receberTransferencia(InstituicaoFinanceira instituicaoOrigem, Conta contaOrigem, 
			int agencia, int conta, double valor) {
		
	}
}
