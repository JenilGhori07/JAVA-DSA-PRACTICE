// Definition: Prints numbers from n down to 1 using recursion
public class  Nto1Print{

    public static void Print(int n){

        if(n ==0){
            return;
        }

        System.out.println(n);
        Print(n-1);
    }

    public static void main(String[] args) {
        
        int n =5;
        Print(n);
    }
}