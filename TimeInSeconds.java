import java.util.Scanner;
/** this program takes user input of seconds as int
* and converts them to a combination of days, hours,
* minutes, and seconds. If a negative raw time is
* entered, a response is printed.
*
* @ Josh Molloy
* @ version 9-3-2021
*/
public class TimeInSeconds {
   /** this function will take user input of time in s,
   * and convert it to days, hours, minutes, and seconds.
   *
   * @param args not used.
   */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String name = " ";
      int seconds = 1;
      int minutes = 60;
      int hours = 3600;
      int days = 86400;
      
      //gather raw time from user input
      System.out.print("Enter the raw time in seconds: ");
      seconds = userInput.nextInt();
      if (seconds < 0) {
         System.out.println("*** Time must be non-negative. ***");
      }
      else {
         System.out.println("");
         System.out.println("Time by combined days, hours, minutes, seconds: ");
         days = seconds / 86400;
         System.out.println("\tdays: " + days);
         hours = (seconds % 86400) / 3600;
         System.out.println("\thours: " + hours);
         minutes = ((seconds % 86400) % 3600) / 60;
         System.out.println("\tminutes: " + minutes);
         int outSeconds = seconds % 60;
         System.out.println("\tseconds: " + outSeconds);
         System.out.println("");
         StringBuilder sb = new StringBuilder();
         sb.append(seconds);
         sb.append(" seconds = ");
         sb.append(days);
         sb.append(" days, ");
         sb.append(hours);
         sb.append(" hours, ");
         sb.append(minutes);
         sb.append(" minutes, ");
         sb.append(outSeconds);
         sb.append(" seconds");
         System.out.println(sb.toString());
      }
   }
}