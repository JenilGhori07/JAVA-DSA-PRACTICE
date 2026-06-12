// Definition: Calculates factorial of n using recursion
public class Factorial {
    
    public static int PrintFactorial(int n){
        if(n==1){
            return 1;
        }
        int Fact =  PrintFactorial(n-1); // works for 4*3*2*1 = 24
        int result = n * Fact; // works for 5*24 = 120
        return result;
       
    }

    public static void main(String[] args) {
        int n =5;

       System.out.println(PrintFactorial(n)); 
    }
}

// 45:49 break;