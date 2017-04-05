package Celular;

public class CelularBuilder {
	private String os;
	private int ram;
	private String processador;
	private int bateria;
	private int camera;
	public String getOs() {
		return os;
	}
	public  CelularBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	
	public CelularBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	
	public CelularBuilder setProcessador(String processador) {
		this.processador = processador;
		return this;
	}
	
	public CelularBuilder setBateria(int bateria) {
		this.bateria = bateria;
		return this;
	}
	
	public CelularBuilder setCamera(int camera) {
		this.camera = camera;
		return this;
	}
    public Celular getCelular()
    {
     return new Celular(os, ram, processador,bateria, camera);
    }
    }
		
	
	

