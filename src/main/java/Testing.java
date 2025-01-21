import java.util.*;

public class Testing {
    public static void main(String[] args) {
        My_Map<Integer,Integer> map = new My_Map<>();
        map.add(1,1);
        map.add(2,2);
        map.add(3,3);

        for (Map.Entry<Integer,Integer> m: map){
            System.out.println(m.getKey() );
            System.out.println(m.getValue());
        }









    }

}
