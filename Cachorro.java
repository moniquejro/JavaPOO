package POO;

public class Cachorro extends Animal
{
	public Cachorro (String nome, int idade, String som, String movimento)
	{
		super(nome, idade, som, movimento);
	}
	
	public void dadosCachorro()
	{
		System.out.println("Nome: "+getNome());
		System.out.println("Idade: "+getIdade());
		System.out.println("Som: "+getSom());
		System.out.println("O movimento do animal é: "+getMovimento());
	}
	
}
