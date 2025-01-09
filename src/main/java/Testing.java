import java.util.*;

public class Testing {
    public static void main(String[] args) {
        My_Map<Integer, String> myMap = new My_Map<>();
        myMap.add(3, "третий");
        myMap.add(3, "третий");
        System.out.println(myMap);

        My_Map<Integer,String > myMap1 = new My_Map<>();
        myMap1.add(1,"one");
        System.out.println(myMap1);
        myMap1.addAll(myMap);
        System.out.println(myMap1);
    }

}
