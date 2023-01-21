/*Print x^n (Stack heigh = logN) */
public class Stack_height_of_logN {
    public static int calculatePower(int x, int n){
        if(n == 0){
            return 1; // base case 1
        }
        if(x == 0) // base case 2
        {
            return 0;
        }
        
        
        // for even num
        if(n % 2 ==0){
            return calculatePower(x, n/2)* calculatePower(x, n/2);
        }else{ // for odd num
            return calculatePower(x, n/2)* calculatePower(x, n/2)*x;
        }

    }
    public static void main(String[] args){
        int x = 3, n = 5;
        int resp = calculatePower(x, n);

        System.out.println(resp); 
    }
}
