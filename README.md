# LLMCodeSmellRefactor

The objective of this repository is to study the refactoring capabilities of LLMs. 

It was design to have both good and bad java practices. 

The code can be faulty, and it is supposed to be

## Identifying code smells

1. In this project you can use PMD and the file "rules.xml" to identify: Data Classes (DC): Long Method (LM), Long Parameter List (LPL)

    ``
     pmd.bat check -f json -R .\regras.xml -d .\ -r ./All.json
    ``
2. You can use IntelliJDeodorant to identify: Feature Envy (FE). (You must use IntelliJ 2021.2.4 since it's the latest version that the plugin works on)

## Refactoring

The project has 100 test methods with 228 total assertions surrounding the code smells behaviour.
When refactoring the code with any LLM, you can run the tests to identify any change in the outcome, since
refactoring only alters the internal structure without altering the external behaviour.


## This project contains the following code smells:

### 5 Data Classes
- Card, Reference, ToDo, Task, SearchLog

### 5 Long Method
- LeitnerSystem, KanbanView, ToDoTracker, StudyMaterial, StudyGoal

### 5 Feature Envy
- TimelineView, GeneralSearch, StudyCardsController, MaterialSearch, RegistrySearch

### 5 Long Parameter List
- AudioReference, HabitTracker, StudyObjective, StudyPlan, StudyTaskManager



