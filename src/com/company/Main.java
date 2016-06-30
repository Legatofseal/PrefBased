package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Turn turn = new Turn(new Players(new Player("A"),new Player("B"),new Player("C"),new Player("D")));
        turn.printAllHands();

    }
}
