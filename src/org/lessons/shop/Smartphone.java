package org.lessons.shop;

public class Smartphone extends Prodotto {
	
	private String IMEI;
	private int memoria;
	private int ram;
	
	Smartphone(String nome, String descrizione, double prezzo, int iva, String IMEI, int memoria, int ram) {
		super(nome, descrizione, prezzo, iva);
		
		this.IMEI = IMEI;
		this.memoria = memoria;
		this.ram = ram;
		
	}

	public String getIMEI() {
		return IMEI;
	}

	public void setIMEI(String iMEI) {
		IMEI = iMEI;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" +
				"IMEI: " + IMEI + "\n" +
				"Memoria: " + memoria + "\n" +
				"Memoria Ram: " + ram;
	}

}
