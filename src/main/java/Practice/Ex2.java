package Practice;
//
//
// String[] words = {"apple", "is", "a", "fruit"};
//  "apple", "fruit"

public class Ex2 {
    public static void main(String[] args) {
        String[] words = {"apple", "is", "a", "fruit"};
        for (String word : words) { //
            if (word.length() > 3) { //
                System.out.println(" " + word); //
            }
        }
    }
}
