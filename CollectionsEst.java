package POO;

import java.util.*;

public class CollectionsEst 
{
	public static void main (String [] args)
	{
		Collection<String> dados = new ArrayList();
		Scanner ler = new Scanner (System.in);
		
		
		int opcao = 0;
		String produto = null;
		boolean continua = true;
		
		dados.add("Caneta");
		dados.add("Papel");
		
		System.out.println(">>Estoque da loja Amarelinha<<");
		
		
		
		do
		{
			do {
			try
			{
			System.out.println("\nO que deseja fazer? \n[1] Armazenar dados; \t[2] Remover dados; \n[3] Atualizar dados;  \t[4] Mostrar todos os dados; \n[5] Sair.");
			System.out.println("\nDigite aqui: ");
			opcao = ler.nextInt();
					
			
			continua = false;
			
			}catch (InputMismatchException erro1) {
				System.err.println("Não é permitido inserir letras, informe apenas números inteiros.");
				ler.nextLine();
			}finally{
				System.out.println("Opção inválida. \nEscolha uma opção abaixo para continuar.");
			}
			}while (continua);
			
		
		switch (opcao)
		{
		case 1: //add dados 
			System.out.println("Qual produto deseja adicionar?");
			produto = ler.next();
			dados.add(produto);
			break;
		
		case 2: //remover dados
			
			System.out.println("Lista do estoque: "+dados);
			System.out.println("O que deseja remover?");
			produto = ler.next();
			dados.remove(produto);
			break; 
			
		case 3: //atualizar dados
			System.out.println("Qual produto deseja atualizar?");
			produto = ler.next();
			dados.add(produto);
			System.out.println("\nO que deseja fazer? \n[1] Adicionar produto; \t[2] Remover produto;");
			opcao = ler.nextInt();
			
			if (opcao == 1 )
			{
				System.out.println("Qual produto deseja adicionar?");
				produto = ler.next();
				dados.add(produto);
			}
			else
			{
				System.out.println("Lista do estoque: "+dados);
				System.out.println("O que deseja remover?");
				produto = ler.next();
				dados.remove(produto);
			}
						
		case 4: //mostrar todos dados
			System.out.println("Estoque atualizado após mudanças produto: "+dados);
			break;
			
		}
		
		}
		while (opcao != 5);
		
	}
}
