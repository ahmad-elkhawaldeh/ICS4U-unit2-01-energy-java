/*
* this program reverses a string
*
* @author  Ahmad
* @version 1.0
* @since   2021-11-19
*/



/**
* Reverse a string.
*/
class Reverse {
   
    /**                                                                             
    * Reverse a string.                                                             
    */ 
    void reverseString(String string) {
        if (string == null) || (string.length() <= 1) {
             System.out.println(string);
        }
        else {
             System.out.print(string.charAt(string.length() - 1));
              reverseString(string.substring(0, string.length() - 1));
          }
  }

      /**
      * The Einstein program uses his famous equation to find the
      * energy of an inputted then determine how many kiloton bombs
      * its equivalent to.
      *
      * @param args
      *
      */                                    
      public static void main(String[] args) {
            String str = "java";                                                    
            final Reverse rs = new Reverse();
            rs.reverseString(str);
         }
 }
