package Practice;

public class ArrayReverse {
    public static void main(String[] args) {
        // Оголошення масиву
        int[] array = {1, 2, 3, 4, 5};
        // Змінна для тимчасового зберігання елементу
        int temp;
        // Довжина масиву
        int length = array.length;
        // Цикл для інверсії масиву (перевертаємо масив)
        for (int i = 0; i < length / 2; i++) {
            // Зберігаємо поточний елемент у змінну temp
            temp = array[i];
            // Міняємо місцями поточний елемент з відповідним елементом з кінця
            array[i] = array[length - i - 1];
            // Міняємо місцями елементи
            array[length - i - 1] = temp;
        }
        // Виводимо інвертований масив
        System.out.print("Інвертований масив: ");
        for (int element : array) {
            // Виводимо кожен елемент масиву
            System.out.print(element + " ");
        }
    }
}
