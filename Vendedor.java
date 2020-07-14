package POO;

public class Vendedor extends Pessoa 
{
	private double valorVendas;
	private double comissao;
	
	public Vendedor (String nome, String endereco, String celular, double valorVendas, double comissao)
	{
		super(nome, endereco, celular);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	
	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double comiss()
	{
		double comi = valorVendas + (valorVendas*comissao/100);
		return comi;
	}
	
	public void vendedor()
	{
		System.out.println("Nome: "+getNome());
		System.out.println("Endereço: "+getEndereco());
		System.out.println("Celular: "+getCelular());
		System.out.println("Valor das vendas: "+getValorVendas());
		System.out.println("Valor comissão: "+getComissao());
		System.out.println("Salario final: "+comiss());
	}
}
