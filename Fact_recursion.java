import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Fact_recursion {
       
        public static void main(String args[]) throws NumberFormatException, IOException{
               
                System.out.println("Enter the number: ");
               
                //get input from the user
                BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
                int a = Integer.parseInt(num.readLine());
               
                //call the recursive function to generate factorial
                int result= fact(a);
               
               
                System.out.println("Factorial of the number is: " + result);
        }
       
        static int fact(int b)
        {
                if(b <= 1)
                        return 1;
                else
                        return b * fact(b-1);
        }
}