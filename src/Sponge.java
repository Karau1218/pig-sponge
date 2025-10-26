public class Sponge {

  /*
   * Create a method "spongeCase" that takes a string consisting of one or more words 
   * separated by spaces. It should return a new string converted to "sponge 
   * case," where each word starts with a lowercase letter, and then alternates 
   * between upper and lower case for each following letter in the word.
   *
   * Examples:
   *
   * spongeCase("spongebob")  should return "sPoNgEbOb"
   * spongeCase("Who are YOU calling A Pinhead")  should return "wHo aRe yOu cAlLiNg a pInHeAd"
   * spongeCase("WHAT is UP my dude")  should return "wHaT iS uP mY dUdE"
   * spongeCase("debí tirar más fotos") should return dEbÍ tIrAr mÁs fOtOs" (note the accents)
   * spongeCase("E")  should return "e"
   * spongeCase("e")  should return "e"
   * 
   * Hints:
   * There exist the following methods in java:
   * Character.toUpperCase() (e.g. Character.toUpperCase('f'))
   * Character.toLowerCase() (e.g. Character.toLowerCase('Q'))
   * .toCharArray() String method (e.g. myString.toCharArray())
   */
  public static void main(String[] args) {
    // Test cases
    assertEqual(1, spongeCase("spongebob"), "sPoNgEbOb");
    assertEqual(2, spongeCase("Who are YOU calling A Pinhead"), "wHo aRe yOu cAlLiNg a pInHeAd");
    assertEqual(3, spongeCase("WHAT is UP my dude"), "wHaT iS uP mY dUdE");
    assertEqual(4, spongeCase("debí tirar más fotos"), "dEbÍ tIrAr mÁs fOtOs");
    assertEqual(5, spongeCase("E"), "e");
    assertEqual(6, spongeCase("e"), "e");
  }

  // Implement your solution here!
public static String spongeCase(String sentence) {
   // split the sentence into separate words
    String[] words = sentence.split(" ");
  // this is for storing the final result of the new spongeCase
    StringBuilder result = new StringBuilder();

    // for looping through each individual word from the string words array
    for (String word : words) {
      // this stores the spongecase version of the single words
        StringBuilder newWord = new StringBuilder();
        //makes sure the letters are lowercase
        boolean toUpper = false;
      //looping through each character
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
          //makes ro upper upper or lowercase
            if (toUpper) {
                newWord.append(Character.toUpperCase(c));
            } else {
                newWord.append(Character.toLowerCase(c));
            }
            // flips the values of the toupper --> false becomes true then vise versa
            toUpper = !toUpper;
        }
          // adds space to the new word
        result.append(newWord).append(" ");
    }
        // makes stringbuilder a regualr string and 
        // takes off extra space
    return result.toString().trim();
}


  // Method to help with testing, you do not need to read this.
  public static void assertEqual(int testNumber, String actual, String expected) {
    if (!expected.equals(actual)) {
      System.out.println("Test " + testNumber + " failed! Expected: '" + expected + "', but got: '" + actual + "'");
    } else {
      System.out.println("Test " + testNumber + " passed!");
    }
  }
}