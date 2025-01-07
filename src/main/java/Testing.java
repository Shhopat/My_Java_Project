public class Testing {
    public static void main(String[] args) {
        My_Map<Integer,String> myMap = new My_Map<>();
        myMap.add(1,"третий");
        myMap.add(2,"третий");
        myMap.add(3,"третий");
        myMap.add(4,"третий");
        myMap.add(5,"третий");
        myMap.add(6,"третий");
        myMap.add(7,"третий");
        myMap.add(6,"третий");
        myMap.add(6,"третий");
        System.out.println(myMap.indexOfKey(5));
    }
}
