package pe.joedayz.samples;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinaryArrayMain {

    public static void main(String[] args) {

        int[] numbers = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 4));
        System.out.println(Arrays.binarySearch(numbers, 1));
        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 9));

        System.out.println("###############");

        int[] numbers2 = new int[] {3,2,1};
        System.out.println(Arrays.binarySearch(numbers2, 2));
        System.out.println(Arrays.binarySearch(numbers2, 3));

        System.out.println("###############");

        System.out.println(Arrays.compare(new int[]{1}, new int[]{2}));
        System.out.println(Arrays.compare(new int[]{1,2}, new int[]{1}));
        System.out.println(Arrays.compare(new int[]{1,2}, new int[]{1,2}));
        System.out.println(Arrays.compare(new String[]{"a"}, new String[]{"aa"}));
        System.out.println(Arrays.compare(new String[]{"a"}, new String[]{"A"}));
        System.out.println(Arrays.compare(new String[]{"a"}, new String[]{null}));
//        System.out.println(Arrays.compare(new int[]{1}, new String[]{"a"})); //NO COMPILA

        System.out.println("###############");

        System.out.println(Arrays.mismatch(new int[] {1}, new int[] {1}));
        System.out.println(Arrays.mismatch(new String[] {"a"}, new String[] {"A"}));
        System.out.println(Arrays.mismatch(new int[] {1,2}, new int[] {1}));

        System.out.println("###############");

        int[][] vars1;
        int vars2 [][];
        int[] vars3[];
        int[] vars4 [], space [][];

        String [][] rectangle = new String[3][2];
        rectangle[0][1] = "set";
        System.out.println(rectangle.length);

        int[][] differentSizes = {{1,4},{3},{9,8,7}};
        System.out.println(differentSizes[0][0]);
        System.out.println(differentSizes[0][1]);
        System.out.println(differentSizes[2][2]);

        int [][] argsx = new int[4][];
        argsx[0] = new int[5];
        argsx[1] = new int[3];

        System.out.println("###############");

        int[][] twoD = new int[3][2];
        for (int i = 0; i < twoD.length; i++){
            for (int j = 0; j < twoD[i].length; j++)
                System.out.println(twoD[i][j] + " ");
            System.out.println();
        }

        for (int[] inner : twoD){
            for(int num : inner)
                System.out.println(num + " ");
            System.out.println();
        }





    }
}
