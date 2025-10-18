public class computer_science {
    public static void main(String[] args) {
        String lenString = "Hello World!, this is a sample string. Will you count the vowels?";
        int length = getStringLength(lenString);
        System.out.println("Length of the string: " + length);
        String fString = "Hello World!, this is a sample string. Will you count the vowels?";
        char firstChar = getFirstCharacter(fString);
        System.out.println("First character of the string: " + firstChar);
        String lString = "Hello World!, this is a sample string. Will you count the vowels?";
        char lastChar = getLastCharacter(lString);
        System.out.println("Last character of the string: " + lastChar);    
    }

    public static int getStringLength(String str) {
        return str.length();
    }

    public static char getFirstCharacter(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("String is empty");
        }
        return str.charAt(0);
    }

    public static char getLastCharacter(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("String is empty");
        }
        return str.charAt(str.length() - 1);
    }   
}
