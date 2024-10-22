package Practice;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        // Задане число для перевірки на простоту
        int number = 7;
        // Змінна для зберігання результату перевірки, за замовчуванням вважаємо, що число просте
        boolean isPrime = true;
        // Проходимо всі можливі дільники від 2 до квадратного кореня числа
        for (int i = 2; i <= Math.sqrt(number); i++) {
            // Перевіряємо, чи ділиться число без залишку
            if (number % i == 0) {
                // Якщо знайшли дільник, то число не є простим
                isPrime = false;
                // Завершуємо цикл, оскільки число вже не може бути простим
                break;
            }
        }
        System.out.println(number + " є простим числом: " + isPrime);
    }
}
