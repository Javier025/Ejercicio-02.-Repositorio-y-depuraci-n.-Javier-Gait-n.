package ejercicio2;

public class Card {
	//Aquí creamos nuestras cartas
	public String suit;
	public String value;
	
	public Card (String suit, String value) {
		this.suit = suit;
		this.value = value;
	}
	
	public String toString () {
		//Nuestra carta se mostrará con el formato "palo-valor"
		return (this.suit+"-"+this.value);
	}
}
