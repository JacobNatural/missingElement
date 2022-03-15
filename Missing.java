package pl.samouczekprogramisty.kursyjava.znajdzbrakujacyelement;

import java.util.Arrays;

public class Missing {

    public static int findMissing(int[] array){
        int [] arrayCopy = new int[array.length];
        arrayCopy = array;
        Arrays.sort(arrayCopy);

        for(int i = 0, j = arrayCopy[0]; i < arrayCopy.length; i++, j++){
            if( j != arrayCopy[i] ){
                return j;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] tab ={0, 2, 1,  4, 3, 7, 6};
        System.out.println(Missing.findMissing(tab));
    }
}
