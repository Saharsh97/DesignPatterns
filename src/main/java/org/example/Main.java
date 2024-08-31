package org.example;

import org.example.backup.singleton.DataBaseConnection;

public class Main {
    public static void main(String[] args) {
        DataBaseConnection dbc1 = DataBaseConnection.getInstance();
        DataBaseConnection dbc2 = DataBaseConnection.getInstance();
        DataBaseConnection dbc3 = DataBaseConnection.getInstance();
        DataBaseConnection dbc4 = DataBaseConnection.getInstance();
        DataBaseConnection dbc5 = DataBaseConnection.getInstance();

        System.out.println("DEBUG");

    }
}