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

// public class sortll {
// private static Node sort012(Node head) {
// int c0 = 0, c1 = 0, c2 = 0;
// Node temp = head;
// while (temp != null) {
// if (temp.data == 0)
// c0++;
// else if (temp.data == 1)
// c1++;
// else
// c2++;
// temp = temp.next;
// }
// temp = head;
// while (temp != null) {
// if (c0 != 0) {
// temp.data = 0;
// c0--;
// } else if (c1 != 0) {
// temp.data = 1;
// c1--;
// } else {
// temp.data = 2;
// c2--;
// }
// temp = temp.next;
// }
// return head;
// }

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

// private static Node sort012Node(Node head) {
// if (head == null || head.next == null)
// return head;
// Node temp = head;
// Node zerohead = new Node(-1);
// Node onehead = new Node(-1);
// Node twohead = new Node(-1);
// Node one = onehead, two = twohead, zero = zerohead;
// while (temp != null) {
// if (temp.data == 0) {
// zero.next = temp;
// zero = zero.next;
// } else if (temp.data == 1) {
// one.next = temp;
// one = one.next;
// } else {
// two.next = temp;
// two = two.next;
// }
// temp = temp.next;
// }
// zero.next = (onehead.next != null) ? onehead.next : twohead.next;
// one.next = twohead.next;
// two.next = null;
// return zerohead.next;

// }

// public static void main(String[] args) {
// int a[] = { 1, 0, 2, 0, 0, 1, 2, 0, 1, 2, 2 };
// Node ne = array2ll(a);
// ne = sort012Node(ne);
// traver(ne);

// }
// }
