package org.example;

import org.example.controllers.MainController;
import org.example.controllers.StudyCardsController;
import org.example.controllers.StudyPlannerController;
import org.example.studycards.FlashCard;
import org.example.studycards.LeitnerSystem;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        StudyCardsController studyCardsController = new StudyCardsController();
        StudyPlannerController studyPlannerController = new StudyPlannerController();
        MainController controller = new MainController(studyCardsController, studyPlannerController);

        Scanner userInput = new Scanner(System.in);
        String input = "";

        while(!input.equals("0")) {
            System.out.println(mainOptions());
            input = userInput.nextLine();
            controller.handleUserInput(input);
        }
    }

    public static String mainOptions(){
        return """
                Welcome to the Study Organizer
                Please choose from the following options:
                0 - ends program
                1 - study cards
                2 - study planner
                3 - study registry
                
                """;
    }
}