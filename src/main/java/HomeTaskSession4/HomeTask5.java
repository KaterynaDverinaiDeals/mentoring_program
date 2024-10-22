package HomeTaskSession4;
//Given: Write a Java program to find first non repeating character in a string
//String str = "gibblegabbler";

public class HomeTask5 {
    public static void main(String[] args) {
        String text = "gibblegabbler";
        // Is a for loop that is used to loop through each character in the text string
        for (int i = 0; i < text.length(); i++) {
            // Extracts a character from the text string at position “i” and stores it in variable c of char type
            char c = text.charAt(i);
            // Check if a character occurs only once
            if (text.indexOf(c) == text.lastIndexOf(c)) {
                System.out.println("First non-repeating character: " + c);
                return;
            }
        }
    }
}