/*Print numbers 5 to 1 */
public class PrintNum{
    
    public static void PrintNums(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        PrintNums(n-1); // recursion call
    }
    

    public static void main(String[] args){
        int n = 5;
        PrintNums(n);
    }
}