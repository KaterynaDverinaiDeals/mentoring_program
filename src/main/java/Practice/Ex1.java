package Practice;
// Напиши програму, яка приймає масив цілих чисел і знаходить їхню суму. Використовуй цикл for each.
// int[] numbers = {1, 2, 3, 4, 5};
// Очікуваний результат: 15

public class Ex1 {
    // Варіант рішення 1
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