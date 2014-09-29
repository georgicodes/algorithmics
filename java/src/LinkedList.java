public class LinkedList {
  public Node head = null;

  public Node add(int data) {
    if (head == null) {
      head = new Node(data);
      return head;
    }
    Node curr = head;
    Node newN = new Node(data);
    curr.next = newN;
    head = newN;
    return head;
  }

  // 5 -> 4 -> 3 -> 2== 2 -> 3 -> 4 ->5
  // Approach
  // In loop, change next to prev, prev to current and current to next.
  //
  public void reverse() {

  }
}
