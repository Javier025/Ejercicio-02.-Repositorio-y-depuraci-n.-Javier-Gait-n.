package ejercicio2;

import java.util.ArrayList;

public class DeckCards {

	public static void main(String[] args) {
		//Aquí definimos las cartas
		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		//Este es el mazo donde se guarden las cartas.
		ArrayList<Card> deck = new ArrayList<Card>();
		
		//Creamos las cartas que se incluirán dentro del mazo.
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < values.length; j++) {
				Card card = new Card(suits[i], values[j]);
				deck.add(card);
			}
		}
		//Barajamos el mazo de forma pseudoaleatoria.
		for (int i = 0; i < deck.size(); i++) {
			int j = (int) Math.floor(Math.random() * i);
			Card tmp = deck.get(i);
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}
		//Mostramos por pantalla las 5 primeras cartas del mazo ya barajado.
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}

	}

}
