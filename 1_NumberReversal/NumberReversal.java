import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class NumberReversal {

    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
	System.out.println("Enter your input number to be reversed :");
        int a = in.nextInt();
        //Create object of reverse class
        reverse obj = new reverse(a);
        //Output the result here
        System.out.println(obj.reverseNumber());
   }
}
class reverse{
    private int num;
    
    //define constructor here
    public reverse(int num)
    {
        this.num = num;
    }
    
    public int reverseNumber()
    {
    	//Write your logic here
    	int sum, mod;
    	mod = num % 10;
        sum = 0;
    	while(mod > 0 ) //123
    	{
	    // 3 * Pow (10, 0) = 3 * 1 = 3
    	    sum = (sum * 10) + mod; // 3, 32, 321 
    	    num = num / 10; // 123, 12, 1
    	    mod = num % 10; // 3, 2, 1
	    System.out.println("Sum = " + sum + ", num = " + num + ", mod = " + mod);
    	}
    	return sum;
    }
}
