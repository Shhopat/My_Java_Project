import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class My_MapTest {
    private static My_Map<Integer, String> myMap;

    @BeforeAll
    public static void pullAllArguments() {
        myMap = new My_Map<>();
        myMap.add(0,"null");
        myMap.add(1,"one");
        myMap.add(3,"two");
        myMap.add(4,"for");
        myMap.add(5,"five");
        myMap.add(6,"six");
        myMap.add(7,"sevan");
        myMap.add(8,"ate");
        myMap.add(9,"nine");
        myMap.add(10,"ten");
        myMap.add(11,"one one");


    }
    @Test
    public void getShouldIndex(){
        Assertions.assertEquals(7,myMap.indexOfKey(7));
    }
    @Test
    public void getShouldValueOnKey(){


       Assertions.assertEquals("one one",myMap.getValue(11));

    }

}
