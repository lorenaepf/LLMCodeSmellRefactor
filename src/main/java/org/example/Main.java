package org.example;

import org.example.studycards.FlashCard;
import org.example.studycards.LeitnerSystem;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LeitnerSystem lei = new LeitnerSystem("Leitner");
        FlashCard fc = new FlashCard("FlashCard");
    }
}