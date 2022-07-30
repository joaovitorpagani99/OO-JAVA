
public class Main {

	public static void main(String[] args) {
		Cliente jv = new Cliente();
		jv.setNome("Joao Vitor");
		Cliente cl = new Cliente();
		cl.setNome("Celita");
		Conta cc = new ContaCorrente(jv);
		Conta cp = new ContaPoupanca(cl);
		
		cc.depositar(1000);
		
		cc.transferir(100, cp);
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
