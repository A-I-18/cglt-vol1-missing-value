package org.codinggym.lt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    /* Enter your code here.
     * Read input from STDIN.
     * Print output to STDOUT. Your class should be named Solution. */
    Scanner scanner = new Scanner(System.in);
    int inputN = scanner.nextInt();
    List<Integer> inputValues = readIntList(scanner, inputN);
    scanner.close();

    int res = computeMissingValue(inputN, inputValues);
    System.out.println(res);
  }

  private static List<Integer> readIntList(Scanner scanner, int length) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < length-1; i++) {
      list.add(scanner.nextInt());
    }
    return list;
  }

  public static int computeMissingValue(int n, List<Integer> values) {
    List<Integer> sequence = computeSequence(n);
    sequence.removeAll(values);
    return sequence.get(0);
  }

  private static List<Integer> computeSequence(int n) {
    List<Integer> res = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      res.add(i);
    }
    return res;
  }
}
