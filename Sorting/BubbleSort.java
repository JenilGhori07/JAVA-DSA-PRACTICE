public class BubbleSort {

    public static void main(String[] args) {
        
        int arr [] = {7,8,3,1,2};

        for(int i=0; i < arr.length-1;i++){ // આ loop નક્કી કરે છે કે કેટલી વાર આખી array પર ફરીશું.
            for(int j=0; j < arr.length-i-1; j++){ // આ loop બાજુબાજુના બે numbers ની સરખામણી કરે છે.
                if(arr[j] > arr[j+1]){
                    //Swap મોટા નંબરને એક પગલું પાછળ ધકેલે છે, અને ઘણા swaps પછી મોટો નંબર છેલ્લે પહોંચી જાય છે.

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


        // for print 

        for(int i =0 ; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }


    
}
