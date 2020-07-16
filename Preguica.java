package POO;

public class Preguica extends Animal
{
	public Preguica (String nome, int idade, String som, String movimento)
	{
		super(nome, idade, som, movimento);
	}
	
	public void dadosPreguica()
	{
		System.out.println("Nome: "+getNome());
		System.out.println("Idade: "+getIdade());
		System.out.println("Som: "+getSom());
		System.out.println("O movimento do animal é: "+getMovimento());
	}
}
