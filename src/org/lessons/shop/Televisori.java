package org.lessons.shop;

public class Televisori extends Prodotto {
	
	private String altezza;
	private String larghezza;
	private String profondita;
	private boolean isSmart;
	

	Televisori(String nome, String descrizione, double prezzo, int iva, String altezza, String larghezza, String profondita, boolean isSmart) {
		super(nome, descrizione, prezzo, iva);
		
		this.altezza = altezza;
		this.larghezza = larghezza;
		this.profondita = profondita;
		this.isSmart = isSmart;
		
		
		
	}


	public String getAltezza() {
		return altezza;
	}


	public void setAltezza(String altezza) {
		this.altezza = altezza;
	}


	public String getLarghezza() {
		return larghezza;
	}


	public void setLarghezza(String larghezza) {
		this.larghezza = larghezza;
	}


	public String getProfondita() {
		return profondita;
	}


	public void setProfondita(String profondita) {
		this.profondita = profondita;
	}


	public boolean isSmart() {
		return isSmart;
	}


	public void setSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n" + 
				"Altezza: " + altezza + "\n" + 
				"Larghezza: " + larghezza + "\n" +
				"Profondità: " + profondita + "\n" +
				"Smart Tv: " + (isSmart ? "Si" : "No");
	}
	
}
