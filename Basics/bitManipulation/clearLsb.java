// package Basics.bitManipulation;

// public class clearLsb {
// public static void main(String[] args) {
// printBits(53);
// int res1 = clearLSB(53, 4);
// printBits(res1);
// }

// public static void printBits(int num) {
// for (int i = 7; i >= 0; i--) {
// System.out.print((num >> i) & 1);
// }
// System.out.println();
// }

// public static int clearLSB(int num, int bit) {
// return num & ~((1 << bit + 1) - 1);
// }

// }
