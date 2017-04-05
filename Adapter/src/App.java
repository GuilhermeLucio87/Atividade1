
public class App {

	public static void main(String[] args){
		Veiculo Onibus = new Onibus();
		Veiculo Carro = new Carro();
		Veiculo Bicicleta = new BicicleteAdapter(new Bicicleta());
		
		Onibus.acelerar();
		Carro.acelerar();
		Bicicleta.acelerar();
	}
}
