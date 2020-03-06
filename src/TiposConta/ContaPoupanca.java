package TiposConta;

public class ContaPoupanca extends Conta {
	int[] diasAniversario;
	
	public ContaPoupanca(int agencia, int conta, String cpf, String nome) {
		super(agencia, conta, cpf, nome);
		diasAniversario = new int[28];
		for(int i=0; i<=28; i++) {
			diasAniversario[i] = 0;
		}
	}

	@Override
	public void creditar(double valor, int diaMes) {
		super.creditar(valor, diaMes);
		if(diaMes > 28) {
			diasAniversario[diaMes] += valor;
		}
	}
	
	@Override
	public void debitar(double valor, int diaMes) {
		super.debitar(valor, diaMes);
		
		if(diasAniversario[diaMes] == 0) {
			for(int i = diaMes; i == 0; i--) {
				if(diasAniversario[i] > 0) {
					diasAniversario[i] -= valor;
				}
			}
		} else {
			diasAniversario[diaMes] -= valor;
		}
	}	
}
