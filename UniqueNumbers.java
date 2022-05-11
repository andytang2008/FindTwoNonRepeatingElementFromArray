    // This function sets the values of
    // *x and *y to non-repeating elements
    // in an array arr[] of size n
import java.util.*;
public class UniqueNumbers {

    public static void UniqueNumbers2(int[] arr, int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++) {
 
            // Xor  all the elements of the array
            // all the elements occurring twice will
            // cancel out each other remaining
            // two unique numbers will be xored
			System.out.println("sum ^ arr["+i+"]="+sum+"^"+arr[i] +" = "+(sum ^ arr[i])+"  => "+Integer.toBinaryString(sum)+"^"+Integer.toBinaryString(arr[i])+"="+Integer.toBinaryString(sum ^ arr[i]));
            sum = (sum ^ arr[i]);
			
        }
 
        // Bitwise & the sum with it's 2's Complement
        // Bitwise & will give us the sum containing
        // only the rightmost set bit
		System.out.println("-sum = "+ (-sum) + "  = "+Integer.toBinaryString(-sum));
		 System.out.println("sum & -sum = "+ sum +"&"+(-sum) + " = "+(sum & -sum)+" => "+Integer.toBinaryString(sum)+" & "+Integer.toBinaryString(-sum)+"="+Integer.toBinaryString(sum & -sum));
        sum = (sum & -sum);

        // sum1 and sum2 will contains 2 unique
        // elements initialized with 0 box
        // number xored with 0 is number itself
        int sum1 = 0;
        int sum2 = 0;
 System.out.println("--------------------------------------------------------------");
        // traversing the array again
        for (int i = 0; i < arr.length; i++) {
 
            // Bitwise & the arr[i] with the sum
            // Two possibilities either result == 0
            // or result > 0
            if ((arr[i] & sum) > 0) {
					System.out.println("arr["+i+"] & sum= "+arr[i]+"&"+sum+"="+(arr[i] & sum) + "  =>  "+Integer.toBinaryString(arr[i])+" & " +Integer.toBinaryString(sum)+" = "+Integer.toBinaryString(arr[i] & sum)+"  ");
                // if result > 0 then arr[i] xored
                // with the sum1
				//System.out.println("   sum1 ^ arr["+i+"]="+sum1+"^"+arr[i] +" = "+(sum1 ^ arr[i]));
				
				System.out.println("sum1 ^ arr["+i+"]="+sum1+"^"+arr[i] +" = "+(sum1 ^ arr[i])+ "   =>  "+Integer.toBinaryString(sum1)+" ^ " +Integer.toBinaryString(arr[i])+" = "+Integer.toBinaryString(sum1 ^ arr[i]));
				System.out.println();
                sum1 = (sum1 ^ arr[i]);
            }
            else {
                // if result == 0 then arr[i]
                // xored with sum2
				//System.out.println("   **arr["+i+"] & sum= "+(arr[i] & sum));
						System.out.println("arr["+i+"] & sum= "+arr[i]+"&"+sum+"="+(arr[i] & sum) + "  =>  "+Integer.toBinaryString(arr[i])+" & " +Integer.toBinaryString(sum)+" = "+Integer.toBinaryString(arr[i] & sum)+"  ");
				//System.out.print("   **sum2 ^ arr["+i+"]="+sum2+"^"+arr[i] +" = "+(sum2 ^ arr[i]));
				
				System.out.println("**sum2 ^ arr["+i+"]= "+sum2+"^"+arr[i] +" = "+(sum2 ^ arr[i])+ "  =>  "+Integer.toBinaryString(sum2)+" ^ " +Integer.toBinaryString(arr[i])+" = "+Integer.toBinaryString(sum2 ^ arr[i]));
				System.out.println();
                sum2 = (sum2 ^ arr[i]);
            }
        }
 
        // print the the two unique numbers
        System.out.println("The non-repeating elements are "
                           + sum1 + " and " + sum2);
    }
 
    public static void main(String[] args)
    {
        int[] arr = new int[] { 2, 3, 7, 9, 11, 2, 3, 11 };
		System.out.println("arr="+Arrays.toString(arr));
        int n = arr.length;
        UniqueNumbers2(arr, n);
    }
}
