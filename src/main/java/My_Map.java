public class My_Map<K, V> {
    private static Object[] keys;
    private static Object[] values;
    private static int size;

    public My_Map() {
        keys = new Object[10];
        values = new Object[10];
        size = 0;
    }

    public void add(K key, V value) {
        keys[size] = key;
        values[size] = value;
        ++size;

    }

    public static int size() {
        return size;
    }

    
}
