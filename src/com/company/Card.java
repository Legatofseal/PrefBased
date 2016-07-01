package com.company;

/**
 * Created by Legat on 6/29/2016.
 */
public class Card implements Comparable<Card>{
    @Override
    public int compareTo(Card o) {
        if (this.power>o.getPower()){
            return 1;
        }
        if (this.power<o.getPower()){
            return -1;
        }
        else {
            return 0;
        }

    }

    enum  SUITE {SPRADES, CLUBS, DIAMONDS, HEARTS}
    enum  CARD_VALUE {SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE}
    Player owner;
    SUITE suite;
    CARD_VALUE card_value;
    int power = 0;

    public SUITE getSuite() {
        return suite;
    }

    public CARD_VALUE getCard_value() {
        return card_value;
    }

    public Card(CARD_VALUE card_value,  SUITE suite, Player owner) {
        this.card_value = card_value;
        this.owner = owner;
        this.suite = suite;
    }

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

    public int getPower() {
        return power;
    }

    public void calcPower (SUITE suite){
        if (this.suite==suite){
            power=100;
        }
        if (this.card_value==CARD_VALUE.SEVEN){
            power+=7;
        }
        if (this.card_value==CARD_VALUE.EIGHT){
            power+=8;
        }
        if (this.card_value==CARD_VALUE.NINE){
            power+=9;
        }
        if (this.card_value==CARD_VALUE.TEN){
            power+=10;
        }
        if (this.card_value==CARD_VALUE.JACK){
            power+=11;
        }

        if (this.card_value==CARD_VALUE.QUEEN){
            power+=12;
        }
        if (this.card_value==CARD_VALUE.KING){
            power+=13;
        }
        if (this.card_value==CARD_VALUE.ACE){
            power+=14;
        }
    }
}
