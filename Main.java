
public class Main {

	public static void main(String[] args) {
		Cliente sandro = new Cliente();
		sandro.setNome("Alexsandro");
		
		Conta cc = new ContaCorrente(sandro);
		Conta poupanca = new ContaPoupanca(sandro);

		cc.depositar(200);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
