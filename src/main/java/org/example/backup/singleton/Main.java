package org.example.backup.singleton;

public class Main {
    public static void main(String[] args) {

        DataBaseConnection dbc1 = DataBaseConnection.getInstance();
        DataBaseConnection dbc2 = DataBaseConnection.getInstance();
        DataBaseConnection dbc3 = DataBaseConnection.getInstance();
        DataBaseConnection dbc4 = DataBaseConnection.getInstance();
        DataBaseConnection dbc5 = DataBaseConnection.getInstance();

//        EagerDBC eager1 = EagerDBC.getInstance();
//        EagerDBC eager2 = EagerDBC.getInstance();
//        EagerDBC eager3 = EagerDBC.getInstance();
//
//
//        SyncDBC sync1 = SyncDBC.getInstance();
//        SyncDBC sync2 = SyncDBC.getInstance();
//        SyncDBC sync3 = SyncDBC.getInstance();
//        SyncDBC sync4 = SyncDBC.getInstance();

        System.out.println("DEBUG");
    }
}
