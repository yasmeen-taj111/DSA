public class insertNode {

  private static Node insertHead(Node head, int k) {
    head = new Node(k, head);
    return head;
  }

  private static Node insertTail(Node head, int val) {
    if (head == null)
      return new Node(val);
    Node temp = head;
    while (temp.next != null)
      temp = temp.next;
    Node newnNode = new Node(val);
    temp.next = newnNode;
    return head;
  }

  private static Node insertKPosition(Node head, int val, int el) {
    if (head == null) {
      if (val == 1)
        return new Node(el);
      else
        return head;
    }
    if (val == 1)
      return new Node(el, head);

    int c = 0;
    Node temp = head;
    while (temp != null) {
      c++;
      if (c == val - 1) {
        Node newn = new Node(el);
        newn.next = temp.next;
        temp.next = newn;
        break;
      }
      temp = temp.next;

    }
    return head;

  }

  // insert element before the value x
  private static Node insertByValue(Node head, int x, int el) {
    if (head == null) {
      return null;
    }
    if (head.data == x)
      return new Node(el, head);

    Node temp = head;
    while (temp.next != null) {

      if (temp.next.data == x) {
        Node newn = new Node(el);
        newn.next = temp.next;
        temp.next = newn;
        break;
      }
      temp = temp.next;

    }
    return head;

  }

  public static void main(String[] args) {
    Node head = new Node(11);
    head.next = new Node(22);
    head.next.next = new Node(33);
    head.next.next.next = new Node(44);

  }

}
