package POO;

public class Cliente02 
{
	private String nomeCliente;
	private int cpfCliente;
	private String endCliente;
	private boolean creditoC;
	
	public Cliente02 (String nome, int cpf, String end, boolean credito)
	{
		nomeCliente = nome;
		cpfCliente = cpf;
		endCliente = end;
		creditoC = credito;
	}
	
	public String mostrarInformacao()
	{
		String informacao = "\nCliente: "+nomeCliente+"\nCPF: "+cpfCliente+"\nEndereço: "+endCliente;
		return informacao;
	}
	
	public String verificarCredito()
	{
		if (creditoC)
			return "Pode liberar a compra";
		else
			return "Não pode liberar a compra";
	}
}
