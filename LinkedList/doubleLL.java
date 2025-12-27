// package LinkedList;

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

// public class doubleLL {
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

// // delete head
// private static Node deleteHead(Node head) {
// if (head == null || head.next == null)
// return null;
// Node prev = head;
// head = head.next;
// prev.next = null;
// head.prev = null;
// return head;

// }

// // private static Node deleteTail(Node head) {
// // if (head == null || head.next == null)
// // return null;
// // Node temp = head;
// // while (temp.next != null) {
// // if (temp.next.next == null) {
// // Node prev = temp.next;

// // temp.next = null;
// // prev.prev = null;
// // break;
// // }
// // temp = temp.next;
// // }

// // return head;

// // }

// private static Node deletetail2(Node head) {
// if (head == null || head.next == null)
// return null;
// Node tail = head;
// while (tail.next != null) {
// tail = tail.next;
// }
// Node newtail = tail.prev;
// tail.prev = null;
// newtail.next = null;
// return head;
// }

// // delete kth node
// private static Node deletekthNode(Node head, int k) {
// int c = 0;
// Node temp = head;
// while (temp != null) {
// c++;
// if (c == k)
// break;
// temp = temp.next;
// }
// Node back = temp.prev;
// Node front = temp.next;
// if (back == null && front == null)
// return null; // only 1 element
// if (back == null) { // head
// return deleteHead(head);

// } else if (front == null) { // tail
// return deletetail2(head);
// } else {
// back.next = front;
// front.prev = back;
// temp.next = null;
// temp.prev = null;
// }
// return head;

// }

// // delete given node except head
// private static void deleteNode(Node node) {
// Node temp = node;
// Node back = temp.prev;
// Node front = temp.next;
// if (front == null) {
// back.next = null;
// temp.prev = null;
// } else {
// back.next = front;
// front.prev = back;
// temp.next = temp.prev = null;
// }

// }

// // insert at before head pos
// private static Node insertbeforeHead(Node head, int val) {
// Node newhead = new Node(val, head, null);
// head.prev = newhead;
// return newhead;
// }

// // insert at after tail
// private static Node insertaftertail(Node head, int val) {
// Node temp = head;
// while (temp.next != null)
// temp = temp.next;
// Node newtail = new Node(val, null, temp);
// temp.next = newtail;
// return head;
// }

// // insert before tail
// private static Node insertbeforetail(Node head, int val) {
// Node temp = head;
// if (head.next == null)
// return insertbeforeHead(head, val);
// while (temp.next != null)
// temp = temp.next;
// Node back = temp.prev;
// Node newnode = new Node(val, temp, back);
// temp.prev = newnode;

// back.next = newnode;
// return head;

// }

// // insert before kth position
// private static Node insertbeforekthpos(Node head, int k, int val) {
// Node temp = head;
// int c = 0;
// while (temp.next != null) {
// c++;
// if (c == k)
// break;

// temp = temp.next;
// }

// Node back = temp.prev;

// if (back == null)
// return insertbeforeHead(head, val);
// else {
// Node newnode = new Node(val, temp, back);
// back.next = newnode;
// temp.prev = newnode;

// }
// return head;

// }

// // insert before the given node except head
// private static void insertbeforekthnode(Node node, int val) {
// Node back = node.prev;
// Node newnode = new Node(val, node, back);
// back.next = newnode;
// node.prev = newnode;

// }

// public static void main(String[] args) {
// int a[] = { 1, 2, 90, 76, 34, 65 };
// Node ne = arr2DLL(a);
// // deleteNode(ne.next);
// insertbeforekthnode(ne.next.next.next.next, 99);
// print(ne);

// }
// }
