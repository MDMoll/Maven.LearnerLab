package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E> {
    protected List<E> personList = new ArrayList<>();
    
    public void add(E p) {
        personList.add(p);
    }
    
    public void remove(E p) {
        personList.remove(p);
    }
    
    public void removeById(Long id) {
        remove(getById(id));
    }
    
    public int count() {
        return personList.size();
    }
    
    public E getById(Long id) {
        for (E p : personList) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
    
    public Boolean contains(E p) {
        return personList.contains(p);
    }
    
    abstract public E[] toArray();
    
    public void removeAll() {
        personList.clear();
    }
    
    @Override
    public Iterator<E> iterator() {
        return personList.iterator();
    }
}
