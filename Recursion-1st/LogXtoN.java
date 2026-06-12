// Definition: Calculates x raised to power n using divide and conquer method
public class LogXtoN {
    public static int PrintLXN(int x, int n){
        if(n==0){
            return 1;
        }

        if(x==0){
            return 0;
        }

        if(n % 2 == 0){
            return PrintLXN(x, n/2) * PrintLXN(x, n/2); 
        }else{
            return PrintLXN(x, n/2) * PrintLXN(x, n/2) * x;
        }


    }

    public static void main(String[] args) {
        
        int x =3;
        int n = 5;

        System.out.println(PrintLXN(x, n));
    }
}