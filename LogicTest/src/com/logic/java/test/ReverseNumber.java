/*
 * This code contains copyright information which is the proprietary property
 * of Apple Inc. No part of this code may be reproduced, stored or transmitted in any form without the prior
 * written permission of Apple Inc.
 *
 * Copyright (C) Apple Inc Information Network Computing Limited 2022-2023.
 * All rights reserved.
 */
package com.logic.java.test;

/**
 * <pre>
 * <b>Description : </b>
 * LogicTest
 * ReverseNumber.java
 *
 * @version $Revision: 1 $Date: 00:22:03 2022
 * @author dillip.das
 * </pre>
 */

/* Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1],
 * then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */
public class ReverseNumber {

  public static void main(String[] args) {
    int n = 12311347;
    System.out.print(reverse(n));

  }

  public static int reverse(int n) {

    int sum = 0;
    int temp = 0;

    while (n != 0) {

      int top_limit = Integer.MAX_VALUE / 10;//2147483647
      int bottom_limit = Integer.MIN_VALUE / 10;//-2147483648

      if (sum > top_limit || sum < bottom_limit) {
        return 0;
      }

      temp = n % 10;
      sum = sum * 10 + temp;
      n = n / 10;
    }
    return sum;
  }

}
