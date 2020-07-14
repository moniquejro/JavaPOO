package POO;

public class Operario extends Pessoa 
{
	private int valorProducao;
	private int comissao;

	public Operario (String nome, String endereco, String celular, int valorProducao, int comissao)
	{
		super(nome, endereco, celular);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public int getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(int valorProducao) {
		this.valorProducao = valorProducao;
	}

	public int getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}
	
	public double salFinal()
	{
		double sFinal = valorProducao + (valorProducao*comissao/100);
		return sFinal;
	}
	
}