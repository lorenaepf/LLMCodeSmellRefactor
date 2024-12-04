package org.example;

import org.example.cardstudy.FlashCard;
import org.example.cardstudy.LeitnerSystem;
import org.example.cardstudy.StudyMethod;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LeitnerSystem lei = new LeitnerSystem("Leitner");
        FlashCard fc = new FlashCard("FlashCard");
    }
}