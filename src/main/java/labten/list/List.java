package labten.list;

import java.util.Iterator;


public interface List<E> extends Iterable<E> {


  int getSize();


  boolean isEmpty();


  E get(int index) throws IndexOutOfBoundsException;

  E set(int index, E element) throws IndexOutOfBoundsException;

  void add(int index, E element) throws IndexOutOfBoundsException;

  E remove(int index) throws IndexOutOfBoundsException;

  Iterator<E> iterator();

}
