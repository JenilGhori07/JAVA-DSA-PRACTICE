public class Array1D{
    public static void main(String args []){

        int [] marks = new int[3]; // int [] marks ={90,91,98}; instad that way
        marks[0] = 90;
        marks[1] = 91;
        marks[2] = 98;



        for(int i=0; i<3; i++){
            System.out.println("Marks of Sub "+ i +": "+marks[i]);  // We can use this loop Printing Our Array
        }


    }
}