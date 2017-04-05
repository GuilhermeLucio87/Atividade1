
public class BicicleteAdapter implements Veiculo {

	
	
	private Bicicleta bicicleta;
	
	public BicicleteAdapter(Bicicleta bicicleta){
		this.bicicleta = bicicleta;
		
	}
	
	@Override
	public void acelerar() {
	this.bicicleta.go();	
	
	
	
	}



}
