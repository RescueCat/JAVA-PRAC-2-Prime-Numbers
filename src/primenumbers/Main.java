/******************************************************************************
Prime Numbers by Jonathan Houston (05.28.2019)
Purpose:
    This program 's intent is to print prime numbers 1 to n.
Object Parameters:
    n: the amount of numbers in the set
Results:
    Print to standard out the set
Returns:
    none
Notes:
    none
    **************************************************************************/
package primenumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> primes = new ArrayList<Integer>();
   
        //Prompt for n
        System.out.println("This program will print all prime numbers 0 through"
                + " 'n', please specify 'n'.");
        System.out.print("n : ");
        int n = scan.nextInt();
        
        //Find Primes and add to list
        for(int i = 1; i <= n; i++)
        {
            for(int j = 3; j <= i; j++)
            {
                if((i%j == 0) && (i != j))
                {
                    break;
                }
                if(i == j)
                    primes.add(i);
            }
        }
        
        //Print the prime list
        System.out.println("\nPrime numbers 1 through " + n + " :");
        System.out.println(primes.toString());
                
    }
    
}
