package HomeTaskSession3;
//Given array {3, 5, 8, 13, 21, 34, 55},
// print a numbers that can be divided by 5 and greater than 10, using for loop
public class HomeTask1 {
    public static void main(String[] args) {
        int [] array =  {3, 5, 8, 13, 21, 34, 55};
        for (int number : array) {
          if (number % 5 == 0 && number > 10) {
            System.out.println(number);
          }
        }
    }
}
