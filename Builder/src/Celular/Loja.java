package Celular;

public class Loja {

	public static void main(String a[])
	{
		
	    
		Celular p = new CelularBuilder().setOs("Android").setRam(2).setProcessador("DualCore").setBateria(2880).setCamera(5).getCelular();
		
		System.out.println(p);
	
	}

	
}
