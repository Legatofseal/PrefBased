package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Legat on 6/29/2016.
 */
public class Player {
    String name;
    ArrayList<Card> hand;
    PLAYER_TYPE type;
    enum PLAYER_TYPE {ACTIVE, PASSIVE}

    int score = 0;

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hand=" + hand +
                ", type=" + type +
                '}';
    }

    public Player(String name) {
        this.name = name;
        hand = new ArrayList<>();
    }

    public ArrayList<Card> getHand() {
        return hand;
    }


    public PLAYER_TYPE getType() {
        return type;
    }



    public void setType(PLAYER_TYPE type) {
        this.type = type;
    }
}
