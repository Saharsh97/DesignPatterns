package org.example.backup.singleton;

public class SyncDBC {
    private static SyncDBC INSTANCE = null;

    private SyncDBC() {}

    public synchronized static SyncDBC getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SyncDBC();
        }
        return INSTANCE;
    }
}
