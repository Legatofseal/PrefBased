package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	// write your code here
        Turn turn = new Turn(new Players(new Player("A"),new Player("B"),new Player("C"),new Player("D")));
        turn.printAllHands();
       /* String url = "jdbc:mysql://127.0.0.1:3306/test";
        //Имя пользователя БД
        String name = "root";
        //Пароль
        String password = "polon123";
        Class.forName("com.mysql.jdbc.Driver");


       Connection connection = DriverManager.getConnection(url, name, password);*/

    }
}
