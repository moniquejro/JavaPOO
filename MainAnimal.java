package POO;

public class MainAnimal {

	public static void main(String[] args) 
	{
		System.out.println("Este animal � um cachorro! ");
		
		Cachorro leao = new Cachorro ("Le�o", 2, "Au au au au au...", "Morder canela!");
		leao.dadosCachorro();
		
		System.out.println("\nEste animal � um cavalo!");
		
		Cavalo pedepano = new Cavalo ("P� de Pano", 4, "Pocot�, pocot�...", "Atrapalhar o PicaPau!");
		pedepano.dadosCavalo();
		
		System.out.println("\nEste animal � a Pregui�a!");
		
		Preguica judith = new Preguica ("Judith dos Milagres", 70, "zzZZZzzzZZZZzzz", "Respirar, comer e dormir!");
		judith.getSom();
		System.out.println("Som: "+judith.getSom());
	}
	
	
}
