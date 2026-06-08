import java.util.Scanner;   

public class UserArray1D{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array:");  // For taking Inputof Array Size from User
        int size = sc.nextInt();

        int [] numbers = new int[size]; // Declaration of Array 

        for(int i=0; i<size; i++){ 
            System.out.print("Enter the Element:"); // Loop for taking input from user as per Size of Array
            numbers[i] = sc.nextInt();
            
        }

        for(int i =0; i <size; i++){
            System.out.println("Output of "+ i+" index:"+"\n"+numbers[i]); // For Printing Array
        }
        sc.close();
    }
}