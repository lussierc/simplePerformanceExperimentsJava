package labten.list;

public class SinglyLinkedList<E> implements Cloneable {

  private static class Node<E> {

    private E element;

    private Node<E> next;

    public Node(E element, Node<E> next) {
      this.element = element;
      this.next = next;
    }

    public E getElement() {
      return element;
    }


    public Node<E> getNext() {
      return next;
    }

    public void setNext(Node<E> next) {
      this.next = next;
    }
  }

  private Node<E> head;

  private Node<E> tail;

  private int size;

  public SinglyLinkedList() {
    head = null;
    tail = null;
    size = 0;
  }

  public int getSize() {
    return size;
  }


  public boolean isEmpty() {
    return size == 0;
  }

  public E getFirst() {
    if (isEmpty()) {
      return null;
    }
    return head.getElement();
  }


  public E getLast() {
    if (isEmpty()) {
      return null;
    }
    return tail.getElement();
  }

  public void addFirst(E element) {
    head = new Node<>(element, head);
    if (size == 0) {
      tail = head;
    }
    size++;
  }


  public void addLast(E element) {
    Node<E> newest = new Node<>(element, null);
    if (isEmpty()) {
      head = newest;
    } else {
      tail.setNext(newest);
    }
    tail = newest;
    size++;
  }


  public E removeFirst() {
    if (isEmpty()) {
      return null;
    }
    final E answer = head.getElement();
    head = head.getNext();
    size--;
    if (size == 0) {
      tail = null;
    }
    return answer;
  }

  @SuppressWarnings({"unchecked"})
  public boolean equals(Object list) {
    if (list == null) {
      return false;
    }
    if (getClass() != list.getClass()) {
      return false;
    }
    SinglyLinkedList<?> other = (SinglyLinkedList)list;
    if (size != other.size) {
      return false;
    }
    Node<?> walkA = head;
    Node<?> walkB = other.head;
    while (walkA != null) {
      if (!walkA.getElement().equals(walkB.getElement())) {
        return false;
      }
      walkA = walkA.getNext();
      walkB = walkB.getNext();
    }
    return true;
  }

  @SuppressWarnings({"unchecked"})
  public SinglyLinkedList<E> clone() throws CloneNotSupportedException {
    // always use inherited Object.clone() to create the initial copy
    SinglyLinkedList<E> other = (SinglyLinkedList<E>)super.clone();
    if (size > 0) {
      other.head = new Node<>(head.getElement(), null);
      Node<E> walk = head.getNext();
      Node<E> otherTail = other.head;
      while (walk != null) {
        Node<E> newest = new Node<>(walk.getElement(), null);
        otherTail.setNext(newest);
        otherTail = newest;
        walk = walk.getNext();
      }
    }
    return other;
  }

  public int hashCode() {
    int hashCodeValue = 0;
    for (Node<?> walk = head; walk != null; walk = walk.getNext()) {
      hashCodeValue ^= walk.getElement().hashCode();
      hashCodeValue = (hashCodeValue << 5) | (hashCodeValue >>> 27);
    }
    return hashCodeValue;
  }


  public String toString() {
    StringBuilder sb = new StringBuilder("(");
    Node<E> walk = head;
    while (walk != null) {
      sb.append(walk.getElement());
      if (walk != tail) {
        sb.append(", ");
      }
      walk = walk.getNext();
    }
    sb.append(")");
    return sb.toString();
  }

}
