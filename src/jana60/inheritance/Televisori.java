package jana60.inheritance;

public class Televisori extends Prodotto {
	
	private int dimensioni;
	private boolean smart;

	public Televisori(String marca, String nome, float prezzoBase, int codice, int dimensioni, boolean smart) {
		super(marca, nome, prezzoBase,codice);
		this.dimensioni = dimensioni;
		this.smart = smart;
	}

	public int getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	@Override 
	public String toString() {
		String tipo = "";
		if (smart) {
			tipo = "Smart TV";
					
	}else {
		tipo = "No Smart TV";
	}
		return super.toString() + "\n" + "Tipologia:" + tipo + "\n" + "Dimensioni:" + dimensioni;
	}

	

	}


