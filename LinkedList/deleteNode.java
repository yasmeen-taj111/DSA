public class deleteNode {

  private static Node deleteHead(Node head) {
    if (head == null)
      return head;
    head = head.next;
    return head;

  }

  private static Node deleteTail(Node head) {
    if (head.next == null || head == null) {
      return null;
    }
    Node temp = head;
    while (temp.next.next != null)
      temp = temp.next;

    temp.next = null;

    return head;
  }

  private static Node removeKElement(Node head, int k) {
    if (head == null)
      return null;

    if (k == 1) {
      head = head.next;
      return head;
    }
    int c = 0;
    Node temp = head;
    Node prev = null;
    while (temp != null) {
      c++;
      if (c == k) {
        prev.next = prev.next.next;
        break;
      }
      prev = temp;

      temp = temp.next;

    }

    return head;

  }

  private static Node deleteByValue(Node head, int k) {
    if (head == null)
      return null;
    if (k == head.data) {
      head = head.next;
      return head;
    }

    Node temp = head;
    Node prev = null;
    while (temp != null) {

      if (temp.data == k) {
        prev.next = prev.next.next;
        break;
      }
      prev = temp;
      temp = temp.next;
    }
    return head;
  }

}
