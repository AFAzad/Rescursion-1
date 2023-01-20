/*Printing numbers from 1 to 10  */
public class PrintNumbers {
    public static void printNumber(int n){
        if(n == 11){
            return;
        }
        System.out.println(n);
        printNumber(n+1); // recursion call
    }
    

    public static void main(String[] args){
        int n = 1;
        printNumber(n);
    }
}
