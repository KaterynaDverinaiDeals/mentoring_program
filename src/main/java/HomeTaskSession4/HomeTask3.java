package HomeTaskSession4;
//Given: String text = "Текст з певною кількістю речень";
//Count how much sentences ends with letter “e”

public class HomeTask3 {
    public static void main(String[] args) {
        String txt = "I love the feel of wood curls flying off the lathe as I begin to shape the log " +
                "in front of me. " + "The sound of scraping changes based on the wetness of the wood," +
                " " + "the speed at which the lathe is turning, " + "and the type of cut I am making." +
                " " + "The smell and feel of wet wood being turned are unique. " +
                "The water is sprayed out as I cut through the" + " different layers of wood. " +
                "A log can turn into anything an imagination can think of with the right " + "set of hands-on tools. "
                + "I have those hands and imagination to spare. I use all of my senses and"
                + " intuition to create a beautiful object. " + "That is why I enjoy turning wood on the lathe.";

        String sentences[] = txt.split("\\."); // Splitting the string into sentences

        int count = 0; // Initialize the count variable

        // The loop iterates through each element of the sentences array,with each element representing an individual sentence.
        for (String sentence : sentences) {
            if (sentence.trim().endsWith("e")) {
                count++;
            }
        }

        // Output the result
        System.out.println("The number of sentences that end with 'e': " + count);
    }
}

