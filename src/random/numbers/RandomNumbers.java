
package random.numbers;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

  
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
        Random rand = new Random ();
        int min = 0;
        int max = 100;
        int randNum = rand.nextInt((max-min)+1)+min;
        System.out.println(randNum);

        int r1 = rand.nextInt();
        System.out.println(r1);
        
        System.out.println("Enter a number");
        int usernumber = input.nextInt();
        
        System.out.println("Enter the maximum");
        int usermax = input.nextInt();
        
        System.out.println("Enter minimum");
        int usermin = input.nextInt();
        
        int randNumber = rand.nextInt((usermax=usermin)+1)+usermin;
        System.out.println(randNumber);
    }
    
}
