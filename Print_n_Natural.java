/*print n natural number */
public class Print_n_Natural {

    public static void natNums(int i, int n, int sum){
        if(i ==n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        natNums(i+1, n, sum);
    }
    public static void main(String[] args){
        System.out.print("The sum of n natural number is : ");

        
        natNums(1, 10, 0);
    }
}
