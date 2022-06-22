package jana60.inheritance;

public class Cuffie extends Prodotto {
	
	private String colore;
	private boolean tipo;
	

	public Cuffie(String marca, String nome, float prezzoBase, int codice, String colore, boolean tipo) {
		super(marca, nome, prezzoBase, codice);
		this.colore = colore;
		this.tipo = tipo;
	}
    public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isTipo() {
		return tipo;
	}

	public void setWireless(boolean tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		String tipoCuffie = "";
		if (tipo) {
			tipoCuffie = "Wireless";
		}else {
			tipoCuffie = "Cavo";
			
		}
		return super.toString() + "\n" + "Colore cuffie :" + colore + "\n" + "Tipologia: " + tipoCuffie;
	}
	
    
	
	}
	

	


