class Node {
  int data;
  Node next;

  public Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }

  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class basics {
  private static Node array2LL(int[] a) {
    Node head = new Node(a[0]);
    Node nextptr = head;
    for (int i = 1; i < a.length; i++) {
      Node temp = new Node(a[i]);
      nextptr.next = temp;
      nextptr = temp;
    }
    return head;
  }

  private static void printLinkedList(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }

  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6 };
    Node head = array2LL(arr);
    printLinkedList(head);
  }

}
