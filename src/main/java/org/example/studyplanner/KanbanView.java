package org.example.studyplanner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// long method
public class KanbanView {
    public enum State{
        TODO, DOING, DONE;
    }

    HabitTracker tracker = null;
    Map<State, List<Habit>> kanban = null;

    public KanbanView(HabitTracker tracker) {
        this.tracker = tracker;
        this.kanban = new HashMap<>();
        this.kanban.put(State.TODO, new ArrayList<>());
        this.kanban.put(State.DOING, new ArrayList<>());
        this.kanban.put(State.DONE, new ArrayList<>());
    }

    public void addToKanban(State state, Integer id){
        Habit toAdd = this.tracker.getHabitById(id);
        kanban.get(state).add(toAdd);
    }

    public void removeFromKanban(State state, Integer id){
        Habit toRemove = this.tracker.getHabitById(id);
        kanban.get(state).remove(toRemove);
    }

    public String view(){
        if(kanban.isEmpty()){
            return "No habits found";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[ Habits ToDo: ");
        sb.append(System.lineSeparator());

        if(kanban.get(State.TODO).isEmpty()){
            sb.append("No habits found");
        } else {
            for(Habit habit : kanban.get(State.TODO)){
                sb.append(", ").append(habit.toString());
            }
        }
        sb.append(System.lineSeparator());
        sb.append("Habits in progress:");
        sb.append(System.lineSeparator());
        if(kanban.get(State.DOING).isEmpty()){
            sb.append("No habits found");
        } else {
            for(Habit habit : kanban.get(State.DOING)){
                sb.append(", ").append(habit.toString());
            }
        }
        sb.append(System.lineSeparator());
        sb.append("Habits completed:");
        sb.append(System.lineSeparator());
        if(kanban.get(State.DONE).isEmpty()){
            sb.append("No habits found");
        } else {
            for(Habit habit : kanban.get(State.DONE)){
                sb.append(", ").append(habit.toString());
            }
        }
        sb.append("]");
        return sb.toString();
    }


}
