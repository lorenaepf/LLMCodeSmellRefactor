package org.example.studyregistry;

import org.example.studymaterial.Reference;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyPlan extends Registry{
    private String planName;
    private StudyObjective objective;
    private List<String> steps;

    StudyPlan(String planName, StudyObjective objective, List<StudyMaterial> materials) {
        this.planName = planName;
        this.objective = objective;
        this.steps = new ArrayList<>();
    }

    @Override
    public String toString(){
        return "Plan: " + planName + ",\nObjective: " + objective.getDescription() + ",\nSteps: " + String.join(", ", steps);
    }

    public String getPlanName() {
        return planName;
    }

    public void assignObjective(StudyObjective objective) {
        this.objective = objective;
    }

    public void addSingleStep(String toAdd){
        steps.add(toAdd);
    }

    public void assignSteps(String firstStep, String resetStudyMechanism, String consistentStep, String seasonalSteps, String basicSteps, Integer numberOfSteps, boolean isImportant, LocalDateTime startDate, LocalDateTime endDate, String mainObjectiveTitle, String mainGoalTitle, String mainMaterialTopic, String mainTask) {
        this.steps = new ArrayList<String>(Arrays.asList(firstStep, resetStudyMechanism, consistentStep, seasonalSteps, basicSteps, numberOfSteps.toString(), "Is it important to you? " + isImportant, startDate.toString(), endDate.toString(), mainObjectiveTitle, mainGoalTitle, mainMaterialTopic, mainTask));
    }

}
