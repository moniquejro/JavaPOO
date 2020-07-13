package POO;

public class patinete11 
{

	public static void main(String[] args) 
	{
		patinete patinete = new patinete("Prata", "Scooter", true, 0 , 10);
		System.out.println(patinete.mostrarDados());
        System.out.println("\n");
        System.out.println(patinete.andar());
        System.out.println("\n");
        patinete patinete1 = new patinete ("Preto", "Estrela", false, 0, 0);
        System.out.println(patinete1.mostrarDados());

	}
		

}


