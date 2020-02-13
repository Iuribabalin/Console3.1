package com.company.Comands;

import com.company.App.Dispatcher;

import java.io.IOException;

public interface Comands {
    void doComand(Dispatcher dispatcher, String arg) throws IOException;
}
