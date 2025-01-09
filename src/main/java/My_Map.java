import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.SubstituteLoggerFactory;


import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class My_Map<K, V> implements Iterable {
    private final Logger logger = LoggerFactory.getLogger(My_Map.class);
    private Object[] keys;
    private Object[] values;
    private int size;
    private int length = 10;


    public My_Map() {
        keys = new Object[length];
        values = new Object[length];
        size = 0;
        logger.debug("field initialization");
    }

    public void add(K key, V value) {
        if (key == null || value == null){
            throw new NullPointerException();
        }
        keys[size] = key;
        values[size] = value;
        ++size;
        if (size == length) {
            increase_Arrays();
            logger.debug("increased the array");
        }

    }


    public int indexOfKey(K key) {
        int index;
        for (int i = 0; i < size; i++) {
            if (keys[i] == key) {
                index = i;
                return index;
            }
        }
        return -1;
    }

    public V getValue(K key) {
        logger.warn("it will be able mistake here in getValue");
        return (V) values[indexOfKey(key)];

    }

    public void addAll(My_Map<K, V> map) {
        for (int i = 0; i < map.size(); i++) {
            add(map.getKey(i), map.getValue(map.getKey(i)) );
        }



    }

    public K getKey(V value) {
        if (value == null){
            throw new NullPointerException();
        }
        for (int i = 0; i < size; i++) {
            if (values[i] == value) {
                return (K) keys[i];
            }
        }
        return null;

    }

    public K getKey(int index) {
        logger.debug("get the Key with help to index");
        return (K) keys[index];
    }

    public boolean contains(K key, V value) {
        if (key == null || value == null){
            throw new NullPointerException();
        }
        if (getKey(value) == key && getValue(key) == value) {
            return true;
        } else return false;
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
    public String toString() {
        if (keys[0] == null && values[0] == null) {
            return "My_Map { }";
        }
        StringBuilder stringBuilder = new StringBuilder("My_Map {");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(" " + keys[i] + ":" + values[i] + ",");
        }
        stringBuilder.replace(stringBuilder.length() - 1, stringBuilder.length(), " }");
        return stringBuilder.toString();
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



