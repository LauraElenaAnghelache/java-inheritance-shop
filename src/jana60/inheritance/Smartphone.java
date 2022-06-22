package jana60.inheritance;

import java.util.Random;

public class Smartphone extends Prodotto {
	
    private int memoria;
    private String imei;
    Random random = new Random();
    
	public Smartphone(String marca, String nome, float prezzoBase, int codice, int memoria) {
		super(marca, nome, prezzoBase, codice);
		this.memoria = memoria;
		this.imei = generaImei();
	}
	String generaImei( ) {
		String imei = "";
		for (int i = 0; i < 20; i++); {
			imei += random.nextInt(10);
			return imei;
		}
	}
	@Override 
		public String toString() {
			return super.toString() + "\n" + "IMEI Smartphone :" + imei + "\n" + "Memoria: " + memoria + "Gb";
		}
	
	}



