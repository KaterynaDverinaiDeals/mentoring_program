package HomeTaskSession3;
//Given array {3, 5, 8, 13, 21, 34, 55} find numbers greater than 10 or divided by 5 and increased them w/ 10
public class HomeTask2 {
    public static void main(String[] args) {
        int [] array = {3, 5, 8, 13, 21, 34, 55};
        for (int number : array) {
            if (number > 10 || number % 5 == 0) {
                number += 10;
                System.out.println(number);
            }
        }
    }
}
