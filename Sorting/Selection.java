public class Selection {

    public static void PrintArray(int [] arr){

        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int [] arr = {7,8,3,1,2};

        // Time complexity is O(n^2)

        for(int i=0; i < arr.length-1; i++){ // Array માં કઈ જગ્યાએ સૌથી નાનો નંબર મૂકવાનો છે તે નક્કી કરે છે.
            
            int small = i; // હાલ માટે માની લઈએ કે i વાળી જગ્યાનો નંબર સૌથી નાનો છે.
            for(int j=i+1; j <arr.length;j++){ // પછીના બધા નંબરો ચેક કરીને ખરેખર સૌથી નાનો નંબર શોધે છે.

                if(arr[small] > arr[j]){
                    small = j;
                }

            }

            int temp = arr[small]; // Smallest one store in temp
            arr[small] = arr[i]; // i index stores at smallest one
            arr[i] = temp; // i will some at front side of array

        }

        PrintArray(arr);
    }
}