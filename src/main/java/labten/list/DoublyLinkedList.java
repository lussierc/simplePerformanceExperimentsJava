package labten.list;


public class DoublyLinkedList<E> {

  /**
   * Node of a doubly linked list, which stores a reference to its
   * element and to both the previous and next node in the list.
   */
  private static class Node<E> {

    /** The element stored at this node. */
    private E element;

    /** A reference to the preceding node in the list. */
    private Node<E> prev;

    /** A reference to the subsequent node in the list. */
    private Node<E> next;

    /**
     * Creates a node with the given element and next node.
     *
     * @param element the element to be stored
     * @param previous reference to a node that should precede the new node
     * @param next reference to a node that should follow the new node
     */
    public Node(E element, Node<E> previous, Node<E> next) {
      this.element = element;
      this.prev = previous;
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
     * Returns the node that precedes this one (or null if no such node).
     * @return the preceding node
     */
    public Node<E> getPrev() {
      return prev;
    }

    /**
     * Returns the node that follows this one (or null if no such node).
     * @return the following node
     */
    public Node<E> getNext() {
      return next;
    }

    /**
     * Sets the node's previous reference to point to Node previous.
     * @param previous the node that should precede this one
     */
    public void setPrev(Node<E> previous) {
      this.prev = previous;
    }

    /**
     * Sets the node's next reference to point to Node next.
     * @param next the node that should follow this one
     */
    public void setNext(Node<E> next) {
      this.next = next;
    }
  }

  /** Sentinel node at the beginning of the list. */
  private Node<E> header;

  /** Sentinel node at the end of the list. */
  private Node<E> trailer;

  /** Number of elements in the list (not including sentinels). */
  private int size = 0;

  /** Constructs a new empty list. */
  public DoublyLinkedList() {
    header = new Node<>(null, null, null);
    trailer = new Node<>(null, header, null);
    header.setNext(trailer);
  }

  /**
   * Returns the number of elements in the linked list.
   * @return number of elements in the linked list
   */
  public int getSize() {
    return size;
  }

  /**
   * Tests whether the linked list is empty.
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
    return header.getNext().getElement();
  }

  /**
   * Returns (but does not remove) the last element of the list.
   * @return element at the end of the list (or null if empty)
   */
  public E getLast() {
    if (isEmpty()) {
      return null;
    }
    return trailer.getPrev().getElement();
  }

  /**
   * Adds an element to the front of the list.
   * @param element the new element to add
   */
  public void addFirst(E element) {
    addBetween(element, header, header.getNext());
  }

  /**
   * Adds an element to the end of the list.
   * @param element the new element to add
   */
  public void addLast(E element) {
    addBetween(element, trailer.getPrev(), trailer);
  }

  /**
   * Removes and returns the first element of the list.
   * @return the removed element (or null if empty)
   */
  public E removeFirst() {
    if (isEmpty()) {
      return null;
    }
    return remove(header.getNext());
  }

  /**
   * Removes and returns the last element of the list.
   * @return the removed element (or null if empty)
   */
  public E removeLast() {
    if (isEmpty()) {
      return null;
    }
    return remove(trailer.getPrev());
  }

  /**
   * Adds an element to the linked list in between the given nodes.
   * The given predecessor and successor should be neighboring each
   * other prior to the call.
   *
   * @param predecessor node just before the location where the new element is inserted
   * @param successor node just after the location where the new element is inserted
   */
  private void addBetween(E element, Node<E> predecessor, Node<E> successor) {
    Node<E> newest = new Node<>(element, predecessor, successor);
    predecessor.setNext(newest);
    successor.setPrev(newest);
    size++;
  }

  /**
   * Removes the given node from the list and returns its element.
   * @param node the node to be removed (must not be a sentinel)
   */
  private E remove(Node<E> node) {
    Node<E> predecessor = node.getPrev();
    Node<E> successor = node.getNext();
    predecessor.setNext(successor);
    successor.setPrev(predecessor);
    size--;
    return node.getElement();
  }

  /**
   * Determine if "this" DoublyLinkedList is the same as another provided list.
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
    DoublyLinkedList<?> other = (DoublyLinkedList) list;
    if (size != other.size) {
      return false;
    }
    Node<?> walkA = header.getNext();
    Node<?> walkB = other.header.getNext();
    for (int i = 0; i < size; i++) {
      if (!walkA.getElement().equals(walkB.getElement())) {
        return false;
      }
      walkA = walkA.getNext();
      walkB = walkB.getNext();
    }
    return true;
  }

  /**
   * Produces a string representation of the contents of the list.
   * This exists for debugging purposes only.
   */
  public String toString() {
    StringBuilder sb = new StringBuilder("(");
    Node<E> walk = header.getNext();
    while (walk != trailer) {
      sb.append(walk.getElement());
      walk = walk.getNext();
      if (walk != trailer) {
        sb.append(", ");
      }
    }
    sb.append(")");
    return sb.toString();
  }
}
