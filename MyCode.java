import java.io.*;

// Write a recursive function which reverses a String. Use TDD.
class MyCode {
  
  public static void main (String[] args) {
    System.out.println("TDD Empty = " + testReverseTextEmptyString());
    System.out.println("TDD 1 Char = " + testReverseText1Char());
    System.out.println("TDD 2 Chars = " + testReverseText2Chars());
    System.out.println("TDD 3 Chars = " + testReverseText3Chars());
    System.out.println("TDD +3 Chars = " + testReverseText3Plus());
  }
  
  private static String reverseText(String test){
    if(test.length() < 2 ){
      return test; 
    } else{      
      return test.charAt(test.length() - 1) + reverseText(test.substring(0, test.length() - 1));    
    }
  }
  
  private static boolean testReverseTextEmptyString(){
    return "".equals(reverseText(""));
  }

  private static boolean testReverseText1Char(){
    return "1".equals(reverseText("1"));
  }
  
  private static boolean testReverseText2Chars(){
    return "21".equals(reverseText("12"));
  }
  
  private static boolean testReverseText3Chars(){
    return "321".equals(reverseText("123"));
  }

  private static boolean testReverseText3Plus(){
    return "): txeT esreveR".equals(reverseText("Reverse Text :)"));
  }
  
}
