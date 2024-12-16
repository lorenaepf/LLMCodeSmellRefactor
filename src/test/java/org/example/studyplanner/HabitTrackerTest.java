package org.example.studyplanner;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class HabitTrackerTest {
    HabitTracker habitTracker = HabitTracker.getHabitTracker();
    List<Integer> habitIds = new ArrayList<>();

    @BeforeEach
    void setUp() {
        habitIds.add(habitTracker.addHabit("Test Search Name Habit", "Test Search Habit Motivation"));
    }

    boolean verifyCardStringInList(String searching, List<String> response) {
        for(String habit : response){
            if(habit.contains(searching)){
                return true;
            }
        }
        return false;
    }

    @Test
    @Order(1)
    @DisplayName("Search Name In Habits Test")
    void searchNameInHabits() {
        List<String> response = habitTracker.searchInHabits("Search Name Habit");
        assertTrue(verifyCardStringInList("Search Name Habit", response));
    }

    @Test
    @Order(1)
    @DisplayName("Search Motivation In Habits Test")
    void searchMotivationInHabits() {
        List<String> response = habitTracker.searchInHabits("Search Habit Motivation");
        assertTrue(verifyCardStringInList("Search Habit Motivation", response));
    }
}