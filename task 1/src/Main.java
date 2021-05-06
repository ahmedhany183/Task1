import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {


        int[] numbers = {1,2,3,2,4,5,5,6,2,3,4,4,4};

        Set<Integer> set = new HashSet<Integer>();


        for (int i = 0; i < numbers.length; i++) {
            set.add(numbers[i]);
        }
        System.out.print( "{" );


        for(Integer i : set)
        {
            System.out.print("" + i);
        }
        System.out.print( "}" );



    }


}
