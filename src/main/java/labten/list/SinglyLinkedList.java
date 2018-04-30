package labten.list;


public class SinglyLinkedList<E> implements Cloneable {

  /**
   * The Node of a singly linked list, which stores a reference to its
   * element and to the subsequent node in the list (or null if this
   * is the last node).
   */
  private static class Node<E> {

    /** The element stored at this node. */
    private E element;

    /** A reference to the subsequent node in the list. */
    private Node<E> next;

    /**
     * Creates a node with the given element and next node.
     *
     * @param element the element to be stored
     * @param next reference to a node that should follow the new node
     */
    public Node(E element, Node<E> next) {
      this.element = element;
      this.next = next;
    }

    /**
     * Returns the element stored at the node.
     * @return the element stored at the node
     */
    public E getElement() {
      return element;
    }

    /**
     * Returns the node that follows this one (or null if no such node).
     * @return the following node
     */
    public Node<E> getNext() {
      return next;
    }

    /**
     * Sets the node's next reference to point to Node next.j
     * @param next the node that should follow this one
     */
    public void setNext(Node<E> next) {
      this.next = next;
    }
  }

  /** The head node of the list. */
  private Node<E> head;

  /** The last node of the list. */
  private Node<E> tail;

  /** Number of nodes in the list. */
  private int size;

  /** Constructs an initially empty list. */
  public SinglyLinkedList() {
    head = null;
    tail = null;
    size = 0;
  }

  /**
   * Returns the number of elements in the linked list.
   * @return number of elements in the linked list
   */
  public int getSize() {
    return size;
  }

  /**
   * Checks to see if the linked list is empty.
   * @return true if the linked list is empty, false otherwise
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * Returns (but does not remove) the first element of the list.
   * @return element at the front of the list (or null if empty)
   */
  public E getFirst() {
    if (isEmpty()) {
      return null;
    }
    return head.getElement();
  }

  /**
   * Returns (but does not remove) the last element of the list.
   * @return element at the end of the list (or null if empty)
   */
  public E getLast() {
    if (isEmpty()) {
      return null;
    }
    return tail.getElement();
  }

  /**
   * Adds an element to the front of the list.
   * @param element the new element to add
   */
  public void addFirst(E element) {
    head = new Node<>(element, head);
    if (size == 0) {
      tail = head;
    }
    size++;
  }

  /**
   * Adds an element to the end of the list.
   * @param element the new element to add
   */
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

  /**
   * Removes and returns the first element of the list.
   * @return the removed element (or null if empty)
   */
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

  /**
   * Determine if "this" SinglyLinkedList is the same as another provided list.
   * @return boolean is true if the contents are same, otherrwise false
   */
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

  /**
   * Clone a SinglyLinkedList by walking through the list of nodes.
   * @return a cloned version of the current instance of SinglyLinkedList
   */
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

  /**
   * Produces a hashCode (i.e., a unique number) of the SinglyLinkedList.
   * @return the unique numerical value for this instance of SinglyLinkedList
   */
  public int hashCode() {
    int hashCodeValue = 0;
    for (Node<?> walk = head; walk != null; walk = walk.getNext()) {
      hashCodeValue ^= walk.getElement().hashCode();
      hashCodeValue = (hashCodeValue << 5) | (hashCodeValue >>> 27);
    }
    return hashCodeValue;
  }

  /**
   * Produces a string representation of the contents of the list.
   * @return the textual representation of the SinglyLinkedList
   */
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
