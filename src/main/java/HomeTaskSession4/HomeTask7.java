package HomeTaskSession4;

public class HomeTask7 {
    public static void main(String[] args) {
        String str = "Automation is easy";
        //Conversion of a string into a character array.
        //The toCharArray() method is used to convert the string str into a character array carray.
        char[] carray = str.toCharArray();
        //Declaring a StringBuilder object. StringBuilder is used to create strings directly in memory
        StringBuilder result = new StringBuilder();
        // Array for tracking characters (ASCII range)
        //ASCII is a 7-bit character set containing 128 characters.
        boolean[] seen = new boolean[256];
        //Iterating through each character of the string
        for (int i = 0; i < str.length(); i++) {
            boolean isDuplicate = false;
            // Check for duplicate characters
            for (int j = i + 1; j < str.length(); j++) {
                if (carray[i] == carray[j]) {
                    isDuplicate = true; // If a duplicate is found, mark it
                    break;
                }
            }
            // If the character is not a duplicate, add it to the result
            if (!isDuplicate && !seen[carray[i]]) {
                result.append(carray[i]);
                seen[carray[i]] = true; // Mark the character as added
            }
        }
        // Print the string without duplicates
        System.out.println("String without duplicate characters: " + result.toString());
    }
}

