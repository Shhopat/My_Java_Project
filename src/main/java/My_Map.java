import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class My_Map<K, V> implements Iterable {
    private Object[] keys;
    private Object[] values;
    private int size;
    private int length = 10;

    public My_Map() {
        keys = new Object[length];
        values = new Object[length];
        size = 0;
    }

    public void add(K key, V value) {
        keys[size] = key;
        values[size] = value;
        ++size;
        if (size == length) {
            increase_Arrays();
        }

    }

    public int indexOfKey(K key) {
        int index;
        for (int i = 0; i <= size; i++) {
            if (keys[i] == key) {
                index = i;
                return index;
            }
        }
        return 0;
    }

    public V getValue(K key) {
        return (V) values[indexOfKey(key)];
    }

    public int size() {
        return size;
    }

    private void increase_Arrays() {
        if (size == length) {
            length = length * 2;
            //know a new length of new massive
            Object[] keys = new Object[length];
            Object[] values = new Object[length];
            for (int i = 0; i < size; i++) {
                keys[i] = this.keys[i];
                values[i] = this.values[i];
            }
            this.keys = keys;
            this.values = values;
            //create a new two massive
            // send it all the date from old massive


        }
    }


    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Iterable.super.spliterator();
    }
}
