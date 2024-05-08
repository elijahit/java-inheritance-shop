package org.lessons.shop;

public class Cuffie extends Prodotto {
	private String colore;
	private boolean isWireless;

	Cuffie(String nome, String descrizione, double prezzo, int iva, String colore, boolean isWireless) {
		super(nome, descrizione, prezzo, iva);
		
		this.colore = colore;
		this.isWireless = isWireless;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isWireless() {
		return isWireless;
	}

	public void setWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" +
				"Colore: " + colore + "\n" +
				"Connessione: " + (isWireless ? "Wireless" : "USB");
	}
}
