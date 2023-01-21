// git@github.com:AFAzad/Rescursion-1.git
import java.util.*;
/* calculate the n factorial  */
public class CalculateFactorial {
    public static int calcFact(int n){
        if(n ==1 || n ==0){
            return 1;
        }

        int fact_nm1 = calcFact(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;

    }
    public static void main(String[] args){
        int n = 7;
        int result = calcFact(n);
        System.out.print("The n factorial of n is : ");
        System.out.println(result);
    }
}
