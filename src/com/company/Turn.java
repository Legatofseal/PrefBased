package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

/**
 * Created by Legat on 6/30/2016.
 */
public class Turn {
    Deck deck;
    Card.SUITE trump = null;
    Players players;
    ArrayList<Player> activeSubset;
    ArrayList<Trick> tricks;

    public Turn(Players players) {
        this.deck = new Deck("My deck");

        this.players = players;
        tricks = new ArrayList<Trick>(10);
        activeSubset = new ArrayList<Player>();
        setActiveSubset();
        makeHands();
    }

    public void setActiveSubset() {
        for (int i = 0; i < Game.PLAYERS_Number; i++) {
            if (players.getPlayersList().get(i).getType() == Player.PLAYER_TYPE.ACTIVE) {
                activeSubset.add(players.getPlayersList().get(i));
            }
        }
    }


    public void printAllHands() {
        for (int i = 0; i < Game.PLAYERS_Number - 1; i++) {
            System.out.println(activeSubset.get(i).toString());
        }
    }

    public void makeHands() {
        ArrayList<Card> temp = deck.shuffleDeck();
        for (int i = 0; i < Game.PassivePlayerCardNumber; i++) {
            for (int j = 0; j < Game.PLAYERS_Number; j++) {
                players.getPlayersList().get(j).getHand().add(temp.get(0));
                temp.remove(0);
            }

        }
        for (int i = 0; i < (Game.NumberOfCards - 8) / 3; i++) {
            for (int j = 0; j < Game.PLAYERS_Number - 1; j++) {
                activeSubset.get(j).getHand().add(temp.get(0));
                temp.remove(0);
            }
        }
    }

    public void playRound() {
        ArrayList<Card> trick = new ArrayList<Card>();
        for (Player player:players.getPlayersList()){
            trick.add(player.throwCard(0));
        }



    }

    public void playTurn() {

    }

    private Card compareCards(ArrayList<Card> cardsList) {
        Card temp = cardsList.get(0);
        if (this.trump.equals(null)) {
            this.trump = temp.getSuite();

        }

        for (Card card : cardsList) {
            card.calcPower(trump);
        }

        Collections.sort(cardsList);
        return cardsList.get(3);
    }

}
