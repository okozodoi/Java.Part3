import org.example.Task1;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Task1Test {
    @Test
    void streamToList(){
        List<Integer> result = Task1.fixedStreamToList();
        assertEquals(List.of(1,2,3,4,5,6,7,8,9), result);
    }

    @Test
    void randomNumbers() {
        List<Integer> result = Task1.randomNumbers();
        assertEquals(20, result.size());
    }

    @Test
    void  evenNumbers(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,12,13,54,43,0);
        List<Integer> result = Task1.evenNumbers(list);
        assertEquals(List.of(2,4,6,8,12,54,0), result);
    }
    @Test
    void evenNumbersAssertion() {
        List<Integer> randoms = Task1.randomNumbers();
        List<Integer> result = Task1.evenNumbers(randoms);
        assertTrue(result.stream().allMatch(i->i%2==0));
        assertFalse(result.isEmpty());
    }
}
