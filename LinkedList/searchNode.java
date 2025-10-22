public class searchNode {
  private static void search(Node head, int val) {
    Node temp = head;
    int c = 0;
    while (temp != null) {
      if (temp.data == val) {
        System.out.println("Element exists at node " + c);
        return;
      }
      c++;
      temp = temp.next;
    }
    System.out.println("element not found");
  }

  public static void main(String[] args) {
    Node head = new Node(11);
    head.next = new Node(22);
    head.next.next = new Node(33);
    head.next.next.next = new Node(44);
    search(head, 22);
  }
}
