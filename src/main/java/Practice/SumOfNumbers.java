package Practice;
//Напишіть програму, яка знаходить суму всіх чисел від 1 до 100
public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i<= 100; i++){
            sum+=i;
        }
        System.out.println("Сума чисел від 1 до 100: "+sum);
    }
}
