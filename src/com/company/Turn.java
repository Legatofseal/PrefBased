package com.company;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/**
 * Created by Legat on 6/30/2016.
 */
public class Turn {
    Deck deck;

    Players players;
    ArrayList<Player> activeSubset;

    public Turn(Players players) {
        this.deck=new Deck("My deck");
        this.players = players;
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
        for (int i=0; i<Game.PLAYERS_Number-1; i++){
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
        for (int i = 0; i<(Game.NumberOfCards-8)/3; i++){
            for (int j=0; j<Game.PLAYERS_Number-1; j++){
                activeSubset.get(j).getHand().add(temp.get(0));
                temp.remove(0);
            }
        }
    }


}
