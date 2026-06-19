// Definition: Prints Fibonacci sequence using recursion
public class Fibonacci {
    public static void PrintFib(int a, int b, int n){
        if(n == 0){
            return;
        }
        int c =a+b;
        System.out.println(c);
        PrintFib(b,c,n-1); // used for a and b convert to next a and b
    }

    public static void main(String[] args) {
        int a=0, b=1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        PrintFib(a, b, n-2); // n-2 because already print 2 num first. 
    }
}
