/*
* File: Sol.java
* Author: El Miri Martin
* Copyright: 2026, El Miri Martin
* Group: Szoft I/N
* Date: 2026-03-02
* Github: https://github.com/Martin91625/
* Licenc: MIT
*/

package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sol {
    
    private List<String> targetList = new ArrayList<>();
    private Storage storage = new Storage();

    Sol(){
        task01();
        printTargets();
        startWrite();
    }

    private void task01(){
       
        try(Scanner sc = new Scanner(System.in)){
            for (int i = 0; i < 5; i++) {
                System.out.print("Cél: ");
                String target = sc.nextLine();

                targetList.add(target);
            }
        }
    }
    private void printTargets(){
        for (String string : targetList) {
            System.out.println(string);
        }
    }
    private void startWrite(){
        StringBuilder sb = new StringBuilder();
        for (String target : targetList) {
            sb.append(target);
            sb.append("\n");
        }
        storage.writeToFile(sb.toString());
    }
}