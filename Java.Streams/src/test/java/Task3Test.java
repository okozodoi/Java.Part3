import org.example.Task3;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Task3Test {
    @Test
    void checkForLowercasedNamesStartingWithAAndLongerThanFive() {
        List<String> memberNames = Task3.memberNames();
        List<String> filteredMemberNames = Task3.aWordsWithLengthFive(memberNames);
        assertTrue(filteredMemberNames.stream().allMatch(s->s.startsWith("a")&&s.length()>5));
    }

    @Test
    void memberNames_allMatchContainsS_isFalse() {
        List<String> memberNames = Task3.memberNames();
        assertFalse(memberNames.stream().allMatch(s->s.toLowerCase().contains("s")));
    }

    @Test
    void memberNames_anyMatchContainsS_isTrue() {
        List<String> memberNames = Task3.memberNames();
        assertTrue(memberNames.stream().anyMatch(s->s.toLowerCase().contains("s")));
    }

    @Test
    void memberNames_noneMatchStartsWithH_isTrue() {
        List<String> memberNames = Task3.memberNames();
        assertTrue(memberNames.stream().noneMatch(s->s.contains("H")));
    }

    @Test
    void countsNamesStartingWithA() {
        List<String> memberNames = Task3.memberNames();
        assertEquals(3, Task3.countWords(memberNames, "A"));
    }

    @Test
    void findsFirstNameStartingWithL() {
        List<String> memberNames = Task3.memberNames();
        assertEquals("Lokesh", Task3.firstName(memberNames, "L"));
    }
}
