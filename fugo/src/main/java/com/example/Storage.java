package com.example;

import java.io.FileWriter;
import java.io.IOException;

public class Storage {
    
    Storage(String content){

        writeToFile(content);
    }

    private void writeToFile(String content){

        try(FileWriter file = new FileWriter("adat.txt")){

            file.write(content);
        }
        catch(IOException e){
            System.err.println("Hiba történt a fájlírásban! ");
            e.getMessage();
        }
    }
}
