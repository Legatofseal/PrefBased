package com.company;

import java.util.*;

/**
 * Created by Legat on 6/29/2016.
 */
public class Deck {
    String name;
    ArrayList<Card> deck;

    public Deck(String name) {
        this.name = name;
        deck = new ArrayList<Card>();
        for (Card.SUITE suite: Card.SUITE.values()){
            for (Card.CARD_VALUE card_value: Card.CARD_VALUE.values()){
                deck.add(new Card(suite,card_value));
            }
        }
    }

    public ArrayList<Card> shuffleDeck (){
        ArrayList<Card> temp = new ArrayList<Card>();
        for (int i=0; i<Game.NumberOfCards; i++){
            temp.add(deck.get(i));
        }
        Collections.shuffle(temp);
        return temp;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }


}
