package com.company.Comands;

import com.company.App.Dispatcher;
import com.company.JSON.JSON_Writer;
import com.google.inject.Inject;

import java.io.IOException;

public class Save extends ComandsAbstract{

    private final JSON_Writer writer;

    @Inject
    Save(JSON_Writer writer){
        this.writer = writer;
    }

    @Override
    public void doComand(Dispatcher dispatcher, String arg) throws IOException {
        writer.writeJSON(dispatcher);
    }
}
