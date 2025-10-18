public class challenge_zoo {
   public static void main(String[] args)
   {

    java.util.Scanner scanner = new java.util.Scanner(System.in);

    System.out.print("Enter the number of animals in the zoo: ");
    String animalCountInput = scanner.nextLine();
    Integer animalCount = null;
    try {
        animalCount = Integer.parseInt(animalCountInput);
    } catch (NumberFormatException e) {
        // invalid input, animalCount stays null

   } 
    System.out.print("Enter the name of the zoo: ");
    String zooName = scanner.nextLine();

    System.out.print("Enter the location of the zoo: ");
    String zooLocation = scanner.nextLine();

    System.out.println("Zoo Information:");
    if (animalCount != null) {
        System.out.println("Number of animals: " + animalCount);
    } else {
        System.out.println("Number of animals should be a number");
    }
    System.out.println("Zoo Name: " + zooName);
    if (zooName.isEmpty()) {
        System.out.println("Zoo name is empty");
    }
    System.out.println("Zoo Location: " + zooLocation);
    if (zooLocation.isEmpty()) {
        System.out.println("Zoo location is empty");
    }

    scanner.close();
   }


}

class vowelCounter {
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
    @Override
    public String toString() {
        return "vowelCounter []";
    }
}