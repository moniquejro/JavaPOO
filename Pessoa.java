package POO;

public class Pessoa 
{
	private String nome;
	private String endereco;
	private String celular;
	
	public Pessoa (String nome, String endereco, String celular)
	{
		this.nome = nome;
		this.endereco = endereco;
		this.celular = celular;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getEndereco() 
	{
		return endereco;
	}

	public void setEndereco(String endereco) 
	{
		this.endereco = endereco;
	}

	public String getCelular() 
	{
		return celular;
	}

	public void setCelular(String celular) 
	{
		this.celular = celular;
	}
	
}
