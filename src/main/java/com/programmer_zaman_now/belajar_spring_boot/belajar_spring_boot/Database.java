package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot;

public class Database {
    private static Database database;

    public static Database getInstance() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }

    private Database() {

    }
}
