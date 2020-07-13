package POO;

public class AviaoC 
{
	private String modeloAviao;
	private String companhiaAviao;
	private int numeroVoo;
	private String status;
	
	public AviaoC(String mod, int num, String comp, String statusVoo) 
	{
		modeloAviao = mod;
		companhiaAviao = comp;
		numeroVoo = num;
		status = statusVoo;
	}

	public String embarque()
	{
		String embarque1 = "O voo da "+companhiaAviao+ ", número "+numeroVoo+", do modelo "+modeloAviao;
		return embarque1;
	}
	
}
