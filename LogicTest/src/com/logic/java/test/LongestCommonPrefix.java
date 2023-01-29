package com.logic.java.test;

/**
 * <pre>
 * <b>Description : </b>
 * LogicTest
 * LongestCommonPrefix.java
 *
 * @version $Revision: 1 $Date: 23:51:26 2022
 * @author dillip.das
 * </pre>
 */
public class LongestCommonPrefix {

  public static void main(String ar[]) {
    final String wordArr[] = {"flower","flow","flight"};
    final String smallestWord = getSmallestWord(wordArr);

    System.out.println(longestCommonPrefix(wordArr, smallestWord));
  }

  /*A Function that returns the longest common prefix
  from the array of strings*/
  private static String longestCommonPrefix(final String[] wordArr, final String smallestWord) {
    String result = "";
    char current = 0;

    for (int i = 0; i < smallestWord.length(); i++) {

      //Assign first character of smallest word as current value.
      current = smallestWord.charAt(i);

      for (int j = 0; j < wordArr.length; j++) {

        if (wordArr[j].charAt(i) != current) {
          return result;
        }
      }
      result += current;
    }

    return result;
  }

  private static String getSmallestWord(final String[] wordArr) {
    /*Consider first string of array as smallest word.*/
    String smallWord = wordArr[0];
    /*Compare first string with others in the array and find the actual smallest word */
    for (int i = 1; i < wordArr.length; i++) {
      if (wordArr[i].length() < smallWord.length()) {
        smallWord = wordArr[i];
      }
    }
    return smallWord;
  }

}



/*public class Main {
  public static void main(String[] args) {
      //{"flower","flow","flight"} == output = "fl"
      String[] s = {"flower","flow","float"};
      System.out.println(prefix(s));
  }
  public static String prefix(String[] s){
      if (s.length == 0) return "No data";
      String prefix = s[0]; // flower
      for (int i = 1; i < s.length; i++){
          prefix = prefixHelper(prefix, s[i]); // flow flight
      }
      return prefix;
  }
  public static String prefixHelper(String a, String b){
      int min = Math.min(a.length(),b.length());
      StringBuilder sb = new StringBuilder();
      for (int i =  0; i < min; i++){
          if (a.charAt(i) == b.charAt(i)){
              sb.append(a.charAt(i));
          } else {
              break;
          }
      }
      return sb.toString();
  }
}*/
