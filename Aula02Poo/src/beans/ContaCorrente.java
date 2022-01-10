package beans;

public class ContaCorrente {
	private int agencia;
	private int numero;
	private double saldo;
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void extrato() {
		System.out.println("Ag:" + getAgencia() + "C/C: " + this.numero + "Saldo: " + this.saldo);
	}
	
	public void deposito(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void saque(double valor) {
		if (valor > saldo) {
			System.out.println("Saldo insuficiente");
		}else {
			this.saldo = this.saldo - valor;
		}
	}
	

}
