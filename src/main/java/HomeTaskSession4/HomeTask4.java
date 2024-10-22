package HomeTaskSession4;
// Given: int[] array = {110, 28, 35, 56, 290, 1, 3, 567};
//Calculate sum of all numbers indexes of which are even


public class HomeTask4 {
    public static void main(String[] args) {
        int[] array = {110, 28, 35, 56, 290, 1, 3, 567};
        int sum = 0;
        // Iterating through each index of the array and adding it to the sum
        for (int i = 0; i < array.length; i++) {
            //   sum += i;
            if (i % 2 == 0) {
                sum += array[i];
            }
        }
        System.out.println("The sum of indices: " + sum);
    }
}
