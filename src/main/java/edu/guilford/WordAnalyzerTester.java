package edu.guilford;

public class WordAnalyzerTester {
   public static void main(String[] args) {
      wordTest1("aardvark"); // expect: a
      wordTest1("roommate"); // expect: o (not m)
      wordTest1("mate"); // expect: 0 (no duplicate letters)
      wordTest1("test"); // expect: 0 (the t isn't repeating)

      wordTest2("missisippi"); // expect: i (not m or s)
      wordTest2("mate"); // expect: 0 (no duplicate letters)
      wordTest2("test"); // expect: t

      wordTest3("mississippiii"); // expect: 4 (ss, ss, pp, iii)
      wordTest3("test"); // expect: 0 (no repeated letters)
      wordTest3("aabbcdaaaabb"); // expect: 4 (aa, bb, aaaa, bb)

   }

   public static void wordTest1(String s) {
      WordAnalyzer wa = new WordAnalyzer(s);
      char result = wa.firstRepeatedCharacter();
      if (result == 0)
         System.out.println("No repeated character.");
      else
         System.out.println("First repeated character = " + result);
   }

   public static void wordTest2(String s) {
      WordAnalyzer wa = new WordAnalyzer(s);
      char result = wa.firstMultipleCharacter();
      if (result == 0)
         System.out.println("No multiple character.");
      else
         System.out.println("First multiple character = " + result);
   }

   public static void wordTest3(String s) {
      WordAnalyzer wa = new WordAnalyzer(s);
      int result = wa.countRepeatedCharacters();
      System.out.println(result + " repeated characters.");
   }

}