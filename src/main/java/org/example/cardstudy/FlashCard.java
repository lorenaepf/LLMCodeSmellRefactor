package org.example.cardstudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlashCard extends StudyMethod{
    public FlashCard(String methodName) {
        super(methodName);
    }

    @Override
    String getMethodName() {
        return "";
    }

    @Override
    void setMethodName(String methodName) {

    }

    public Card randomFlashCard(){
        List<Card> cards = cardManager.getCards();
        if (cards.isEmpty()) {
            System.out.println("No cards found");
            return null;
        }

        Random random = new Random();
        int randomIndex = random.nextInt(cards.size());
        return cards.get(randomIndex);
    }
}
