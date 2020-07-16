package POO;

public class MainAnimal {

	public static void main(String[] args) 
	{
		System.out.println("Este animal é um cachorro! ");
		
		Cachorro leao = new Cachorro ("Leão", 2, "Au au au au au...", "Morder canela!");
		leao.dadosCachorro();
		
		System.out.println("\nEste animal é um cavalo!");
		
		Cavalo pedepano = new Cavalo ("Pé de Pano", 4, "Pocotó, pocotó...", "Atrapalhar o PicaPau!");
		pedepano.dadosCavalo();
		
		System.out.println("\nEste animal é a Preguiça!");
		
		Preguica judith = new Preguica ("Judith dos Milagres", 70, "zzZZZzzzZZZZzzz", "Respirar, comer e dormir!");
		judith.getSom();
		System.out.println("Som: "+judith.getSom());
	}
	
	
}
