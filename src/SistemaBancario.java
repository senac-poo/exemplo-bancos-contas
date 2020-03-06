import InstituicoesFinanceiras.*;
import TiposConta.*; 

public class SistemaBancario {
	private static InstituicaoFinanceira[] IAs = new InstituicaoFinanceira[10]; 
	private int totalIAs = 0;
	
	public static void main(String[] args) {

		// cria IAs
		InstituicaoFinanceira bancoTaAi = new BancoVarejo("taAí", 1);
		InstituicaoFinanceira xaPay = new InstituicaoPagamento("XaPay", 2);
		IAs[0] = bancoTaAi;
		IAs[1] = xaPay;
		
		// contas
		ContaCorrente conta1 = new ContaCorrente(1, 1224, "111.111.111-00", "Jose da Silva");
		ContaCorrente conta2 = new ContaCorrente(1, 1225, "111.111.112-00", "Maria Oliveira");
		IAs[0].abrirConta(conta1);
		IAs[0].abrirConta(conta2);
		
		ContaPagamento conta3 = new ContaPagamento(1, 1224, "111.111.113-00", "Lucas Vieira");
		IAs[1].abrirConta(conta3);
		
		// depositos
		conta1.creditar(50.00, 2);
		conta2.creditar(150.00, 2);
		conta3.creditar(20.00, 2);
		
		// transferencias
		bancoTaAi.tranferirEntreContas(conta2, conta1, 22.35, 3);
		transferirEntreIAs(bancoTaAi, conta2, xaPay, conta3, 10.0, 3);
		
		
		// imprime na tela
		System.out.println("Saldo da conta1: " + conta1.getSaldo());
		System.out.println("Saldo da conta2: " + conta2.getSaldo());
		System.out.println("Saldo da conta3: " + conta3.getSaldo());
	}

	public static void transferirEntreIAs(InstituicaoFinanceira origem, Conta contaOrigem, 
			InstituicaoFinanceira destino, Conta contaDestino, double valor, int diaMes) {
		contaOrigem.debitar(valor, diaMes);
		contaDestino.creditar(valor, diaMes);
	}
}
