import java.util.*;
import java.io.*;
import java.applet.*;



public class Main {

    public static void main (String[] args)
    {
        int arr []= {1,2,3,5,8,12};
        int a = arr.length;;
        int min = arr[0];
        int max = arr[0];

        for (int n= 0; n < a -1; n++ ){
            if (arr[n] > arr[n + 1]){
                if (arr[n] > max) {
                    max= arr[n];
                }
            }
            else if (arr[n] < arr[n + 1]){
                if (arr[n]< min){
                    min= arr[n];}
                if (arr[n+1]> max){
                    max= arr[n+1];
                }
            }

        }

        System.out.print( "{" );

        int x = max-min+1 ;
        int c = 0;
        int arr1 [] =new int [x];
        for ( int z = min ; z <= max;min++ ){
            arr1[z]= min;
            System.out.print( arr1[z] );

            if (c==11){break;}
            c++;



        }
        System.out.print( "}" );



    }



}



