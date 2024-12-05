package org.example.studyplanner;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

// long parameter list
public class HabitTracker {
    private List<Habit> habits = new ArrayList<>();
    private Map<Integer, List<LocalDateTime>> tracker;
    private Integer nextId;

    public HabitTracker() {
        this.tracker = new HashMap<Integer, List<LocalDateTime>>();
        this.habits = new ArrayList<Habit>();
        this.nextId = 1;
    }

    public Habit getHabitById(Integer id){
        return this.habits.stream()
                .filter(habit -> Objects.equals(habit.getId(), id))
                .findFirst().orElse(null);
    }

    public void addHabit(String name, String motivation, Integer dailyMinutesDedication, Integer dailyHoursDedication, Integer year, Integer month, Integer day, Integer hour, Integer minute, Integer seconds, Boolean isConcluded) {
        LocalTime lt = LocalTime.of(dailyHoursDedication, dailyMinutesDedication);
        LocalDateTime startDate = LocalDateTime.of(year, month, day, hour, minute, seconds);
        Habit habit = new Habit(name, motivation, lt, this.nextId, startDate, isConcluded);
        this.habits.add(habit);
        this.tracker.put(nextId, new ArrayList<>());
        this.nextId++;
    }

    public void toggleConcludeHabit(Integer id) {
        for (Habit habit : this.habits) {
            if (habit.getId().equals(id)) {
                habit.setIsConcluded(!habit.getIsConcluded());
            }
        }
    }

    public void removeHabit(Integer id) {
        this.habits.removeIf(habit -> habit.getId().equals(id));
        this.tracker.remove(id);
    }
}
