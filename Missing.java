package pl.samouczekprogramisty.kursyjava.znajdzbrakujacyelement;

import java.util.Arrays;

public class Missing {

    public static int findMissing(int[] array){

        Arrays.sort(array);

        for(int i = 0, j = array[0], k = array.length -1, l = array[array.length - 1]; i < array.length; i++, j++, l--, k--){

            if( j != array[i] ){
                return j;
            }
            if(l != array[k]){
                return  l;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] tab ={0, 2, 1,  4, 3, 7, 6};
        System.out.println(Missing.findMissing(tab));
    }
}
