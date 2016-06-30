package com.company;

/**
 * Created by Legat on 6/29/2016.
 */
public class Card {
    enum  SUITE {SPRADES, CLUBS, DIAMONDS, HEARTS}
    enum  CARD_VALUE {SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE}

    SUITE suite;
    CARD_VALUE card_value;

    public Card(SUITE suite, CARD_VALUE card_value) {
        this.suite = suite;
        this.card_value = card_value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suite=" + suite +
                ", card_value=" + card_value +
                '}';
    }
}
