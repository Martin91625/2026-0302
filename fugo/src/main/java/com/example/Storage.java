package com.example;

import java.io.FileWriter;
import java.io.IOException;

public class Storage {
    
    Storage(String content){

        writeToFile(content);
    }

    private void writeToFile(String content){

        try(FileWriter file = new FileWriter("")){

            
        }
        catch(IOException e){


        }
    }
}
