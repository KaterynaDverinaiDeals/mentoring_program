package HomeTaskSession4;

public class HT8 {
    public static void main(String[] args) {
        String str = "Automation is easy";
        //Conversion of a string into a character array.
        //The toCharArray() method is used to convert the string str into a character array carray.
        char[] carray = str.toCharArray();
        //Declaring a StringBuilder object. StringBuilder is used to create strings directly in memory
        StringBuilder builder = new StringBuilder("");
        boolean isDuplicate = false;
        for (int i = 0; i < str.length(); i++) {

            // Check for duplicate characters
            for (int j = i + 1; j < str.length(); j++) {
                if (carray[i] != carray[j] && !(builder.toString().contains(String.valueOf(carray[i])))) {
                    builder.append(carray[i]);
                    //isDuplicate = true;
                }
            }
            // If the character is not a duplicate, add it to the result

        }
        // Print the string without duplicates
        System.out.println(builder);
    }
}

