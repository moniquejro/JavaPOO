package POO;


	public class patinete 
	{

	    private String cor;
	    private String marca;
	    private boolean status;
	    private int velocidade;
	    private int adicionaVel;

	    public patinete (String cor, String marca, boolean status, int velocidade, int incrementoVelocidade) 
	    {

	        this.cor = cor;
	        this.marca = marca;
	        this.status = status;
	        this.velocidade = velocidade;
	        this.adicionaVel = incrementoVelocidade;

	    }
	    public String mostrarDados() 
	    {
	        String statusPatinete;

	        if (status == false) 
	        {
	            statusPatinete = "Parado.";
	        }
	        else 
	        {
	            statusPatinete = "Estamos andando!";
	        }
	        String informacao = "Cor: " + cor + "\nMarca: " + marca + "\nStatus: " + statusPatinete + "\nVelocidade Atual: " + velocidade + " KM/h" + "\nAumento da Velocidade: " + adicionaVel+" KM/h";
	        return informacao;
	    }


	    public String andar() 
	    {
	        status = true;
	        String statusP = null;
	        if (status == true) 
	        {
	         statusP = "Patinete esta andando";
	        }
	        velocidade = velocidade + adicionaVel;
	        String informacao = "Cor: " + cor + "\nMarca: " + marca + "\nStatus: " + statusP + "\nVelocidade Atual: " + velocidade + " KM/h";
	        return informacao;


	    }

	}


