package collection_sendiri;

import java.util.*;

public class SingelQueue<E> extends AbstractQueue<E> {
    private E data;

    @Override
    public Iterator<E> iterator() {
        return Collections.singleton(data).iterator();
    }

    @Override
    public int size() {
        return data == null ? 0 : 1;
    }

    @Override
    public boolean offer(E e) {
        if(data == null) {
            data = e;
            return true;
        }
        return false;
    }

    @Override
    public E poll() {
        E temp = data;
        data = null;
        return temp;
    }

    @Override
    public E peek() {
        return data;
    }
}
