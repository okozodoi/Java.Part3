import org.example.Task3;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Task3Test {
    @Test
    void wordsStartOnLetterAndHaveLength() {
        List<String> memberNames = Task3.memberNames();
        List<String> filteredMemberNames = Task3.aWordsWithLengthFive(memberNames);
        assertTrue(filteredMemberNames.stream().allMatch(s->s.startsWith("a")&&s.length()>5));
    }

    @Test
    void memberNames_StartsWith_S_allMatch() {
        List<String> memberNames = Task3.memberNames();
        assertFalse(memberNames.stream().allMatch(s->s.startsWith("S")));
    }

    @Test
    void memberNames_StartsWith_S_anyMatch() {
        List<String> memberNames = Task3.memberNames();
        assertTrue(memberNames.stream().anyMatch(s->s.startsWith("S")));
    }

    @Test
    void memberNames_StartsWith_H_noneMatch() {
        List<String> memberNames = Task3.memberNames();
        assertTrue(memberNames.stream().noneMatch(s->s.startsWith("H")));
    }

    @Test
    void countNames() {
        List<String> memberNames = Task3.memberNames();
        assertEquals(3, Task3.countWords(memberNames, "A"));
    }

    @Test
    void returnFirstName() {
        List<String> memberNames = Task3.memberNames();
        assertEquals("Lokesh", Task3.firstName(memberNames, "L"));
    }
}
