package com.codecool.Controller;

import com.codecool.Model.*;
import com.codecool.View.View;

public class Main {

    public static void main(String[] args) {

        PersistenceDB persistence = new PersistenceDB();
        Mediatheque mediatheque = new Mediatheque(persistence);
        User user = new User(1000, mediatheque);
        Manager manager = new Manager(2000, mediatheque);

        View view = new View();

        simpleRun();

    }


    private static void simpleRun(){


    }
}
