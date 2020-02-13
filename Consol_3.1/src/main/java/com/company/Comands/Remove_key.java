package com.company.Comands;

import com.company.App.Dispatcher;

public class Remove_key extends ComandsAbstract {
    @Override
    public void doComand(Dispatcher dispatcher, String arg) {
        dispatcher.MyCollection.remove(arg);
    }
}
