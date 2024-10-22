package Practice;
// Напиши програму, яка приймає масив рядків і виводить на екран лише ті рядки, довжина яких більше 3 символів.
// Використовуй цикл for each.
// String[] words = {"apple", "is", "a", "fruit"};
// Очікуваний результат: "apple", "fruit"

public class Ex2 {
    public static void main(String[] args) {
        String[] words = {"apple", "is", "a", "fruit"};
        for (String word : words) { // Проходимо по кожному рядку в масиві
            if (word.length() > 3) { // Перевіряємо, чи довжина рядка більше 3 символів
                System.out.println("Більше трьох символів: " + word); // Виводимо рядок, якщо умова виконується
            }
        }
    }
}
