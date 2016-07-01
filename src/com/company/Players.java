package com.company;

import java.util.ArrayList;

/**
 * Created by Legat on 6/30/2016.
 */
public class Players {
    ArrayList<Player> playersList;



    public Players(Player player1, Player player2, Player player3, Player player4) {
        playersList=new ArrayList<Player>();
        player1.setType(Player.PLAYER_TYPE.ACTIVE);
        playersList.add(player1);
        player2.setType(Player.PLAYER_TYPE.ACTIVE);
        playersList.add(player2);
        player3.setType(Player.PLAYER_TYPE.ACTIVE);
        playersList.add(player3);
        player4.setType(Player.PLAYER_TYPE.PASSIVE);
        playersList.add(player4);
    }

    public Players() {

    }

    public void handTurn() {
        if (getIndexOfPassivePlayer() == playersList.size() - 1) {
            playersList.get(0).setType(Player.PLAYER_TYPE.PASSIVE);
            playersList.get(getIndexOfPassivePlayer()).setType(Player.PLAYER_TYPE.ACTIVE);
        } else{
            playersList.get(getIndexOfPassivePlayer()).setType(Player.PLAYER_TYPE.ACTIVE);
            playersList.get(getIndexOfPassivePlayer()+1).setType(Player.PLAYER_TYPE.PASSIVE);
        }
    }

    public ArrayList<Player> getPlayersList() {
        return playersList;
    }

    public int getIndexOfPassivePlayer() {
        int temp = 0;
        for (int i = 0; i < 4; i++) {
            if (playersList.get(i).getType() == Player.PLAYER_TYPE.PASSIVE) {
                temp = i;
            }
        }
        return temp;

    }

}
