package com.logic.java.test;

/**
 * <pre>
 * <b>Description : </b>
 * LogicTest
 * FindTriplet.java
 *
 * @version $Revision: 1 $Date: 16:16:34 2022
 * @author dillip.das
 * </pre>
 */
public class FindTriplet {

  public static void main(String ar[]) {
    int numbers[] = {0, -1, 2, -3, 1};
    int sum = -2;
    findTriplet(numbers, sum);
  }

  private static void findTriplet(final int[] numbers, final int sum) {

    final int arrlength = numbers.length;

    if (arrlength < 3) {
      System.out.print("To find triplet we need atleat 3 numbers");
    }

    for (int i = 0; i < arrlength - 2; i++) {

      for (int j = i + 1; j < arrlength - 1; j++) {

        for (int k = j + 1; k < arrlength; k++) {

          if (numbers[i] + numbers[j] + numbers[k] == sum) {
            System.out.print("Triplet is " + numbers[i] + ", " + numbers[j] + ", " + numbers[k] + "\n");
          }
        }

      }
    }
  }

}
/*Here the time complexity is O(n3) and space complexity is constant means O(1)*/
