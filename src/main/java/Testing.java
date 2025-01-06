public class Testing {
    public static void main(String[] args) {
        My_Map<Integer,String> myMap = new My_Map<>();
        myMap.add(3,"третий");
        myMap.add(3,"третий");
        System.out.println(myMap.size());
    }
}
