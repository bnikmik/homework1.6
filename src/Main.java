import java.sql.SQLOutput;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        //Задание №5
        int[][] matrix = new int[3][3];
        int unit = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j || i - 2 == j || j - 2 == i) {
                    matrix[j][i] = unit;
                }
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        int[] arrA = {5, 4, 3, 2, 1};
        int[] arrB = new int[5];

        System.out.println(Arrays.toString(arrA));
        for (int i = arrA.length - 1, j = 0; i >= 0 && j < arrB.length; i--, j++) {
            arrB[j] = arrA[i];
        }
        System.out.println(Arrays.toString(arrB));

        int[] arrC = {5, 8, 2, 3, 9};
        System.out.println(Arrays.toString(arrC));
        for (int i = arrC.length - 1; i >= 0; i--) {
            System.out.print(arrC[i]);
        }
        System.out.println(Arrays.toString(arrC));

        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int a = 0;
        int b = arr.length - 1;
        while (a<b) {
            int s = arr[a] + arr[b];
            if (s==-2) {
                System.out.println(arr[a]+ " " +arr[b]);
                a++;
                b--;
            }
            else {
                if(s < -2) a++;
                else b--;
            }
        }

        int[] arrZ = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(arr);
        for (int q = 0,w = arr.length - 1; q<w; q++,w--) {
            int m = arrZ[q] + arrZ[w];
            if (m==-2) {
                System.out.println(arrZ[q] + " eee " + arrZ[w]);
            }
            else {
                if (m < -2) {q++;
                }
                else w--;
            }
        }


    }

}
