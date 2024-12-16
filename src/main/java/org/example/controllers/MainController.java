package org.example.controllers;

import java.util.Map;
import java.util.Scanner;

public class MainController {
    private StudyCardsController studyCardsController;
    private StudyPlannerController studyPlannerController;

    public MainController(StudyCardsController studyCardsController, StudyPlannerController studyPlannerController){
        this.studyCardsController = studyCardsController;
        this.studyPlannerController = studyPlannerController;
    }

    public static String getInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String validateInput(Map<String, Runnable> actions) throws Exception {
        String input = getInput();
        if(input.equals("0")){return null;}
        Runnable ac = actions.get(input);
        if(ac == null) throw new Exception("Invalid action");
        return input;
    }

    public void handleUserInput(String input){
        if(input.equalsIgnoreCase("1")){
            studyCardsController.handleCardsInput();
        } else if(input.equalsIgnoreCase("2")){
            studyPlannerController.handlePlannerInput();
        }
    }
}
