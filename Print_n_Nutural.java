public class Print_n_Nutural {

    public static void natNums(int i, int n, int sum){
        if(i ==n){
            sum =+i;
            System.out.println(sum);
            return;
        }
        sum += i;
        natNums(i+1, n, sum);
    }
    public static void main(String[] args){

        
        natNums(1, 9, 0);
    }
}
