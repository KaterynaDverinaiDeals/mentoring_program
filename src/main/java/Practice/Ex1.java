package Practice;
// Write a program that takes an array of integers and finds their sum. Use a for-each loop.
// int[] numbers = {1, 2, 3, 4, 5};
// Expected result: 15

public class Ex1 {

//    public static void main(String[] args) {
//        int array[] = {1, 2, 3, 4, 5};
//        int sum = 0;
//        for (int element: array){
//        sum += element;
//        }
//        System.out.println(sum);
//    }
//}

    // Варіант рішення 2
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array.length; ++i) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}