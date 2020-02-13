package com.company.Comands;

import com.company.App.Dispatcher;
import com.company.SpaceMarine.SpaceMarine;

import java.util.Map;


public class Show extends ComandsAbstract {
    @Override
    public void doComand(Dispatcher dispatcher, String arg) {
        for (Map.Entry entry : dispatcher.MyCollection.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            SpaceMarine marin = (SpaceMarine) entry.getValue();
            System.out.println("Values:\n" + marin.getAllInfo());
        }
    }
}