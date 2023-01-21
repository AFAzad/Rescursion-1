/* Print X^n (Stack height = n) */
public class Stack_Height_Of_N {
    public static int calculatePower(int x, int n){
        if(n == 0){
            return 1; // base case 1
        }
        if(x == 0) // base case 2
        {
            return 0;
        }
        int xPowernm = calculatePower(x, n-1);
        int xPowerN = x * xPowernm;
        return xPowerN;

    }
    public static void main(String args[]){
        int x = 5, n = 7;
        int resp = calculatePower(x, n);

        System.out.println(resp);
    }
}
