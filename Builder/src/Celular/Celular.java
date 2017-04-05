package Celular;

//Builder
public class Celular {

	private String os;
	private int ram;
	private String processador;
	private int bateria;
	private int camera;
	public Celular() {
		
	}
	public Celular(String os, int ram, String processador, int bateria, int camera) {
		super();
		this.os = os;
		this.ram = ram;
		this.processador = processador;
		this.bateria = bateria;
		this.camera = camera;
	}
	@Override
	public String toString() {
		return "Celular [os=" + os + ", ram=" + ram + ", processador=" + processador + ", bateria=" + bateria
				+ ", camera=" + camera + "]";
	}
}
