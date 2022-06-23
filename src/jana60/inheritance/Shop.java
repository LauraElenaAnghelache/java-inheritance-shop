package jana60.inheritance;




public class Shop {

	public static void main(String[] args) {
		/*Nell’esercizio di oggi riprendiamo Java Shop applicando le proprietà di incapsulamento ed ereditarietà che abbiamo visto
in questi giorni in classe.
Nome repo: java-inheritance-shop
Consegna
Creare la classe Prodotto che gestisce i prodotti dello shop. Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- marca
- prezzo
- iva
Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
- il codice prodotto sia accessibile solo in lettura
- gli altri attributi siano accessibili sia in lettura che in scrittura
- il prodotto esponga un metodo per avere il prezzo comprensivo di iva formattato
Lo shop gestisce diversi tipi di prodotto:
- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
- Cuffie, caratterizzate dal colore e se sono wireless o cablate
Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto e testate le funzionalità delle vostre classi in una classe Main con metodo main.
*/     
		
		Smartphone prodotto1 = new Smartphone("Samsung", "Galaxy21", 350f,123,128, "12345676554");
		Televisori prodotto2  = new Televisori ("Lg", "Ultravision", 400f, 555, 32, true);
		Cuffie prodotto3 = new Cuffie ("Apple", "Airpods",170f,333, "RoseGold", false);
	    
	  
	    System.out.println(prodotto1.toString());
	    System.out.println();
	    System.out.println(prodotto2.toString());
	    System.out.println();
	    System.out.println(prodotto3.toString());
	}

}
