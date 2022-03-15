import java.util.Scanner;
/** this program inputs values of type double
* for x and y and solves for the result of 
* the expression given.
*
* @ Josh Molloy
* @ version 9-3-2021
*/
public class TwoVariableExpression {
   /** this function will determine the val.
   * of an expression from inputted variables,
   * and then print the results.
   *
   * @param args not used.
   */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String name = " ";
      double x = 0;
      double y = 0;
      double result = 0;
      
      //show expression being calculated
      System.out.println("result = (4.5x + 12.5) (3y - 9.0) / xy");
      
      //prompt user for x and y input
      System.out.print("\tx = ");
      x = userInput.nextDouble();
      System.out.print("\ty = ");
      y = userInput.nextDouble();
      
      //checking to see if x/y = 0
      if (x * y == 0) {
         System.out.println("result is \"undefined\"");
      }
      else {
         result = (((4.5 * x) + 12.5) * (((3 * y) - 9.0))) / (x * y);
         System.out.println("result = " + result);
      }
   }
}