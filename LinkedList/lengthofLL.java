public class lengthofLL {
  private static int length(Node head) {
    int c = 0;
    Node temp = head;
    while (temp != null) {
      c++;
      temp = temp.next;
    }
    return c;
  }

  public static void main(String[] args) {
    Node head = new Node(11);
    head.next = new Node(22);
    head.next.next = new Node(33);
    head.next.next.next = new Node(44);
    int count = length(head);
    System.out.println(count);
  }
}
