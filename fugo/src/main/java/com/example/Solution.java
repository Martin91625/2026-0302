/*
* File: Solution.java
* Author: El Miri Martin
* Copyright: 2026, El Miri Martin
* Group: Szoft I/N
* Date: 2026-03-02
* Github: https://github.com/Martin91625/
* Licenc: MIT
*/
package com.example;

import java.util.Scanner;

public class Solution {

    String[] targetArray = new String[5];

    Solution(){

        task01();
        printTargets();
    }

    public void task01() {

        //kérjük be a vizsgaremekek céléjait
        try(Scanner sc = new Scanner(System.in)){
                
            for(int i = 0; i < 5; i++){
                System.out.print("Cél: ");
                String target = sc.nextLine();
                targetArray[i] = target;
            }
        }
    }
    public void printTargets(){

        for(String target : targetArray){

            System.out.println(target);
        }
    }
}