import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task1
        int[] arr1 = new int[]{1, 2, 3, 55, 100, 101};
        double[] arr2 = {1.57, 7.654, 9.986};
        int[] arr3 = new int[2];
        arr3[0] = 21;
        arr3[1] = 22;
        //task2
        System.out.println();
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        //task3
        //Подскажите пожалуйста если можно сделать проще, по-моему получилось мудрёно
        System.out.println();
        for (int i = arr1.length; i > 0; i--) {
            if (i == 1) {
                System.out.println(arr1[i - 1]);
                break;
            }
            System.out.print(arr1[i - 1] + ", ");
        }
        for (int i = arr2.length; i > 0; i--) {
            if (i == 1) {
                System.out.println(arr2[i - 1]);
                break;
            }
            System.out.print(arr2[i - 1] + ", ");
        }
        for (int i = arr3.length; i > 0; i--) {
            if (i == 1) {
                System.out.println(arr3[i - 1]);
                break;
            }
            System.out.print(arr3[i - 1] + ", ");
        }
        //task4
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 1) {
                arr1[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr1));

    }
}