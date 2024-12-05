package org.example.studycards;

import java.util.ArrayList;
import java.util.List;

public class LeitnerSystem extends StudyMethod{
    List<Box> boxes = null;
    public LeitnerSystem(String methodName) {
        super(methodName);
        boxes = new ArrayList<Box>(5);
    }

    @Override
    String getMethodName() {
        return this.methodName;
    }

    @Override
    void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Card takeCardFromBox(Integer boxId){
        Integer cardId = boxes.get(boxId).getRandomCard();
        return this.cardManager.getCard(cardId);
    }

    public void boxIdValidation(Integer boxId) throws Exception {
        if(boxId == null || boxId > boxes.size() || boxId <= 0){
            throw new Exception("Invalid box ID");
        }
    }

    public void upgradeCard(Integer boxId, Integer cardId) throws Exception {
        boxIdValidation(boxId);

        Box refBox = boxes.get(boxId);
        if(!refBox.hasCard(cardId)){
            throw new Exception("No card Found");
        }
        refBox.removeCard(cardId);
        boxes.get(Math.min(boxId + 1, 4)).addCard(cardId);
    }

    public void downgradeCard(Integer boxId, Integer cardId) throws Exception {
        boxIdValidation(boxId);

        Box refBox = boxes.get(boxId);
        if(!refBox.hasCard(cardId)){
            throw new Exception("No card Found");
        }
        refBox.removeCard(cardId);
        boxes.get(Math.max(boxId - 1, 0)).addCard(cardId);
    }

}
