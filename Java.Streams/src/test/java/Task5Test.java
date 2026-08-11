import org.example.Task5;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task5Test {
    @Test
    void checkForOnlyLetters() {
        Map<String, List<String>> people = Task5.returnPeople();
        List<String> result = Task5.returnOnlyLetters(people);
        assertTrue(result.stream().allMatch(s->s.matches("[a-zA-Z]")));
    }
}
