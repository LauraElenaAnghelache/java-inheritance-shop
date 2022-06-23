package jana60.inheritance;

import java.util.Random;

public class Smartphone extends Prodotto {
	
    private int memoria;
    private String imei;
    Random random = new Random();
    
	public Smartphone(String marca, String nome, float prezzoBase, int codice, int memoria, String imei) {
		super(marca, nome, prezzoBase, codice);
		this.memoria = memoria;
		this.imei = imei;
	}
	
	@Override 
		public String toString() {
			return super.toString() + "\n" + "IMEI Smartphone :" + imei + "\n" + "Memoria:" + memoria + "Gb";
		}
	
	}



