package tools;

import java.util.Collection;

public interface ISet<E extends Comparable<E>> {
    boolean add(E element);
    boolean addAll(Collection<E> elements);
    void clear();
    boolean contains(E element);
    boolean isEmpty();
    boolean remove(E element);
    boolean removeAll(Collection<E> elements);
    int size();
}