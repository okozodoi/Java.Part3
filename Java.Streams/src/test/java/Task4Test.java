import org.example.Task1;
import org.example.Task4;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4Test {
    @Test
    void generateOneListOutOfThree(){
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);

        assertEquals(List.of(1,2,3,4,5,6,7,8,9), Task4.generateOneIntegerList(list1,list2,list3));
    }

    @Test
    void generateOneListOutOfStringArray() {
        String[][] dataArray = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};

        assertEquals(List.of("a", "b", "c","d","e","f","g","h"), Task4.generateOneStringList(dataArray));
    }

    @Test
    void removeDuplicates() {
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7));

        assertEquals(List.of(1,2,3,4,5,6,7), Task4.removeDuplicates(numbersList));
    }

    @Test
    void listToMap() {
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7));

        assertEquals(Map.of(1,2L,2,1L,3,3L,4,1L,5,1L,6,3L,7,1L),
                Task4.listToMap(numbersList));
    }
}
