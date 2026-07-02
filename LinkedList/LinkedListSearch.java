// Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). 
// Search for the number 7 & display its index.

import java.util.LinkedList;

public class LinkedListSearch {
    public static void main(String[] args) {
        LinkedList<Integer> List = new LinkedList<>();

        List.add(1);
        List.add(5);
        List.add(7);
        List.add(3);
        List.add(8);
        List.add(2);
        List.add(3);

        int find = List.indexOf(7);

        if(find != -1){
            System.out.println("Found on index:"+ find);

        }else{
            System.out.println("Not in List");
        }


    }
}
