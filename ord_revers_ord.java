public class ord_revers_ord {
    public static void main(String[] args) {
        String input = "Hello World!, this is a sample string. Will you count the vowels?";
        String reversed = reverseWords(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed Words: " + reversed);
    }

    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder reversedStr = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedStr.append(words[i]);
            if (i != 0) {
                reversedStr.append(" ");
            }
        }

        return reversedStr.toString();
    }
}
