package POO;

public class Fornecedor extends Pessoa
{
	private double valorCredito;
	private double valorDivida;
	
	
	public Fornecedor (String nome, String endereco, String celular, double valorCredito, double valorDivida)
	{
		super (nome, endereco, celular);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		
	}
		
		
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public double obterDivida() 
	{
		double divida = valorCredito - valorDivida;
		return divida;
    }
		
	
}
