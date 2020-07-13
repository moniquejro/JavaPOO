package POO;

public class AviaoC2 
{

	public static void main(String[] args) 
	{
		AviaoC AviaoC2 = new AviaoC ("Teco Teco.", 0547, "Azul", "No ar");
		System.out.println(AviaoC2.embarque());
		
		AviaoC AviaoC3 = new AviaoC ("AirBus.", 380, "Emirates", "Parado");
		System.out.println(AviaoC3.embarque());
				

	}

}
