package POO;

public class Cavalo extends Animal
{
	public Cavalo (String nome, int idade, String som, String movimento)
	{
		super(nome, idade, som, movimento);
	}
	
	public void dadosCavalo()
	{
		System.out.println("Nome: "+getNome());
		System.out.println("Idade: "+getIdade());
		System.out.println("Som: "+getSom());
		System.out.println("O movimento do animal é: "+getMovimento());
	}
}
