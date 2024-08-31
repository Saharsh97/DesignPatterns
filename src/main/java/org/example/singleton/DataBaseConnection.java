package org.example.singleton;

public class DataBaseConnection {


    private static DataBaseConnection INSTANCE = null;

    private DataBaseConnection() {}

    public static DataBaseConnection getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new DataBaseConnection();
        }
        return INSTANCE;
    }
}
