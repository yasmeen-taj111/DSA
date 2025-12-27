// package LinkedList;

// import java.util.Stack;

// class Node {
// int data;
// Node next;
// Node prev;

// public Node(int data, Node next, Node prev) {
// this.data = data;
// this.next = next;
// this.prev = prev;
// }

// public Node(int data) {
// this.data = data;
// this.next = null;
// this.prev = null;
// }
// }

// public class reverseDLL {
// private static void print(Node head) {
// Node temp = head;
// while (temp != null) {
// System.out.println(temp.data);
// temp = temp.next;
// }
// }

// private static Node arr2DLL(int[] a) {
// Node head = new Node(a[0]);
// Node prev = head;
// for (int i = 1; i < a.length; i++) {
// Node temp = new Node(a[i], null, prev);
// prev.next = temp;
// prev = temp;
// }
// return head;
// }
// //tc o(2n) sc o(n)
// private static Node reverseByStack(Node head) {
// Stack<Integer> st = new Stack<>();
// Node temp = head;
// while (temp != null) {
// st.push(temp.data);
// temp = temp.next;
// }
// temp = head;
// while (temp != null) {
// temp.data = st.peek();
// st.pop();
// temp = temp.next;
// }
// return head;
// }
// //tc o(n) sc o(1)
// private static Node reversedll(Node head) {
// if (head == null || head.next == null)
// return head;
// Node back = null;
// Node temp = head;
// while (temp != null) {
// back = temp.prev;
// temp.prev = temp.next;
// temp.next = back;
// temp = temp.prev;

// }
// return back.prev;
// }

// public static void main(String[] args) {
// int a[] = { 1, 2, 90, 76, 34, 65 };
// Node ne = arr2DLL(a);
// ne = reversedll(ne);
// print(ne);
// }
// }
