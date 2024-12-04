package org.example.cardstudy;

import java.util.*;

public class Box {
    private List<Integer> cards;
    public Box() {}
    public Box(List<Integer> cards) {
        this.cards = cards;
    }
    public List<Integer> getCards() {
        return cards;
    }
    public boolean hasCard(int cardId) {
        return cards.contains(cardId);
    }

    public void setCards(List<Integer> cards) {
        this.cards = cards;
    }
    public void removeCard (Integer id) {
        cards.remove(id);
    }
    public void addCard (Integer id) {
        cards.add(id);
    }

    public Integer getRandomCard(){
        Random random = new Random();
        int randomIndex = random.nextInt(cards.size());
        return cards.get(randomIndex);
    }
}
