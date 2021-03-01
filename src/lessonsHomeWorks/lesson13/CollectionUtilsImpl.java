package lessons.lesson13;

import java.util.Collection;
import java.util.Set;

public class CollectionUtilsImpl implements CollectionUtils {

    @Override
    /**
     * Объединение двух коллекций с дубликатами
     *
     * @param a первая коллекция
     * @param b вторая коллекция
     * @return новая колекция содержащая объединение a и b, может содержать дубликаты
     * @throws NullPointerException если a или b == null
     */
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {


        return null;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }
}