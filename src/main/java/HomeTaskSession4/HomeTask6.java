package HomeTaskSession4;

// Modified task, for practicing: Write a java program that will find duplicate characters in the given string
// String str = "Automation is easy";

public class HomeTask6{
    public static void main(String[] args) {
        String str = "Automation is easy";
        char[] carray = str.toCharArray();
        System.out.println("The string is:" + str);
        System.out.print("Duplicate Characters are: ");
        //Iterating through each character of the string
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (carray[i] == carray[j]) {
                    System.out.print(carray[j] + " ");
                    break;
                }
            }
        }
    }
}
