import java.util.*;

public class Testing {
    public static void main(String[] args) {
        My_Map<Integer, Integer> map = new My_Map<>();
        map.add(1, 1);
        map.add(2,2);
        map.add(3,3);
        System.out.println(map);
        System.out.println(map.size());
        map.remove(1,1);
        System.out.println(map);
        System.out.println(map.size());
        map.add(4,4);
        System.out.println(map);
        System.out.println(map.size());






    }

}
