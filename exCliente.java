package POO;

public class exCliente {

	public static void main(String[] args) 
	{
		Cliente02 cliente1 = new Cliente02("Monique", 7845879, "Rua 25 de Março", true);
		Cliente02 cliente2 = new Cliente02("Jéssica", 5214879, "João de Melo", false);
		
		System.out.println(cliente1.mostrarInformacao());
		System.out.println(cliente1.verificarCredito());
		
		System.out.println(cliente2.mostrarInformacao());
		System.out.println(cliente2.verificarCredito());
	}

}
