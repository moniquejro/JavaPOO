package POO;

public class Administrador extends Pessoa 
{
	private int custoMoradia;
	private int custoGas;
	
	public Administrador(String nome, String endereco, String celular, int custoMoradia, int custoGas)
	{
		super(nome, endereco, celular);
		this.custoMoradia = custoMoradia;
		this.custoGas = custoGas;
	}

	public int getCustoMoradia() {
		return custoMoradia;
	}

	public void setCustoMoradia(int custoMoradia) {
		this.custoMoradia = custoMoradia;
	}

	public int getCustoGas() {
		return custoGas;
	}

	public void setCustoGas(int custoGas) {
		this.custoGas = custoGas;
	}
	
	public double volta()
	{
		int ressarcimento = custoMoradia+custoGas;
		return ressarcimento;
	}
	
	
	
}
