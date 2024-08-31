package org.example.backup.singleton;

public class EagerDBC {
    private static EagerDBC INSTANCE = new EagerDBC();

    private EagerDBC() {}

    public static EagerDBC getInstance() {
        return INSTANCE;
    }
}
