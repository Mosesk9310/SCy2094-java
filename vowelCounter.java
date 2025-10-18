public class vowelCounter {
    public static void main(String[] args) {
        String input = "Hello World!, this is a sample string. Will you count the vowels?";
        int count = countVowels(input);
        System.out.println("Number of vowels in \"" + input + "\": " + count);
    }

    public static int countVowels(String str) {
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                vowelCount++;
            }
        }

        return vowelCount;
    }
}