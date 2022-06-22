package jana60.inheritance;

import java.text.DecimalFormat;

public class Prodotto {

	private String marca, nome;
	private float prezzoBase;
	private int codice, iva =22;
	DecimalFormat df = new DecimalFormat ("#.00€");
     public Prodotto(String marca, String nome, float prezzoBase, int codice) {
		super();
		this.marca = marca;
		this.nome = nome;
		this.prezzoBase = prezzoBase;
		this.codice = codice;

	}
     public String getMarca() {
		    return marca;
		  }

		  public void setMarca(String marca) {
		    this.marca = marca;
		  }
     
 	public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public float getPrezzoBase() {
			return prezzoBase;
		}
		public void setPrezzoBase(float prezzoBase) {
			this.prezzoBase = prezzoBase;
		}
		public void setCodice(int codice) {
			this.codice = codice;
		}
		public int getIva() {
			return iva;
		}
		public void setIva(int iva) {
			this.iva = iva;
		}
		
	float prezzoTotale()
 	{
 		return prezzoBase + ((prezzoBase/100)*iva);
 	}
	@Override
 	public String toString() {
 		return "Marca:"+ marca + "\n"+ "Modello:" + nome + "\n" + "Codice:"+ codice + "\n" + "Prezzo:" + df.format(prezzoTotale());
 		
 		}
 	}
