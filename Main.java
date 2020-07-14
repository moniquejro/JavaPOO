package POO;

public class Main 
{

	public static void main(String[] args) 
	{
		
		System.out.println("EXERC�C�O: Pessoa e Fornecedor");
		
		Pessoa monique = new Pessoa ("Monique", "25 de Mar�o", "(11)6587-1254");
		Pessoa jessica = new Fornecedor("Jessica", "7 de setembro", "(11)2154-8796", 1000, 200);
		Fornecedor ana = new Fornecedor ("Ana", "3 de abril", "(11)8457-9966", 1000, 1200);
		
		System.out.println("Nome: "+jessica.getNome());
		System.out.println("Nome: "+monique.getNome());
		System.out.println("Endere�o: "+monique.getEndereco());
		System.out.println("Celular: "+monique.getCelular());
		System.out.println("Nome: "+ana.getNome());
		System.out.println("Valor d�vida: "+ana.getValorDivida());
		System.out.println("Valor cr�dito: "+ana.getValorCredito());
		System.out.println("D�vida: "+ana.obterDivida());

		
		System.out.println("\nEXERC�C�O Pessoa e Empregado");
		
		Empregado jorge = new Empregado ("Jorge", "Edilio Ribeiro", "11-6325-8755", 7854, 200, 10.0);
		
		System.out.println("Nome: "+jorge.getNome());
		System.out.println("C�digo do setor: "+jorge.getCodigoSetor());
		System.out.println("Sal�rio base: "+jorge.getSalarioBase());
		System.out.println("Imposto: "+jorge.getImposto());
		System.out.println("Salario final: "+jorge.obterSalario());
		
		
		System.out.println("\nEXERC�CIO Pessoa e Administrador");
		
		Administrador luis = new Administrador ("Luis", "Praia Boa", "11-8888-8888", 500, 200);
		
		System.out.println("Nome: "+luis.getNome());
		System.out.println("Endere�o: "+luis.getEndereco());
		System.out.println("Custo de gasolina: "+luis.getCustoGas());
		System.out.println("Custo da moradia: "+luis.getCustoMoradia());
		System.out.println("Valor de ressarcimento: "+luis.volta());
		
		System.out.println("\nEXERC�CIO Pessoa e Oper�rio");
		
		Operario lucas = new Operario ("Lucas", "S�tio Belo", "11-333-3333", 200, 50);
		
		System.out.println("Nome: "+lucas.getNome());
		System.out.println("Endere�o: "+lucas.getEndereco());
		System.out.println("Valor produ��o: "+lucas.getValorProducao());
		System.out.println("Valor comiss�o: "+lucas.getComissao());
		System.out.println("Sal�rio final: "+lucas.salFinal());
		
		System.out.println("\nEXERCICIO Pessoa e Vendedor");
		
		Vendedor xuxa = new Vendedor ("Xuxa", "Globo", "00-0000-0000", 1100, 50);
		xuxa.vendedor();
	}

}
