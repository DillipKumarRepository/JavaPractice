package com.logic.java.test;

import java.util.Scanner;

/**
 * <pre>
 * <b>Description : </b>
 * LogicTest
 * LengthOfLastWord.java
 *
 * @version $Revision: 1 $Date: 23:22:19 2022
 * @author dillip.das
 * </pre>
 */
public class LengthOfLastWord {

  public static void main(String ar[]) {

    try (Scanner sc = new Scanner(System.in)) {
      final String str = sc.nextLine();
      int length = findLength(str);
      System.out.println(length);
    }

  }

  private static int findLength(final String str) {
    final String arr[] = str.split(" ");
    final int length = arr[arr.length - 1].length();
    return length;
  }

}
