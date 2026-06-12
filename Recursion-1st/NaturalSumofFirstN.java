// Definition: Calculates sum of first n natural numbers using recursion
public class NaturalSumofFirstN {
    public static void PrintSum(int i, int n, int sum){
        if(i == n){

            sum += i; // to store n in sum becuse at this postion i=n
            System.out.println(sum);
            return;
        }

        sum += i; // increase and store in sum
        PrintSum(i+1, n, sum); // recursion
    }

    public static void main(String[] args) {
        PrintSum(1, 5, 0);
    }
}