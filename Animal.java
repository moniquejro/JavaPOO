package POO;

public class Animal {
		
	private String nome;
	private int idade;
	private String som;
	private String movimento;
	
	
	public Animal (String nome, int idade, String som, String movimento)
	{
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.movimento = movimento;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	
	public String getMovimento() {
		return movimento;
	}

	public void setMovimento(String movimento) {
		this.movimento = movimento;
	}

	public void dadosAnimal()
	{
		System.out.println("Nome: "+getNome());
		System.out.println("Idade: "+getIdade());
		System.out.println("Som: "+getSom());
		System.out.println("O movimento do animal �: "+getMovimento());
	}
}
