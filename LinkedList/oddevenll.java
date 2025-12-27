// package LinkedList;

// class Node {
// int data;
// Node next;

// public Node(int data, Node next) {
// this.data = data;
// this.next = next;
// }

// public Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public class oddevenll {

// public static Node array2ll(int[] a) {
// Node head = new Node(a[0]);
// Node ptr = head;
// for (int i = 1; i < a.length; i++) {
// Node temp = new Node(a[i]);
// ptr.next = temp;
// ptr = temp;

// }
// return head;
// }

// private static void traver(Node head) {
// Node temp = head;
// while (temp != null) {
// System.out.println(temp.data);
// temp = temp.next;
// }

// }

// private static Node oddevenusingarray(Node head) {
// if (head == null || head.next == null)
// return head;
// Node temp = head;
// ArrayList<Integer> a = new ArrayList<>();
// while (temp != null && temp.next != null) {
// a.add(temp.data);
// temp = temp.next.next;
// }
// if (temp != null)
// a.add(temp.data);
// temp = head.next;
// while (temp != null && temp.next != null) {
// a.add(temp.data);
// temp = temp.next.next;
// }
// if (temp != null)
// a.add(temp.data);
// temp = head;
// int i = 0;
// while (temp != null) {
// temp.data = a.get(i);
// i++;
// temp = temp.next;
// }
// return head;

// }

// private static Node oddeven(Node head) {
// if (head == null || head.next == null)
// return head;
// Node temp = head.next;
// Node odd = head;
// Node even = head.next;
// while (even != null && even.next != null) {
// odd.next = odd.next.next;
// even.next = even.next.next;
// odd = odd.next;
// even = even.next;
// }
// odd.next = temp;

// return head;
// }

// public static void main(String[] args) {
// int a[] = { 1, 2, 3, 4, 5, 6, 7 };
// Node ne = array2ll(a);
// ne = oddeven(ne);
// traver(ne);

// }
// }
