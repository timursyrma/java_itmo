package com.software;

public class Worker {
    private Database database;

    public Worker(Database database) {
        this.database = database;
    }

    public void saveData() {
        database.save();
    }
}

class DatabaseImpl implements Database {
    @Override
    public void save() {
        // ..
    }
}

