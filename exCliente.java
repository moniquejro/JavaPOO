package POO;

public class exCliente {

	public static void main(String[] args) 
	{
		Cliente02 cliente1 = new Cliente02("Monique", 7845879, "Rua 25 de Mar�o", true);
		Cliente02 cliente2 = new Cliente02("J�ssica", 5214879, "Jo�o de Melo", false);
		
		System.out.println(cliente1.mostrarInformacao());
		System.out.println(cliente1.verificarCredito());
		
		System.out.println(cliente2.mostrarInformacao());
		System.out.println(cliente2.verificarCredito());
	}

}
