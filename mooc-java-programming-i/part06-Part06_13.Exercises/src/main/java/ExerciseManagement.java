import java.util.ArrayList;
import java.util.List;

public class ExerciseManagement {

    private List<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public void addExercise(String name) {
        exercises.add(new Exercise(name));
    }

    public void markCompleted(String name) {
        for (Exercise exercise : exercises) {
            if (exercise.getName().equals(name)) {
                exercise.markCompleted();
            }
        }
    }

    public List<Exercise> getCompletedExercises() {
        List<Exercise> completed = new ArrayList<>();
        for (Exercise exercise : exercises) {
            if (exercise.isCompleted()) {
                completed.add(exercise);
            }
        }
        return completed;
    }

    public int getCompletedCount() {
        return getCompletedExercises().size();
    }
}
