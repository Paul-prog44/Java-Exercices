import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;


public class ExerciceManagementTest {
	private ExerciseManagement management  = new ExerciseManagement();
	
	@Test
	public void exercicseListEmptyAtBeginning() {
		assertEquals(0, management.exerciseList().size());
	}
	
	@Test
	public void addingExerciseGrowsListByOne() {
		management.add("Write a test");
		assertEquals(1, management.exerciseList().size());
	}
	
	@Test
	public void AddedExerciseIsInList() {
		management.add("Write a test");
		assertTrue(management.exerciseList().contains("Write a test"));
	}
	
	@Test
	public void exerciseCanBeMarkedAsCompleted() {
		management.add("New exercise");
		management.markAsCompleted("New exercise");
		assertTrue(management.isCompleted("New exercise"));
	}
	
	@Test
	public void ifNotMarkedCompletedIsNotCompleted() {
		management.add("New exercise");
		management.markAsCompleted("New exercise");
		assertFalse(management.isCompleted("Some exercise"));
	}
}
