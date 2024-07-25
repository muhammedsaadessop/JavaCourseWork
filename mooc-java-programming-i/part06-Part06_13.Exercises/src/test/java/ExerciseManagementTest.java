import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExerciseManagementTest {

    private ExerciseManagement management;

    @Before
    public void setUp() {
        management = new ExerciseManagement();
    }

    @Test
    public void testAddExercise() {
        management.addExercise("Exercise 1");
        assertEquals(0, management.getCompletedCount()); // No exercises should be completed yet
    }

    @Test
    public void testMarkCompleted() {
        management.addExercise("Exercise 1");
        management.markCompleted("Exercise 1");
        assertTrue(management.getCompletedExercises().get(0).isCompleted());
    }

    @Test
    public void testGetCompletedExercises() {
        management.addExercise("Exercise 1");
        management.addExercise("Exercise 2");
        management.markCompleted("Exercise 1");
        assertEquals(1, management.getCompletedExercises().size());
    }
}
