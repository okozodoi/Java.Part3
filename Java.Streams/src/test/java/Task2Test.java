import org.example.Task1;
import org.example.Task2;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Task2Test {
    @Test
    void evenNumbersArray_onRandomInput_allResultsAreEven() {
        List<Integer> randoms = Task1.randomNumbers();
        Integer[] result = Task2.evenNumbersArray(randoms);
        assertTrue(Arrays.stream(result).allMatch(i -> i % 2 == 0));
    }

    @Test
    void listOfDescendingC_returnsUppercasedCWordsInDescendingOrder() {
        List<String> stringList = Arrays.asList("a1", "a2", "b1", "c1", "c3");
        List<String> cWords = Task2.listOfDescendingC(stringList);
        assertEquals(List.of("C3","C1"), cWords);
    }

    @Test
    void listOfDescendingC_allResultsAreUppercase() {
        List<String> stringList = Arrays.asList("a1", "a2", "b1", "c1", "c3");
        List<String> cWords = Task2.listOfDescendingC(stringList);
        assertFalse(cWords.stream().anyMatch(s -> s.equals(s.toLowerCase())));
    }
}
