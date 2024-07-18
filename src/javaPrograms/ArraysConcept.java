package src.javaPrograms;

import java.util.Arrays;

public class ArraysConcept {

    public static void main(String[] args) {

        int [] arr = {2,3,4,5,6,7};
        /***
            We can print an Array in many ways
            1 - First by using a For Loop
         */
        for(int element: arr){
            System.out.println(element);
        }

        /***
            We can print Array by using Arrays.toSring method
         */
        System.out.println(Arrays.toString(arr));

        /***
         * To print multi-dimensional Array, use Arrays.deepToString method
         */

        int [] [] multiDimensionalArray = {{1,3},{2,5},{5,2}};
        System.out.println(Arrays.deepToString(multiDimensionalArray));

    }
}
