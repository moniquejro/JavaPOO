package POO;

public class Empregado extends Pessoa 
{
	//private int calcularSalario;
	private int codigoSetor;
	private int salarioBase;
	private double imposto;
	
	public Empregado (String nome, String endereco, String celular, int codigoSetor, int salarioBase, double imposto)
	{
		super (nome, endereco, celular);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public int getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public double obterSalario()
	{
		double calcularSalario = salarioBase-((salarioBase*imposto)/100);
		return calcularSalario;
	}
	


}
