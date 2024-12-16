package org.example.studyregistry;

import java.util.*;

public class StudyTaskManager {
    private static StudyTaskManager instance;
    private StudyMaterial studyMaterial = StudyMaterial.getStudyMaterial();
    List<Registry> registryList;
    List<String> weekResposabilities;

    private StudyTaskManager(){
        this.registryList = new ArrayList<Registry>();
    }

    public static StudyTaskManager getStudyTaskManager(){
        if (instance == null) {
            instance = new StudyTaskManager();
        }
        return instance;
    }

    public void setUpWeek(String planName, String objectiveTitle, String objectiveDescription, String materialTopic, String materialFormat, String goal, String reminderTitle, String reminderDescription, String mainTaskTitle, String mainHabit, String mainCardStudy){
        this.weekResposabilities = new ArrayList<>();
        this.weekResposabilities.addAll(Arrays.asList(planName, objectiveTitle, objectiveDescription, materialTopic, materialFormat, goal, reminderTitle, reminderDescription, mainTaskTitle, mainHabit, mainCardStudy));
    }

    public void addRegistry(Registry registry){
        registryList.add(registry);
    }
    public void removeRegistry(Registry registry){
        registryList.remove(registry);
    }
    public List<Registry> getRegistryList(){
        return registryList;
    }

}
