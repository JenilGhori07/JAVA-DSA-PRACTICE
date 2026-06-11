public class Insertion {

     public static void PrintArray(int [] arr){

        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        
        int arr [] = {7,8,3,1,2};

        // Time complexity is O(n^2)

        for(int i = 1; i <arr.length; i++){
            int current =arr[i];
            int j = i-1;

            while (j >= 0 && current < arr[j]) { // current = unsorted part's firts element and // Checks:

                                                                                                // Is there still element on left side?
                                                                                                // Is current smaller than sorted element?

                                                                                                // If yes:

                                                                                                // shift larger elements right side. // right ma shift kare atle agal jagya thy atle tane agal muki de
                arr[j+1] = arr[j]; // used for temprory storage where j = index number 
                j--;
                
            }

            // placement

            arr[j+1] = current;

            
        }
        PrintArray(arr);
    }
}
